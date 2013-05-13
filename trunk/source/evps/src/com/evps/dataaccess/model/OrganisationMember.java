package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * The persistent class for the evp_org_member database table.
 * 
 */
@Entity
@Table(name="evp_org_member")
public class OrganisationMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MEMBER_ID")
	private int memberId;

	@Column(name="MEMBER_EMAIL")
	private String memberEmail;

	@Column(name="MEMBER_FNAME")
	private String memberFname;

	@Column(name="MEMBER_LNAME")
	private String memberLname;

	@Column(name="MEMBER_PHONE")
	private String memberPhone;

	@Column(name="MEMBER_SEX")
	private int memberSex;

	@Column(name="MEMBER_TYPE")
	private String memberType;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="ORG_ID")
	private Organisation evpOrg;

//	//bi-directional many-to-one association to OrganisationMemberQualifications
//	@OneToMany(mappedBy="evpOrgMember")
//	private List<OrganisationMemberQualifications> evpOrgMemberQuals;

	//bi-directional many-to-one association to AssessmentRequestStaff
	@OneToMany(mappedBy="evpOrgMember")
	private List<AssessmentRequestStaff> evpReqStaffs;

	public OrganisationMember() {
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberFname() {
		return this.memberFname;
	}

	public void setMemberFname(String memberFname) {
		this.memberFname = memberFname;
	}

	public String getMemberLname() {
		return this.memberLname;
	}

	public void setMemberLname(String memberLname) {
		this.memberLname = memberLname;
	}

	public String getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public int getMemberSex() {
		return this.memberSex;
	}

	public void setMemberSex(int memberSex) {
		this.memberSex = memberSex;
	}

	public String getMemberType() {
		return this.memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public Organisation getEvpOrg() {
		return this.evpOrg;
	}

	public void setEvpOrg(Organisation evpOrg) {
		this.evpOrg = evpOrg;
	}

//	public List<OrganisationMemberQualifications> getEvpOrgMemberQuals() {
//		return this.evpOrgMemberQuals;
//	}
//
//	public void setEvpOrgMemberQuals(List<OrganisationMemberQualifications> evpOrgMemberQuals) {
//		this.evpOrgMemberQuals = evpOrgMemberQuals;
//	}

	public List<AssessmentRequestStaff> getEvpReqStaffs() {
		return this.evpReqStaffs;
	}

	public void setEvpReqStaffs(List<AssessmentRequestStaff> evpReqStaffs) {
		this.evpReqStaffs = evpReqStaffs;
	}

}