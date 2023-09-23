public class LogSingleton {
    private static LogSingleton instance;
    private StringBuilder logBuffer;

    private LogSingleton() {
        logBuffer = new StringBuilder();
    }

    public static LogSingleton getInstance() {
        if (instance == null) {
            instance = new LogSingleton();
        }
        return instance;
    }

    public void logMessage(String message) {
        logBuffer.append(message).append("\n");
    }

    public String getLog() {
        return logBuffer.toString();
    }
}
