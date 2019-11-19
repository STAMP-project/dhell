package eu.stamp_project.examples.dhell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
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
    public void testDeleteData() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();

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
        myFile.delData("a second line, longer than the first one");
        //we delete one of the data files and check that the data is no longer the same
        assertFalse(myFile.dataAreEqual(myData));
        theFile = new File(myFileName);
        assertEquals(true, theFile.exists());
    }

    //Test case created for the coverage problem
    @Test
    public void testDeleteDataForTask3() throws Exception
    {
        MyStorage myFile = null;
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();

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
        myData.remove(2);
        myData.add("3rd line with something else: 2, 4, 8, 15");
        assertFalse(myFile.dataAreEqual(myData));

        myFile.saveData();
        myFile.delData("a second line, longer than the first one");
        //we delete one of the data files and check that the data is no longer the same
        assertFalse(myFile.dataAreEqual(myData));
    }

    @Test (expected = IOException.class)
    public void testReadNonExistingFile() throws Exception {
        MyStorage myFile = null;
        String myFileName = "foo.txt";

        // write data in the first file
        myFile = new MyStorage(myFileName);
        myFile.readData();
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

        //Add new data to mydata to check that dataAreEqual works as expected
        myData.add("TestMutations");
        assertEquals(false, mySecondFile.dataAreEqual(myData));

        //Add a new file, different that the 2 previous ones.

        // write data in the first file
        myThirdFile = new MyStorage(myFileName);
        for (int i = 0; i < myData.size(); i++)
        {
            myThirdFile.addData(myData.get(i));
        }

        assertEquals(myData.size(), myThirdFile.getDataSize());
        assertEquals(true, myThirdFile.dataAreEqual(myData));

        // compare content
        assertEquals(false, myFile.isEqual(myThirdFile));

    }
    
    //WORKSHOP
    
    @Test (expected=NullPointerException.class)
    public void testReproduceException2() {
        MyStorage myFile = null;

        // write data in the first file
        myFile = new MyStorage();
        myFile.deleteFile(null);
    }
    
    @Test (expected=FileNotFoundException.class)
    public void testReproduceException3() {
        MyStorage myFile = null;
        String myFileName = "";

        // write data in the first file
        myFile = new MyStorage(myFileName);
        try {
            myFile.saveData();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
