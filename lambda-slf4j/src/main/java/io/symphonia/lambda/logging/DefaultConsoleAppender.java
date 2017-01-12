package io.symphonia.lambda.logging;

@SuppressWarnings("WeakerAccess")
public class DefaultConsoleAppender extends LambdaConsoleAppender {

    public static String NO_REQUEST_ID = "NO-REQUEST-ID";

    public static String DEFAULT_PATTERN =
            "[%d{yyyy-MM-dd HH:mm:ss.SSS}] %.-6level %logger{5} - %msg%n";

    public DefaultConsoleAppender() {
        super(DEFAULT_PATTERN);
    }

}
