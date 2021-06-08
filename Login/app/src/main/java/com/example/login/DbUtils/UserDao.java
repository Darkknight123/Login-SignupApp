package com.example.login.DbUtils;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Insert
    void createUser(User user);
    @Query("SELECT *FROM  user where username like :strUsername")
    User getUserByUserName(String strUsername);
}
