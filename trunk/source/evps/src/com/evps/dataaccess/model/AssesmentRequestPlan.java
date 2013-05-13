package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 * The persistent class for the evp_req_plan database table.
 * 
 */
@Entity
@Table(name="evp_req_plan")
public class AssesmentRequestPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REQ_ID")
	private int reqId;

	@Column(name="REQ_CONT_DESC")
	private String reqContDesc;

	@Column(name="REQ_CONT_TITLE")
	private String reqContTitle;

	@Column(name="REQ_OUTCOME")
	private String reqOutcome;

	@Column(name="REQ_PLAN_DESC")
	private String reqPlanDesc;

	@Column(name="REQ_PLAN_TITLE")
	private String reqPlanTitle;

	@Column(name="REQ_PURPOSE")
	private String reqPurpose;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="REQ_CONT_ATTACH")
	private Attachment evpAttachment1;

	//bi-directional one-to-one association to AssessmentRequestRequest
	@OneToOne
	@JoinColumn(name="REQ_ID")
	private AssessmentRequestRequest evpRequest;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="PURPOSE_ATTACH")
	private Attachment evpAttachment2;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="REQ_PLAN_ATTACH")
	private Attachment evpAttachment3;

	public AssesmentRequestPlan() {
	}

	public int getReqId() {
		return this.reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getReqContDesc() {
		return this.reqContDesc;
	}

	public void setReqContDesc(String reqContDesc) {
		this.reqContDesc = reqContDesc;
	}

	public String getReqContTitle() {
		return this.reqContTitle;
	}

	public void setReqContTitle(String reqContTitle) {
		this.reqContTitle = reqContTitle;
	}

	public String getReqOutcome() {
		return this.reqOutcome;
	}

	public void setReqOutcome(String reqOutcome) {
		this.reqOutcome = reqOutcome;
	}

	public String getReqPlanDesc() {
		return this.reqPlanDesc;
	}

	public void setReqPlanDesc(String reqPlanDesc) {
		this.reqPlanDesc = reqPlanDesc;
	}

	public String getReqPlanTitle() {
		return this.reqPlanTitle;
	}

	public void setReqPlanTitle(String reqPlanTitle) {
		this.reqPlanTitle = reqPlanTitle;
	}

	public String getReqPurpose() {
		return this.reqPurpose;
	}

	public void setReqPurpose(String reqPurpose) {
		this.reqPurpose = reqPurpose;
	}

	public Attachment getEvpAttachment1() {
		return this.evpAttachment1;
	}

	public void setEvpAttachment1(Attachment evpAttachment1) {
		this.evpAttachment1 = evpAttachment1;
	}

	public AssessmentRequestRequest getEvpRequest() {
		return this.evpRequest;
	}

	public void setEvpRequest(AssessmentRequestRequest evpRequest) {
		this.evpRequest = evpRequest;
	}

	public Attachment getEvpAttachment2() {
		return this.evpAttachment2;
	}

	public void setEvpAttachment2(Attachment evpAttachment2) {
		this.evpAttachment2 = evpAttachment2;
	}

	public Attachment getEvpAttachment3() {
		return this.evpAttachment3;
	}

	public void setEvpAttachment3(Attachment evpAttachment3) {
		this.evpAttachment3 = evpAttachment3;
	}

}