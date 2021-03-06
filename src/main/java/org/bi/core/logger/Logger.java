package org.bi.core.logger;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Logger {
    private static final String INFO = "[INFO]";
    private static final String DEBUG = "[DEBUG]";
    private static final String ERROR = "[ERROR]";

    public static LogLevel LOG_LEVEL = LogLevel.INFO;

    public static void setLogLevel(LogLevel logLevel) {
        Logger.LOG_LEVEL = logLevel;
    }

    public void error(String s) {
        if (LOG_LEVEL == LogLevel.ERROR || LOG_LEVEL == LogLevel.INFO || LOG_LEVEL == LogLevel.DEBUG)
            System.out.println(ERROR + " <" + s + ">");
    }

    public void error(String s, Throwable e) {
        if (LOG_LEVEL == LogLevel.ERROR || LOG_LEVEL == LogLevel.INFO || LOG_LEVEL == LogLevel.DEBUG) {
            System.out.println(ERROR + " <" + s + ">");
            System.out.println(e.getMessage() + " ==> Stack trace: \n" +
                    Arrays.stream(e.getStackTrace()).map(StackTraceElement::toString).collect(Collectors.joining("\n")));
        }
    }

    public void info(String s) {
        if (LOG_LEVEL == LogLevel.INFO || LOG_LEVEL == LogLevel.DEBUG)
            System.out.println(INFO + s);
    }

    public void debug(String s) {
        if (LOG_LEVEL == LogLevel.DEBUG)
            System.out.println(DEBUG + s);
    }
}
