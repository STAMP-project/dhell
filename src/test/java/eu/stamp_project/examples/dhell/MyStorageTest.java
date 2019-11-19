package eu.stamp_project.examples.dhell;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import eu.stamp_project.examples.dhell.MyStorage;

public class MyStorageTest
{
    // **********************************************************************
    // public
    // **********************************************************************
    @Test
    public void testMyStorageDefault() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "my_storage.txt";
        File theFile = null;

        MyStorage.deleteFile(myFileName);

        myFile = new MyStorage();
        assertEquals(myFileName, myFile.getFileName());
        assertEquals(0, myFile.getDataSize());

        theFile = new File(myFileName);
        theFile = new File(myFileName);
        assertEquals(false, theFile.exists());
    }

    @Test
    public void testMyStorageString() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "foofoo.txt";
        File theFile = null;

        MyStorage.deleteFile(myFileName);

        myFile = new MyStorage(myFileName);
        assertEquals(myFileName, myFile.getFileName());
        assertEquals(0, myFile.getDataSize());

        theFile = new File(myFileName);
        assertEquals(false, theFile.exists());
    }

    @Test
    public void testAddData() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();

        // file content
        // 1st line
        // a second line, longer than the first one
        // 3rd line with something else: 2, 4, 8, 16
        myData.add("1st line");
        myData.add("a second line, longer than the first one");
        myData.add("3rd line with something else: 2, 4, 8, 16");

        myFile = new MyStorage(myFileName);
        for (int i = 0; i < myData.size(); i++)
        {
            myFile.addData(myData.get(i));
        }

        assertEquals(myData.size(), myFile.getDataSize());
        assertEquals(true, myFile.dataAreEqual(myData));
    }
    
    @Test
    public void testModifyData() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();

        // file content
        // 1st line
        // a second line, longer than the first one
        myData.add("1st line");
        myData.add("a second line, longer than the first one");

        myFile = new MyStorage(myFileName);
        for (int i = 0; i < myData.size(); i++)
        {
            myFile.addData(myData.get(i));
        }
        myData.remove(1);

        assertEquals(false, myFile.dataAreEqual(myData));
    }

    @Test
    public void testSaveReadData() throws Exception
    {
        MyStorage myFile = null;
        MyStorage mySecondFile = null;
        MyStorage myThirdFile = null;
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        ArrayList<String> myDifferentData = new ArrayList<String>();

        MyStorage.deleteFile(myFileName);

        // file content
        // 1st line
        // a second line, longer than the first one
        // 3rd line with something else: 2, 4, 8, 16
        myData.add("1st line");
        myData.add("a second line, longer than the first one");
        myData.add("3rd line with something else: 2, 4, 8, 16");

        // write data in the first file
        myFile = new MyStorage(myFileName);
        for (int i = 0; i < myData.size(); i++)
        {
            myFile.addData(myData.get(i));
        }
        assertEquals(myData.size(), myFile.getDataSize());
        assertEquals(true, myFile.dataAreEqual(myData));

        myFile.saveData();
        theFile = new File(myFileName);
        assertEquals(true, theFile.exists());

        // read data in the 2nd file
        mySecondFile = new MyStorage(myFileName);
        assertEquals(true, theFile.exists());

        mySecondFile.readData();
        assertEquals(myData.size(), mySecondFile.getDataSize());
        assertEquals(true, mySecondFile.dataAreEqual(myData));

        // compare content
        assertEquals(true, myFile.isEqual(mySecondFile));
        
        // read data in a 3rd file content
        myDifferentData.add("a different 1st line");
        myDifferentData.add("a different 2nd line");
        myThirdFile = new MyStorage(myFileName);
        myThirdFile.addData(myDifferentData.get(0));
        myThirdFile.addData(myDifferentData.get(1));
        
        // compare different content
        assertEquals(false, myThirdFile.dataAreEqual(myData));
    }
    
    @Test
    public void testDelData() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();

        // file content
        // 1st line
        // a second line, longer than the first one
        myData.add("1st line");
        myData.add("a second line, longer than the first one");

        myFile = new MyStorage(myFileName);
        for (int i = 0; i < myData.size(); i++)
        {
            myFile.addData(myData.get(i));
        }
        myFile.delData("1st line");

        assertEquals(true, myFile.dataAreEqual(myData));
    }
    
    //WORKSHOP
    
    @Test //(expected=NullPointerException.class)
    public void testReproduceException2() {
    	MyStorage.deleteFile(null);
    }
    
    @Test //(expected=FileNotFoundException.class)
    public void testReproduceException3() {
    	MyStorage myFile = null;
        String myFileName = "/";
        ArrayList<String> myData = new ArrayList<String>();
        myFile = new MyStorage(myFileName);
        try {
			myFile.saveData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
