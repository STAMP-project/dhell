/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import java.io.File;

import eu.stamp_project.examples.dhell.HelloApp;

public class HelloAppTest
{static class __CLR4_2_09p9pk2q2rqwk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620965L,8589935092L,452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // **********************************************************************
    // public
    // **********************************************************************
    @BeforeClass
    public static void runOnceAtTheBeginning()
    {try{__CLR4_2_09p9pk2q2rqwk.R.inc(349);
         __CLR4_2_09p9pk2q2rqwk.R.inc(350);System.out.println("dhell.HelloAppTest: @BeforeClass - runOnceAtTheBeginning");
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @AfterClass
    public static void runOnceAtTheEnd()
    {try{__CLR4_2_09p9pk2q2rqwk.R.inc(351);
         __CLR4_2_09p9pk2q2rqwk.R.inc(352);System.out.println("dhell.HelloAppTest: @AfterClass - runOnceAtTheEnd");
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppDefault() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dgghnd9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),353,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dgghnd9t() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(353);
        __CLR4_2_09p9pk2q2rqwk.R.inc(354);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(355);File theFile = null;

        __CLR4_2_09p9pk2q2rqwk.R.inc(356);myApp = new HelloApp();
        __CLR4_2_09p9pk2q2rqwk.R.inc(357);assertEquals(1, myApp.getMyPrintCount());
        __CLR4_2_09p9pk2q2rqwk.R.inc(358);assertEquals("myHelloApp.traces", myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(359);assertEquals(0, myApp.cardMyTraces());
        __CLR4_2_09p9pk2q2rqwk.R.inc(360);assertTrue(myApp.returnSomething() > 0);

        __CLR4_2_09p9pk2q2rqwk.R.inc(361);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(362);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppInt() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lt5xwra3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppInt",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),363,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lt5xwra3() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(363);
        __CLR4_2_09p9pk2q2rqwk.R.inc(364);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(365);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(366);int myCount = 8;

        __CLR4_2_09p9pk2q2rqwk.R.inc(367);myApp = new HelloApp(myCount);
        __CLR4_2_09p9pk2q2rqwk.R.inc(368);assertEquals(myCount, myApp.getMyPrintCount());
        __CLR4_2_09p9pk2q2rqwk.R.inc(369);assertEquals("myHelloApp.traces", myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(370);assertEquals(0, myApp.cardMyTraces());

        __CLR4_2_09p9pk2q2rqwk.R.inc(371);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(372);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppString() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gj8yjrad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),373,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gj8yjrad() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(373);
        __CLR4_2_09p9pk2q2rqwk.R.inc(374);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(375);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(376);String MyTracesName = "foo1.traces";

        __CLR4_2_09p9pk2q2rqwk.R.inc(377);myApp = new HelloApp(MyTracesName);
        __CLR4_2_09p9pk2q2rqwk.R.inc(378);assertEquals(1, myApp.getMyPrintCount());
        __CLR4_2_09p9pk2q2rqwk.R.inc(379);assertEquals(MyTracesName, myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(380);assertEquals(0, myApp.cardMyTraces());

        __CLR4_2_09p9pk2q2rqwk.R.inc(381);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(382);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppIntString() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0itoexyan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppIntString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),383,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0itoexyan() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(383);
        __CLR4_2_09p9pk2q2rqwk.R.inc(384);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(385);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(386);int myCount = 8;
        __CLR4_2_09p9pk2q2rqwk.R.inc(387);String MyTracesName = "foo2.traces";

        __CLR4_2_09p9pk2q2rqwk.R.inc(388);myApp = new HelloApp(myCount, MyTracesName);
        __CLR4_2_09p9pk2q2rqwk.R.inc(389);assertEquals(myCount, myApp.getMyPrintCount());
        __CLR4_2_09p9pk2q2rqwk.R.inc(390);assertEquals(MyTracesName, myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(391);assertEquals(0, myApp.cardMyTraces());

        __CLR4_2_09p9pk2q2rqwk.R.inc(392);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(393);assertEquals(false, theFile.exists());
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppRun1() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04tds2aay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppRun1",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),394,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04tds2aay() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(394);
        __CLR4_2_09p9pk2q2rqwk.R.inc(395);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(396);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(397);MyStorage fileContent = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(398);String countString;
        // String message;

        __CLR4_2_09p9pk2q2rqwk.R.inc(399);myApp = new HelloApp();
        __CLR4_2_09p9pk2q2rqwk.R.inc(400);myApp.run();

        // message = "#### TracesName = " + myApp.getMyTracesName();
        // System.out.println(message);

        __CLR4_2_09p9pk2q2rqwk.R.inc(401);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(402);countString = Integer.toString(myApp.getMyPrintCount());
        __CLR4_2_09p9pk2q2rqwk.R.inc(403);assertEquals(true, theFile.exists());
        __CLR4_2_09p9pk2q2rqwk.R.inc(404);assertEquals(true, countString.equals(myApp.getMyTraces().getData(0)));

        __CLR4_2_09p9pk2q2rqwk.R.inc(405);fileContent = new MyStorage(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(406);fileContent.readData();
        __CLR4_2_09p9pk2q2rqwk.R.inc(407);assertEquals(true, fileContent.isEqual(myApp.getMyTraces()));
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppRun2() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01kdt9tbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppRun2",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),408,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01kdt9tbc() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(408);
        __CLR4_2_09p9pk2q2rqwk.R.inc(409);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(410);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(411);MyStorage fileContent = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(412);int myCount = 8;
        __CLR4_2_09p9pk2q2rqwk.R.inc(413);String countString = Integer.toString(myCount);
        __CLR4_2_09p9pk2q2rqwk.R.inc(414);String MyTracesName = "foo3.traces";
        // String message;

        __CLR4_2_09p9pk2q2rqwk.R.inc(415);myApp = new HelloApp(myCount, MyTracesName);
        __CLR4_2_09p9pk2q2rqwk.R.inc(416);myApp.run();

        // message = "#### TracesName = " + myApp.getMyTracesName();
        // System.out.println(message);

        __CLR4_2_09p9pk2q2rqwk.R.inc(417);theFile = new File(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(418);assertEquals(true, theFile.exists());
        __CLR4_2_09p9pk2q2rqwk.R.inc(419);assertEquals(true, countString.equals(myApp.getMyTraces().getData(0)));

        __CLR4_2_09p9pk2q2rqwk.R.inc(420);fileContent = new MyStorage(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(421);fileContent.readData();
        __CLR4_2_09p9pk2q2rqwk.R.inc(422);assertEquals(true, fileContent.isEqual(myApp.getMyTraces()));
        __CLR4_2_09p9pk2q2rqwk.R.inc(423);assertEquals(true, countString.equals(fileContent.getData(0)));
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    @Test
    public void testHelloAppRun3() throws Exception
    {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01om5iobs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppRun3",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),424,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01om5iobs() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(424);
        __CLR4_2_09p9pk2q2rqwk.R.inc(425);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(426);File theFile = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(427);MyStorage fileContent = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(428);int myCount = 22;
        __CLR4_2_09p9pk2q2rqwk.R.inc(429);String countString = Integer.toString(myCount);
        __CLR4_2_09p9pk2q2rqwk.R.inc(430);String helloString = "---------------------- Hello World !";
        __CLR4_2_09p9pk2q2rqwk.R.inc(431);String MyTracesName = "hello_run3.traces";
        // String message;

        __CLR4_2_09p9pk2q2rqwk.R.inc(432);myApp = new HelloApp(myCount, MyTracesName);
        __CLR4_2_09p9pk2q2rqwk.R.inc(433);myApp.run();

        // message = "#### TracesName = " + myApp.getMyTracesName();
        // System.out.println(message);

        __CLR4_2_09p9pk2q2rqwk.R.inc(434);fileContent = new MyStorage(myApp.getMyTracesName());
        __CLR4_2_09p9pk2q2rqwk.R.inc(435);fileContent.readData();
        __CLR4_2_09p9pk2q2rqwk.R.inc(436);assertEquals(true, fileContent.isEqual(myApp.getMyTraces()));
        __CLR4_2_09p9pk2q2rqwk.R.inc(437);assertEquals(true, countString.equals(fileContent.getData(0)));
        __CLR4_2_09p9pk2q2rqwk.R.inc(438);assertEquals(true, helloString.equals(fileContent.getData(2)));
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}
    
    @Test
    public void testHelloAppSomeInfoAreReturned() throws Exception {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cd1hbtc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppSomeInfoAreReturned",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),439,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cd1hbtc7() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(439);
    	__CLR4_2_09p9pk2q2rqwk.R.inc(440);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(441);int myCount = 22;
        __CLR4_2_09p9pk2q2rqwk.R.inc(442);String MyTracesName = "hello_run3.traces";
    	__CLR4_2_09p9pk2q2rqwk.R.inc(443);myApp = new HelloApp(myCount, MyTracesName);
        
        
    	__CLR4_2_09p9pk2q2rqwk.R.inc(444);assertTrue("App should return some info", myApp.getMyAppSystemInformation(true)!= null);
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}
    
    @Test
    public void testHelloAppDetailedInfoAreReturned() throws Exception {__CLR4_2_09p9pk2q2rqwk.R.globalSliceStart(getClass().getName(),445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zsi7pcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_09p9pk2q2rqwk.R.rethrow($CLV_t2$);}finally{__CLR4_2_09p9pk2q2rqwk.R.globalSliceEnd(getClass().getName(),"eu.stamp_project.examples.dhell.HelloAppTest.testHelloAppDetailedInfoAreReturned",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),445,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zsi7pcd() throws Exception{try{__CLR4_2_09p9pk2q2rqwk.R.inc(445);
    	__CLR4_2_09p9pk2q2rqwk.R.inc(446);HelloApp myApp = null;
        __CLR4_2_09p9pk2q2rqwk.R.inc(447);int myCount = 22;
        __CLR4_2_09p9pk2q2rqwk.R.inc(448);String MyTracesName = "hello_run3.traces";
        
        __CLR4_2_09p9pk2q2rqwk.R.inc(449);String expectedDetailedInfo = "My App Detailed Infos";
        
    	__CLR4_2_09p9pk2q2rqwk.R.inc(450);myApp = new HelloApp(myCount, MyTracesName);
        
        
    	__CLR4_2_09p9pk2q2rqwk.R.inc(451);assertEquals("App should return deatailed info", expectedDetailedInfo, myApp.getMyAppSystemInformation(true));
    }finally{__CLR4_2_09p9pk2q2rqwk.R.flushNeeded();}}

    // **********************************************************************
    // private
    // **********************************************************************
    // ******** attributes
}
