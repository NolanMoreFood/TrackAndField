import java.util.ArrayList;
import java.util.*;

public class HeatSheet {
    private ArrayList<RunningEvent> heatList;
    private String eventName;

    public HeatSheet (ArrayList<RunningEvent> runnersAndTimes, String e){
        heatList = (ArrayList)runnersAndTimes.clone();
        eventName = e;
    }

    public String printHeat(){
        return "ok";
    }
}
