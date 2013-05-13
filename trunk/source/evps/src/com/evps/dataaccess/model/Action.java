package com.evps.dataaccess.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the evp_action database table.
 * 
 */
@Entity
@javax.persistence.Table(name="evp_action")
public class Action implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@EmbeddedId
	private ActionPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTION_BY_DATE")
	private Date actionByDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTION_DATE")
	private Date actionDate;

	@Column(name="ACTION_PRIORITY")
	private int actionPriority;

	@Column(name="ACTION_QUERY")
	private String actionQuery;

	@Column(name="ACTION_RESP")
	private String actionResp;

	@Column(name="ACTION_STATUS")
	private String actionStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPD_DT")
	private Date lastUpdDt;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="ACTION_ATTACH")
	private Attachment evpAttachment;

	//bi-directional many-to-one association to AssessmentRequestRequest
	@ManyToOne
	@JoinColumn(name="REQ_ID")
	private AssessmentRequestRequest evpRequest;

	public Action() {
	}

	public ActionPK getId() {
		return this.id;
	}

	public void setId(ActionPK id) {
		this.id = id;
	}

	public Date getActionByDate() {
		return this.actionByDate;
	}

	public void setActionByDate(Date actionByDate) {
		this.actionByDate = actionByDate;
	}

	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public int getActionPriority() {
		return this.actionPriority;
	}

	public void setActionPriority(int actionPriority) {
		this.actionPriority = actionPriority;
	}

	public String getActionQuery() {
		return this.actionQuery;
	}

	public void setActionQuery(String actionQuery) {
		this.actionQuery = actionQuery;
	}

	public String getActionResp() {
		return this.actionResp;
	}

	public void setActionResp(String actionResp) {
		this.actionResp = actionResp;
	}

	public String getActionStatus() {
		return this.actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public Date getLastUpdDt() {
		return this.lastUpdDt;
	}

	public void setLastUpdDt(Date lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}

	public Attachment getEvpAttachment() {
		return this.evpAttachment;
	}

	public void setEvpAttachment(Attachment evpAttachment) {
		this.evpAttachment = evpAttachment;
	}

	public AssessmentRequestRequest getEvpRequest() {
		return this.evpRequest;
	}

	public void setEvpRequest(AssessmentRequestRequest evpRequest) {
		this.evpRequest = evpRequest;
	}

}