package com.bmocl.appWithSpringBoot.service;

import com.bmocl.appWithSpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getListUser();

    User getUserById(long id);

    void addUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);

}
