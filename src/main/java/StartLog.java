public class StartLog {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addInfoLog("Привет");
        ProgramLogger.getProgramLogger().addInfoLog("Привет2");
        ProgramLogger.getProgramLogger().addInfoLog("Привет3");

        ProgramLogger.getProgramLogger().showLog();
    }
}
