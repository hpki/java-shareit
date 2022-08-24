package ru.practicum.shareit.user;

import ru.practicum.shareit.exceptions.ExistsException;

import java.util.List;
import java.util.NoSuchElementException;

public interface UserService {
    List<User> getAll();

    User getUserById(long id) throws NoSuchElementException;

    User addUser(User user) throws ExistsException;

    User updateUser(long id, User user) throws NoSuchElementException, ExistsException,
            IllegalArgumentException;

    void deleteUserById(long id);
}
