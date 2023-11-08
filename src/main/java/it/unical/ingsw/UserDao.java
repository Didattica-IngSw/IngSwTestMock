package it.unical.ingsw;

import java.util.Optional;

public interface UserDao {
    User updateUser(User user);
    Optional<User> findByUsername(String username);
}
