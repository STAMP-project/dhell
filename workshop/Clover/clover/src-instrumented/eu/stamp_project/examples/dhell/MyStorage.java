/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

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
{public static class __CLR4_2_06c6ck2q2rquq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620784L,8589935092L,294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	MyStorageHelper helper = new MyStorageHelper();
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    public static void deleteFile(String fileName)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(228);
        __CLR4_2_06c6ck2q2rquq.R.inc(229);String methodName = "deleteFile";
        __CLR4_2_06c6ck2q2rquq.R.inc(230);MyLogger.Instance.entering("MyStorage", methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(231);MyStorageHelper.deleteFile(fileName);

        __CLR4_2_06c6ck2q2rquq.R.inc(232);MyLogger.Instance.exiting("MyStorage", methodName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

	

    // **********************************************************************
    public MyStorage()
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(233);
        __CLR4_2_06c6ck2q2rquq.R.inc(234);String methodName = "MyStorage";
        __CLR4_2_06c6ck2q2rquq.R.inc(235);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(236);FileName = "my_storage.txt";
        __CLR4_2_06c6ck2q2rquq.R.inc(237);MyData = new ArrayList<String>();

        __CLR4_2_06c6ck2q2rquq.R.inc(238);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public MyStorage(String fileName)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(239);
        __CLR4_2_06c6ck2q2rquq.R.inc(240);String methodName = "MyStorage_String";
        __CLR4_2_06c6ck2q2rquq.R.inc(241);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(242);this.FileName = fileName;
        __CLR4_2_06c6ck2q2rquq.R.inc(243);MyData = new ArrayList<String>();

        __CLR4_2_06c6ck2q2rquq.R.inc(244);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public void readData() throws IOException
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(245);
        __CLR4_2_06c6ck2q2rquq.R.inc(246);String methodName = "readData";
        __CLR4_2_06c6ck2q2rquq.R.inc(247);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(248);helper.readData(getFileName(), this);

        __CLR4_2_06c6ck2q2rquq.R.inc(249);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

	
    // **********************************************************************
    public void saveData() throws IOException
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(250);
        __CLR4_2_06c6ck2q2rquq.R.inc(251);String methodName = "saveData";
        __CLR4_2_06c6ck2q2rquq.R.inc(252);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(253);helper.saveData(getFileName(), this);

        __CLR4_2_06c6ck2q2rquq.R.inc(254);MyLogger.Instance.exiting(getClass().getName(), methodName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}


    // **********************************************************************
    public boolean isEqual(MyStorage anotherStorage)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(255);
        __CLR4_2_06c6ck2q2rquq.R.inc(256);String methodName = "isEqual";
        __CLR4_2_06c6ck2q2rquq.R.inc(257);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(258);boolean areEqual = helper.isEqual(this, anotherStorage);

        __CLR4_2_06c6ck2q2rquq.R.inc(259);MyLogger.Instance.exiting(getClass().getName(), methodName);
        __CLR4_2_06c6ck2q2rquq.R.inc(260);return(areEqual);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public boolean dataAreEqual(ArrayList<String> otherData)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(261);
        __CLR4_2_06c6ck2q2rquq.R.inc(262);String methodName = "dataAreEqual";
        __CLR4_2_06c6ck2q2rquq.R.inc(263);MyLogger.Instance.entering(getClass().getName(), methodName);

        __CLR4_2_06c6ck2q2rquq.R.inc(264);boolean areEqual = (getDataSize() == otherData.size());

        __CLR4_2_06c6ck2q2rquq.R.inc(265);for (int i = 0; (((i < getDataSize() && areEqual)&&(__CLR4_2_06c6ck2q2rquq.R.iget(266)!=0|true))||(__CLR4_2_06c6ck2q2rquq.R.iget(267)==0&false)); i++)
        {{
            __CLR4_2_06c6ck2q2rquq.R.inc(268);if ((((! (getData(i).equals(otherData.get(i))))&&(__CLR4_2_06c6ck2q2rquq.R.iget(269)!=0|true))||(__CLR4_2_06c6ck2q2rquq.R.iget(270)==0&false)))
            {{
                __CLR4_2_06c6ck2q2rquq.R.inc(271);areEqual = false;
            } 
        }}

        }__CLR4_2_06c6ck2q2rquq.R.inc(272);MyLogger.Instance.exiting(getClass().getName(), methodName);
        __CLR4_2_06c6ck2q2rquq.R.inc(273);return(areEqual);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    // ******** attributes

    // **********************************************************************
    public String getFileName()
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(274);
        __CLR4_2_06c6ck2q2rquq.R.inc(275);return(FileName);
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public int getDataSize()
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(276);
        __CLR4_2_06c6ck2q2rquq.R.inc(277);return(MyData.size());
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public String getData(int index)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(278);
        __CLR4_2_06c6ck2q2rquq.R.inc(279);return(MyData.get(index));
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************

    public void addData(String aData) {try{__CLR4_2_06c6ck2q2rquq.R.inc(280);
		__CLR4_2_06c6ck2q2rquq.R.inc(281);MyData.add(aData);
	}finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    public void delData(String aData)
    {try{__CLR4_2_06c6ck2q2rquq.R.inc(282);
        __CLR4_2_06c6ck2q2rquq.R.inc(283);MyLogger.Instance.finest("IN : DataSize = " + Integer.toString(getDataSize()));

        __CLR4_2_06c6ck2q2rquq.R.inc(284);boolean found = false;

        __CLR4_2_06c6ck2q2rquq.R.inc(285);for (int i = 0; (((i < getDataSize() && ! found)&&(__CLR4_2_06c6ck2q2rquq.R.iget(286)!=0|true))||(__CLR4_2_06c6ck2q2rquq.R.iget(287)==0&false)); i++)
        {{
            __CLR4_2_06c6ck2q2rquq.R.inc(288);if ((((getData(i).equals(aData))&&(__CLR4_2_06c6ck2q2rquq.R.iget(289)!=0|true))||(__CLR4_2_06c6ck2q2rquq.R.iget(290)==0&false)))
            {{
                __CLR4_2_06c6ck2q2rquq.R.inc(291);MyData.remove(i);
                __CLR4_2_06c6ck2q2rquq.R.inc(292);found = true;
            } 
        }} 

        }__CLR4_2_06c6ck2q2rquq.R.inc(293);MyLogger.Instance.finest("OUT: DataSize = " + Integer.toString(getDataSize())
            + " - found = " + Boolean.toString(found));
    }finally{__CLR4_2_06c6ck2q2rquq.R.flushNeeded();}}

    // **********************************************************************
    // private
    // **********************************************************************
    // ******** attributes
    private String FileName;
    private ArrayList<String> MyData;

}
