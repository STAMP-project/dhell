/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

// **********************************************************************
import java.util.logging.*;
import java.io.IOException;

// **********************************************************************
public class MyLogger
{public static class __CLR4_2_04k4kk2q2rqu9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620784L,8589935092L,228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** attributes
    public static Logger Instance = Logger.getLogger(MyLogger.class.getName());

    // ******** methods
    // **********************************************************************
    public static void initLogs(String level)
    {try{__CLR4_2_04k4kk2q2rqu9.R.inc(164);
        __CLR4_2_04k4kk2q2rqu9.R.inc(165);Handler logHandler = null;
        __CLR4_2_04k4kk2q2rqu9.R.inc(166);Formatter logFormater = null;
        __CLR4_2_04k4kk2q2rqu9.R.inc(167);boolean fileCreated = false;

        __CLR4_2_04k4kk2q2rqu9.R.inc(168);Instance.setUseParentHandlers(false);

        __CLR4_2_04k4kk2q2rqu9.R.inc(169);try
        {
            __CLR4_2_04k4kk2q2rqu9.R.inc(170);logHandler = new FileHandler("dhell.log", false);
            __CLR4_2_04k4kk2q2rqu9.R.inc(171);logHandler.setFormatter(new SimpleFormatter());
            __CLR4_2_04k4kk2q2rqu9.R.inc(172);fileCreated = true;
        }
        catch (Exception e)
        {
            __CLR4_2_04k4kk2q2rqu9.R.inc(173);logHandler = new ConsoleHandler();
        }
        __CLR4_2_04k4kk2q2rqu9.R.inc(174);Instance.addHandler(logHandler);

        __CLR4_2_04k4kk2q2rqu9.R.inc(175);logHandler.setLevel(Level.ALL);
        __CLR4_2_04k4kk2q2rqu9.R.inc(176);Instance.setLevel(stringToLevel(level));

        __CLR4_2_04k4kk2q2rqu9.R.inc(177);if ((((fileCreated)&&(__CLR4_2_04k4kk2q2rqu9.R.iget(178)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(179)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(180);Instance.info("Log file created");
        }
        }else
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(181);Instance.warning("Cannot create log file, redirecting logs to the console");
        }
        }__CLR4_2_04k4kk2q2rqu9.R.inc(182);Instance.severe("checking log level: severe: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(183);Instance.warning("checking log level: warning: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(184);Instance.info("checking log level: info: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(185);Instance.config("checking log level: config: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(186);Instance.fine("checking log level: fine: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(187);Instance.finer("checking log level: finer: Exiting initLogs");
        __CLR4_2_04k4kk2q2rqu9.R.inc(188);Instance.finest("checking log level: finest: Exiting initLogs");
    }finally{__CLR4_2_04k4kk2q2rqu9.R.flushNeeded();}}

    // **********************************************************************
    public static Level stringToLevel(String level)
    {try{__CLR4_2_04k4kk2q2rqu9.R.inc(189);
        // levels: OFF, SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST, ALL
        __CLR4_2_04k4kk2q2rqu9.R.inc(190);Level theLevel = Level.WARNING;

        __CLR4_2_04k4kk2q2rqu9.R.inc(191);if ((((level.equals("OFF"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(192)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(193)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(194);theLevel = Level.OFF;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(195);if ((((level.equals("SEVERE"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(196)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(197)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(198);theLevel = Level.SEVERE;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(199);if ((((level.equals("WARNING"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(200)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(201)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(202);theLevel = Level.WARNING;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(203);if ((((level.equals("INFO"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(204)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(205)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(206);theLevel = Level.INFO;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(207);if ((((level.equals("CONFIG"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(208)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(209)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(210);theLevel = Level.CONFIG;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(211);if ((((level.equals("FINE"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(212)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(213)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(214);theLevel = Level.FINE;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(215);if ((((level.equals("FINER"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(216)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(217)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(218);theLevel = Level.FINER;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(219);if ((((level.equals("FINEST"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(220)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(221)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(222);theLevel = Level.FINEST;
        }
        }else {__CLR4_2_04k4kk2q2rqu9.R.inc(223);if ((((level.equals("ALL"))&&(__CLR4_2_04k4kk2q2rqu9.R.iget(224)!=0|true))||(__CLR4_2_04k4kk2q2rqu9.R.iget(225)==0&false)))
        {{
            __CLR4_2_04k4kk2q2rqu9.R.inc(226);theLevel = Level.ALL;
        }

        }}}}}}}}}__CLR4_2_04k4kk2q2rqu9.R.inc(227);return(theLevel);
    }finally{__CLR4_2_04k4kk2q2rqu9.R.flushNeeded();}}

    // **********************************************************************
    // private
    // **********************************************************************
}
