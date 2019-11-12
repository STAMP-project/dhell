package eu.stamp_project.examples.dhell;


import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloAppTest {
    private int sleep = 200;

    @BeforeClass
    public static void runOnceAtTheBeginning() {
        System.out.println("dhell.HelloAppTest: @BeforeClass - runOnceAtTheBeginning");
    }

    @org.junit.AfterClass
    public static void runOnceAtTheEnd() {
        System.out.println("dhell.HelloAppTest: @AfterClass - runOnceAtTheEnd");
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add4() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add4__7 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add4__7)));
        String o_testHelloAppDefault_add4__8 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add4__8);
        int o_testHelloAppDefault_add4__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add4__9)));
        int o_testHelloAppDefault_add4__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add4__10)));
        boolean boolean_5 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add4__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add4__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add4__7)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add4__8);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add4__9)));
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add4__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add3() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add3__7 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add3__7)));
        myApp.getMyTracesName();
        String o_testHelloAppDefault_add3__9 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add3__9);
        int o_testHelloAppDefault_add3__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add3__10)));
        boolean boolean_4 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add3__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add3__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add3__7)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add3__9);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add3__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add2() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        int o_testHelloAppDefault_add2__8 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add2__8)));
        String o_testHelloAppDefault_add2__9 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add2__9);
        int o_testHelloAppDefault_add2__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add2__10)));
        boolean boolean_3 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add2__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add2__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add2__8)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add2__9);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add2__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add1() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add1__8 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add1__8)));
        String o_testHelloAppDefault_add1__9 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add1__9);
        int o_testHelloAppDefault_add1__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add1__10)));
        boolean boolean_2 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add1__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add1__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add1__8)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add1__9);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add1__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add7() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add7__7 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add7__7)));
        String o_testHelloAppDefault_add7__8 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add7__8);
        int o_testHelloAppDefault_add7__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add7__9)));
        boolean boolean_8 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add7__15 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add7__15);
        boolean o_testHelloAppDefault_add7__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add7__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add7__7)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add7__8);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add7__9)));
        Assert.assertFalse(o_testHelloAppDefault_add7__15);
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add6() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add6__7 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add6__7)));
        String o_testHelloAppDefault_add6__8 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add6__8);
        int o_testHelloAppDefault_add6__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add6__9)));
        boolean boolean_7 = (myApp.returnSomething()) > 0;
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add6__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add6__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add6__7)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add6__8);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add6__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault_add5() throws Exception {
        Thread.sleep(sleep);
        String myTracesName = "myHelloApp.traces";
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp(myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        int o_testHelloAppDefault_add5__7 = myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add5__7)));
        String o_testHelloAppDefault_add5__8 = myApp.getMyTracesName();
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add5__8);
        int o_testHelloAppDefault_add5__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add5__9)));
        Integer o_testHelloAppDefault_add5__10 = myApp.returnSomething();
        Assert.assertEquals(7, ((int) (o_testHelloAppDefault_add5__10)));
        boolean boolean_6 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault_add5__16 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault_add5__16);
        Assert.assertEquals("myHelloApp.traces", myTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(1, ((int) (o_testHelloAppDefault_add5__7)));
        Assert.assertEquals("myHelloApp.traces", o_testHelloAppDefault_add5__8);
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault_add5__9)));
        Assert.assertEquals(7, ((int) (o_testHelloAppDefault_add5__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12230() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12057_add12230__16 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12057_add12230__16);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12057_add12230__16);
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12276() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        String o_testHelloAppRun1_add12054_add12276__27 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12276__27);
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12276__27);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12125() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058_add12125__22 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_add12058_add12125__22);
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12058_add12125__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12238() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057_add12238__19 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12057_add12238__19);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12057_add12238__19);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12419() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12417() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12240() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12376() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        String o_testHelloAppRun1_add12053_add12376__25 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12053_add12376__25);
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12053_add12376__25);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12243() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12315() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12319() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12321() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12367() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12367__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12367__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12324() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12111() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12111__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12111__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12226() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12109() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12407() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12331() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12404() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12330() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12284() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12368() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053_add12368__22 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12053_add12368__22);
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12053_add12368__22);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12129() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12339() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050_add12339__23 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_add12050_add12339__23);
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12050_add12339__23);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12363() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053_add12363__19 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12053_add12363__19);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12053_add12363__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12245() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12360() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12199() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12112() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12120() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12186() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12337() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12195() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12124() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12108() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12108__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12108__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12106() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getMyTraces();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12106__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12106__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12255() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054_add12255__19 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12054_add12255__19);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12054_add12255__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12379() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048_add12379__20 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12379__20);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12379__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12379__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12379__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12418() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12418__32 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12418__32);
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12418__32);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12149() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        String o_testHelloAppRun1_add12052_add12149__23 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12052_add12149__23);
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12052_add12149__23);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12103() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12103__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12103__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12101() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12101__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12101__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12371() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12048_add12371__17 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12048_add12371__17);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12371__34 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12371__34);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12048_add12371__17);
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12257() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        String o_testHelloAppRun1_add12057_add12257__22 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12057_add12257__22);
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12057_add12257__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12355() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12053_add12355__16 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12053_add12355__16);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12053_add12355__16);
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12258() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060_add12258__22 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_add12060_add12258__22);
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12060_add12258__22);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12222() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12049_add12222__17 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12049_add12222__17);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12049_add12222__17);
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12351() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12144() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052_add12144__23 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_add12052_add12144__23);
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12052_add12144__23);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12154() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12153() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056_add12153__32 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12056_add12153__32);
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12056_add12153__32);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12229() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049_add12229__20 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_add12049_add12229__20);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_add12049_add12229__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12263() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        String o_testHelloAppRun1_add12054_add12263__22 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12263__22);
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12263__22);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12428() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12428__32 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12428__32);
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12428__32);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12347() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12172() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12358() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12180() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12304() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12166() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12133() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        String o_testHelloAppRun1_add12052_add12133__17 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12052_add12133__17);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12052_add12133__17);
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12142() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12357() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12055_add12357__16 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12055_add12357__16);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12055_add12357__16);
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12307() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12130() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12273() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12232() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getMyPrintCount();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12394() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12394__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12394__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12314() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12317() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12274() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12311() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12398() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12398__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12398__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12432() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12432__32 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12432__32);
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12432__32);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12136() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12316() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12134() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        String o_testHelloAppRun1_add12056_add12134__23 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12056_add12134__23);
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12056_add12134__23);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12389() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12283() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12313() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12278() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12310() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12201() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12369() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055_add12369__22 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055_add12369__22);
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055_add12369__22);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12403() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055_add12403__35 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12055_add12403__35);
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12055_add12403__35);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12162() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12318() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12179() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12415() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12265() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12171() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12247() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12054_add12247__16 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12247__16);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12054_add12247__16);
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12286() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060_add12286__32 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12060_add12286__32);
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12060_add12286__32);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12305() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12269() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12204() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12205() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12377() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12206() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12212() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12208() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12157() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12374() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        myApp.getMyTraces();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12214() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getMyTraces();
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12200() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12429() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12427() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12298() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyPrintCount();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12215() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12143() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12143__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12143__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(12, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(12, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12217() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12054_add12293() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12054__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12054__20 = countString.equals(myApp.getMyTraces().getData(0));
        boolean o_testHelloAppRun1_add12054__23 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12054__30 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12060_add12294() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12060__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12060__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12060__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12299() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12113() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12329() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12268() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12116() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        String o_testHelloAppRun1_add12056_add12116__16 = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", o_testHelloAppRun1_add12056_add12116__16);
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", o_testHelloAppRun1_add12056_add12116__16);
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12326() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.getShouldPrintOnStdout();
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12194() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12392() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12386() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12198() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12423() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12285() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12139() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12058_add12139__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertFalse(o_testHelloAppRun1_add12058_add12139__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12190() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12058_add12135() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12058__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12058__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12048_add12349() throws Exception {
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12048__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12048__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12048_add12349__33 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12048_add12349__33);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12193() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059_add12193__35 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_add12059_add12193__35);
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertTrue(o_testHelloAppRun1_add12059_add12193__35);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12057_add12289() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12057__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12057__20 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12057__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12050_add12397() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.getMyTracesName();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12050__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12050__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12050__28 = fileContent.isEqual(myApp.getMyTraces());
        ((HelloApp) (myApp)).getMyTraces().getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12426() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12275() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12391() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12388() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.getDataSize();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12049_add12279() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12049__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12049__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12049__28 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getShouldPrintOnStdout();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12384() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        myApp.getMyTracesName();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12056_add12127() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12056__19 = theFile.exists();
        myApp.getMyTraces();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12056__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12056__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12059_add12183() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12059__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12059__20 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12059__27 = fileContent.isEqual(myApp.getMyTraces());
        boolean o_testHelloAppRun1_add12059__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12399() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(8, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12053_add12380() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12053__19 = theFile.exists();
        boolean o_testHelloAppRun1_add12053__20 = theFile.exists();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12053__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12053__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12435() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        fileContent.getDataSize();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12052_add12174() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        myApp.getMyPrintCount();
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12052__20 = theFile.exists();
        boolean o_testHelloAppRun1_add12052__21 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        myApp.getMyTraces();
        boolean o_testHelloAppRun1_add12052__28 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_add12055_add12434() throws Exception {
        Thread.sleep(sleep);
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        String MyTracesName = "hello_run1.traces";
        myApp = new HelloApp(MyTracesName);
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_add12055__19 = theFile.exists();
        String o_testHelloAppRun1_add12055__20 = myApp.getMyTraces().getData(0);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        boolean o_testHelloAppRun1_add12055__22 = countString.equals(myApp.getMyTraces().getData(0));
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        fileContent.readData();
        boolean o_testHelloAppRun1_add12055__29 = fileContent.isEqual(myApp.getMyTraces());
        myApp.getMyTraces();
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals("1", countString);
        Assert.assertEquals("1", o_testHelloAppRun1_add12055__20);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
    }
}

