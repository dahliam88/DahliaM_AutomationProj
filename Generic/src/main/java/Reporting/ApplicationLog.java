package Reporting;

public class ApplicationLog {
    public static void epiclogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("launch local browser");
    }
}