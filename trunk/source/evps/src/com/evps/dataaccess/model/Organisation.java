package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * The persistent class for the evp_org database table.
 * 
 */
@Entity
@Table(name="evp_org")
public class Organisation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORG_ID")
	private int orgId;

	@Column(name="ORG_ADDR_COUNTRY")
	private String orgAddrCountry;

	@Column(name="ORG_ADDR_LINE1")
	private String orgAddrLine1;

	@Column(name="ORG_ADDR_LINE2")
	private String orgAddrLine2;

	@Column(name="ORG_ADDR_OTHER_INFO")
	private String orgAddrOtherInfo;

	@Column(name="ORG_ADDR_POSTCODE")
	private String orgAddrPostcode;

	@Column(name="ORG_EMAIL")
	private String orgEmail;

	@Column(name="ORG_NAME")
	private String orgName;

	@Column(name="ORG_PHONE")
	private String orgPhone;

	@Column(name="ORG_TYPE")
	private String orgType;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="ORG_PARENT")
	private Organisation evpOrg;

	//bi-directional many-to-one association to Organisation
	@OneToMany(mappedBy="evpOrg")
	private List<Organisation> evpOrgs;

	//bi-directional many-to-one association to OrganisationCurriculm
	@OneToMany(mappedBy="evpOrg")
	private List<OrganisationCurriculm> evpOrgCurculms;

	//bi-directional many-to-one association to OrganisationMember
	@OneToMany(mappedBy="evpOrg")
	private List<OrganisationMember> evpOrgMembers;

	//bi-directional many-to-one association to AssessmentRequestRequest
	@OneToMany(mappedBy="evpOrg")
	private List<AssessmentRequestRequest> evpRequests;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="evpOrg")
	private List<UserRole> evpUserRoles;

	public Organisation() {
	}

	public int getOrgId() {
		return this.orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgAddrCountry() {
		return this.orgAddrCountry;
	}

	public void setOrgAddrCountry(String orgAddrCountry) {
		this.orgAddrCountry = orgAddrCountry;
	}

	public String getOrgAddrLine1() {
		return this.orgAddrLine1;
	}

	public void setOrgAddrLine1(String orgAddrLine1) {
		this.orgAddrLine1 = orgAddrLine1;
	}

	public String getOrgAddrLine2() {
		return this.orgAddrLine2;
	}

	public void setOrgAddrLine2(String orgAddrLine2) {
		this.orgAddrLine2 = orgAddrLine2;
	}

	public String getOrgAddrOtherInfo() {
		return this.orgAddrOtherInfo;
	}

	public void setOrgAddrOtherInfo(String orgAddrOtherInfo) {
		this.orgAddrOtherInfo = orgAddrOtherInfo;
	}

	public String getOrgAddrPostcode() {
		return this.orgAddrPostcode;
	}

	public void setOrgAddrPostcode(String orgAddrPostcode) {
		this.orgAddrPostcode = orgAddrPostcode;
	}

	public String getOrgEmail() {
		return this.orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgPhone() {
		return this.orgPhone;
	}

	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public Organisation getEvpOrg() {
		return this.evpOrg;
	}

	public void setEvpOrg(Organisation evpOrg) {
		this.evpOrg = evpOrg;
	}

	public List<Organisation> getEvpOrgs() {
		return this.evpOrgs;
	}

	public void setEvpOrgs(List<Organisation> evpOrgs) {
		this.evpOrgs = evpOrgs;
	}

	public List<OrganisationCurriculm> getEvpOrgCurculms() {
		return this.evpOrgCurculms;
	}

	public void setEvpOrgCurculms(List<OrganisationCurriculm> evpOrgCurculms) {
		this.evpOrgCurculms = evpOrgCurculms;
	}

	public List<OrganisationMember> getEvpOrgMembers() {
		return this.evpOrgMembers;
	}

	public void setEvpOrgMembers(List<OrganisationMember> evpOrgMembers) {
		this.evpOrgMembers = evpOrgMembers;
	}

	public List<AssessmentRequestRequest> getEvpRequests() {
		return this.evpRequests;
	}

	public void setEvpRequests(List<AssessmentRequestRequest> evpRequests) {
		this.evpRequests = evpRequests;
	}

	public List<UserRole> getEvpUserRoles() {
		return this.evpUserRoles;
	}

	public void setEvpUserRoles(List<UserRole> evpUserRoles) {
		this.evpUserRoles = evpUserRoles;
	}

}