import java.time.LocalDateTime;

public class Logger {
    private String path;

    private class LoggerInstance{
        private static Logger logger =  new Logger();
    }

    public static Logger getInstance(){
        return LoggerInstance.logger;
    }

    public void logInfo(String message) {
        log("INFO", message);
    }

    public void logWarn(String message) {
        log("WARN", message);
    }

    public void logError(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        String logMsg = String.format("[%s] %s: %s",
                LocalDateTime.now(), level, message);
        System.out.println(logMsg);
    }

}
