import java.util.ArrayList;
import java.util.*;

public class RunningEvent{
    private String runnerName;

    private double time;
    private String eventname;
    boolean hurdles;

    public RunningEvent (String n, boolean h, int time, String name){
        this.eventname = n;
        this.hurdles = h;
        this.runnerName = name;
    }

    public String toString(){
        return eventname;
    }
    public String getEventName(){
        return eventname;
    }
}