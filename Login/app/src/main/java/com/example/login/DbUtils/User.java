package com.example.login.DbUtils;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {


    @PrimaryKey(autoGenerate = true)
    private int Uid;
    @ColumnInfo (name = "Username")
    private static String Username;
    @ColumnInfo (name = "Password")
    private String Password;
//Getter and Setter
    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getUsername() {
        return Username;
    }

    public static void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
