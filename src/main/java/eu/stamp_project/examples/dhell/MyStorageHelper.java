package eu.stamp_project.examples.dhell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class MyStorageHelper {
	
	public void readData(String filename, MyStorage myStorage) throws IOException {
		BufferedReader myBuffer = null;
        FileReader myFile = null;
        String currentLine;

        try
        {
            myFile = new FileReader(filename);
            myBuffer = new BufferedReader(myFile);
            while ((currentLine = myBuffer.readLine()) != null)
            {
                addData(currentLine, myStorage);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: cannot read " + filename);
            throw e;
        }

        try
        {
            if (myBuffer != null)
            {
                myBuffer.close();
            }
            if (myFile != null)
            {
                myFile.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: closing " + filename);
            throw e;
        }
	}
	
	public void saveData(String filename, MyStorage myStorage) throws IOException {
		try
        {
            PrintStream writer = new PrintStream(new File(filename));
            for (int i = 0; i < myStorage.getDataSize(); i++)
            {
                writer.println(myStorage.getData(i));
            }
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error: cannot write into " + filename);
            throw e;
        }
	}
	
	public static void deleteFile(String fileName) {
		File theFile = null;

        // delete file if it already exists
        theFile = new File(fileName);
        if (theFile.exists())
        {
            theFile.delete();
        }
	}
	
	public boolean isEqual(MyStorage MyData, MyStorage anotherStorage) {
		boolean areEqual = (MyData.getDataSize() == anotherStorage.getDataSize());

        for (int i = 0; i < MyData.getDataSize() && areEqual; i++)
        {
            if (! (MyData.getData(i).equals(anotherStorage.getData(i))))
            {
                areEqual = false;
            } 
        }
		return areEqual;
	}
	
	private void addData(String aData, MyStorage myStorage)
    {
        MyLogger.Instance.finest("IN : DataSize = " + Integer.toString(myStorage.getDataSize())
            + " - aData = " + aData);

        myStorage.addData(aData);

        MyLogger.Instance.finest("OUT: DataSize = " + Integer.toString(myStorage.getDataSize()));
    }
	
	

}
