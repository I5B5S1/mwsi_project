package jpa.services;

import jpa.api.UserRepositoryApi;
import jpa.entities.UserEntity;
import jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserRepositoryApi {


    @Autowired
    private UserRepository userRepository;

    public UserService() {
    }

    @Override
    public void addUser(String username, String password, Boolean createPermission, Boolean readPermission, Boolean updatePermission, Boolean deletePermission) {
        userRepository.save(new UserEntity(username, password, createPermission, readPermission, updatePermission, deletePermission));
    }

    @Override
    public UserEntity getUser(String username) {
        return userRepository.getOne(username);
    }
}
