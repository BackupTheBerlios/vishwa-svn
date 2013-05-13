package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * The persistent class for the evp_request database table.
 * 
 */
@Entity
@Table(name="evp_request")
public class AssessmentRequestRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REQ_ID")
	private int reqId;

	@Column(name="EVP_DATE_OPTION")
	private int evpDateOption;

	@Column(name="EVP_SUBTYPE")
	private String evpSubtype;

	@Column(name="EVP_TYPE")
	private String evpType;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Temporal(TemporalType.DATE)
	@Column(name="REQ_DATE")
	private Date reqDate;

	@Column(name="REQ_GROUP_AGE")
	private String reqGroupAge;

	@Column(name="REQ_GROUP_FEMALE")
	private int reqGroupFemale;

	@Column(name="REQ_GROUP_MALE")
	private int reqGroupMale;

	@Column(name="REQ_STATUS")
	private String reqStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="REVIEW_BY_DATE")
	private Date reviewByDate;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="evpRequest")
	private List<Action> evpActions;

	//bi-directional many-to-many association to OrganisationCurriculm
	@ManyToMany
	@JoinTable(
		name="evp_req_curculm"
		, joinColumns={
			@JoinColumn(name="REQ_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CURCULM_ID")
			}
		)
	private List<OrganisationCurriculm> evpOrgCurculms;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpRequest")
	private List<AssessmentRequestDate> evpReqDates;

	//bi-directional one-to-one association to AssesmentRequestPlan
	@OneToOne(mappedBy="evpRequest")
	private AssesmentRequestPlan evpReqPlan;

	//bi-directional many-to-one association to AssessmentRequestStaff
	@OneToMany(mappedBy="evpRequest")
	private List<AssessmentRequestStaff> evpReqStaffs;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="REQ_VISIT_LEADER")
	private User evpUser1;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="REQ_ORG")
	private Organisation evpOrg;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="REQ_USER")
	private User evpUser2;

	public AssessmentRequestRequest() {
	}

	public int getReqId() {
		return this.reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public int getEvpDateOption() {
		return this.evpDateOption;
	}

	public void setEvpDateOption(int evpDateOption) {
		this.evpDateOption = evpDateOption;
	}

	public String getEvpSubtype() {
		return this.evpSubtype;
	}

	public void setEvpSubtype(String evpSubtype) {
		this.evpSubtype = evpSubtype;
	}

	public String getEvpType() {
		return this.evpType;
	}

	public void setEvpType(String evpType) {
		this.evpType = evpType;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getReqDate() {
		return this.reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public String getReqGroupAge() {
		return this.reqGroupAge;
	}

	public void setReqGroupAge(String reqGroupAge) {
		this.reqGroupAge = reqGroupAge;
	}

	public int getReqGroupFemale() {
		return this.reqGroupFemale;
	}

	public void setReqGroupFemale(int reqGroupFemale) {
		this.reqGroupFemale = reqGroupFemale;
	}

	public int getReqGroupMale() {
		return this.reqGroupMale;
	}

	public void setReqGroupMale(int reqGroupMale) {
		this.reqGroupMale = reqGroupMale;
	}

	public String getReqStatus() {
		return this.reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public Date getReviewByDate() {
		return this.reviewByDate;
	}

	public void setReviewByDate(Date reviewByDate) {
		this.reviewByDate = reviewByDate;
	}

	public List<Action> getEvpActions() {
		return this.evpActions;
	}

	public void setEvpActions(List<Action> evpActions) {
		this.evpActions = evpActions;
	}

	public List<OrganisationCurriculm> getEvpOrgCurculms() {
		return this.evpOrgCurculms;
	}

	public void setEvpOrgCurculms(List<OrganisationCurriculm> evpOrgCurculms) {
		this.evpOrgCurculms = evpOrgCurculms;
	}

	public List<AssessmentRequestDate> getEvpReqDates() {
		return this.evpReqDates;
	}

	public void setEvpReqDates(List<AssessmentRequestDate> evpReqDates) {
		this.evpReqDates = evpReqDates;
	}

	public AssesmentRequestPlan getEvpReqPlan() {
		return this.evpReqPlan;
	}

	public void setEvpReqPlan(AssesmentRequestPlan evpReqPlan) {
		this.evpReqPlan = evpReqPlan;
	}

	public List<AssessmentRequestStaff> getEvpReqStaffs() {
		return this.evpReqStaffs;
	}

	public void setEvpReqStaffs(List<AssessmentRequestStaff> evpReqStaffs) {
		this.evpReqStaffs = evpReqStaffs;
	}

	public User getEvpUser1() {
		return this.evpUser1;
	}

	public void setEvpUser1(User evpUser1) {
		this.evpUser1 = evpUser1;
	}

	public Organisation getEvpOrg() {
		return this.evpOrg;
	}

	public void setEvpOrg(Organisation evpOrg) {
		this.evpOrg = evpOrg;
	}

	public User getEvpUser2() {
		return this.evpUser2;
	}

	public void setEvpUser2(User evpUser2) {
		this.evpUser2 = evpUser2;
	}

}