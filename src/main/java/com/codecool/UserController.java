package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();
    //dodawanie uzytkownika
    public void addUser(User user) {
        users.add(user);
    }

    //wyswietlanie uzytkownikow
    public void getAllUsers() {
        for (User user : users) {
            System.out.println(user.toString());
        }
        //ctrl + spacja -> generate predicate
        //users.forEach(user -> System.out.println(user));
    }
}
