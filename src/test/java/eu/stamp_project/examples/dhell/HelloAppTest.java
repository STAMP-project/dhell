package eu.stamp_project.examples.dhell;


import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloAppTest {
    @BeforeClass
    public static void runOnceAtTheBeginning() {
        System.out.println("dhell.HelloAppTest: @BeforeClass - runOnceAtTheBeginning");
    }

    @org.junit.AfterClass
    public static void runOnceAtTheEnd() {
        System.out.println("dhell.HelloAppTest: @AfterClass - runOnceAtTheEnd");
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppDefault__7 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        boolean boolean_0 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber73() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber73__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber73__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber73__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber73__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber73__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber74() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 16;
        Assert.assertEquals(16, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber74__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber74__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber74__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber74__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(16, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber74__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "foo1.traces";
        Assert.assertEquals("foo1.traces", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("foo1.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString370() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString370__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString370__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString370__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString370__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString370__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString371() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("---------------------- Hello World !", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString371__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString371__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString371__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString371__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("---------------------- Hello World !", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("---------------------- Hello World !", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("---------------------- Hello World !", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString371__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationNumber93() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationNumber93__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber93__10)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationNumber93__14 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber93__14);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber93__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationString98() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationString98__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString98__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationString98__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString98__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString98__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1__17);
        boolean o_testHelloAppRun1__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun1__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1__25);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1__17);
        Assert.assertTrue(o_testHelloAppRun1__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber137() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber137__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber137__17);
        boolean o_testHelloAppRun1_literalMutationNumber137__18 = countString.equals(myApp.getMyTraces().getData(1));
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber137__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber137__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber137__26);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber137__17);
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber137__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber139() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber139__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber139__17);
        boolean o_testHelloAppRun1_literalMutationNumber139__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber139__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber139__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber139__26);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber139__17);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber139__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber138_failAssert0() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            String countString;
            myApp = new HelloApp();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            countString = Integer.toString(myApp.getMyPrintCount());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            org.junit.Assert.fail("testHelloAppRun1_literalMutationNumber138 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 8;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("8", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2__17);
        boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2__25);
        boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2__27);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("8", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__17);
        Assert.assertTrue(o_testHelloAppRun2__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__25);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber152() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 4;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("4", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber152__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__18);
        boolean o_testHelloAppRun2_literalMutationNumber152__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber152__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__26);
        boolean o_testHelloAppRun2_literalMutationNumber152__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__28);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("4", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber152__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber154() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber154__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__18);
        boolean o_testHelloAppRun2_literalMutationNumber154__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber154__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__26);
        boolean o_testHelloAppRun2_literalMutationNumber154__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__28);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber154__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString159_failAssert1() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString159 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber164_failAssert2() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber164 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber168_failAssert3() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(-1));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber168 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 22;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("22", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun3__19 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3__19);
        boolean o_testHelloAppRun3__21 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3__21);
        boolean o_testHelloAppRun3__23 = helloString.equals(fileContent.getData(2));
        Assert.assertTrue(o_testHelloAppRun3__23);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("22", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3__19);
        Assert.assertTrue(o_testHelloAppRun3__21);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber225() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber225__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber225__20);
        boolean o_testHelloAppRun3_literalMutationNumber225__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber225__22);
        boolean o_testHelloAppRun3_literalMutationNumber225__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber225__24);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber225__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber225__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber226() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 21;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("21", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber226__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber226__20);
        boolean o_testHelloAppRun3_literalMutationNumber226__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber226__22);
        boolean o_testHelloAppRun3_literalMutationNumber226__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber226__24);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("21", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber226__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber226__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString236_failAssert4() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            helloString.equals(fileContent.getData(2));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString236 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber243_failAssert5() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "hello_run3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(-1));
            helloString.equals(fileContent.getData(2));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber243 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber247_failAssert6() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "hello_run3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            helloString.equals(fileContent.getData(4));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber247 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 4, Size: 4", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppSomeInfoAreReturned() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 22;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        boolean boolean_1 = (myApp.getMyAppSystemInformation(true)) != null;
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppSomeInfoAreReturned_literalMutationNumber322() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 0;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        boolean boolean_2 = (myApp.getMyAppSystemInformation(true)) != null;
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppSomeInfoAreReturned_literalMutationNumber323() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 21;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        boolean boolean_3 = (myApp.getMyAppSystemInformation(true)) != null;
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppSomeInfoAreReturned_literalMutationBoolean333() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 22;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        boolean boolean_13 = (myApp.getMyAppSystemInformation(false)) != null;
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppDetailedInfoAreReturned() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 22;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        String expectedDetailedInfo = "My App Detailed Infos";
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        String o_testHelloAppDetailedInfoAreReturned__7 = myApp.getMyAppSystemInformation(true);
        Assert.assertEquals("My App Detailed Infos", o_testHelloAppDetailedInfoAreReturned__7);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppDetailedInfoAreReturned_literalMutationNumber1() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 0;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        String expectedDetailedInfo = "My App Detailed Infos";
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        String o_testHelloAppDetailedInfoAreReturned_literalMutationNumber1__8 = myApp.getMyAppSystemInformation(true);
        Assert.assertEquals("My App Detailed Infos", o_testHelloAppDetailedInfoAreReturned_literalMutationNumber1__8);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppDetailedInfoAreReturned_literalMutationNumber2() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 21;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        String expectedDetailedInfo = "My App Detailed Infos";
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        String o_testHelloAppDetailedInfoAreReturned_literalMutationNumber2__8 = myApp.getMyAppSystemInformation(true);
        Assert.assertEquals("My App Detailed Infos", o_testHelloAppDetailedInfoAreReturned_literalMutationNumber2__8);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }

    @Test(timeout = 10000)
    public void testHelloAppDetailedInfoAreReturned_literalMutationBoolean18() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        int myCount = 22;
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        String expectedDetailedInfo = "My App Detailed Infos";
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        String o_testHelloAppDetailedInfoAreReturned_literalMutationBoolean18__7 = myApp.getMyAppSystemInformation(false);
        Assert.assertEquals("My App General Infos", o_testHelloAppDetailedInfoAreReturned_literalMutationBoolean18__7);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertEquals("My App Detailed Infos", expectedDetailedInfo);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(22, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
    }
}

