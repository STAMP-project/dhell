/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class MyStorageHelper {public static class __CLR4_2_08686k2q2rqv6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620784L,8589935092L,349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	public void readData(String filename, MyStorage myStorage) throws IOException {try{__CLR4_2_08686k2q2rqv6.R.inc(294);
		__CLR4_2_08686k2q2rqv6.R.inc(295);BufferedReader myBuffer = null;
        __CLR4_2_08686k2q2rqv6.R.inc(296);FileReader myFile = null;
        __CLR4_2_08686k2q2rqv6.R.inc(297);String currentLine;

        __CLR4_2_08686k2q2rqv6.R.inc(298);try
        {
            __CLR4_2_08686k2q2rqv6.R.inc(299);myFile = new FileReader(filename);
            __CLR4_2_08686k2q2rqv6.R.inc(300);myBuffer = new BufferedReader(myFile);
            __CLR4_2_08686k2q2rqv6.R.inc(301);while ((currentLine = myBuffer.readLine()) != null)
            {{
                __CLR4_2_08686k2q2rqv6.R.inc(304);addData(currentLine, myStorage);
            }
        }}
        catch(IOException e)
        {
            __CLR4_2_08686k2q2rqv6.R.inc(305);System.out.println("Error: cannot read " + filename);
            __CLR4_2_08686k2q2rqv6.R.inc(306);throw e;
        }

        __CLR4_2_08686k2q2rqv6.R.inc(307);try
        {
            __CLR4_2_08686k2q2rqv6.R.inc(308);if ((((myBuffer != null)&&(__CLR4_2_08686k2q2rqv6.R.iget(309)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(310)==0&false)))
            {{
                __CLR4_2_08686k2q2rqv6.R.inc(311);myBuffer.close();
            }
            }__CLR4_2_08686k2q2rqv6.R.inc(312);if ((((myFile != null)&&(__CLR4_2_08686k2q2rqv6.R.iget(313)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(314)==0&false)))
            {{
                __CLR4_2_08686k2q2rqv6.R.inc(315);myFile.close();
            }
        }}
        catch(IOException e)
        {
            __CLR4_2_08686k2q2rqv6.R.inc(316);System.out.println("Error: closing " + filename);
            __CLR4_2_08686k2q2rqv6.R.inc(317);throw e;
        }
	}finally{__CLR4_2_08686k2q2rqv6.R.flushNeeded();}}
	
	public void saveData(String filename, MyStorage myStorage) throws IOException {try{__CLR4_2_08686k2q2rqv6.R.inc(318);
		__CLR4_2_08686k2q2rqv6.R.inc(319);try
        {
            __CLR4_2_08686k2q2rqv6.R.inc(320);PrintStream writer = new PrintStream(new File(filename));
            __CLR4_2_08686k2q2rqv6.R.inc(321);for (int i = 0; (((i < myStorage.getDataSize())&&(__CLR4_2_08686k2q2rqv6.R.iget(322)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(323)==0&false)); i++)
            {{
                __CLR4_2_08686k2q2rqv6.R.inc(324);writer.println(myStorage.getData(i));
            }
            }__CLR4_2_08686k2q2rqv6.R.inc(325);writer.close();
        }
        catch(IOException e)
        {
            __CLR4_2_08686k2q2rqv6.R.inc(326);System.out.println("Error: cannot write into " + filename);
            __CLR4_2_08686k2q2rqv6.R.inc(327);throw e;
        }
	}finally{__CLR4_2_08686k2q2rqv6.R.flushNeeded();}}
	
	public static void deleteFile(String fileName) {try{__CLR4_2_08686k2q2rqv6.R.inc(328);
		__CLR4_2_08686k2q2rqv6.R.inc(329);File theFile = null;

        // delete file if it already exists
        __CLR4_2_08686k2q2rqv6.R.inc(330);theFile = new File(fileName);
        __CLR4_2_08686k2q2rqv6.R.inc(331);if ((((theFile.exists())&&(__CLR4_2_08686k2q2rqv6.R.iget(332)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(333)==0&false)))
        {{
            __CLR4_2_08686k2q2rqv6.R.inc(334);theFile.delete();
        }
	}}finally{__CLR4_2_08686k2q2rqv6.R.flushNeeded();}}
	
	public boolean isEqual(MyStorage MyData, MyStorage anotherStorage) {try{__CLR4_2_08686k2q2rqv6.R.inc(335);
		__CLR4_2_08686k2q2rqv6.R.inc(336);boolean areEqual = (MyData.getDataSize() == anotherStorage.getDataSize());

        __CLR4_2_08686k2q2rqv6.R.inc(337);for (int i = 0; (((i < MyData.getDataSize() && areEqual)&&(__CLR4_2_08686k2q2rqv6.R.iget(338)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(339)==0&false)); i++)
        {{
            __CLR4_2_08686k2q2rqv6.R.inc(340);if ((((! (MyData.getData(i).equals(anotherStorage.getData(i))))&&(__CLR4_2_08686k2q2rqv6.R.iget(341)!=0|true))||(__CLR4_2_08686k2q2rqv6.R.iget(342)==0&false)))
            {{
                __CLR4_2_08686k2q2rqv6.R.inc(343);areEqual = false;
            } 
        }}
		}__CLR4_2_08686k2q2rqv6.R.inc(344);return areEqual;
	}finally{__CLR4_2_08686k2q2rqv6.R.flushNeeded();}}
	
	private void addData(String aData, MyStorage myStorage)
    {try{__CLR4_2_08686k2q2rqv6.R.inc(345);
        __CLR4_2_08686k2q2rqv6.R.inc(346);MyLogger.Instance.finest("IN : DataSize = " + Integer.toString(myStorage.getDataSize())
            + " - aData = " + aData);

        __CLR4_2_08686k2q2rqv6.R.inc(347);myStorage.addData(aData);

        __CLR4_2_08686k2q2rqv6.R.inc(348);MyLogger.Instance.finest("OUT: DataSize = " + Integer.toString(myStorage.getDataSize()));
    }finally{__CLR4_2_08686k2q2rqv6.R.flushNeeded();}}
	
	

}
