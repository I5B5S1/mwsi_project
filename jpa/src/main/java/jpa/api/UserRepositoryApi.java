package jpa.api;

import jpa.entities.UserEntity;

public interface UserRepositoryApi {
    void addUser(String username,
                 String password,
                 Boolean createPermission,
                 Boolean readPermission,
                 Boolean updatePermission,
                 Boolean deletePermission);

    UserEntity getUser(String username);
}
