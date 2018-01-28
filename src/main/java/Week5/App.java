package Week5;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {


        User user1 = new User("Rafal", "Suchy", 12345, "RaSu", "123Ds", "suchy@gmail.com", LocalDate.parse("1990-01-20"));
        User user2 = new User("Michal", "Bak", 1234, "RaFa", "1234", "such@gmail.com", LocalDate.parse("2018-01-28"));
        User user3 = new User("Marcin", "Krycha", 123456, "RaSu", "123", "suchy1@gmail.com", LocalDate.parse("2018-01-28"));


        UserServiceImplement userServiceImplement1 = new UserServiceImplement();

        userServiceImplement1.register(user1);
        userServiceImplement1.login("RaSu", "123");




    }
}
