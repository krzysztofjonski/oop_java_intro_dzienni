package com.codecool;

public class MainForController {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser(new User(1, "Michal", "nk@nk.pl"));
        uc.addUser(new User(2, "Adam", "ad@ad.pl"));

        uc.getAllUsers();
    }
}
