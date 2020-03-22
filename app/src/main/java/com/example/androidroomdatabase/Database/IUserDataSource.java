package com.example.androidroomdatabase.Database;

import com.example.androidroomdatabase.Model.User;

import java.util.List;

import io.reactivex.Flowable;

public interface IUserDataSource {

    Flowable<User> getUserById(int userId);

    Flowable<List<User>> getAllUsers();

    void insertUser(User...users);

    void updateUser(User...users);

    void deleteUser(User...users);

    void deleteAllUsers();
}
