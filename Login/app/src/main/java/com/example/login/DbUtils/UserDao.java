package com.example.login.DbUtils;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Insert
    void createUser(User user);

    @Query("SELECT *FROM  user where Username like :strUsername")
    default User getUserByUserName() {
        return getUserByUserName();
    }

    @Query("SELECT *FROM  user where Username like :strUsername")
    default User getUserByUserName(String strUsername) {
        return null;
    }
}
