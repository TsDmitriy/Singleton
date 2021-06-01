public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String log = "Это лог...+";
    private ProgramLogger() {

    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger==null){
             programLogger=new ProgramLogger();
        }
            return programLogger;

    }

    public void addInfoLog(String text) {
        log +=text + "\n";
    }

    public void showLog () {
        System.out.println(log);
    }
}
