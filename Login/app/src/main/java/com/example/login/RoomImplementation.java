package com.example.login;

import android.app.Application;

import androidx.room.Room;

import com.example.login.DbUtils.LocalDB;

public class RoomImplementation extends Application {

    private static RoomImplementation mInstance;
    private LocalDB dbInstance;

    @Override
    public void  onCreate(){
        super.onCreate();

        mInstance=this;
        dbInstance= Room.databaseBuilder(getApplicationContext(),LocalDB.class, "LocalDB").build();
    }
    public static RoomImplementation getmInstance(){
        return mInstance;
    }
    public LocalDB getDbInstance(){
        return dbInstance;
    }
}
