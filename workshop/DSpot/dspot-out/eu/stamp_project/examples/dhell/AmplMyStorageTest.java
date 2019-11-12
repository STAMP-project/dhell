package eu.stamp_project.examples.dhell;


import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;


public class AmplMyStorageTest {
    @Test(timeout = 10000)
    public void testMyStorageDefault_add6426() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_add6426__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6426__8);
        int o_testMyStorageDefault_add6426__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_add6426__9)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_add6426__14 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_add6426__14);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6426__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_add6426__9)));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_add6427() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        myFile.getFileName();
        String o_testMyStorageDefault_add6427__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6427__8);
        int o_testMyStorageDefault_add6427__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_add6427__9)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_add6427__14 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_add6427__14);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6427__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_add6427__9)));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_remove6430() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_remove6430__6 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_remove6430__6);
        int o_testMyStorageDefault_remove6430__7 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_remove6430__7)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_remove6430__12 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_remove6430__12);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_remove6430__6);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_remove6430__7)));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437() throws Exception {
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6437__9)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6437__14);
        myFile.addData(__DSPOT_aData_1867);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6437__9)));
        Assert.assertFalse(o_testMyStorageDefault_mg6437__14);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6438() throws Exception {
        ArrayList<String> __DSPOT_otherData_1868 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6438__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
        int o_testMyStorageDefault_mg6438__10 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6438__10)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6438__15 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6438__15);
        boolean o_testMyStorageDefault_mg6438__16 = myFile.dataAreEqual(__DSPOT_otherData_1868);
        Assert.assertTrue(o_testMyStorageDefault_mg6438__16);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6438__10)));
        Assert.assertFalse(o_testMyStorageDefault_mg6438__15);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439() throws Exception {
        String __DSPOT_aData_1869 = ")E4c*Az^48d,]NKv|s{d";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6439__9)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6439__14);
        myFile.delData(__DSPOT_aData_1869);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6439__9)));
        Assert.assertFalse(o_testMyStorageDefault_mg6439__14);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441() throws Exception {
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6441__10)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6441__15);
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        Assert.assertTrue(o_testMyStorageDefault_mg6441__16);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6441__10)));
        Assert.assertFalse(o_testMyStorageDefault_mg6441__15);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6442__8)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6442__13);
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6442__8)));
        Assert.assertFalse(o_testMyStorageDefault_mg6442__13);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6443__8)));
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_mg6443__13);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6443__8)));
        Assert.assertFalse(o_testMyStorageDefault_mg6443__13);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefaultnull6460_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = null;
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            myFile.getFileName();
            myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            theFile.exists();
            Assert.fail("testMyStorageDefaultnull6460 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6711() throws Exception {
        String __DSPOT_aData_1884 = "ie:J)i^?fINu4b:1|J$%";
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        __DSPOT_anotherStorage_1871.addData(__DSPOT_aData_1884);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6965() throws Exception {
        ArrayList<String> __DSPOT_otherData_1921 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageDefault_mg6442_mg6965__23 = myFile.dataAreEqual(__DSPOT_otherData_1921);
        Assert.assertTrue(o_testMyStorageDefault_mg6442_mg6965__23);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_add6427_mg6700() throws Exception {
        String __DSPOT_aData_1879 = "Kn/-Xp&^.)4<q_&K(SF2";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        myFile.getFileName();
        String o_testMyStorageDefault_add6427__8 = myFile.getFileName();
        int o_testMyStorageDefault_add6427__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_add6427__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1879);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_literalMutationString6945() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("---------------------- Hello World !", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_add6730() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439_mg6873() throws Exception {
        String __DSPOT_aData_1869 = ")E4c*Az^48d,]NKv|s{d";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1869);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439_mg6860() throws Exception {
        MyStorage __DSPOT_anotherStorage_1911 = new MyStorage("(dB?u[-=+VV6]*86s-h3");
        String __DSPOT_aData_1869 = ")E4c*Az^48d,]NKv|s{d";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1869);
        boolean o_testMyStorageDefault_mg6439_mg6860__24 = myFile.isEqual(__DSPOT_anotherStorage_1911);
        Assert.assertTrue(o_testMyStorageDefault_mg6439_mg6860__24);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6784() throws Exception {
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.saveData();
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6749() throws Exception {
        String __DSPOT_aData_1899 = "r6&Q4mkgM$?pE+i=JSd[";
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.delData(__DSPOT_aData_1899);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6963() throws Exception {
        String __DSPOT_aData_1920 = "YUNCr hy,[idOH5h!Z.0";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.addData(__DSPOT_aData_1920);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6969() throws Exception {
        String __DSPOT_aData_1923 = "UR)Nh(3?9CzaW0Z}`X.!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_1923);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6741() throws Exception {
        ArrayList<String> __DSPOT_otherData_1897 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        boolean o_testMyStorageDefault_mg6437_mg6741__25 = myFile.dataAreEqual(__DSPOT_otherData_1897);
        Assert.assertFalse(o_testMyStorageDefault_mg6437_mg6741__25);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6979() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_remove6430_mg6645() throws Exception {
        String __DSPOT_aData_1872 = "F&@UI%+G!:q/J41(z5|R";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_remove6430__6 = myFile.getFileName();
        int o_testMyStorageDefault_remove6430__7 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_remove6430__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_1872);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_remove6925() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6818() throws Exception {
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_mg6956() throws Exception {
        ArrayList<String> __DSPOT_otherData_1918 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6443_mg6956__23 = myFile.dataAreEqual(__DSPOT_otherData_1918);
        Assert.assertTrue(o_testMyStorageDefault_mg6443_mg6956__23);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_remove6660() throws Exception {
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_add6626() throws Exception {
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.getFileName();
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6438_mg6744() throws Exception {
        ArrayList<String> __DSPOT_otherData_1868 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6438__9 = myFile.getFileName();
        int o_testMyStorageDefault_mg6438__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6438__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6438__16 = myFile.dataAreEqual(__DSPOT_otherData_1868);
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6973() throws Exception {
        MyStorage __DSPOT_anotherStorage_1926 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageDefault_mg6442_mg6973__23 = myFile.isEqual(__DSPOT_anotherStorage_1926);
        Assert.assertTrue(o_testMyStorageDefault_mg6442_mg6973__23);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefaultnull6460_failAssert0_mg6893_failAssert0() throws Exception {
        try {
            {
                MyStorage __DSPOT_anotherStorage_1916 = new MyStorage("k?3[=m#I[iBP4.zy:zNY");
                MyStorage myFile = null;
                String myFileName = null;
                File theFile = null;
                MyStorage.deleteFile(myFileName);
                myFile = new MyStorage();
                myFile.getFileName();
                myFile.getDataSize();
                theFile = new File(myFileName);
                theFile = new File(myFileName);
                theFile.exists();
                myFile.isEqual(__DSPOT_anotherStorage_1916);
            }
            Assert.fail("testMyStorageDefaultnull6460_failAssert0_mg6893 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6737_failAssert0() throws Exception {
        try {
            int __DSPOT_index_1896 = 2124611681;
            MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "my_storage.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
            int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
            boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
            __DSPOT_anotherStorage_1871.getData(__DSPOT_index_1896);
            Assert.fail("testMyStorageDefault_mg6441_mg6737 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 2124611681, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_literalMutationString6945_mg8661() throws Exception {
        MyStorage __DSPOT_anotherStorage_2068 = new MyStorage("ABjLXA6_9Vs|[WBpHJy&");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageDefault_mg6442_literalMutationString6945_mg8661__23 = myFile.isEqual(__DSPOT_anotherStorage_2068);
        Assert.assertTrue(o_testMyStorageDefault_mg6442_literalMutationString6945_mg8661__23);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("---------------------- Hello World !", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6969_remove7758() throws Exception {
        String __DSPOT_aData_1923 = "UR)Nh(3?9CzaW0Z}`X.!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_1923);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6818_add7678() throws Exception {
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        myFile.saveData();
        myFile.getDataSize();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6969_mg7907() throws Exception {
        String __DSPOT_aData_1923 = "UR)Nh(3?9CzaW0Z}`X.!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_1923);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6749_literalMutationString8827() throws Exception {
        String __DSPOT_aData_1899 = "---------------------- Hello World !";
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.delData(__DSPOT_aData_1899);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6818_mg7776() throws Exception {
        MyStorage __DSPOT_anotherStorage_1952 = new MyStorage("mf0QY5)]JWBw]Ajn53hR");
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6441_mg6818_mg7776__28 = __DSPOT_anotherStorage_1871.isEqual(__DSPOT_anotherStorage_1952);
        Assert.assertTrue(o_testMyStorageDefault_mg6441_mg6818_mg7776__28);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_literalMutationString6945_literalMutationString8614() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "---------------------- Hell World !";
        Assert.assertEquals("---------------------- Hell World !", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("---------------------- Hell World !", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439litString6989_mg8216() throws Exception {
        String __DSPOT_aData_2012 = "g#;9Qd=UHuy5c`T=*n=,";
        String __DSPOT_aData_1869 = ")E4c*Az^48d,]NKv|s{d";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "xu2PJS`A:.EP:7";
        Assert.assertEquals("xu2PJS`A:.EP:7", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1869);
        myFile.addData(__DSPOT_aData_2012);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("xu2PJS`A:.EP:7", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6741_literalMutationString8318() throws Exception {
        ArrayList<String> __DSPOT_otherData_1897 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storJage.txt";
        Assert.assertEquals("my_storJage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        boolean o_testMyStorageDefault_mg6437_mg6741__25 = myFile.dataAreEqual(__DSPOT_otherData_1897);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storJage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_add6626_mg8207() throws Exception {
        MyStorage __DSPOT_anotherStorage_2008 = new MyStorage();
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.getFileName();
        boolean o_testMyStorageDefault_mg6437_add6626_mg8207__25 = myFile.isEqual(__DSPOT_anotherStorage_2008);
        Assert.assertFalse(o_testMyStorageDefault_mg6437_add6626_mg8207__25);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_remove6925_mg7894() throws Exception {
        String __DSPOT_aData_1972 = "k&!, $o(PU]THvc8Pk(t";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        myFile.delData(__DSPOT_aData_1972);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439_mg6873litString9176() throws Exception {
        String __DSPOT_aData_1869 = ":";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1869);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6438_mg6744litString8624() throws Exception {
        ArrayList<String> __DSPOT_otherData_1868 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storae.txt";
        Assert.assertEquals("my_storae.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6438__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
        int o_testMyStorageDefault_mg6438__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6438__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6438__16 = myFile.dataAreEqual(__DSPOT_otherData_1868);
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storae.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6979litString8219() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "\n";
        Assert.assertEquals("\n", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("\n", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6973litString8256() throws Exception {
        MyStorage __DSPOT_anotherStorage_1926 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "3rd line with something else: 2, 4, 8, 16";
        Assert.assertEquals("3rd line with something else: 2, 4, 8, 16", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageDefault_mg6442_mg6973__23 = myFile.isEqual(__DSPOT_anotherStorage_1926);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("3rd line with something else: 2, 4, 8, 16", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6963litString8710() throws Exception {
        String __DSPOT_aData_1920 = "";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.addData(__DSPOT_aData_1920);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6439_mg6860litString9263() throws Exception {
        MyStorage __DSPOT_anotherStorage_1911 = new MyStorage("(dB?u[-=+VV6]*86s-h3");
        String __DSPOT_aData_1869 = ")E4c*Az^48d,]NKv|s{d";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "m_storage.txt";
        Assert.assertEquals("m_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6439__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
        int o_testMyStorageDefault_mg6439__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6439__14 = theFile.exists();
        myFile.delData(__DSPOT_aData_1869);
        boolean o_testMyStorageDefault_mg6439_mg6860__24 = myFile.isEqual(__DSPOT_anotherStorage_1911);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("m_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6439__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_mg6956litString8684() throws Exception {
        ArrayList<String> __DSPOT_otherData_1918 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "?faF%WDz<pTLZx";
        Assert.assertEquals("?faF%WDz<pTLZx", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6443_mg6956__23 = myFile.dataAreEqual(__DSPOT_otherData_1918);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("?faF%WDz<pTLZx", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6979_add8032() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442_mg6979_add8032__10 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6442_mg6979_add8032__10)));
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        Assert.assertEquals(0, ((int) (o_testMyStorageDefault_mg6442_mg6979_add8032__10)));
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_remove6660_mg8139() throws Exception {
        String __DSPOT_aData_1985 = "c[#WVqy2fBA0^H56&$aE";
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        __DSPOT_anotherStorage_1871.delData(__DSPOT_aData_1985);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_mg6956_mg8589() throws Exception {
        String __DSPOT_aData_2052 = "faiU(O.Sa6B*OgL6E=U(";
        ArrayList<String> __DSPOT_otherData_1918 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6443_mg6956__23 = myFile.dataAreEqual(__DSPOT_otherData_1918);
        myFile.addData(__DSPOT_aData_2052);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6963_mg8547() throws Exception {
        ArrayList<String> __DSPOT_otherData_2045 = new ArrayList<String>();
        String __DSPOT_aData_1920 = "YUNCr hy,[idOH5h!Z.0";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.addData(__DSPOT_aData_1920);
        boolean o_testMyStorageDefault_mg6442_mg6963_mg8547__25 = myFile.dataAreEqual(__DSPOT_otherData_2045);
        Assert.assertFalse(o_testMyStorageDefault_mg6442_mg6963_mg8547__25);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6711_mg8317() throws Exception {
        String __DSPOT_aData_1884 = "ie:J)i^?fINu4b:1|J$%";
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        __DSPOT_anotherStorage_1871.addData(__DSPOT_aData_1884);
        __DSPOT_anotherStorage_1871.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6438_mg6744_mg8605() throws Exception {
        ArrayList<String> __DSPOT_otherData_1868 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6438__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
        int o_testMyStorageDefault_mg6438__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6438__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6438__16 = myFile.dataAreEqual(__DSPOT_otherData_1868);
        myFile.readData();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6438__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6969_mg7851() throws Exception {
        String __DSPOT_aData_1965 = "?D>LPr3|hO u6<;xCdL}";
        String __DSPOT_aData_1923 = "UR)Nh(3?9CzaW0Z}`X.!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_1923);
        myFile.addData(__DSPOT_aData_1965);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_literalMutationString6685_mg7778() throws Exception {
        String __DSPOT_aData_1953 = "|Gz+Rn#:6ke5&qv$[LbK";
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storagertxt";
        Assert.assertEquals("my_storagertxt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        myFile.delData(__DSPOT_aData_1953);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storagertxt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_remove6660_mg8150() throws Exception {
        MyStorage __DSPOT_anotherStorage_1989 = new MyStorage("yZP?g?.4:[nnm{hU3_I9");
        MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
        int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
        boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
        boolean o_testMyStorageDefault_mg6441_remove6660_mg8150__26 = __DSPOT_anotherStorage_1871.isEqual(__DSPOT_anotherStorage_1989);
        Assert.assertTrue(o_testMyStorageDefault_mg6441_remove6660_mg8150__26);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6441__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_mg6956_remove8549() throws Exception {
        ArrayList<String> __DSPOT_otherData_1918 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6443_mg6956__23 = myFile.dataAreEqual(__DSPOT_otherData_1918);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6784litString9150() throws Exception {
        String __DSPOT_aData_1867 = "\n";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        myFile.saveData();
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6442_mg6973_mg8232() throws Exception {
        MyStorage __DSPOT_anotherStorage_2017 = new MyStorage();
        MyStorage __DSPOT_anotherStorage_1926 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6442__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
        int o_testMyStorageDefault_mg6442__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6442__13 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageDefault_mg6442_mg6973__23 = myFile.isEqual(__DSPOT_anotherStorage_1926);
        boolean o_testMyStorageDefault_mg6442_mg6973_mg8232__28 = myFile.isEqual(__DSPOT_anotherStorage_2017);
        Assert.assertTrue(o_testMyStorageDefault_mg6442_mg6973_mg8232__28);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6442__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6443_mg6956_mg8598() throws Exception {
        String __DSPOT_aData_2056 = "vG),r5;J)cjVSk9}E{:7";
        ArrayList<String> __DSPOT_otherData_1918 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6443__7 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
        int o_testMyStorageDefault_mg6443__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6443__13 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageDefault_mg6443_mg6956__23 = myFile.dataAreEqual(__DSPOT_otherData_1918);
        myFile.delData(__DSPOT_aData_2056);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6443__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6741_mg8366() throws Exception {
        ArrayList<String> __DSPOT_otherData_1897 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "my_storage.txt";
        Assert.assertEquals("my_storage.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
        int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
        myFile.addData(__DSPOT_aData_1867);
        boolean o_testMyStorageDefault_mg6437_mg6741__25 = myFile.dataAreEqual(__DSPOT_otherData_1897);
        myFile.readData();
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_mg6437__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_add6427_mg6694_failAssert0litNum7946() throws Exception {
        {
            ArrayList<String> __DSPOT_otherData_1878 = new ArrayList<String>(224162745);
            MyStorage myFile = null;
            Assert.assertNull(myFile);
            String myFileName = "my_storage.txt";
            Assert.assertEquals("my_storage.txt", myFileName);
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
            Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
            myFile.getFileName();
            String o_testMyStorageDefault_add6427__8 = myFile.getFileName();
            Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6427__8);
            int o_testMyStorageDefault_add6427__9 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_add6427__14 = theFile.exists();
            boolean o_testMyStorageDefault_add6427_mg6694_failAssert0litNum7946__24 = myFile.dataAreEqual(__DSPOT_otherData_1878);
            Assert.assertTrue(o_testMyStorageDefault_add6427_mg6694_failAssert0litNum7946__24);
            Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
            Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
            Assert.assertEquals("my_storage.txt", myFileName);
            Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
            Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
            Assert.assertEquals("my_storage.txt", o_testMyStorageDefault_add6427__8);
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6737_failAssert0null9229_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_1896 = 2124611681;
                MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
                MyStorage myFile = null;
                String myFileName = null;
                File theFile = null;
                MyStorage.deleteFile(myFileName);
                myFile = new MyStorage();
                String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
                int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
                theFile = new File(myFileName);
                theFile = new File(myFileName);
                boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
                boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(__DSPOT_anotherStorage_1871);
                __DSPOT_anotherStorage_1871.getData(__DSPOT_index_1896);
            }
            Assert.fail("testMyStorageDefault_mg6441_mg6737_failAssert0null9229 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6437_mg6749null9279_failAssert0() throws Exception {
        try {
            String __DSPOT_aData_1899 = "r6&Q4mkgM$?pE+i=JSd[";
            String __DSPOT_aData_1867 = "uNPfEq}Zc-vp9}UhH.7x";
            MyStorage myFile = null;
            String myFileName = "my_storage.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            String o_testMyStorageDefault_mg6437__8 = myFile.getFileName();
            int o_testMyStorageDefault_mg6437__9 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_mg6437__14 = theFile.exists();
            myFile.addData(null);
            myFile.delData(__DSPOT_aData_1899);
            Assert.fail("testMyStorageDefault_mg6437_mg6749null9279 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_literalMutationString6685null8009_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "my_storagertxt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
            int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
            boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(null);
            Assert.fail("testMyStorageDefault_mg6441_literalMutationString6685null8009 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_remove6660null8325_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "my_storage.txt";
            File theFile = null;
            myFile = new MyStorage();
            String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
            int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
            boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(null);
            Assert.fail("testMyStorageDefault_mg6441_remove6660null8325 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_mg6441_mg6711null8571_failAssert0() throws Exception {
        try {
            String __DSPOT_aData_1884 = "ie:J)i^?fINu4b:1|J$%";
            MyStorage __DSPOT_anotherStorage_1871 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "my_storage.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage();
            String o_testMyStorageDefault_mg6441__9 = myFile.getFileName();
            int o_testMyStorageDefault_mg6441__10 = myFile.getDataSize();
            theFile = new File(myFileName);
            theFile = new File(myFileName);
            boolean o_testMyStorageDefault_mg6441__15 = theFile.exists();
            boolean o_testMyStorageDefault_mg6441__16 = myFile.isEqual(null);
            __DSPOT_anotherStorage_1871.addData(__DSPOT_aData_1884);
            Assert.fail("testMyStorageDefault_mg6441_mg6711null8571 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageString_add9843() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_add9843__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_add9843__8);
        int o_testMyStorageString_add9843__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_add9843__9)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_add9843__12 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_add9843__12);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_add9843__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_add9843__9)));
    }

    @Test(timeout = 10000)
    public void testMyStorageString_remove9847() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_remove9847__6 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        int o_testMyStorageString_remove9847__7 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_remove9847__7)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_remove9847__10 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_remove9847__10);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_remove9847__7)));
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854() throws Exception {
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9854__9)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9854__12);
        myFile.addData(__DSPOT_aData_2129);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9854__9)));
        Assert.assertFalse(o_testMyStorageString_mg9854__12);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9855() throws Exception {
        ArrayList<String> __DSPOT_otherData_2130 = new ArrayList<String>(Collections.emptyList());
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9855__10 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9855__10);
        int o_testMyStorageString_mg9855__11 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9855__11)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9855__14 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9855__14);
        boolean o_testMyStorageString_mg9855__15 = myFile.dataAreEqual(__DSPOT_otherData_2130);
        Assert.assertTrue(o_testMyStorageString_mg9855__15);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9855__10);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9855__11)));
        Assert.assertFalse(o_testMyStorageString_mg9855__14);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856() throws Exception {
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*Rm!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9856__9)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9856__12);
        myFile.delData(__DSPOT_aData_2131);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9856__9)));
        Assert.assertFalse(o_testMyStorageString_mg9856__12);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858() throws Exception {
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9858__10)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9858__13);
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        Assert.assertTrue(o_testMyStorageString_mg9858__14);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9858__10)));
        Assert.assertFalse(o_testMyStorageString_mg9858__13);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9859__8)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9859__11);
        myFile.readData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9859__8)));
        Assert.assertFalse(o_testMyStorageString_mg9859__11);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9860__8)));
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9860__11);
        myFile.saveData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9860__8)));
        Assert.assertFalse(o_testMyStorageString_mg9860__11);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9857_failAssert0() throws Exception {
        try {
            int __DSPOT_index_2132 = 2013050851;
            MyStorage myFile = null;
            String myFileName = "foofoo.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage(myFileName);
            myFile.getFileName();
            myFile.getDataSize();
            theFile = new File(myFileName);
            theFile.exists();
            myFile.getData(__DSPOT_index_2132);
            Assert.fail("testMyStorageString_mg9857 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 2013050851, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9855_mg10430() throws Exception {
        ArrayList<String> __DSPOT_otherData_2130 = new ArrayList<String>(Collections.emptyList());
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9855__10 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9855__10);
        int o_testMyStorageString_mg9855__11 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9855__14 = theFile.exists();
        boolean o_testMyStorageString_mg9855__15 = myFile.dataAreEqual(__DSPOT_otherData_2130);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9855__10);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10258() throws Exception {
        ArrayList<String> __DSPOT_otherData_2175 = new ArrayList<String>(Collections.emptyList());
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        boolean o_testMyStorageString_mg9858_mg10258__26 = myFile.dataAreEqual(__DSPOT_otherData_2175);
        Assert.assertTrue(o_testMyStorageString_mg9858_mg10258__26);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860litString10287() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "fo_foo.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10170() throws Exception {
        String __DSPOT_aData_2150 = "[Iww*[I|&jqL])X5Ii#p";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        myFile.delData(__DSPOT_aData_2150);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_mg10205() throws Exception {
        String __DSPOT_aData_2163 = "=[,uU}::G|G6uUEpR3Z6";
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*Rm!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        myFile.addData(__DSPOT_aData_2163);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10198() throws Exception {
        String __DSPOT_aData_2160 = ">on(cI&>2WByS`F$}hS,";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_2160);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_literalMutationString10112() throws Exception {
        String __DSPOT_aData_2131 = "---------------------- Hello World !";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10190() throws Exception {
        ArrayList<String> __DSPOT_otherData_2157 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageString_mg9859_mg10190__21 = myFile.dataAreEqual(__DSPOT_otherData_2157);
        Assert.assertTrue(o_testMyStorageString_mg9859_mg10190__21);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_remove9847_mg10113() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_remove9847__6 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        int o_testMyStorageString_remove9847__7 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_remove9847__10 = theFile.exists();
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_remove9847_mg10121() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_remove9847__6 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        int o_testMyStorageString_remove9847__7 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_remove9847__10 = theFile.exists();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860litString10312() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10290() throws Exception {
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_mg10219() throws Exception {
        MyStorage __DSPOT_anotherStorage_2169 = new MyStorage();
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_mg10219__22 = myFile.isEqual(__DSPOT_anotherStorage_2169);
        Assert.assertFalse(o_testMyStorageString_mg9854_mg10219__22);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_literalMutationString10151() throws Exception {
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofo.txt";
        Assert.assertEquals("foofo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10182() throws Exception {
        String __DSPOT_aData_2154 = "n6L}tTRCX?$c0,+=U9>l";
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        __DSPOT_anotherStorage_2133.addData(__DSPOT_aData_2154);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188() throws Exception {
        MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(__DSPOT_anotherStorage_2156);
        Assert.assertTrue(o_testMyStorageString_mg9860_mg10188__21);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_add9986() throws Exception {
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_add10011() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_remove9847_mg10091() throws Exception {
        String __DSPOT_aData_2137 = "<r^%NOl,#Yp Ij0fC_bF";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        String o_testMyStorageString_remove9847__6 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        int o_testMyStorageString_remove9847__7 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_remove9847__10 = theFile.exists();
        myFile.delData(__DSPOT_aData_2137);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_add9843null10358_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foofoo.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            MyStorage.deleteFile(null);
            myFile = new MyStorage(myFileName);
            String o_testMyStorageString_add9843__8 = myFile.getFileName();
            int o_testMyStorageString_add9843__9 = myFile.getDataSize();
            theFile = new File(myFileName);
            boolean o_testMyStorageString_add9843__12 = theFile.exists();
            Assert.fail("testMyStorageString_add9843null10358 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_mg10219_add11049() throws Exception {
        MyStorage __DSPOT_anotherStorage_2169 = new MyStorage();
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854_mg10219_add11049__13 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9854_mg10219_add11049__13)));
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_mg10219__22 = myFile.isEqual(__DSPOT_anotherStorage_2169);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        Assert.assertEquals(0, ((int) (o_testMyStorageString_mg9854_mg10219_add11049__13)));
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188litString12035() throws Exception {
        MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofo.txt";
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(__DSPOT_anotherStorage_2156);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_literalMutationString10094_mg12490() throws Exception {
        ArrayList<String> __DSPOT_otherData_2375 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_2129 = "---------------------- Hello World !";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_literalMutationString10094_mg12490__23 = myFile.dataAreEqual(__DSPOT_otherData_2375);
        Assert.assertFalse(o_testMyStorageString_mg9854_literalMutationString10094_mg12490__23);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10170_add12082() throws Exception {
        String __DSPOT_aData_2150 = "[Iww*[I|&jqL])X5Ii#p";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860_mg10170_add12082__16 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_mg9860_mg10170_add12082__16);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        myFile.delData(__DSPOT_aData_2150);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        Assert.assertFalse(o_testMyStorageString_mg9860_mg10170_add12082__16);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10182null11614() throws Exception {
        String __DSPOT_aData_2154 = "n6L}tTRCX?$c0,+=U9>l";
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        __DSPOT_anotherStorage_2133.addData(null);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_mg10219_remove11105() throws Exception {
        MyStorage __DSPOT_anotherStorage_2169 = new MyStorage();
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_mg10219__22 = myFile.isEqual(__DSPOT_anotherStorage_2169);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188_mg11797() throws Exception {
        String __DSPOT_aData_2269 = "RaTq4Gi)Fr}F?*.J$-k|";
        MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(__DSPOT_anotherStorage_2156);
        __DSPOT_anotherStorage_2156.addData(__DSPOT_aData_2269);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_mg10219_mg11253() throws Exception {
        MyStorage __DSPOT_anotherStorage_2222 = new MyStorage("n.awdgK.BX&d!0b=`k.,");
        MyStorage __DSPOT_anotherStorage_2169 = new MyStorage();
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_mg10219__22 = myFile.isEqual(__DSPOT_anotherStorage_2169);
        boolean o_testMyStorageString_mg9854_mg10219_mg11253__27 = __DSPOT_anotherStorage_2169.isEqual(__DSPOT_anotherStorage_2222);
        Assert.assertTrue(o_testMyStorageString_mg9854_mg10219_mg11253__27);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10290_mg11544() throws Exception {
        String __DSPOT_aData_2254 = ":wl,NZsVep.O2+|4klrI";
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        myFile.readData();
        myFile.addData(__DSPOT_aData_2254);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188_literalMutationString11761() throws Exception {
        MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(__DSPOT_anotherStorage_2156);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_mg10243_mg11845() throws Exception {
        String __DSPOT_aData_2291 = "|IYO7ejG>_@=ct j0@Xw";
        MyStorage __DSPOT_anotherStorage_2173 = new MyStorage();
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*Rm!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        boolean o_testMyStorageString_mg9856_mg10243__22 = myFile.isEqual(__DSPOT_anotherStorage_2173);
        myFile.addData(__DSPOT_aData_2291);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10182_mg11286() throws Exception {
        String __DSPOT_aData_2154 = "n6L}tTRCX?$c0,+=U9>l";
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        __DSPOT_anotherStorage_2133.addData(__DSPOT_aData_2154);
        __DSPOT_anotherStorage_2133.saveData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_mg10205_mg11273() throws Exception {
        ArrayList<String> __DSPOT_otherData_2227 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_2163 = "=[,uU}::G|G6uUEpR3Z6";
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*Rm!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        myFile.addData(__DSPOT_aData_2163);
        boolean o_testMyStorageString_mg9856_mg10205_mg11273__25 = myFile.dataAreEqual(__DSPOT_otherData_2227);
        Assert.assertFalse(o_testMyStorageString_mg9856_mg10205_mg11273__25);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10258litString11402() throws Exception {
        ArrayList<String> __DSPOT_otherData_2175 = new ArrayList<String>(Collections.emptyList());
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "\n";
        Assert.assertEquals("\n", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("\n", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("\n", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        boolean o_testMyStorageString_mg9858_mg10258__26 = myFile.dataAreEqual(__DSPOT_otherData_2175);
        Assert.assertEquals("\n", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("\n", myFileName);
        Assert.assertEquals("\n", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("\n", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_remove9847_mg10091_mg11581() throws Exception {
        String __DSPOT_aData_2137 = "<r^%NOl,#Yp Ij0fC_bF";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_remove9847__6 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
        int o_testMyStorageString_remove9847__7 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_remove9847__10 = theFile.exists();
        myFile.delData(__DSPOT_aData_2137);
        myFile.saveData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_remove9847__6);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9854_mg10219_mg11261() throws Exception {
        MyStorage __DSPOT_anotherStorage_2169 = new MyStorage();
        String __DSPOT_aData_2129 = "^T5=#a1 EeDrZJ[)g[^<";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9854__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
        int o_testMyStorageString_mg9854__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9854__12 = theFile.exists();
        myFile.addData(__DSPOT_aData_2129);
        boolean o_testMyStorageString_mg9854_mg10219__22 = myFile.isEqual(__DSPOT_anotherStorage_2169);
        __DSPOT_anotherStorage_2169.readData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9854__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10290_mg11517() throws Exception {
        String __DSPOT_aData_2251 = "L-8n_nL]aDXvwa))4o{W";
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        myFile.readData();
        __DSPOT_anotherStorage_2133.delData(__DSPOT_aData_2251);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_mg10205_mg11308() throws Exception {
        String __DSPOT_aData_2163 = "=[,uU}::G|G6uUEpR3Z6";
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*Rm!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        myFile.addData(__DSPOT_aData_2163);
        myFile.saveData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10198litString12655() throws Exception {
        String __DSPOT_aData_2160 = ">on(cI&>2WByS`F$}hS,";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = ":";
        Assert.assertEquals(":", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(":", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals(":", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_2160);
        Assert.assertEquals(":", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(":", myFileName);
        Assert.assertEquals(":", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(":", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9856_mg10205litString11366() throws Exception {
        String __DSPOT_aData_2163 = "=[,uU}::G|G6uUEpR3Z6";
        String __DSPOT_aData_2131 = "c1@/CRHR^g%*R!:WRU!";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9856__8 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
        int o_testMyStorageString_mg9856__9 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9856__12 = theFile.exists();
        myFile.delData(__DSPOT_aData_2131);
        myFile.addData(__DSPOT_aData_2163);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(1, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9856__8);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188_mg11855() throws Exception {
        String __DSPOT_aData_2296 = "HS#Nq@oz&Ht^f!{WxsqS";
        MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(__DSPOT_anotherStorage_2156);
        myFile.delData(__DSPOT_aData_2296);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10198_remove12539() throws Exception {
        String __DSPOT_aData_2160 = ">on(cI&>2WByS`F$}hS,";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        myFile.delData(__DSPOT_aData_2160);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860litString10312_mg11174() throws Exception {
        MyStorage __DSPOT_anotherStorage_2198 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9860__7 = myFile.getFileName();
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
        int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9860__11 = theFile.exists();
        myFile.saveData();
        boolean o_testMyStorageString_mg9860litString10312_mg11174__21 = myFile.isEqual(__DSPOT_anotherStorage_2198);
        Assert.assertTrue(o_testMyStorageString_mg9860litString10312_mg11174__21);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", o_testMyStorageString_mg9860__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9855litString10449_mg12378() throws Exception {
        ArrayList<String> __DSPOT_otherData_2130 = new ArrayList<String>(Collections.emptyList());
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9855__10 = myFile.getFileName();
        Assert.assertEquals("", o_testMyStorageString_mg9855__10);
        int o_testMyStorageString_mg9855__11 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9855__14 = theFile.exists();
        boolean o_testMyStorageString_mg9855__15 = myFile.dataAreEqual(__DSPOT_otherData_2130);
        myFile.saveData();
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", o_testMyStorageString_mg9855__10);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10190_mg12492() throws Exception {
        ArrayList<String> __DSPOT_otherData_2157 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageString_mg9859_mg10190__21 = myFile.dataAreEqual(__DSPOT_otherData_2157);
        myFile.saveData();
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9859_mg10190_mg12474() throws Exception {
        MyStorage __DSPOT_anotherStorage_2370 = new MyStorage("&;C#U1c_RmTYQgD=LjZ,");
        ArrayList<String> __DSPOT_otherData_2157 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9859__7 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
        int o_testMyStorageString_mg9859__8 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9859__11 = theFile.exists();
        myFile.readData();
        boolean o_testMyStorageString_mg9859_mg10190__21 = myFile.dataAreEqual(__DSPOT_otherData_2157);
        boolean o_testMyStorageString_mg9859_mg10190_mg12474__26 = myFile.isEqual(__DSPOT_anotherStorage_2370);
        Assert.assertTrue(o_testMyStorageString_mg9859_mg10190_mg12474__26);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9859__7);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9858_mg10258_mg11181() throws Exception {
        String __DSPOT_aData_2199 = "DK`?CwK8Hc$#{g=j,m5e";
        ArrayList<String> __DSPOT_otherData_2175 = new ArrayList<String>(Collections.emptyList());
        MyStorage __DSPOT_anotherStorage_2133 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo.txt";
        Assert.assertEquals("foofoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        String o_testMyStorageString_mg9858__9 = myFile.getFileName();
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
        int o_testMyStorageString_mg9858__10 = myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_mg9858__13 = theFile.exists();
        boolean o_testMyStorageString_mg9858__14 = myFile.isEqual(__DSPOT_anotherStorage_2133);
        boolean o_testMyStorageString_mg9858_mg10258__26 = myFile.dataAreEqual(__DSPOT_otherData_2175);
        __DSPOT_anotherStorage_2133.addData(__DSPOT_aData_2199);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", myFileName);
        Assert.assertEquals("foofoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo.txt", o_testMyStorageString_mg9858__9);
    }

    @Test(timeout = 10000)
    public void testMyStorageString_add9843null10358_failAssert0_mg11856_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_2297 = -197630731;
                MyStorage myFile = null;
                String myFileName = "foofoo.txt";
                File theFile = null;
                MyStorage.deleteFile(myFileName);
                MyStorage.deleteFile(null);
                myFile = new MyStorage(myFileName);
                String o_testMyStorageString_add9843__8 = myFile.getFileName();
                int o_testMyStorageString_add9843__9 = myFile.getDataSize();
                theFile = new File(myFileName);
                boolean o_testMyStorageString_add9843__12 = theFile.exists();
                myFile.getData(__DSPOT_index_2297);
            }
            Assert.fail("testMyStorageString_add9843null10358_failAssert0_mg11856 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageString_mg9860_mg10188null12124_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_2156 = new MyStorage("dK![uk&1qjU|-ZAR[bG*");
            MyStorage myFile = null;
            String myFileName = "foofoo.txt";
            File theFile = null;
            MyStorage.deleteFile(myFileName);
            myFile = new MyStorage(myFileName);
            String o_testMyStorageString_mg9860__7 = myFile.getFileName();
            int o_testMyStorageString_mg9860__8 = myFile.getDataSize();
            theFile = new File(myFileName);
            boolean o_testMyStorageString_mg9860__11 = theFile.exists();
            myFile.saveData();
            boolean o_testMyStorageString_mg9860_mg10188__21 = myFile.isEqual(null);
            Assert.fail("testMyStorageString_mg9860_mg10188null12124 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMyStorageString_add9843_mg10146_failAssert0_mg11613_failAssert0() throws Exception {
        try {
            {
                MyStorage __DSPOT_anotherStorage_2268 = new MyStorage();
                ArrayList<String> __DSPOT_otherData_2145 = new ArrayList<String>(-1819413280);
                MyStorage myFile = null;
                String myFileName = "foofoo.txt";
                File theFile = null;
                MyStorage.deleteFile(myFileName);
                MyStorage.deleteFile(myFileName);
                myFile = new MyStorage(myFileName);
                String o_testMyStorageString_add9843__8 = myFile.getFileName();
                int o_testMyStorageString_add9843__9 = myFile.getDataSize();
                theFile = new File(myFileName);
                boolean o_testMyStorageString_add9843__12 = theFile.exists();
                myFile.dataAreEqual(__DSPOT_otherData_2145);
                myFile.isEqual(__DSPOT_anotherStorage_2268);
            }
            Assert.fail("testMyStorageString_add9843_mg10146_failAssert0_mg11613 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Illegal Capacity: -1819413280", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        Assert.assertEquals("foo.txt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData__5);
        boolean o_testAddData__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData__10);
        boolean o_testAddData__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData__21 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData__21)));
        int o_testAddData__22 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testAddData__22)));
        boolean o_testAddData__23 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData__23);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foo.txt", myFileName);
        Assert.assertTrue(o_testAddData__5);
        Assert.assertTrue(o_testAddData__10);
        Assert.assertTrue(o_testAddData__11);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testAddData__21)));
        Assert.assertEquals(3, ((int) (o_testAddData__22)));
    }

    @Test(timeout = 10000)
    public void testAddData_add1() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_add1__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_add1__5);
        boolean o_testAddData_add1__10 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_add1__10);
        boolean o_testAddData_add1__15 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_add1__15);
        boolean o_testAddData_add1__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_add1__16);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_add1__26 = myData.size();
        Assert.assertEquals(4, ((int) (o_testAddData_add1__26)));
        int o_testAddData_add1__27 = myFile.getDataSize();
        Assert.assertEquals(4, ((int) (o_testAddData_add1__27)));
        boolean o_testAddData_add1__28 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_add1__28);
        Assert.assertEquals(4, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_add1__5);
        Assert.assertTrue(o_testAddData_add1__10);
        Assert.assertTrue(o_testAddData_add1__15);
        Assert.assertTrue(o_testAddData_add1__16);
        Assert.assertEquals(4, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (o_testAddData_add1__26)));
        Assert.assertEquals(4, ((int) (o_testAddData_add1__27)));
    }

    @Test(timeout = 10000)
    public void testAddData_add5() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_add5__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_add5__5);
        boolean o_testAddData_add5__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_add5__10);
        boolean o_testAddData_add5__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_add5__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
            myFile.addData(myData.get(i));
        }
        int o_testAddData_add5__23 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_add5__23)));
        int o_testAddData_add5__24 = myFile.getDataSize();
        Assert.assertEquals(6, ((int) (o_testAddData_add5__24)));
        boolean o_testAddData_add5__25 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testAddData_add5__25);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_add5__5);
        Assert.assertTrue(o_testAddData_add5__10);
        Assert.assertTrue(o_testAddData_add5__11);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_add5__23)));
        Assert.assertEquals(6, ((int) (o_testAddData_add5__24)));
    }

    @Test(timeout = 10000)
    public void testAddData_remove13() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_remove13__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_remove13__5);
        boolean o_testAddData_remove13__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_remove13__10);
        boolean o_testAddData_remove13__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_remove13__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
        }
        int o_testAddData_remove13__19 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_remove13__19)));
        int o_testAddData_remove13__20 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testAddData_remove13__20)));
        boolean o_testAddData_remove13__21 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testAddData_remove13__21);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_remove13__5);
        Assert.assertTrue(o_testAddData_remove13__10);
        Assert.assertTrue(o_testAddData_remove13__11);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_remove13__19)));
        Assert.assertEquals(0, ((int) (o_testAddData_remove13__20)));
    }

    @Test(timeout = 10000)
    public void testAddData_mg44() throws Exception {
        String __DSPOT_aData_1629 = "rhR4pBh]li$&pz/(;NtS";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg44__6 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_mg44__6);
        boolean o_testAddData_mg44__11 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_mg44__11);
        boolean o_testAddData_mg44__12 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_mg44__12);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg44__22 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_mg44__22)));
        int o_testAddData_mg44__23 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testAddData_mg44__23)));
        boolean o_testAddData_mg44__24 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_mg44__24);
        myFile.delData(__DSPOT_aData_1629);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_mg44__6);
        Assert.assertTrue(o_testAddData_mg44__11);
        Assert.assertTrue(o_testAddData_mg44__12);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_mg44__22)));
        Assert.assertEquals(3, ((int) (o_testAddData_mg44__23)));
        Assert.assertTrue(o_testAddData_mg44__24);
    }

    @Test(timeout = 10000)
    public void testAddData_mg46() throws Exception {
        MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg46__7 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_mg46__7);
        boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_mg46__12);
        boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_mg46__13);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg46__23 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_mg46__23)));
        int o_testAddData_mg46__24 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testAddData_mg46__24)));
        boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_mg46__25);
        boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
        Assert.assertFalse(o_testAddData_mg46__26);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_mg46__7);
        Assert.assertTrue(o_testAddData_mg46__12);
        Assert.assertTrue(o_testAddData_mg46__13);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_mg46__23)));
        Assert.assertEquals(3, ((int) (o_testAddData_mg46__24)));
        Assert.assertTrue(o_testAddData_mg46__25);
    }

    @Test(timeout = 10000)
    public void testAddData_mg47() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg47__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_mg47__5);
        boolean o_testAddData_mg47__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_mg47__10);
        boolean o_testAddData_mg47__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_mg47__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg47__21 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_mg47__21)));
        int o_testAddData_mg47__22 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testAddData_mg47__22)));
        boolean o_testAddData_mg47__23 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_mg47__23);
        myFile.readData();
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_mg47__5);
        Assert.assertTrue(o_testAddData_mg47__10);
        Assert.assertTrue(o_testAddData_mg47__11);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_mg47__21)));
        Assert.assertEquals(3, ((int) (o_testAddData_mg47__22)));
        Assert.assertTrue(o_testAddData_mg47__23);
    }

    @Test(timeout = 10000)
    public void testAddData_mg48() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg48__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_mg48__5);
        boolean o_testAddData_mg48__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_mg48__10);
        boolean o_testAddData_mg48__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_mg48__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg48__21 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_mg48__21)));
        int o_testAddData_mg48__22 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testAddData_mg48__22)));
        boolean o_testAddData_mg48__23 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_mg48__23);
        myFile.saveData();
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertTrue(o_testAddData_mg48__5);
        Assert.assertTrue(o_testAddData_mg48__10);
        Assert.assertTrue(o_testAddData_mg48__11);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testAddData_mg48__21)));
        Assert.assertEquals(3, ((int) (o_testAddData_mg48__22)));
        Assert.assertTrue(o_testAddData_mg48__23);
    }

    @Test(timeout = 10000)
    public void testAddData_literalMutationNumber39_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            Assert.fail("testAddData_literalMutationNumber39 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddDatanull126_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            myData.add(null);
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            Assert.fail("testAddDatanull126 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddDatanull127_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            myData.add("1st line");
            myData.add(null);
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            Assert.fail("testAddDatanull127 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddDatanull129_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(null);
            Assert.fail("testAddDatanull129 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_mg47litString1424() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foP.txt";
        Assert.assertEquals("foP.txt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg47__5 = myData.add("1st line");
        boolean o_testAddData_mg47__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg47__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foP.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg47__21 = myData.size();
        int o_testAddData_mg47__22 = myFile.getDataSize();
        boolean o_testAddData_mg47__23 = myFile.dataAreEqual(myData);
        myFile.readData();
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foP.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foP.txt", myFileName);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foP.txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData_mg46_mg1555() throws Exception {
        MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg46__7 = myData.add("1st line");
        boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg46__23 = myData.size();
        int o_testAddData_mg46__24 = myFile.getDataSize();
        boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
        boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
        __DSPOT_anotherStorage_1631.readData();
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_mg48litNum1231() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg48__5 = myData.add("1st line");
        boolean o_testAddData_mg48__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg48__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg48__21 = myData.size();
        int o_testAddData_mg48__22 = myFile.getDataSize();
        boolean o_testAddData_mg48__23 = myFile.dataAreEqual(myData);
        myFile.saveData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_literalMutationString14litNum1682() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "fzo.txt";
        Assert.assertEquals("fzo.txt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_literalMutationString14__5 = myData.add("1st line");
        boolean o_testAddData_literalMutationString14__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_literalMutationString14__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("fzo.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_literalMutationString14__21 = myData.size();
        int o_testAddData_literalMutationString14__22 = myFile.getDataSize();
        boolean o_testAddData_literalMutationString14__23 = myFile.dataAreEqual(myData);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("fzo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("fzo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("fzo.txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData_add5_literalMutationString679() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.xt";
        Assert.assertEquals("foo.xt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_add5__5 = myData.add("1st line");
        boolean o_testAddData_add5__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_add5__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.xt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
            myFile.addData(myData.get(i));
        }
        int o_testAddData_add5__23 = myData.size();
        int o_testAddData_add5__24 = myFile.getDataSize();
        boolean o_testAddData_add5__25 = myFile.dataAreEqual(myData);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.xt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foo.xt", myFileName);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.xt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData_mg44_literalMutationString1644() throws Exception {
        String __DSPOT_aData_1629 = "rhR4pBh]li$&pz/(;NtS";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg44__6 = myData.add("1st line");
        boolean o_testAddData_mg44__11 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg44__12 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg44__22 = myData.size();
        int o_testAddData_mg44__23 = myFile.getDataSize();
        boolean o_testAddData_mg44__24 = myFile.dataAreEqual(myData);
        myFile.delData(__DSPOT_aData_1629);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("", myFileName);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData_mg46_mg1608() throws Exception {
        MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg46__7 = myData.add("1st line");
        boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg46__23 = myData.size();
        int o_testAddData_mg46__24 = myFile.getDataSize();
        boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
        boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
        myFile.saveData();
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_mg46_literalMutationString1321() throws Exception {
        MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.ytxt";
        Assert.assertEquals("foo.ytxt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg46__7 = myData.add("1st line");
        boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.ytxt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg46__23 = myData.size();
        int o_testAddData_mg46__24 = myFile.getDataSize();
        boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
        boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.ytxt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foo.ytxt", myFileName);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.ytxt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData_mg47litNum1637() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg47__5 = myData.add("1st line");
        boolean o_testAddData_mg47__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg47__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 338392873; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg47__21 = myData.size();
        int o_testAddData_mg47__22 = myFile.getDataSize();
        boolean o_testAddData_mg47__23 = myFile.dataAreEqual(myData);
        myFile.readData();
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_mg48litNum1215() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg48__5 = myData.add("1st line");
        boolean o_testAddData_mg48__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg48__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg48__21 = myData.size();
        int o_testAddData_mg48__22 = myFile.getDataSize();
        boolean o_testAddData_mg48__23 = myFile.dataAreEqual(myData);
        myFile.saveData();
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddDatanull129_failAssert0_mg1343_failAssert0() throws Exception {
        try {
            {
                MyStorage __DSPOT_anotherStorage_1676 = new MyStorage();
                MyStorage myFile = null;
                String myFileName = "foo.txt";
                ArrayList<String> myData = new ArrayList<String>();
                myData.add("1st line");
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(null);
                myFile.isEqual(__DSPOT_anotherStorage_1676);
            }
            Assert.fail("testAddDatanull129_failAssert0_mg1343 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_remove13null1450_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_remove13__5 = myData.add("1st line");
            boolean o_testAddData_remove13__10 = myData.add("a second line, longer than the first one");
            boolean o_testAddData_remove13__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
            }
            int o_testAddData_remove13__19 = myData.size();
            int o_testAddData_remove13__20 = myFile.getDataSize();
            boolean o_testAddData_remove13__21 = myFile.dataAreEqual(null);
            Assert.fail("testAddData_remove13null1450 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_mg46litNum1917_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_mg46__7 = myData.add("1st line");
            boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
            boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testAddData_mg46__23 = myData.size();
            int o_testAddData_mg46__24 = myFile.getDataSize();
            boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
            boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
            Assert.fail("testAddData_mg46litNum1917 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddDatanull129_failAssert0_mg1322_failAssert0() throws Exception {
        try {
            {
                ArrayList<String> __DSPOT_otherData_1673 = new ArrayList<String>(-1324822568);
                MyStorage myFile = null;
                String myFileName = "foo.txt";
                ArrayList<String> myData = new ArrayList<String>();
                myData.add("1st line");
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(null);
                myFile.dataAreEqual(__DSPOT_otherData_1673);
            }
            Assert.fail("testAddDatanull129_failAssert0_mg1322 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Illegal Capacity: -1324822568", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_mg46null1970_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_mg46__7 = myData.add("1st line");
            boolean o_testAddData_mg46__12 = myData.add("a second line, longer than the first one");
            boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testAddData_mg46__23 = myData.size();
            int o_testAddData_mg46__24 = myFile.getDataSize();
            boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
            boolean o_testAddData_mg46__26 = myFile.isEqual(null);
            Assert.fail("testAddData_mg46null1970 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_mg47litNum1637litString3811() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg47__5 = myData.add("1st line");
        boolean o_testAddData_mg47__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg47__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 338392873; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg47__21 = myData.size();
        int o_testAddData_mg47__22 = myFile.getDataSize();
        boolean o_testAddData_mg47__23 = myFile.dataAreEqual(myData);
        myFile.readData();
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_mg48litNum1231_mg3134() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_mg48__5 = myData.add("1st line");
        boolean o_testAddData_mg48__10 = myData.add("a second line, longer than the first one");
        boolean o_testAddData_mg48__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_mg48__21 = myData.size();
        int o_testAddData_mg48__22 = myFile.getDataSize();
        boolean o_testAddData_mg48__23 = myFile.dataAreEqual(myData);
        myFile.saveData();
        myFile.readData();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testAddData_mg46_mg1608null5439_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_1631 = new MyStorage();
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_mg46__7 = myData.add("1st line");
            boolean o_testAddData_mg46__12 = myData.add(null);
            boolean o_testAddData_mg46__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testAddData_mg46__23 = myData.size();
            int o_testAddData_mg46__24 = myFile.getDataSize();
            boolean o_testAddData_mg46__25 = myFile.dataAreEqual(myData);
            boolean o_testAddData_mg46__26 = myFile.isEqual(__DSPOT_anotherStorage_1631);
            myFile.saveData();
            Assert.fail("testAddData_mg46_mg1608null5439 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_mg48litNum1231null3508_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = null;
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_mg48__5 = myData.add("1st line");
            boolean o_testAddData_mg48__10 = myData.add("a second line, longer than the first one");
            boolean o_testAddData_mg48__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testAddData_mg48__21 = myData.size();
            int o_testAddData_mg48__22 = myFile.getDataSize();
            boolean o_testAddData_mg48__23 = myFile.dataAreEqual(myData);
            myFile.saveData();
            Assert.fail("testAddData_mg48litNum1231null3508 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAddData_add5null1786_mg2865_failAssert0() throws Exception {
        try {
            String __DSPOT_aData_1706 = "9pnoIU]bTTQLG(P]Y9TG";
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            boolean o_testAddData_add5__5 = myData.add("1st line");
            boolean o_testAddData_add5__10 = myData.add("a second line, longer than the first one");
            boolean o_testAddData_add5__11 = myData.add(null);
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
                myFile.addData(myData.get(i));
            }
            int o_testAddData_add5__23 = myData.size();
            int o_testAddData_add5__24 = myFile.getDataSize();
            boolean o_testAddData_add5__25 = myFile.dataAreEqual(myData);
            myFile.delData(__DSPOT_aData_1706);
            Assert.fail("testAddData_add5null1786_mg2865 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13232() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13232__9 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_add13232__9);
        boolean o_testSaveReadData_add13232__14 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_add13232__14);
        boolean o_testSaveReadData_add13232__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_add13232__15);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13232__26 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__26)));
        int o_testSaveReadData_add13232__27 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__27)));
        boolean o_testSaveReadData_add13232__28 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_add13232__28);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13232__32 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13232__32);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13232__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13232__36);
        boolean o_testSaveReadData_add13232__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13232__37);
        mySecondFile.readData();
        int o_testSaveReadData_add13232__39 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__39)));
        int o_testSaveReadData_add13232__40 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__40)));
        boolean o_testSaveReadData_add13232__41 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_add13232__41);
        boolean o_testSaveReadData_add13232__42 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_add13232__42);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13232__9);
        Assert.assertTrue(o_testSaveReadData_add13232__14);
        Assert.assertTrue(o_testSaveReadData_add13232__15);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__26)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__27)));
        Assert.assertTrue(o_testSaveReadData_add13232__28);
        Assert.assertTrue(o_testSaveReadData_add13232__32);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13232__36);
        Assert.assertTrue(o_testSaveReadData_add13232__37);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__39)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13232__40)));
        Assert.assertTrue(o_testSaveReadData_add13232__41);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13233() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13233__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_add13233__8);
        boolean o_testSaveReadData_add13233__13 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_add13233__13);
        boolean o_testSaveReadData_add13233__18 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_add13233__18);
        boolean o_testSaveReadData_add13233__19 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_add13233__19);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13233__30 = myData.size();
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__30)));
        int o_testSaveReadData_add13233__31 = myFile.getDataSize();
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__31)));
        boolean o_testSaveReadData_add13233__32 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_add13233__32);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13233__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13233__36);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13233__40 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13233__40);
        boolean o_testSaveReadData_add13233__41 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13233__41);
        mySecondFile.readData();
        int o_testSaveReadData_add13233__43 = myData.size();
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__43)));
        int o_testSaveReadData_add13233__44 = mySecondFile.getDataSize();
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__44)));
        boolean o_testSaveReadData_add13233__45 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_add13233__45);
        boolean o_testSaveReadData_add13233__46 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_add13233__46);
        Assert.assertEquals(4, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13233__8);
        Assert.assertTrue(o_testSaveReadData_add13233__13);
        Assert.assertTrue(o_testSaveReadData_add13233__18);
        Assert.assertTrue(o_testSaveReadData_add13233__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__30)));
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__31)));
        Assert.assertTrue(o_testSaveReadData_add13233__32);
        Assert.assertTrue(o_testSaveReadData_add13233__36);
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13233__40);
        Assert.assertTrue(o_testSaveReadData_add13233__41);
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__43)));
        Assert.assertEquals(4, ((int) (o_testSaveReadData_add13233__44)));
        Assert.assertTrue(o_testSaveReadData_add13233__45);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13237() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13237__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_add13237__8);
        boolean o_testSaveReadData_add13237__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_add13237__13);
        boolean o_testSaveReadData_add13237__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_add13237__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13237__27 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13237__27)));
        int o_testSaveReadData_add13237__28 = myFile.getDataSize();
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13237__28)));
        boolean o_testSaveReadData_add13237__29 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_add13237__29);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13237__33 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13237__33);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13237__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13237__37);
        boolean o_testSaveReadData_add13237__38 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13237__38);
        mySecondFile.readData();
        int o_testSaveReadData_add13237__40 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13237__40)));
        int o_testSaveReadData_add13237__41 = mySecondFile.getDataSize();
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13237__41)));
        boolean o_testSaveReadData_add13237__42 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_add13237__42);
        boolean o_testSaveReadData_add13237__43 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_add13237__43);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13237__8);
        Assert.assertTrue(o_testSaveReadData_add13237__13);
        Assert.assertTrue(o_testSaveReadData_add13237__14);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13237__27)));
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13237__28)));
        Assert.assertFalse(o_testSaveReadData_add13237__29);
        Assert.assertTrue(o_testSaveReadData_add13237__33);
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13237__37);
        Assert.assertTrue(o_testSaveReadData_add13237__38);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13237__40)));
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13237__41)));
        Assert.assertFalse(o_testSaveReadData_add13237__42);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13245() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13245__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_add13245__8);
        boolean o_testSaveReadData_add13245__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_add13245__13);
        boolean o_testSaveReadData_add13245__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_add13245__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13245__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__25)));
        int o_testSaveReadData_add13245__26 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__26)));
        boolean o_testSaveReadData_add13245__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_add13245__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13245__31 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13245__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13245__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13245__35);
        boolean o_testSaveReadData_add13245__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_add13245__36);
        mySecondFile.readData();
        mySecondFile.readData();
        int o_testSaveReadData_add13245__39 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__39)));
        int o_testSaveReadData_add13245__40 = mySecondFile.getDataSize();
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13245__40)));
        boolean o_testSaveReadData_add13245__41 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_add13245__41);
        boolean o_testSaveReadData_add13245__42 = myFile.isEqual(mySecondFile);
        Assert.assertFalse(o_testSaveReadData_add13245__42);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13245__8);
        Assert.assertTrue(o_testSaveReadData_add13245__13);
        Assert.assertTrue(o_testSaveReadData_add13245__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__25)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__26)));
        Assert.assertTrue(o_testSaveReadData_add13245__27);
        Assert.assertTrue(o_testSaveReadData_add13245__31);
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_add13245__35);
        Assert.assertTrue(o_testSaveReadData_add13245__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_add13245__39)));
        Assert.assertEquals(6, ((int) (o_testSaveReadData_add13245__40)));
        Assert.assertFalse(o_testSaveReadData_add13245__41);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13250() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testSaveReadData_remove13250__7 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_remove13250__7);
        boolean o_testSaveReadData_remove13250__12 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_remove13250__12);
        boolean o_testSaveReadData_remove13250__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_remove13250__13);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13250__24 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__24)));
        int o_testSaveReadData_remove13250__25 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__25)));
        boolean o_testSaveReadData_remove13250__26 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_remove13250__26);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13250__30 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13250__30);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13250__34 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13250__34);
        boolean o_testSaveReadData_remove13250__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13250__35);
        mySecondFile.readData();
        int o_testSaveReadData_remove13250__37 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__37)));
        int o_testSaveReadData_remove13250__38 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__38)));
        boolean o_testSaveReadData_remove13250__39 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_remove13250__39);
        boolean o_testSaveReadData_remove13250__40 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_remove13250__40);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13250__7);
        Assert.assertTrue(o_testSaveReadData_remove13250__12);
        Assert.assertTrue(o_testSaveReadData_remove13250__13);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__24)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__25)));
        Assert.assertTrue(o_testSaveReadData_remove13250__26);
        Assert.assertTrue(o_testSaveReadData_remove13250__30);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13250__34);
        Assert.assertTrue(o_testSaveReadData_remove13250__35);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__37)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13250__38)));
        Assert.assertTrue(o_testSaveReadData_remove13250__39);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13254() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13254__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_remove13254__8);
        boolean o_testSaveReadData_remove13254__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_remove13254__13);
        boolean o_testSaveReadData_remove13254__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_remove13254__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
        }
        int o_testSaveReadData_remove13254__23 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13254__23)));
        int o_testSaveReadData_remove13254__24 = myFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13254__24)));
        boolean o_testSaveReadData_remove13254__25 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_remove13254__25);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13254__29 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13254__29);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13254__33 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13254__33);
        boolean o_testSaveReadData_remove13254__34 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13254__34);
        mySecondFile.readData();
        int o_testSaveReadData_remove13254__36 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13254__36)));
        int o_testSaveReadData_remove13254__37 = mySecondFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13254__37)));
        boolean o_testSaveReadData_remove13254__38 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_remove13254__38);
        boolean o_testSaveReadData_remove13254__39 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_remove13254__39);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13254__8);
        Assert.assertTrue(o_testSaveReadData_remove13254__13);
        Assert.assertTrue(o_testSaveReadData_remove13254__14);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13254__23)));
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13254__24)));
        Assert.assertFalse(o_testSaveReadData_remove13254__25);
        Assert.assertTrue(o_testSaveReadData_remove13254__29);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13254__33);
        Assert.assertTrue(o_testSaveReadData_remove13254__34);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13254__36)));
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13254__37)));
        Assert.assertFalse(o_testSaveReadData_remove13254__38);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13255() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13255__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_remove13255__8);
        boolean o_testSaveReadData_remove13255__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_remove13255__13);
        boolean o_testSaveReadData_remove13255__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_remove13255__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13255__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__25)));
        int o_testSaveReadData_remove13255__26 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__26)));
        boolean o_testSaveReadData_remove13255__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_remove13255__27);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13255__30 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_remove13255__30);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13255__34 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_remove13255__34);
        boolean o_testSaveReadData_remove13255__35 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_remove13255__35);
        mySecondFile.readData();
        int o_testSaveReadData_remove13255__37 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__37)));
        int o_testSaveReadData_remove13255__38 = mySecondFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13255__38)));
        boolean o_testSaveReadData_remove13255__39 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_remove13255__39);
        boolean o_testSaveReadData_remove13255__40 = myFile.isEqual(mySecondFile);
        Assert.assertFalse(o_testSaveReadData_remove13255__40);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13255__8);
        Assert.assertTrue(o_testSaveReadData_remove13255__13);
        Assert.assertTrue(o_testSaveReadData_remove13255__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__25)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__26)));
        Assert.assertTrue(o_testSaveReadData_remove13255__27);
        Assert.assertFalse(o_testSaveReadData_remove13255__30);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertFalse(o_testSaveReadData_remove13255__34);
        Assert.assertFalse(o_testSaveReadData_remove13255__35);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13255__37)));
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13255__38)));
        Assert.assertFalse(o_testSaveReadData_remove13255__39);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13256() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13256__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_remove13256__8);
        boolean o_testSaveReadData_remove13256__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_remove13256__13);
        boolean o_testSaveReadData_remove13256__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_remove13256__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13256__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__25)));
        int o_testSaveReadData_remove13256__26 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__26)));
        boolean o_testSaveReadData_remove13256__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_remove13256__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13256__31 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13256__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13256__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13256__35);
        boolean o_testSaveReadData_remove13256__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_remove13256__36);
        int o_testSaveReadData_remove13256__37 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__37)));
        int o_testSaveReadData_remove13256__38 = mySecondFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13256__38)));
        boolean o_testSaveReadData_remove13256__39 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_remove13256__39);
        boolean o_testSaveReadData_remove13256__40 = myFile.isEqual(mySecondFile);
        Assert.assertFalse(o_testSaveReadData_remove13256__40);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13256__8);
        Assert.assertTrue(o_testSaveReadData_remove13256__13);
        Assert.assertTrue(o_testSaveReadData_remove13256__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__25)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__26)));
        Assert.assertTrue(o_testSaveReadData_remove13256__27);
        Assert.assertTrue(o_testSaveReadData_remove13256__31);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_remove13256__35);
        Assert.assertTrue(o_testSaveReadData_remove13256__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_remove13256__37)));
        Assert.assertEquals(0, ((int) (o_testSaveReadData_remove13256__38)));
        Assert.assertFalse(o_testSaveReadData_remove13256__39);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationString13257() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationString13257__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__8);
        boolean o_testSaveReadData_literalMutationString13257__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__13);
        boolean o_testSaveReadData_literalMutationString13257__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationString13257__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__25)));
        int o_testSaveReadData_literalMutationString13257__26 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__26)));
        boolean o_testSaveReadData_literalMutationString13257__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationString13257__31 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationString13257__35 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__35);
        boolean o_testSaveReadData_literalMutationString13257__36 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__36);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationString13257__38 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__38)));
        int o_testSaveReadData_literalMutationString13257__39 = mySecondFile.getDataSize();
        Assert.assertEquals(0, ((int) (o_testSaveReadData_literalMutationString13257__39)));
        boolean o_testSaveReadData_literalMutationString13257__40 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__40);
        boolean o_testSaveReadData_literalMutationString13257__41 = myFile.isEqual(mySecondFile);
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__41);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__14);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__25)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__26)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString13257__27);
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__31);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__35);
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString13257__38)));
        Assert.assertEquals(0, ((int) (o_testSaveReadData_literalMutationString13257__39)));
        Assert.assertFalse(o_testSaveReadData_literalMutationString13257__40);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__8);
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__13);
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber13281__26)));
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        Assert.assertEquals(2, ((int) (o_testSaveReadData_literalMutationNumber13281__27)));
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber13281__28);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__32);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__36);
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__37);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber13281__39)));
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        Assert.assertEquals(2, ((int) (o_testSaveReadData_literalMutationNumber13281__40)));
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber13281__41);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__42);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__14);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber13281__26)));
        Assert.assertEquals(2, ((int) (o_testSaveReadData_literalMutationNumber13281__27)));
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber13281__28);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__32);
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__36);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber13281__37);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber13281__39)));
        Assert.assertEquals(2, ((int) (o_testSaveReadData_literalMutationNumber13281__40)));
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber13281__41);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13286() throws Exception {
        ArrayList<String> __DSPOT_otherData_2390 = new ArrayList<String>(Collections.emptyList());
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13286__11 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_mg13286__11);
        boolean o_testSaveReadData_mg13286__16 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_mg13286__16);
        boolean o_testSaveReadData_mg13286__17 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_mg13286__17);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13286__28 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__28)));
        int o_testSaveReadData_mg13286__29 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__29)));
        boolean o_testSaveReadData_mg13286__30 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13286__30);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13286__34 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13286__34);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13286__38 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13286__38);
        boolean o_testSaveReadData_mg13286__39 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13286__39);
        mySecondFile.readData();
        int o_testSaveReadData_mg13286__41 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__41)));
        int o_testSaveReadData_mg13286__42 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__42)));
        boolean o_testSaveReadData_mg13286__43 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13286__43);
        boolean o_testSaveReadData_mg13286__44 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_mg13286__44);
        boolean o_testSaveReadData_mg13286__45 = myFile.dataAreEqual(__DSPOT_otherData_2390);
        Assert.assertFalse(o_testSaveReadData_mg13286__45);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13286__11);
        Assert.assertTrue(o_testSaveReadData_mg13286__16);
        Assert.assertTrue(o_testSaveReadData_mg13286__17);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__28)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__29)));
        Assert.assertTrue(o_testSaveReadData_mg13286__30);
        Assert.assertTrue(o_testSaveReadData_mg13286__34);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13286__38);
        Assert.assertTrue(o_testSaveReadData_mg13286__39);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__41)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13286__42)));
        Assert.assertTrue(o_testSaveReadData_mg13286__43);
        Assert.assertTrue(o_testSaveReadData_mg13286__44);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_mg13287__9);
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_mg13287__14);
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_mg13287__15);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__26)));
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__27)));
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13287__28);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13287__32);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13287__36);
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13287__37);
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__39)));
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__40)));
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13287__41);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_mg13287__42);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13287__9);
        Assert.assertTrue(o_testSaveReadData_mg13287__14);
        Assert.assertTrue(o_testSaveReadData_mg13287__15);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__26)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__27)));
        Assert.assertTrue(o_testSaveReadData_mg13287__28);
        Assert.assertTrue(o_testSaveReadData_mg13287__32);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13287__36);
        Assert.assertTrue(o_testSaveReadData_mg13287__37);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__39)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13287__40)));
        Assert.assertTrue(o_testSaveReadData_mg13287__41);
        Assert.assertTrue(o_testSaveReadData_mg13287__42);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289() throws Exception {
        MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_mg13289__10);
        boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_mg13289__15);
        boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_mg13289__16);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13289__27 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__27)));
        int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__28)));
        boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13289__29);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13289__33 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13289__33);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13289__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13289__37);
        boolean o_testSaveReadData_mg13289__38 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13289__38);
        mySecondFile.readData();
        int o_testSaveReadData_mg13289__40 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__40)));
        int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__41)));
        boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13289__42);
        boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_mg13289__43);
        boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
        Assert.assertFalse(o_testSaveReadData_mg13289__44);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13289__10);
        Assert.assertTrue(o_testSaveReadData_mg13289__15);
        Assert.assertTrue(o_testSaveReadData_mg13289__16);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__27)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__28)));
        Assert.assertTrue(o_testSaveReadData_mg13289__29);
        Assert.assertTrue(o_testSaveReadData_mg13289__33);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13289__37);
        Assert.assertTrue(o_testSaveReadData_mg13289__38);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__40)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13289__41)));
        Assert.assertTrue(o_testSaveReadData_mg13289__42);
        Assert.assertTrue(o_testSaveReadData_mg13289__43);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13296() throws Exception {
        MyStorage __DSPOT_anotherStorage_2398 = new MyStorage(".GRv* z4C5Q->+2y(ab+");
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13296__10 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_mg13296__10);
        boolean o_testSaveReadData_mg13296__15 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_mg13296__15);
        boolean o_testSaveReadData_mg13296__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_mg13296__16);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13296__27 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__27)));
        int o_testSaveReadData_mg13296__28 = myFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__28)));
        boolean o_testSaveReadData_mg13296__29 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13296__29);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13296__33 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13296__33);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13296__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13296__37);
        boolean o_testSaveReadData_mg13296__38 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_mg13296__38);
        mySecondFile.readData();
        int o_testSaveReadData_mg13296__40 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__40)));
        int o_testSaveReadData_mg13296__41 = mySecondFile.getDataSize();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__41)));
        boolean o_testSaveReadData_mg13296__42 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_mg13296__42);
        boolean o_testSaveReadData_mg13296__43 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_mg13296__43);
        boolean o_testSaveReadData_mg13296__44 = mySecondFile.isEqual(__DSPOT_anotherStorage_2398);
        Assert.assertFalse(o_testSaveReadData_mg13296__44);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13296__10);
        Assert.assertTrue(o_testSaveReadData_mg13296__15);
        Assert.assertTrue(o_testSaveReadData_mg13296__16);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__27)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__28)));
        Assert.assertTrue(o_testSaveReadData_mg13296__29);
        Assert.assertTrue(o_testSaveReadData_mg13296__33);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertTrue(o_testSaveReadData_mg13296__37);
        Assert.assertTrue(o_testSaveReadData_mg13296__38);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__40)));
        Assert.assertEquals(3, ((int) (o_testSaveReadData_mg13296__41)));
        Assert.assertTrue(o_testSaveReadData_mg13296__42);
        Assert.assertTrue(o_testSaveReadData_mg13296__43);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13282_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadData_literalMutationNumber13282 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatalitNum13336_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -202946487; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadDatalitNum13336 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-202946487", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13377_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add(null);
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadDatanull13377 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13378_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add(null);
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadDatanull13378 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13380_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(null);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadDatanull13380 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13381_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(null);
            myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadDatanull13381 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13382_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(null);
            Assert.fail("testSaveReadDatanull13382 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13245_mg15843() throws Exception {
        String __DSPOT_aData_2554 = "rkpNs#WGCrt}y)v1EI@:";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13245__8 = myData.add("1st line");
        boolean o_testSaveReadData_add13245__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_add13245__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13245__25 = myData.size();
        int o_testSaveReadData_add13245__26 = myFile.getDataSize();
        boolean o_testSaveReadData_add13245__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13245__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13245__35 = theFile.exists();
        boolean o_testSaveReadData_add13245__36 = theFile.exists();
        mySecondFile.readData();
        mySecondFile.readData();
        int o_testSaveReadData_add13245__39 = myData.size();
        int o_testSaveReadData_add13245__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_add13245__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_add13245__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2554);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13255litString14845() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13255__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13255__13 = myData.add("\n");
        boolean o_testSaveReadData_remove13255__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13255__25 = myData.size();
        int o_testSaveReadData_remove13255__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13255__27 = myFile.dataAreEqual(myData);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13255__30 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13255__34 = theFile.exists();
        boolean o_testSaveReadData_remove13255__35 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_remove13255__37 = myData.size();
        int o_testSaveReadData_remove13255__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13255__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13255__40 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13254_literalMutationString15393() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "---------------------- Hello World !";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13254__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13254__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13254__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
        }
        int o_testSaveReadData_remove13254__23 = myData.size();
        int o_testSaveReadData_remove13254__24 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13254__25 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13254__29 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13254__33 = theFile.exists();
        boolean o_testSaveReadData_remove13254__34 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_remove13254__36 = myData.size();
        int o_testSaveReadData_remove13254__37 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13254__38 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13254__39 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13237litString14883() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13237__8 = myData.add("\n");
        boolean o_testSaveReadData_add13237__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_add13237__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13237__27 = myData.size();
        int o_testSaveReadData_add13237__28 = myFile.getDataSize();
        boolean o_testSaveReadData_add13237__29 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13237__33 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13237__37 = theFile.exists();
        boolean o_testSaveReadData_add13237__38 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_add13237__40 = myData.size();
        int o_testSaveReadData_add13237__41 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_add13237__42 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_add13237__43 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(8, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(8, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17093() throws Exception {
        String __DSPOT_aData_2391 = "3rd line with something else: 2, 4, 8, 16";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289_literalMutationString16553() throws Exception {
        MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13289__10 = myData.add("1yt line");
        boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13289__27 = myData.size();
        int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13289__33 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13289__37 = theFile.exists();
        boolean o_testSaveReadData_mg13289__38 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13289__40 = myData.size();
        int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13245litString16025() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13245__8 = myData.add("3rd line with something else: 2, 4, 8, 16");
        boolean o_testSaveReadData_add13245__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_add13245__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13245__25 = myData.size();
        int o_testSaveReadData_add13245__26 = myFile.getDataSize();
        boolean o_testSaveReadData_add13245__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13245__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13245__35 = theFile.exists();
        boolean o_testSaveReadData_add13245__36 = theFile.exists();
        mySecondFile.readData();
        mySecondFile.readData();
        int o_testSaveReadData_add13245__39 = myData.size();
        int o_testSaveReadData_add13245__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_add13245__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_add13245__42 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13286_literalMutationString15458() throws Exception {
        ArrayList<String> __DSPOT_otherData_2390 = new ArrayList<String>(Collections.emptyList());
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13286__11 = myData.add("ZU#zL+yy");
        boolean o_testSaveReadData_mg13286__16 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13286__17 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13286__28 = myData.size();
        int o_testSaveReadData_mg13286__29 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13286__30 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13286__34 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13286__38 = theFile.exists();
        boolean o_testSaveReadData_mg13286__39 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13286__41 = myData.size();
        int o_testSaveReadData_mg13286__42 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13286__43 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13286__44 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_mg13286__45 = myFile.dataAreEqual(__DSPOT_otherData_2390);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationString13257_add13907() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationString13257__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationString13257__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationString13257__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationString13257__25 = myData.size();
        int o_testSaveReadData_literalMutationString13257__26 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString13257__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationString13257__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationString13257__35 = theFile.exists();
        boolean o_testSaveReadData_literalMutationString13257__36 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationString13257__38 = myData.size();
        int o_testSaveReadData_literalMutationString13257__39 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString13257__40 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationString13257__41 = myFile.isEqual(mySecondFile);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(6, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13250litNum16349() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testSaveReadData_remove13250__7 = myData.add("1st line");
        boolean o_testSaveReadData_remove13250__12 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13250__13 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13250__24 = myData.size();
        int o_testSaveReadData_remove13250__25 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13250__26 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13250__30 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13250__34 = theFile.exists();
        boolean o_testSaveReadData_remove13250__35 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_remove13250__37 = myData.size();
        int o_testSaveReadData_remove13250__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13250__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13250__40 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13256_literalMutationString15981() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13256__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13256__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13256__14 = myData.add("3rd line with someshing else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13256__25 = myData.size();
        int o_testSaveReadData_remove13256__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13256__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13256__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13256__35 = theFile.exists();
        boolean o_testSaveReadData_remove13256__36 = theFile.exists();
        int o_testSaveReadData_remove13256__37 = myData.size();
        int o_testSaveReadData_remove13256__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13256__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13256__40 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13256litString16314() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13256__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13256__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13256__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13256__25 = myData.size();
        int o_testSaveReadData_remove13256__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13256__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13256__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13256__35 = theFile.exists();
        boolean o_testSaveReadData_remove13256__36 = theFile.exists();
        int o_testSaveReadData_remove13256__37 = myData.size();
        int o_testSaveReadData_remove13256__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13256__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13256__40 = myFile.isEqual(mySecondFile);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289litString16947() throws Exception {
        MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
        boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13289__16 = myData.add("\n");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13289__27 = myData.size();
        int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13289__33 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13289__37 = theFile.exists();
        boolean o_testSaveReadData_mg13289__38 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13289__40 = myData.size();
        int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287_remove16611() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281_remove14069() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litNum17088() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281_mg14320() throws Exception {
        String __DSPOT_aData_2416 = "EFiA5/myXuZc@ce@Mqwr";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2416);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289null17129_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
            boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
            boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_mg13289__27 = myData.size();
            int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
            boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_mg13289__33 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_mg13289__37 = theFile.exists();
            boolean o_testSaveReadData_mg13289__38 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_mg13289__40 = myData.size();
            int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
            boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(null);
            Assert.fail("testSaveReadData_mg13289null17129 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13382_failAssert0_add14725_failAssert0() throws Exception {
        try {
            {
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                myData.add("1st line");
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(myData);
                myFile.saveData();
                myFile.saveData();
                theFile = new File(myFileName);
                theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                theFile.exists();
                theFile.exists();
                mySecondFile.readData();
                myData.size();
                mySecondFile.getDataSize();
                mySecondFile.dataAreEqual(myData);
                myFile.isEqual(null);
            }
            Assert.fail("testSaveReadDatanull13382_failAssert0_add14725 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13377_failAssert0_mg15501_failAssert0() throws Exception {
        try {
            {
                ArrayList<String> __DSPOT_otherData_2498 = new ArrayList<String>(Collections.emptyList());
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                myData.add(null);
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(myData);
                myFile.saveData();
                theFile = new File(myFileName);
                theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                theFile.exists();
                theFile.exists();
                mySecondFile.readData();
                myData.size();
                mySecondFile.getDataSize();
                mySecondFile.dataAreEqual(myData);
                myFile.isEqual(mySecondFile);
                mySecondFile.dataAreEqual(__DSPOT_otherData_2498);
            }
            Assert.fail("testSaveReadDatanull13377_failAssert0_mg15501 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13378_failAssert0_literalMutationNumber16202_failAssert0() throws Exception {
        try {
            {
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                myData.add("1st line");
                myData.add(null);
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(myData);
                myFile.saveData();
                theFile = new File(myFileName);
                theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                theFile.exists();
                theFile.exists();
                mySecondFile.readData();
                myData.size();
                mySecondFile.getDataSize();
                mySecondFile.dataAreEqual(myData);
                myFile.isEqual(mySecondFile);
            }
            Assert.fail("testSaveReadDatanull13378_failAssert0_literalMutationNumber16202 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13381_failAssert0_literalMutationString15539_failAssert0() throws Exception {
        try {
            {
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                myData.add("---------------------- Hello World !");
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(myData);
                myFile.saveData();
                theFile = new File(myFileName);
                theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                theFile.exists();
                theFile.exists();
                mySecondFile.readData();
                myData.size();
                mySecondFile.getDataSize();
                mySecondFile.dataAreEqual(null);
                myFile.isEqual(mySecondFile);
            }
            Assert.fail("testSaveReadDatanull13381_failAssert0_literalMutationString15539 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13380_failAssert0_literalMutationString13923_failAssert0() throws Exception {
        try {
            {
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                myData.add("1st l0ine");
                myData.add("a second line, longer than the first one");
                myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = 0; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                myData.size();
                myFile.getDataSize();
                myFile.dataAreEqual(null);
                myFile.saveData();
                theFile = new File(myFileName);
                theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                theFile.exists();
                theFile.exists();
                mySecondFile.readData();
                myData.size();
                mySecondFile.getDataSize();
                mySecondFile.dataAreEqual(myData);
                myFile.isEqual(mySecondFile);
            }
            Assert.fail("testSaveReadDatanull13380_failAssert0_literalMutationString13923 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281null15107_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
            boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
            boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
            int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
            boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
            boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
            int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(null);
            boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadData_literalMutationNumber13281null15107 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289litNum16966_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
            boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
            boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_mg13289__27 = myData.size();
            int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
            boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_mg13289__33 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_mg13289__37 = theFile.exists();
            boolean o_testSaveReadData_mg13289__38 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_mg13289__40 = myData.size();
            int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
            boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
            Assert.fail("testSaveReadData_mg13289litNum16966 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13256litString16314_remove21636() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testSaveReadData_remove13256__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13256__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13256__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13256__25 = myData.size();
        int o_testSaveReadData_remove13256__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13256__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13256__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13256__35 = theFile.exists();
        boolean o_testSaveReadData_remove13256__36 = theFile.exists();
        int o_testSaveReadData_remove13256__37 = myData.size();
        int o_testSaveReadData_remove13256__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13256__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13256__40 = myFile.isEqual(mySecondFile);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litNum17088_mg20605() throws Exception {
        String __DSPOT_aData_2850 = "m?=_:9YqRzquU7sim(L8";
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        mySecondFile.addData(__DSPOT_aData_2850);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(1, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281_remove14069_mg18221() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        mySecondFile.readData();
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289litString16947litNum21922() throws Exception {
        MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
        boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13289__16 = myData.add("\n");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13289__27 = myData.size();
        int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13289__33 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13289__37 = theFile.exists();
        boolean o_testSaveReadData_mg13289__38 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13289__40 = myData.size();
        int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17136_mg23383() throws Exception {
        MyStorage __DSPOT_anotherStorage_3076 = new MyStorage("qS%z[{e[y{|9h7r<|E_+");
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd 7line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        boolean o_testSaveReadData_mg13287litString17136_mg23383__72 = mySecondFile.isEqual(__DSPOT_anotherStorage_3076);
        Assert.assertFalse(o_testSaveReadData_mg13287litString17136_mg23383__72);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287_remove16611litString22812() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st ine");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13255_mg14357_mg22687() throws Exception {
        MyStorage __DSPOT_anotherStorage_3018 = new MyStorage();
        ArrayList<String> __DSPOT_otherData_2421 = new ArrayList<String>();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13255__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13255__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13255__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13255__25 = myData.size();
        int o_testSaveReadData_remove13255__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13255__27 = myFile.dataAreEqual(myData);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13255__30 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13255__34 = theFile.exists();
        boolean o_testSaveReadData_remove13255__35 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_remove13255__37 = myData.size();
        int o_testSaveReadData_remove13255__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13255__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13255__40 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_remove13255_mg14357__69 = mySecondFile.dataAreEqual(__DSPOT_otherData_2421);
        boolean o_testSaveReadData_remove13255_mg14357_mg22687__74 = mySecondFile.isEqual(__DSPOT_anotherStorage_3018);
        Assert.assertTrue(o_testSaveReadData_remove13255_mg14357_mg22687__74);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litNum17088_remove20314() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17093litString22033() throws Exception {
        String __DSPOT_aData_2391 = "3rd line with something else: 2, 4, 8, 16";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add(":");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17136_mg23359() throws Exception {
        ArrayList<String> __DSPOT_otherData_3073 = new ArrayList<String>();
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd 7line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        boolean o_testSaveReadData_mg13287litString17136_mg23359__72 = mySecondFile.dataAreEqual(__DSPOT_otherData_3073);
        Assert.assertFalse(o_testSaveReadData_mg13287litString17136_mg23359__72);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281_remove14069litNum18442() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litNum17088_mg20612() throws Exception {
        ArrayList<String> __DSPOT_otherData_2853 = new ArrayList<String>(Collections.emptyList());
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        boolean o_testSaveReadData_mg13287litNum17088_mg20612__73 = mySecondFile.dataAreEqual(__DSPOT_otherData_2853);
        Assert.assertTrue(o_testSaveReadData_mg13287litNum17088_mg20612__73);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litNum17088_literalMutationString20418() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("---------------------- Hello World !");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287_remove16611litNum22931() throws Exception {
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = Integer.MAX_VALUE; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber13281_remove14069_add17722() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__8 = myData.add("1st line");
        boolean o_testSaveReadData_literalMutationNumber13281__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_literalMutationNumber13281__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myData.get(i);
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber13281__26 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__27 = myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber13281__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_literalMutationNumber13281__36 = theFile.exists();
        boolean o_testSaveReadData_literalMutationNumber13281__37 = theFile.exists();
        int o_testSaveReadData_literalMutationNumber13281__39 = myData.size();
        int o_testSaveReadData_literalMutationNumber13281__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber13281__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_literalMutationNumber13281__42 = myFile.isEqual(mySecondFile);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13245_mg15843litString20739() throws Exception {
        String __DSPOT_aData_2554 = "\n";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_add13245__8 = myData.add("1st line");
        boolean o_testSaveReadData_add13245__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_add13245__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_add13245__25 = myData.size();
        int o_testSaveReadData_add13245__26 = myFile.getDataSize();
        boolean o_testSaveReadData_add13245__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_add13245__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_add13245__35 = theFile.exists();
        boolean o_testSaveReadData_add13245__36 = theFile.exists();
        mySecondFile.readData();
        mySecondFile.readData();
        int o_testSaveReadData_add13245__39 = myData.size();
        int o_testSaveReadData_add13245__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_add13245__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_add13245__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2554);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(6, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17136_mg23325() throws Exception {
        String __DSPOT_aData_3064 = "wzr/]l?GJb:%9@M6siOi";
        String __DSPOT_aData_2391 = "1lFGcg42Io+cuz$;ar#6";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd 7line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        myFile.delData(__DSPOT_aData_3064);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17093litString21989() throws Exception {
        String __DSPOT_aData_2391 = "3rd line with something else: 2, 4, 8, 16";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("1st line");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289_literalMutationString16553litNum23600() throws Exception {
        MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13289__10 = myData.add("1yt line");
        boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13289__27 = myData.size();
        int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13289__33 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13289__37 = theFile.exists();
        boolean o_testSaveReadData_mg13289__38 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13289__40 = myData.size();
        int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
        boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13287litString17093litString22029() throws Exception {
        String __DSPOT_aData_2391 = "3rd line with something else: 2, 4, 8, 16";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_mg13287__9 = myData.add("\n");
        boolean o_testSaveReadData_mg13287__14 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_mg13287__15 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_mg13287__26 = myData.size();
        int o_testSaveReadData_mg13287__27 = myFile.getDataSize();
        boolean o_testSaveReadData_mg13287__28 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_mg13287__32 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_mg13287__36 = theFile.exists();
        boolean o_testSaveReadData_mg13287__37 = theFile.exists();
        mySecondFile.readData();
        int o_testSaveReadData_mg13287__39 = myData.size();
        int o_testSaveReadData_mg13287__40 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_mg13287__41 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_mg13287__42 = myFile.isEqual(mySecondFile);
        myFile.delData(__DSPOT_aData_2391);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals(4, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13256litString16314_mg22040() throws Exception {
        String __DSPOT_aData_2964 = "j@VS&Z[,s4GB?R_cS%3f";
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_remove13256__8 = myData.add("1st line");
        boolean o_testSaveReadData_remove13256__13 = myData.add("a second line, longer than the first one");
        boolean o_testSaveReadData_remove13256__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        myFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_remove13256__25 = myData.size();
        int o_testSaveReadData_remove13256__26 = myFile.getDataSize();
        boolean o_testSaveReadData_remove13256__27 = myFile.dataAreEqual(myData);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_remove13256__31 = theFile.exists();
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        boolean o_testSaveReadData_remove13256__35 = theFile.exists();
        boolean o_testSaveReadData_remove13256__36 = theFile.exists();
        int o_testSaveReadData_remove13256__37 = myData.size();
        int o_testSaveReadData_remove13256__38 = mySecondFile.getDataSize();
        boolean o_testSaveReadData_remove13256__39 = mySecondFile.dataAreEqual(myData);
        boolean o_testSaveReadData_remove13256__40 = myFile.isEqual(mySecondFile);
        mySecondFile.delData(__DSPOT_aData_2964);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", myFileName);
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289null17129_failAssert0_literalMutationNumber18993_failAssert0() throws Exception {
        try {
            {
                MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
                MyStorage myFile = null;
                MyStorage mySecondFile = null;
                String myFileName = "bar.txt";
                File theFile = null;
                ArrayList<String> myData = new ArrayList<String>();
                MyStorage.deleteFile(myFileName);
                boolean o_testSaveReadData_mg13289__10 = myData.add("1st line");
                boolean o_testSaveReadData_mg13289__15 = myData.add("a second line, longer than the first one");
                boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
                myFile = new MyStorage(myFileName);
                for (int i = -1; i < (myData.size()); i++) {
                    myFile.addData(myData.get(i));
                }
                int o_testSaveReadData_mg13289__27 = myData.size();
                int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
                boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
                myFile.saveData();
                theFile = new File(myFileName);
                boolean o_testSaveReadData_mg13289__33 = theFile.exists();
                mySecondFile = new MyStorage(myFileName);
                boolean o_testSaveReadData_mg13289__37 = theFile.exists();
                boolean o_testSaveReadData_mg13289__38 = theFile.exists();
                mySecondFile.readData();
                int o_testSaveReadData_mg13289__40 = myData.size();
                int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
                boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
                boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
                boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(null);
            }
            Assert.fail("testSaveReadData_mg13289null17129_failAssert0_literalMutationNumber18993 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13381_failAssert0litString15866_failAssert0litNum21792_failAssert0() throws Exception {
        try {
            {
                {
                    MyStorage myFile = null;
                    MyStorage mySecondFile = null;
                    String myFileName = "bar.txt";
                    File theFile = null;
                    ArrayList<String> myData = new ArrayList<String>();
                    MyStorage.deleteFile(myFileName);
                    myData.add("1st line");
                    myData.add("");
                    myData.add("3rd line with something else: 2, 4, 8, 16");
                    myFile = new MyStorage(myFileName);
                    for (int i = 1; i < (myData.size()); i++) {
                        myFile.addData(myData.get(i));
                    }
                    myData.size();
                    myFile.getDataSize();
                    myFile.dataAreEqual(myData);
                    myFile.saveData();
                    theFile = new File(myFileName);
                    theFile.exists();
                    mySecondFile = new MyStorage(myFileName);
                    theFile.exists();
                    theFile.exists();
                    mySecondFile.readData();
                    myData.size();
                    mySecondFile.getDataSize();
                    mySecondFile.dataAreEqual(null);
                    myFile.isEqual(mySecondFile);
                }
            }
            Assert.fail("testSaveReadDatanull13381_failAssert0litString15866_failAssert0litNum21792 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13237litString14883null24604_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_add13237__8 = myData.add("\n");
            boolean o_testSaveReadData_add13237__13 = myData.add("a second line, longer than the first one");
            boolean o_testSaveReadData_add13237__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_add13237__27 = myData.size();
            int o_testSaveReadData_add13237__28 = myFile.getDataSize();
            boolean o_testSaveReadData_add13237__29 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_add13237__33 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_add13237__37 = theFile.exists();
            boolean o_testSaveReadData_add13237__38 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_add13237__40 = myData.size();
            int o_testSaveReadData_add13237__41 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_add13237__42 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_add13237__43 = myFile.isEqual(null);
            Assert.fail("testSaveReadData_add13237litString14883null24604 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_add13237_add14019null24631_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_add13237__8 = myData.add("1st line");
            boolean o_testSaveReadData_add13237__13 = myData.add("a second line, longer than the first one");
            boolean o_testSaveReadData_add13237__14 = myData.add(null);
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_add13237__27 = myData.size();
            int o_testSaveReadData_add13237__28 = myFile.getDataSize();
            boolean o_testSaveReadData_add13237__29 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_add13237__33 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_add13237__37 = theFile.exists();
            boolean o_testSaveReadData_add13237__38 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_add13237__40 = myData.size();
            int o_testSaveReadData_add13237__41 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_add13237__42 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_add13237_add14019__67 = myFile.isEqual(mySecondFile);
            boolean o_testSaveReadData_add13237__43 = myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadData_add13237_add14019null24631 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_mg13289_literalMutationString16553null23972_failAssert0() throws Exception {
        try {
            MyStorage __DSPOT_anotherStorage_2393 = new MyStorage();
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_mg13289__10 = myData.add("1yt line");
            boolean o_testSaveReadData_mg13289__15 = myData.add(null);
            boolean o_testSaveReadData_mg13289__16 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            int o_testSaveReadData_mg13289__27 = myData.size();
            int o_testSaveReadData_mg13289__28 = myFile.getDataSize();
            boolean o_testSaveReadData_mg13289__29 = myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_mg13289__33 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_mg13289__37 = theFile.exists();
            boolean o_testSaveReadData_mg13289__38 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_mg13289__40 = myData.size();
            int o_testSaveReadData_mg13289__41 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_mg13289__42 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_mg13289__43 = myFile.isEqual(mySecondFile);
            boolean o_testSaveReadData_mg13289__44 = myFile.isEqual(__DSPOT_anotherStorage_2393);
            Assert.fail("testSaveReadData_mg13289_literalMutationString16553null23972 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData_remove13254_literalMutationString15527null24277_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            boolean o_testSaveReadData_remove13254__8 = myData.add("1st line");
            boolean o_testSaveReadData_remove13254__13 = myData.add("{Vi,L@l:A-W.nTuy];wdAQ/t>N-q##08h3e09o0K");
            boolean o_testSaveReadData_remove13254__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = 0; i < (myData.size()); i++) {
            }
            int o_testSaveReadData_remove13254__23 = myData.size();
            int o_testSaveReadData_remove13254__24 = myFile.getDataSize();
            boolean o_testSaveReadData_remove13254__25 = myFile.dataAreEqual(null);
            myFile.saveData();
            theFile = new File(myFileName);
            boolean o_testSaveReadData_remove13254__29 = theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            boolean o_testSaveReadData_remove13254__33 = theFile.exists();
            boolean o_testSaveReadData_remove13254__34 = theFile.exists();
            mySecondFile.readData();
            int o_testSaveReadData_remove13254__36 = myData.size();
            int o_testSaveReadData_remove13254__37 = mySecondFile.getDataSize();
            boolean o_testSaveReadData_remove13254__38 = mySecondFile.dataAreEqual(myData);
            boolean o_testSaveReadData_remove13254__39 = myFile.isEqual(mySecondFile);
            Assert.fail("testSaveReadData_remove13254_literalMutationString15527null24277 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadDatanull13382_failAssert0_add14725_failAssert0litString18866_failAssert0() throws Exception {
        try {
            {
                {
                    MyStorage myFile = null;
                    MyStorage mySecondFile = null;
                    String myFileName = "bar.txt";
                    File theFile = null;
                    ArrayList<String> myData = new ArrayList<String>();
                    MyStorage.deleteFile(myFileName);
                    myData.add("1st line");
                    myData.add("\n");
                    myData.add("3rd line with something else: 2, 4, 8, 16");
                    myFile = new MyStorage(myFileName);
                    for (int i = 0; i < (myData.size()); i++) {
                        myFile.addData(myData.get(i));
                    }
                    myData.size();
                    myFile.getDataSize();
                    myFile.dataAreEqual(myData);
                    myFile.saveData();
                    myFile.saveData();
                    theFile = new File(myFileName);
                    theFile.exists();
                    mySecondFile = new MyStorage(myFileName);
                    theFile.exists();
                    theFile.exists();
                    mySecondFile.readData();
                    myData.size();
                    mySecondFile.getDataSize();
                    mySecondFile.dataAreEqual(myData);
                    myFile.isEqual(null);
                }
            }
            Assert.fail("testSaveReadDatanull13382_failAssert0_add14725_failAssert0litString18866 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

