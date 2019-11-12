/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package eu.stamp_project.examples.dhell;

import java.io.IOException;

// **********************************************************************
import eu.stamp_project.examples.dhell.HelloApp;
import eu.stamp_project.examples.dhell.MyLogger;

// **********************************************************************
public class MyGod
{public static class __CLR4_2_02j2jk2q2rqtz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0079\u006f\u0073\u0075\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0053\u0054\u0041\u004d\u0050\u002f\u0047\u0069\u0074\u002f\u0064\u0068\u0065\u006c\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573213620784L,8589935092L,164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // **********************************************************************
    // public
    // **********************************************************************
    // ******** methods

    // **********************************************************************
    public static void main(String[] args) throws IOException
    {try{__CLR4_2_02j2jk2q2rqtz.R.inc(91);
        __CLR4_2_02j2jk2q2rqtz.R.inc(92);int indentCount = 1;
        __CLR4_2_02j2jk2q2rqtz.R.inc(93);int argIndex = 0;
        __CLR4_2_02j2jk2q2rqtz.R.inc(94);String indentArg = "";
        __CLR4_2_02j2jk2q2rqtz.R.inc(95);String fileName = "";
        __CLR4_2_02j2jk2q2rqtz.R.inc(96);String logLevel = "WARNING";
        __CLR4_2_02j2jk2q2rqtz.R.inc(97);boolean printOnStdout = true;
        __CLR4_2_02j2jk2q2rqtz.R.inc(98);boolean shouldRun = true;

        __CLR4_2_02j2jk2q2rqtz.R.inc(99);while ((((argIndex < args.length)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(100)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(101)==0&false)))
        {{
            __CLR4_2_02j2jk2q2rqtz.R.inc(102);if ((((args[argIndex].equals("-h"))&&(__CLR4_2_02j2jk2q2rqtz.R.iget(103)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(104)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(105);printHelp();
                __CLR4_2_02j2jk2q2rqtz.R.inc(106);shouldRun = false;
                __CLR4_2_02j2jk2q2rqtz.R.inc(107);argIndex = args.length;
            }
            }else {__CLR4_2_02j2jk2q2rqtz.R.inc(108);if ((((args[argIndex].equals("-no_stdout"))&&(__CLR4_2_02j2jk2q2rqtz.R.iget(109)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(110)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(111);printOnStdout = false;
                __CLR4_2_02j2jk2q2rqtz.R.inc(112);argIndex = argIndex + 1;
            }
            }else {__CLR4_2_02j2jk2q2rqtz.R.inc(113);if ((((args[argIndex].equals("-log"))&&(__CLR4_2_02j2jk2q2rqtz.R.iget(114)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(115)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(116);if ((((argIndex + 1 < args.length)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(117)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(118)==0&false)))
                {{
                    __CLR4_2_02j2jk2q2rqtz.R.inc(119);logLevel = args[argIndex + 1];
                }
                }else
                {{
                    __CLR4_2_02j2jk2q2rqtz.R.inc(120);System.err.println("Missing argument: -log <level>, -h for help");
                    __CLR4_2_02j2jk2q2rqtz.R.inc(121);System.exit(1);
                }
                }__CLR4_2_02j2jk2q2rqtz.R.inc(122);argIndex = argIndex + 2;
            }
            }else {__CLR4_2_02j2jk2q2rqtz.R.inc(123);if ((((indentArg.length() == 0)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(124)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(125)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(126);indentArg = args[argIndex];
                __CLR4_2_02j2jk2q2rqtz.R.inc(127);argIndex = argIndex + 1;
            }
            }else {__CLR4_2_02j2jk2q2rqtz.R.inc(128);if ((((fileName.length() == 0)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(129)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(130)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(131);fileName = args[argIndex];
                __CLR4_2_02j2jk2q2rqtz.R.inc(132);argIndex = argIndex + 1;
            }
            }else
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(133);System.err.println("Unknown argument: " + args[argIndex] + ", -h for help");
                __CLR4_2_02j2jk2q2rqtz.R.inc(134);System.exit(1);
            }
        }}}}}}

        }__CLR4_2_02j2jk2q2rqtz.R.inc(135);if ((((shouldRun)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(136)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(137)==0&false)))
        {{
            __CLR4_2_02j2jk2q2rqtz.R.inc(138);if ((((indentArg.length() > 0)&&(__CLR4_2_02j2jk2q2rqtz.R.iget(139)!=0|true))||(__CLR4_2_02j2jk2q2rqtz.R.iget(140)==0&false)))
            {{
                __CLR4_2_02j2jk2q2rqtz.R.inc(141);try
                {
                    __CLR4_2_02j2jk2q2rqtz.R.inc(142);indentCount = Integer.parseInt(indentArg);
                }
                catch (NumberFormatException e)
                {
                    __CLR4_2_02j2jk2q2rqtz.R.inc(143);System.err.println("Argument " + indentArg +
                        " must be an integer, -h for help");
                    __CLR4_2_02j2jk2q2rqtz.R.inc(144);System.exit(1);
                }
            }

            }__CLR4_2_02j2jk2q2rqtz.R.inc(145);MyLogger.initLogs(logLevel);

            __CLR4_2_02j2jk2q2rqtz.R.inc(146);HelloApp myApp = new HelloApp(indentCount, fileName);
            __CLR4_2_02j2jk2q2rqtz.R.inc(147);myApp.setShouldPrintOnStdout(printOnStdout);
            __CLR4_2_02j2jk2q2rqtz.R.inc(148);myApp.run();
        }
    }}finally{__CLR4_2_02j2jk2q2rqtz.R.flushNeeded();}}

    // **********************************************************************
    public static void printHelp()
    {try{__CLR4_2_02j2jk2q2rqtz.R.inc(149);
        __CLR4_2_02j2jk2q2rqtz.R.inc(150);System.out.println("eu.stamp_project.examples.dhell.MyGod");
        __CLR4_2_02j2jk2q2rqtz.R.inc(151);System.out.println("Print on stdout a 'Hello World !' message formatted according to");
        __CLR4_2_02j2jk2q2rqtz.R.inc(152);System.out.println("<indentation_count>, and generate an output file");
        __CLR4_2_02j2jk2q2rqtz.R.inc(153);System.out.println("");
        __CLR4_2_02j2jk2q2rqtz.R.inc(154);System.out.println("args: [-h | <indentation_count> [<file_name>] [-no_stdout] [-log <level>]]");
        __CLR4_2_02j2jk2q2rqtz.R.inc(155);System.out.println("    -h: this help");
        __CLR4_2_02j2jk2q2rqtz.R.inc(156);System.out.println("    <indentation_count>: number of '-' for message indentation, default is 1");
        __CLR4_2_02j2jk2q2rqtz.R.inc(157);System.out.println("    <file_name>: output file name, default is my_storage.txt");
        __CLR4_2_02j2jk2q2rqtz.R.inc(158);System.out.println("        output file name contains <indentation_count> and the stdout");
        __CLR4_2_02j2jk2q2rqtz.R.inc(159);System.out.println("    -no_stdout: if specified, do not print anything on stdout,");
        __CLR4_2_02j2jk2q2rqtz.R.inc(160);System.out.println("        generate only the output file");
        __CLR4_2_02j2jk2q2rqtz.R.inc(161);System.out.println("    -log <level>: specify the level of information to log,");
        __CLR4_2_02j2jk2q2rqtz.R.inc(162);System.out.println("        <level> is one of {OFF, SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST, ALL}, default is WARNING");
        __CLR4_2_02j2jk2q2rqtz.R.inc(163);System.out.println("        generate a log file, dhell.log, in the current directory");
    }finally{__CLR4_2_02j2jk2q2rqtz.R.flushNeeded();}}
}
