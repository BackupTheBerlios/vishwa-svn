package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The primary key class for the evp_action database table.
 * 
 */
@Entity
@Embeddable
public class ActionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACTION_ID")
	private int actionId;

	@Id
	@GeneratedValue
	@Column(name="REQ_ID")
	private int reqId;

	public ActionPK() {
	}
	public int getActionId() {
		return this.actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public int getReqId() {
		return this.reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActionPK)) {
			return false;
		}
		ActionPK castOther = (ActionPK)other;
		return 
			(this.actionId == castOther.actionId)
			&& (this.reqId == castOther.reqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.actionId;
		hash = hash * prime + this.reqId;
		
		return hash;
	}
}