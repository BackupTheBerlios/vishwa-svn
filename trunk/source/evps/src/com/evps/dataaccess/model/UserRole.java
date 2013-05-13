package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the evp_user_role database table.
 * 
 */
@Entity
@Table(name="evp_user_role")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@EmbeddedId
	private UserRolePK id;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="WF_REVIEWER")
	private User evpUser1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User evpUser2;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="USER_ORG")
	private Organisation evpOrg;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="USER_ROLE")
	private Role evpRole;

	public UserRole() {
	}

	public UserRolePK getId() {
		return this.id;
	}

	public void setId(UserRolePK id) {
		this.id = id;
	}

	public User getEvpUser1() {
		return this.evpUser1;
	}

	public void setEvpUser1(User evpUser1) {
		this.evpUser1 = evpUser1;
	}

	public User getEvpUser2() {
		return this.evpUser2;
	}

	public void setEvpUser2(User evpUser2) {
		this.evpUser2 = evpUser2;
	}

	public Organisation getEvpOrg() {
		return this.evpOrg;
	}

	public void setEvpOrg(Organisation evpOrg) {
		this.evpOrg = evpOrg;
	}

	public Role getEvpRole() {
		return this.evpRole;
	}

	public void setEvpRole(Role evpRole) {
		this.evpRole = evpRole;
	}

}