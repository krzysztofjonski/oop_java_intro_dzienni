package com.codecool;

// psvm                 -> public static void main(String[] args)
// sout                 -> System.out.println
// ctrl + shift + f10   -> run
// file -> settings -> - keymap = wiecej skrotow
// crtl + d             -> duplikowanie linii kursora
// art + enter          -> auto-podpowiedz
// alt + ins -> generate
public class Main {
    //metoda od ktorej startujemy!
    public static void main(String[] args) {
        System.out.println("Startujemy!");
        // utworzenie Obiektu klasy
        User userOne = new User(1, "Michal", "nk@nk.pl");
        User userTwo = new User(2, "Adam", "ad@ad.pl");
        User userThree = new User(3, "Anna", "anna@anna.pl");
        User userFour = new User(3, "Anna", "anna@anna.pl");
        System.out.println(userOne);
        System.out.println(userTwo);
        System.out.println(userThree);
        //userOne.setName("Adam");
        //System.out.println(userOne.getName());
        //System.out.println(userOne.getEmail());
        //System.out.println(userOne.getRegistrationDateTime());
        System.out.println(userOne.equals(userTwo));
        System.out.println(userThree.equals(userFour));
        User userFive = userOne;
        System.out.println(userOne.equals(userFive));
        userFive.setName("UPDATE!!!");
        System.out.println(userOne);
        System.out.println(userFive);
    }
}
