package com.codecool;
import java.time.LocalDateTime;

// model Java Bean
// -> prywatne pola klasowe
// -> publiczne metody dostepowe do pol
// -> konstruktor
// -> toString()
public class User {
    // skladowe - pola
    private int userId;
    private String name;
    private String email;
    private boolean status;
    private LocalDateTime registrationDateTime;


    // public User() {} - domyslny konstruktor
    // konstruktor - metoda specjalna do tworzenia nowego obiektu
    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        status = true;
        registrationDateTime = LocalDateTime.now();
    }

    @Override     // ta metoda pochodzi z nadklasy Object i jest aktualizowana tutaj
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", registrationDateTime=" + registrationDateTime +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}

