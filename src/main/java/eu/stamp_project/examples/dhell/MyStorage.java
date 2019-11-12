package eu.stamp_project.examples.dhell;

// **********************************************************************
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.*;

import eu.stamp_project.examples.dhell.MyLogger;

// **********************************************************************
public class MyStorage
{
	
	MyStorageHelper helper = new MyStorageHelper();
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    public static void deleteFile(String fileName)
    {
        String methodName = "deleteFile";
        MyLogger.Instance.entering("MyStorage", methodName);

        MyStorageHelper.deleteFile(fileName);

        MyLogger.Instance.exiting("MyStorage", methodName);
    }

	

    // **********************************************************************
    public MyStorage()
    {
        String methodName = "MyStorage";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        FileName = "my_storage.txt";
        MyData = new ArrayList<String>();

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }

    // **********************************************************************
    public MyStorage(String fileName)
    {
        String methodName = "MyStorage_String";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        this.FileName = fileName;
        MyData = new ArrayList<String>();

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }

    // **********************************************************************
    public void readData() throws IOException
    {
        String methodName = "readData";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        helper.readData(getFileName(), this);

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }

	
    // **********************************************************************
    public void saveData() throws IOException
    {
        String methodName = "saveData";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        helper.saveData(getFileName(), this);

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }


    // **********************************************************************
    public boolean isEqual(MyStorage anotherStorage)
    {
        String methodName = "isEqual";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        boolean areEqual = helper.isEqual(this, anotherStorage);

        MyLogger.Instance.exiting(getClass().getName(), methodName);
        return(areEqual);
    }

    // **********************************************************************
    public boolean dataAreEqual(ArrayList<String> otherData)
    {
        String methodName = "dataAreEqual";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        boolean areEqual = (getDataSize() == otherData.size());

        for (int i = 0; i < getDataSize() && areEqual; i++)
        {
            if (! (getData(i).equals(otherData.get(i))))
            {
                areEqual = false;
            } 
        }

        MyLogger.Instance.exiting(getClass().getName(), methodName);
        return(areEqual);
    }

    // **********************************************************************
    // ******** attributes

    // **********************************************************************
    public String getFileName()
    {
        return(FileName);
    }

    // **********************************************************************
    public int getDataSize()
    {
        return(MyData.size());
    }

    // **********************************************************************
    public String getData(int index)
    {
        return(MyData.get(index));
    }

    // **********************************************************************

    public void addData(String aData) {
		MyData.add(aData);
	}

    // **********************************************************************
    public void delData(String aData)
    {
        MyLogger.Instance.finest("IN : DataSize = " + Integer.toString(getDataSize()));

        boolean found = false;

        for (int i = 0; i < getDataSize() && ! found; i++)
        {
            if (getData(i).equals(aData))
            {
                MyData.remove(i);
                found = true;
            } 
        } 

        MyLogger.Instance.finest("OUT: DataSize = " + Integer.toString(getDataSize())
            + " - found = " + Boolean.toString(found));
    }

    // **********************************************************************
    // private
    // **********************************************************************
    // ******** attributes
    private String FileName;
    private ArrayList<String> MyData;

}
