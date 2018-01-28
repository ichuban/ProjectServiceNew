package Week5;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserServiceImplement implements UserService {
    ArrayList<User> users = new ArrayList<>();


    protected static final Logger log = Logger.getLogger(UserServiceImplement.class.getName());

    @Override
    public boolean register(User user) {

        if (user.getDayOfBirth().isAfter(LocalDate.now().minusYears(18))) {
            log.warn("Uzytkownik nie ma 18 lat");
            return false;
        }


        if (user.getPassword().chars().filter(Character::isLowerCase).count() < 1 ||
                user.getPassword().chars().filter(Character::isUpperCase).count() < 1) {

            log.warn("Hasło musi zawierać conamniej jedną małą i dużą literę");
            return false;
        }
            if (user.getPassword().length() < 8) {
                log.warn("Haslo ma mniej niz 8 znakow");
                return false;
            }
            for (User user1 : users) {

                if (user.getLogin().equals(user1.getLogin())) {
                    log.warn("Uzytkownik" + user1.getLogin() + " istenije");
                    return false;
                } else if (user.getEmail().equals(user1.getEmail())) {
                    log.warn("Uzytkownik" + user1.getLogin() + " istenije");
                    return false;

                }

            }


            users.add(user);
            log.info("Uzytkownik zarejestrowany:" + user.getLogin());
            return true;

        }

        @Override
        public boolean login (String login, String password){
            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    if (user.getPassword().equals(password))
                        log.info("Zalogowany uzytkownik:" + user.getLogin());
                    return true;
                }

            }
            return false;
        }

        @Override
        public boolean changePassword (String login, String newPassword){
            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    user.setPassword(newPassword);
                    log.info("Zmiana Hasla");
                    return true;
                }

            }
            return false;
        }
    }
