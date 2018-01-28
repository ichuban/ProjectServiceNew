package Week5;

public interface UserService {

    //Rejestracja Uzytkownika

    boolean register(User user);

    // Logowanie Uzytkownika

    boolean login(String login, String password);

    // Zmiana hasła

    boolean changePassword(String login, String newPassword);

}
