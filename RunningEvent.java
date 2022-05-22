import java.util.ArrayList;
import java.util.*;

public class RunningEvent{
    private String runnerName;

    private int time;
    private String eventname;
    boolean hurdles;

    public RunningEvent (String n, boolean h, int time, String name){
        this.eventname = n;
        this.hurdles = h;
        this.runnerName = name;
        this.time=time;
    }

    public String toString(){
        return eventname;
    }
    public String getEventName(){
        return eventname;
    }

    public int getTime(){
        return time;
    }

    public String getRunnerName(){
        return runnerName;
    }
}