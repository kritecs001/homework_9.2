import java.time.LocalDateTime;
import java.util.Locale;

public class SmartLogger implements Logger{
    private int counter = 1;

    @Override
    public void log(String msg){
        if (msg.toLowerCase().contains("error")){
            System.out.println("ERROR#" + counter + " [" + LocalDateTime.now() + "]" + " "+ msg);
            counter ++;
        } else {
            System.out.println("INFO#" + counter + " [" + LocalDateTime.now() + "]" + " "+ msg);
            counter ++;
        }
    }
}
