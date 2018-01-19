package jpa.entities;

import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Proxy(lazy = false)
public class UserEntity {

    @Id
    @Column(name = "UserID")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "CreateAuth")
    private Boolean createPermission;
    @Column(name = "ReadAuth")
    private Boolean readPermission;
    @Column(name = "UpdateAuth")
    private Boolean updatePermission;
    @Column(name = "DeleteAuth")
    private Boolean deletePermission;


    public UserEntity() {
    }


    public UserEntity(String username, String password, Boolean createPermission, Boolean readPermission,
                      Boolean updatePermission, Boolean deletePermission) {
        super();
        this.username = username;
        this.password = password;
        this.createPermission = createPermission;
        this.readPermission = readPermission;
        this.updatePermission = updatePermission;
        this.deletePermission = deletePermission;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isCreatePermission() {
        return createPermission;
    }

    public void setCreatePermission(Boolean createPermission) {
        this.createPermission = createPermission;
    }

    public boolean isReadPermission() {
        return readPermission;
    }

    public void setReadPermission(Boolean readPermission) {
        this.readPermission = readPermission;
    }

    public boolean isUpdatePermission() {
        return updatePermission;
    }

    public void setUpdatePermission(Boolean updatePermission) {
        this.updatePermission = updatePermission;
    }

    public boolean isDeletePermission() {
        return deletePermission;
    }

    public void setDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
    }


}
