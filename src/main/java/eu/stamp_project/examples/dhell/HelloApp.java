package eu.stamp_project.examples.dhell;

// **********************************************************************
import eu.stamp_project.examples.dhell.MyStorage;

import java.io.IOException;

import eu.stamp_project.examples.dhell.MyLogger;

// **********************************************************************
public class HelloApp
{
	
	HelloAppData myData;
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    public HelloApp()
    {
    	this("HelloApp", 1, "myHelloApp.traces");
    }

    // **********************************************************************
    public HelloApp(int printCount)
    {
        this("HelloApp_int", printCount, "myHelloApp.traces");
    }

    // **********************************************************************
    public HelloApp(String tracesName)
    {
        this ("HelloApp_String", 1, tracesName);
    }

    // **********************************************************************
    public HelloApp(int printCount, String tracesName)
    {
    	this ("HelloApp_int_String", printCount, tracesName);
    }

    public HelloApp(String methodName, int printCount, String tracesName)
    {
        MyLogger.Instance.entering(getClass().getName(), methodName);
        myData = new HelloAppData();
        myData.setMyPrintCount(printCount); 
        myData.setMyTraces(null);
        myData.setMyTracesName(tracesName);
        myData.setShouldPrintOnStdout(true);
        MyStorage.deleteFile(myData.getMyTracesName());

        MyLogger.Instance.info("MyPrintCount = " + Integer.toString(myData.getMyPrintCount())
            + " - MyTracesName = " + myData.getMyTracesName());

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }
    
    // **********************************************************************
    public void run() throws IOException
    {
        String methodName = "run";
        MyLogger.Instance.entering(getClass().getName(), methodName);

        String indent = "-";
        String countString = Integer.toString(myData.getMyPrintCount());

        if (myData.getMyTracesName().length() > 0)
        {
        	myData.setMyTraces(new MyStorage(myData.getMyTracesName()));
        }
        else
        {
        	myData.setMyTraces(new MyStorage());
        }

        myData.getMyTraces().addData(countString);

        for (int i = 1; i < myData.getMyPrintCount(); i++)
        {
            indent = indent + "-";
        }
        MyLogger.Instance.fine("indent = '" + indent + "'");
        myPrint(indent);
        myPrint(indent + " Hello World !");
        myPrint(indent);

        myData.getMyTraces().saveData();

        MyLogger.Instance.exiting(getClass().getName(), methodName);
    }

    // **********************************************************************
    public Integer returnSomething()
    {
        Integer myInt = 1;
        String myName = "MyName" + myInt.toString();
        return myName.length();
    }

    // **********************************************************************
    public void computeMyUselessResult()
    {
        // PI = 3,141 592 653 589 793 - PI (10 chiffres exactes) ~ 104348 / 33215
        // PI = 3,1415926535 8979323846 2643383279 5028841971 6939937510 5820974944
        //        5923078164 0628620899 8628034825 3421170679
        // PHI = (1 + rootsquare(5)) / 2 = 1,618 033 988 7
        // PHI = 1,618 033 988 749 894 848 204 586 834 365 638 117 720 309 179 805
        //        762 862 135 448 622 705 260 462 189 024 497 072 072 041
    }

    // **********************************************************************
    // ******** attributes

    // **********************************************************************
    public int getMyPrintCount()
    {
        return(myData.getMyPrintCount());
    }

    // **********************************************************************
    public String getMyTracesName()
    {
        return(myData.getMyTracesName());
    }

    // **********************************************************************
    public boolean getShouldPrintOnStdout()
    {
        return(myData.isShouldPrintOnStdout());
    }

    // **********
    public void setShouldPrintOnStdout(boolean value)
    {
    	myData.setShouldPrintOnStdout(value);
    }

    // **********************************************************************
    // ******** associations

    // **********************************************************************
    public int cardMyTraces()
    {
        int theCard = 0;

        if (myData.getMyTraces() != null)
        {
            theCard = 1;
        }

        return(theCard);
    }

    // **********
    public MyStorage getMyTraces()
    {
        return(myData.getMyTraces());
    }

    // **********************************************************************
    // protected
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    protected void myPrint(String message)
    {
        if (getShouldPrintOnStdout())
        {
            System.out.println(message);
        }
        myData.getMyTraces().addData(message);
    }
    
    public String getMyAppSystemInformation(boolean detailed) {
    	String myAppGeneralInfo = "My App General Infos";
    	String myAppDetailedInfo = "My App Detailed Infos";
    	if (detailed) {
    		return myAppDetailedInfo;
    	}
    	return myAppGeneralInfo;
    }
}
