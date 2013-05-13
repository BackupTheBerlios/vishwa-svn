package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The primary key class for the evp_req_staff database table.
 * 
 */
@Entity
@Embeddable
public class AssessmentRequestStaffPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="REQ_ID")
	private int reqId;

	@Column(name="MEMBER_ID")
	private int memberId;

	public AssessmentRequestStaffPK() {
	}
	public int getReqId() {
		return this.reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public int getMemberId() {
		return this.memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AssessmentRequestStaffPK)) {
			return false;
		}
		AssessmentRequestStaffPK castOther = (AssessmentRequestStaffPK)other;
		return 
			(this.reqId == castOther.reqId)
			&& (this.memberId == castOther.memberId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reqId;
		hash = hash * prime + this.memberId;
		
		return hash;
	}
}