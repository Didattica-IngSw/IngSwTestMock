package it.unical.ingsw;

public interface UserService {

    User assignPassword(User user) throws Exception;
    String findUserEmail(String username);
}
