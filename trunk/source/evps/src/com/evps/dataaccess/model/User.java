package com.evps.dataaccess.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the evp_user database table.
 * 
 */
@XmlRootElement 
@Entity
@Table(name="evp_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="LOGIN_NAME")
	private String loginName;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_FNAME")
	private String userFname;

	@Column(name="USER_LNAME")
	private String userLname;

	@Column(name="USER_PHONE")
	private String userPhone;

	@Column(name="USER_PWD")
	private String userPwd;

	@Column(name="USER_SEX")
	private int userSex;


	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="evpUser1")
	private List<UserRole> evpUserRoles1;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="evpUser2")
	private List<UserRole> evpUserRoles2;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFname() {
		return this.userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return this.userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserSex() {
		return this.userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}


	public List<UserRole> getEvpUserRoles1() {
		return this.evpUserRoles1;
	}

	public void setEvpUserRoles1(List<UserRole> evpUserRoles1) {
		this.evpUserRoles1 = evpUserRoles1;
	}

	public List<UserRole> getEvpUserRoles2() {
		return this.evpUserRoles2;
	}

	public void setEvpUserRoles2(List<UserRole> evpUserRoles2) {
		this.evpUserRoles2 = evpUserRoles2;
	}

}