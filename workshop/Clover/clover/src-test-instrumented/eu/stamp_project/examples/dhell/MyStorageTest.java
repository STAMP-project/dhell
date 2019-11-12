/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.File;
import java.util.*;

import eu.stamp_project.examples.dhell.MyStorage;

public class MyStorageTest
{static class __CLR4_2_0ckckk2q2rqx7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620965L,8589935092L,513,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // **********************************************************************
    // public
    // **********************************************************************
    @Test
    public void testMyStorageDefault() throws Exception
    {__CLR4_2_0ckckk2q2rqx7.R.globalSliceStart(getClass().getName(),452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fimyd1ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0ckckk2q2rqx7.R.rethrow($CLV_t2$);}finally{__CLR4_2_0ckckk2q2rqx7.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.MyStorageTest.testMyStorageDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),452,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fimyd1ck() throws Exception{try{__CLR4_2_0ckckk2q2rqx7.R.inc(452);
        __CLR4_2_0ckckk2q2rqx7.R.inc(453);MyStorage myFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(454);String myFileName = "my_storage.txt";
        __CLR4_2_0ckckk2q2rqx7.R.inc(455);File theFile = null;

        __CLR4_2_0ckckk2q2rqx7.R.inc(456);MyStorage.deleteFile(myFileName);

        __CLR4_2_0ckckk2q2rqx7.R.inc(457);myFile = new MyStorage();
        __CLR4_2_0ckckk2q2rqx7.R.inc(458);assertEquals(myFileName, myFile.getFileName());
        __CLR4_2_0ckckk2q2rqx7.R.inc(459);assertEquals(0, myFile.getDataSize());

        __CLR4_2_0ckckk2q2rqx7.R.inc(460);theFile = new File(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(461);theFile = new File(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(462);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_0ckckk2q2rqx7.R.flushNeeded();}}

    @Test
    public void testMyStorageString() throws Exception
    {__CLR4_2_0ckckk2q2rqx7.R.globalSliceStart(getClass().getName(),463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xt2zzpcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0ckckk2q2rqx7.R.rethrow($CLV_t2$);}finally{__CLR4_2_0ckckk2q2rqx7.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.MyStorageTest.testMyStorageString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),463,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xt2zzpcv() throws Exception{try{__CLR4_2_0ckckk2q2rqx7.R.inc(463);
        __CLR4_2_0ckckk2q2rqx7.R.inc(464);MyStorage myFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(465);String myFileName = "foofoo.txt";
        __CLR4_2_0ckckk2q2rqx7.R.inc(466);File theFile = null;

        __CLR4_2_0ckckk2q2rqx7.R.inc(467);MyStorage.deleteFile(myFileName);

        __CLR4_2_0ckckk2q2rqx7.R.inc(468);myFile = new MyStorage(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(469);assertEquals(myFileName, myFile.getFileName());
        __CLR4_2_0ckckk2q2rqx7.R.inc(470);assertEquals(0, myFile.getDataSize());

        __CLR4_2_0ckckk2q2rqx7.R.inc(471);theFile = new File(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(472);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_0ckckk2q2rqx7.R.flushNeeded();}}

    @Test
    public void testAddData() throws Exception
    {__CLR4_2_0ckckk2q2rqx7.R.globalSliceStart(getClass().getName(),473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nq2p0gd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0ckckk2q2rqx7.R.rethrow($CLV_t2$);}finally{__CLR4_2_0ckckk2q2rqx7.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.MyStorageTest.testAddData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),473,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nq2p0gd5() throws Exception{try{__CLR4_2_0ckckk2q2rqx7.R.inc(473);
        __CLR4_2_0ckckk2q2rqx7.R.inc(474);MyStorage myFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(475);String myFileName = "foo.txt";
        __CLR4_2_0ckckk2q2rqx7.R.inc(476);ArrayList<String> myData = new ArrayList<String>();

        // file content
        // 1st line
        // a second line, longer than the first one
        // 3rd line with something else: 2, 4, 8, 16
        __CLR4_2_0ckckk2q2rqx7.R.inc(477);myData.add("1st line");
        __CLR4_2_0ckckk2q2rqx7.R.inc(478);myData.add("a second line, longer than the first one");
        __CLR4_2_0ckckk2q2rqx7.R.inc(479);myData.add("3rd line with something else: 2, 4, 8, 16");

        __CLR4_2_0ckckk2q2rqx7.R.inc(480);myFile = new MyStorage(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(481);for (int i = 0; (((i < myData.size())&&(__CLR4_2_0ckckk2q2rqx7.R.iget(482)!=0|true))||(__CLR4_2_0ckckk2q2rqx7.R.iget(483)==0&false)); i++)
        {{
            __CLR4_2_0ckckk2q2rqx7.R.inc(484);myFile.addData(myData.get(i));
        }

        }__CLR4_2_0ckckk2q2rqx7.R.inc(485);assertEquals(myData.size(), myFile.getDataSize());
        __CLR4_2_0ckckk2q2rqx7.R.inc(486);assertEquals(true, myFile.dataAreEqual(myData));
    }finally{__CLR4_2_0ckckk2q2rqx7.R.flushNeeded();}}

    @Test
    public void testSaveReadData() throws Exception
    {__CLR4_2_0ckckk2q2rqx7.R.globalSliceStart(getClass().getName(),487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01zmvvudj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0ckckk2q2rqx7.R.rethrow($CLV_t2$);}finally{__CLR4_2_0ckckk2q2rqx7.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.MyStorageTest.testSaveReadData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),487,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01zmvvudj() throws Exception{try{__CLR4_2_0ckckk2q2rqx7.R.inc(487);
        __CLR4_2_0ckckk2q2rqx7.R.inc(488);MyStorage myFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(489);MyStorage mySecondFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(490);String myFileName = "bar.txt";
        __CLR4_2_0ckckk2q2rqx7.R.inc(491);File theFile = null;
        __CLR4_2_0ckckk2q2rqx7.R.inc(492);ArrayList<String> myData = new ArrayList<String>();

        __CLR4_2_0ckckk2q2rqx7.R.inc(493);MyStorage.deleteFile(myFileName);

        // file content
        // 1st line
        // a second line, longer than the first one
        // 3rd line with something else: 2, 4, 8, 16
        __CLR4_2_0ckckk2q2rqx7.R.inc(494);myData.add("1st line");
        __CLR4_2_0ckckk2q2rqx7.R.inc(495);myData.add("a second line, longer than the first one");
        __CLR4_2_0ckckk2q2rqx7.R.inc(496);myData.add("3rd line with something else: 2, 4, 8, 16");

        // write data in the first file
        __CLR4_2_0ckckk2q2rqx7.R.inc(497);myFile = new MyStorage(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(498);for (int i = 0; (((i < myData.size())&&(__CLR4_2_0ckckk2q2rqx7.R.iget(499)!=0|true))||(__CLR4_2_0ckckk2q2rqx7.R.iget(500)==0&false)); i++)
        {{
            __CLR4_2_0ckckk2q2rqx7.R.inc(501);myFile.addData(myData.get(i));
        }
        }__CLR4_2_0ckckk2q2rqx7.R.inc(502);assertEquals(myData.size(), myFile.getDataSize());
        __CLR4_2_0ckckk2q2rqx7.R.inc(503);assertEquals(true, myFile.dataAreEqual(myData));

        __CLR4_2_0ckckk2q2rqx7.R.inc(504);myFile.saveData();
        __CLR4_2_0ckckk2q2rqx7.R.inc(505);theFile = new File(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(506);assertEquals(true, theFile.exists());

        // read data in the 2nd file
        __CLR4_2_0ckckk2q2rqx7.R.inc(507);mySecondFile = new MyStorage(myFileName);
        __CLR4_2_0ckckk2q2rqx7.R.inc(508);assertEquals(true, theFile.exists());

        __CLR4_2_0ckckk2q2rqx7.R.inc(509);mySecondFile.readData();
        __CLR4_2_0ckckk2q2rqx7.R.inc(510);assertEquals(myData.size(), mySecondFile.getDataSize());
        __CLR4_2_0ckckk2q2rqx7.R.inc(511);assertEquals(true, mySecondFile.dataAreEqual(myData));

        // compare content
        __CLR4_2_0ckckk2q2rqx7.R.inc(512);assertEquals(true, myFile.isEqual(mySecondFile));
    }finally{__CLR4_2_0ckckk2q2rqx7.R.flushNeeded();}}
}
