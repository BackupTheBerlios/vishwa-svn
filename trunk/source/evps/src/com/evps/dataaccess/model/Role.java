package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.OneToMany;


/**
 * The persistent class for the evp_role database table.
 * 
 */
@Entity
@Table(name="evp_role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROLE_ID")
	private int roleId;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	@Column(name="ROLE_NAME")
	private String roleName;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="evpRole")
	private List<UserRole> evpUserRoles;

	public Role() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserRole> getEvpUserRoles() {
		return this.evpUserRoles;
	}

	public void setEvpUserRoles(List<UserRole> evpUserRoles) {
		this.evpUserRoles = evpUserRoles;
	}

}