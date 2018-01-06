package model;

public class User {

	private final String username;
	private final String password;
	private Boolean createPermission;
	private Boolean readPermission;
	private Boolean updatePermission;
	private Boolean deletePermission;
	private Long masleko;

	

	public User(String username, String password, Boolean createPermission, Boolean readPermission,
			Boolean updatePermission, Boolean deletePermission, Long masleko) {
		super();
		this.username = username;
		this.password = password;
		this.createPermission = createPermission;
		this.readPermission = readPermission;
		this.updatePermission = updatePermission;
		this.deletePermission = deletePermission;
		this.masleko = masleko;
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

	public Long getMasleko() {
		return masleko;
	}

}
