package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The primary key class for the evp_req_date database table.
 * 
 */
@Entity
@Embeddable
public class AssessmentRequestDatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="REQ_ID")
	private int reqId;

	@Temporal(TemporalType.DATE)
	@Column(name="EVP_VISIT_DATE")
	private java.util.Date evpVisitDate;

	public AssessmentRequestDatePK() {
	}
	public int getReqId() {
		return this.reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public java.util.Date getEvpVisitDate() {
		return this.evpVisitDate;
	}
	public void setEvpVisitDate(java.util.Date evpVisitDate) {
		this.evpVisitDate = evpVisitDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AssessmentRequestDatePK)) {
			return false;
		}
		AssessmentRequestDatePK castOther = (AssessmentRequestDatePK)other;
		return 
			(this.reqId == castOther.reqId)
			&& this.evpVisitDate.equals(castOther.evpVisitDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reqId;
		hash = hash * prime + this.evpVisitDate.hashCode();
		
		return hash;
	}
}