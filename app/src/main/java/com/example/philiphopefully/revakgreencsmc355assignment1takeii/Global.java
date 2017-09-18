package com.example.philiphopefully.revakgreencsmc355assignment1takeii;

/**
 * Created by Philip Hopefully on 9/17/2017.
 */

public class Global {
    private static Global instance;
    public static boolean locked;

    private Global(){}

    public boolean getLocked(){
        return Global.locked;
    }

    public void setLocked(boolean bool){
        Global.locked=bool;
    }

    public static synchronized Global getInstance(){
        if(instance==null){
            instance=new Global();
        }
            return instance;
    }



}
