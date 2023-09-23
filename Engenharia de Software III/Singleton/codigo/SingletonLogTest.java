public class SingletonLogTest {
    public static void main(String[] args) {
        LogSingleton log = LogSingleton.getInstance();

        log.logMessage("Mensagem 1");
        log.logMessage("Mensagem 2");
        log.logMessage("Mensagem 3");

        String logContent = log.getLog();
        System.out.println("Registro de Log:");
        System.out.println(logContent);
    }
}