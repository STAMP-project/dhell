/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

// **********************************************************************
import eu.stamp_project.examples.dhell.MyStorage;

import java.io.IOException;

import eu.stamp_project.examples.dhell.MyLogger;

// **********************************************************************
public class HelloApp
{public static class __CLR4_2_000k2q2rqsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620784L,8589935092L,75,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	HelloAppData myData;
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    public HelloApp()
    {
    	this("HelloApp", 1, "myHelloApp.traces");__CLR4_2_000k2q2rqsz.R.inc(1);try{__CLR4_2_000k2q2rqsz.R.inc(0);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public HelloApp(int printCount)
    {
        this("HelloApp_int", printCount, "myHelloApp.traces");__CLR4_2_000k2q2rqsz.R.inc(3);try{__CLR4_2_000k2q2rqsz.R.inc(2);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public HelloApp(String tracesName)
    {
        this ("HelloApp_String", 1, tracesName);__CLR4_2_000k2q2rqsz.R.inc(5);try{__CLR4_2_000k2q2rqsz.R.inc(4);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public HelloApp(int printCount, String tracesName)
    {
    	this ("HelloApp_int_String", printCount, tracesName);__CLR4_2_000k2q2rqsz.R.inc(7);try{__CLR4_2_000k2q2rqsz.R.inc(6);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    public HelloApp(String methodName, int printCount, String tracesName)
    {try{__CLR4_2_000k2q2rqsz.R.inc(8);
        __CLR4_2_000k2q2rqsz.R.inc(9);MyLogger.Instance.entering(getClass().getName(), methodName);
        __CLR4_2_000k2q2rqsz.R.inc(10);myData = new HelloAppData();
        __CLR4_2_000k2q2rqsz.R.inc(11);myData.setMyPrintCount(printCount); 
        __CLR4_2_000k2q2rqsz.R.inc(12);myData.setMyTraces(null);
        __CLR4_2_000k2q2rqsz.R.inc(13);myData.setMyTracesName(tracesName);
        __CLR4_2_000k2q2rqsz.R.inc(14);myData.setShouldPrintOnStdout(true);
        __CLR4_2_000k2q2rqsz.R.inc(15);MyStorage.deleteFile(myData.getMyTracesName());

        __CLR4_2_000k2q2rqsz.R.inc(16);MyLogger.Instance.info("MyPrintCount = " + Integer.toString(myData.getMyPrintCount())
            + " - MyTracesName = " + myData.getMyTracesName());

        __CLR4_2_000k2q2rqsz.R.inc(17);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}
    
    // **********************************************************************
    public void run() throws IOException
    {try{__CLR4_2_000k2q2rqsz.R.inc(18);
        __CLR4_2_000k2q2rqsz.R.inc(19);String methodName = "run";
        __CLR4_2_000k2q2rqsz.R.inc(20);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_000k2q2rqsz.R.inc(21);String indent = "-";
        __CLR4_2_000k2q2rqsz.R.inc(22);String countString = Integer.toString(myData.getMyPrintCount());

        __CLR4_2_000k2q2rqsz.R.inc(23);if ((((myData.getMyTracesName().length() > 0)&&(__CLR4_2_000k2q2rqsz.R.iget(24)!=0|true))||(__CLR4_2_000k2q2rqsz.R.iget(25)==0&false)))
        {{
        	__CLR4_2_000k2q2rqsz.R.inc(26);myData.setMyTraces(new MyStorage(myData.getMyTracesName()));
        }
        }else
        {{
        	__CLR4_2_000k2q2rqsz.R.inc(27);myData.setMyTraces(new MyStorage());
        }

        }__CLR4_2_000k2q2rqsz.R.inc(28);myData.getMyTraces().addData(countString);

        __CLR4_2_000k2q2rqsz.R.inc(29);for (int i = 1; (((i < myData.getMyPrintCount())&&(__CLR4_2_000k2q2rqsz.R.iget(30)!=0|true))||(__CLR4_2_000k2q2rqsz.R.iget(31)==0&false)); i++)
        {{
            __CLR4_2_000k2q2rqsz.R.inc(32);indent = indent + "-";
        }
        }__CLR4_2_000k2q2rqsz.R.inc(33);MyLogger.Instance.fine("indent = '" + indent + "'");
        __CLR4_2_000k2q2rqsz.R.inc(34);myPrint(indent);
        __CLR4_2_000k2q2rqsz.R.inc(35);myPrint(indent + " Hello World !");
        __CLR4_2_000k2q2rqsz.R.inc(36);myPrint(indent);

        __CLR4_2_000k2q2rqsz.R.inc(37);myData.getMyTraces().saveData();

        __CLR4_2_000k2q2rqsz.R.inc(38);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public Integer returnSomething()
    {try{__CLR4_2_000k2q2rqsz.R.inc(39);
        __CLR4_2_000k2q2rqsz.R.inc(40);Integer myInt = 1;
        __CLR4_2_000k2q2rqsz.R.inc(41);String myName = "MyName" + myInt.toString();
        __CLR4_2_000k2q2rqsz.R.inc(42);return myName.length();
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public void computeMyUselessResult()
    {try{__CLR4_2_000k2q2rqsz.R.inc(43);
        // PI = 3,141 592 653 589 793 - PI (10 chiffres exactes) ~ 104348 / 33215
        // PI = 3,1415926535 8979323846 2643383279 5028841971 6939937510 5820974944
        //        5923078164 0628620899 8628034825 3421170679
        // PHI = (1 + rootsquare(5)) / 2 = 1,618 033 988 7
        // PHI = 1,618 033 988 749 894 848 204 586 834 365 638 117 720 309 179 805
        //        762 862 135 448 622 705 260 462 189 024 497 072 072 041
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    // ******** attributes

    // **********************************************************************
    public int getMyPrintCount()
    {try{__CLR4_2_000k2q2rqsz.R.inc(44);
        __CLR4_2_000k2q2rqsz.R.inc(45);return(myData.getMyPrintCount());
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public String getMyTracesName()
    {try{__CLR4_2_000k2q2rqsz.R.inc(46);
        __CLR4_2_000k2q2rqsz.R.inc(47);return(myData.getMyTracesName());
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    public boolean getShouldPrintOnStdout()
    {try{__CLR4_2_000k2q2rqsz.R.inc(48);
        __CLR4_2_000k2q2rqsz.R.inc(49);return(myData.isShouldPrintOnStdout());
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********
    public void setShouldPrintOnStdout(boolean value)
    {try{__CLR4_2_000k2q2rqsz.R.inc(50);
    	__CLR4_2_000k2q2rqsz.R.inc(51);myData.setShouldPrintOnStdout(value);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    // ******** associations

    // **********************************************************************
    public int cardMyTraces()
    {try{__CLR4_2_000k2q2rqsz.R.inc(52);
        __CLR4_2_000k2q2rqsz.R.inc(53);int theCard = 0;

        __CLR4_2_000k2q2rqsz.R.inc(54);if ((((myData.getMyTraces() != null)&&(__CLR4_2_000k2q2rqsz.R.iget(55)!=0|true))||(__CLR4_2_000k2q2rqsz.R.iget(56)==0&false)))
        {{
            __CLR4_2_000k2q2rqsz.R.inc(57);theCard = 1;
        }

        }__CLR4_2_000k2q2rqsz.R.inc(58);return(theCard);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********
    public MyStorage getMyTraces()
    {try{__CLR4_2_000k2q2rqsz.R.inc(59);
        __CLR4_2_000k2q2rqsz.R.inc(60);return(myData.getMyTraces());
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}

    // **********************************************************************
    // protected
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    protected void myPrint(String message)
    {try{__CLR4_2_000k2q2rqsz.R.inc(61);
        __CLR4_2_000k2q2rqsz.R.inc(62);if ((((getShouldPrintOnStdout())&&(__CLR4_2_000k2q2rqsz.R.iget(63)!=0|true))||(__CLR4_2_000k2q2rqsz.R.iget(64)==0&false)))
        {{
            __CLR4_2_000k2q2rqsz.R.inc(65);System.out.println(message);
        }
        }__CLR4_2_000k2q2rqsz.R.inc(66);myData.getMyTraces().addData(message);
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}
    
    public String getMyAppSystemInformation(boolean detailed) {try{__CLR4_2_000k2q2rqsz.R.inc(67);
    	__CLR4_2_000k2q2rqsz.R.inc(68);String myAppGeneralInfo = "My App General Infos";
    	__CLR4_2_000k2q2rqsz.R.inc(69);String myAppDetailedInfo = "My App Detailed Infos";
    	__CLR4_2_000k2q2rqsz.R.inc(70);if ((((detailed)&&(__CLR4_2_000k2q2rqsz.R.iget(71)!=0|true))||(__CLR4_2_000k2q2rqsz.R.iget(72)==0&false))) {{
    		__CLR4_2_000k2q2rqsz.R.inc(73);return myAppDetailedInfo;
    	}
    	}__CLR4_2_000k2q2rqsz.R.inc(74);return myAppGeneralInfo;
    }finally{__CLR4_2_000k2q2rqsz.R.flushNeeded();}}
}
