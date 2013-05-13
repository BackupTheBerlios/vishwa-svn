package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the evp_req_staff database table.
 * 
 */
@Entity
@Table(name="evp_req_staff")
public class AssessmentRequestStaff implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@EmbeddedId
	private AssessmentRequestStaffPK id;

	@Column(name="REQ_MEMBER_TYPE")
	private String reqMemberType;

	//bi-directional many-to-one association to OrganisationMember
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private OrganisationMember evpOrgMember;

	//bi-directional many-to-one association to AssessmentRequestRequest
	@ManyToOne
	@JoinColumn(name="REQ_ID")
	private AssessmentRequestRequest evpRequest;

	public AssessmentRequestStaff() {
	}

	public AssessmentRequestStaffPK getId() {
		return this.id;
	}

	public void setId(AssessmentRequestStaffPK id) {
		this.id = id;
	}

	public String getReqMemberType() {
		return this.reqMemberType;
	}

	public void setReqMemberType(String reqMemberType) {
		this.reqMemberType = reqMemberType;
	}

	public OrganisationMember getEvpOrgMember() {
		return this.evpOrgMember;
	}

	public void setEvpOrgMember(OrganisationMember evpOrgMember) {
		this.evpOrgMember = evpOrgMember;
	}

	public AssessmentRequestRequest getEvpRequest() {
		return this.evpRequest;
	}

	public void setEvpRequest(AssessmentRequestRequest evpRequest) {
		this.evpRequest = evpRequest;
	}

}