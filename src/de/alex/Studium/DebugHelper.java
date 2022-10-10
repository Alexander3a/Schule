package de.alex.Studium;

public class DebugHelper {
    Long debug_time_start = -1L;

    public DebugHelper() {

    }
    public void stop_tracker(){
        debug_time_start = -1L;
    }
    public void reset_tracker(){
        debug_time_start = System.currentTimeMillis();
    }
    public void debug_time(String msg){
        if(debug_time_start!=-1L){
            System.out.println("[DebugHelper] "+msg+": "+(System.currentTimeMillis()-debug_time_start)+"ms");
        }
    }
}