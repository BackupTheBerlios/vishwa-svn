package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The primary key class for the evp_user_role database table.
 * 
 */
@Entity
@Embeddable
public class UserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_ORG")
	private int userOrg;

	public UserRolePK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserOrg() {
		return this.userOrg;
	}
	public void setUserOrg(int userOrg) {
		this.userOrg = userOrg;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserRolePK)) {
			return false;
		}
		UserRolePK castOther = (UserRolePK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.userOrg == castOther.userOrg);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.userOrg;
		
		return hash;
	}
}