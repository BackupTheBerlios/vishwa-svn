package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;


/**
 * The persistent class for the evp_attachment database table.
 * 
 */
@Entity
@Table(name="evp_attachment")
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ATTACH_ID")
	private int attachId;

	@Column(name="ATTACH_DATE")
	private Date attachDate;

	@Lob
	@Column(name="ATTACH_FILE")
	private byte[] attachFile;

	@Column(name="ATTACH_NAME")
	private String attachName;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="evpAttachment")
	private List<Action> evpActions;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpAttachment1")
	private List<AssessmentRequestDate> evpReqDates1;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpAttachment2")
	private List<AssessmentRequestDate> evpReqDates2;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpAttachment3")
	private List<AssessmentRequestDate> evpReqDates3;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpAttachment4")
	private List<AssessmentRequestDate> evpReqDates4;

	//bi-directional many-to-one association to AssessmentRequestDate
	@OneToMany(mappedBy="evpAttachment5")
	private List<AssessmentRequestDate> evpReqDates5;

	//bi-directional many-to-one association to AssesmentRequestPlan
	@OneToMany(mappedBy="evpAttachment1")
	private List<AssesmentRequestPlan> evpReqPlans1;

	//bi-directional many-to-one association to AssesmentRequestPlan
	@OneToMany(mappedBy="evpAttachment2")
	private List<AssesmentRequestPlan> evpReqPlans2;

	//bi-directional many-to-one association to AssesmentRequestPlan
	@OneToMany(mappedBy="evpAttachment3")
	private List<AssesmentRequestPlan> evpReqPlans3;

	public Attachment() {
	}

	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	public Date getAttachDate() {
		return this.attachDate;
	}

	public void setAttachDate(Date attachDate) {
		this.attachDate = attachDate;
	}

	public byte[] getAttachFile() {
		return this.attachFile;
	}

	public void setAttachFile(byte[] attachFile) {
		this.attachFile = attachFile;
	}

	public String getAttachName() {
		return this.attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	public List<Action> getEvpActions() {
		return this.evpActions;
	}

	public void setEvpActions(List<Action> evpActions) {
		this.evpActions = evpActions;
	}

	public List<AssessmentRequestDate> getEvpReqDates1() {
		return this.evpReqDates1;
	}

	public void setEvpReqDates1(List<AssessmentRequestDate> evpReqDates1) {
		this.evpReqDates1 = evpReqDates1;
	}

	public List<AssessmentRequestDate> getEvpReqDates2() {
		return this.evpReqDates2;
	}

	public void setEvpReqDates2(List<AssessmentRequestDate> evpReqDates2) {
		this.evpReqDates2 = evpReqDates2;
	}

	public List<AssessmentRequestDate> getEvpReqDates3() {
		return this.evpReqDates3;
	}

	public void setEvpReqDates3(List<AssessmentRequestDate> evpReqDates3) {
		this.evpReqDates3 = evpReqDates3;
	}

	public List<AssessmentRequestDate> getEvpReqDates4() {
		return this.evpReqDates4;
	}

	public void setEvpReqDates4(List<AssessmentRequestDate> evpReqDates4) {
		this.evpReqDates4 = evpReqDates4;
	}

	public List<AssessmentRequestDate> getEvpReqDates5() {
		return this.evpReqDates5;
	}

	public void setEvpReqDates5(List<AssessmentRequestDate> evpReqDates5) {
		this.evpReqDates5 = evpReqDates5;
	}

	public List<AssesmentRequestPlan> getEvpReqPlans1() {
		return this.evpReqPlans1;
	}

	public void setEvpReqPlans1(List<AssesmentRequestPlan> evpReqPlans1) {
		this.evpReqPlans1 = evpReqPlans1;
	}

	public List<AssesmentRequestPlan> getEvpReqPlans2() {
		return this.evpReqPlans2;
	}

	public void setEvpReqPlans2(List<AssesmentRequestPlan> evpReqPlans2) {
		this.evpReqPlans2 = evpReqPlans2;
	}

	public List<AssesmentRequestPlan> getEvpReqPlans3() {
		return this.evpReqPlans3;
	}

	public void setEvpReqPlans3(List<AssesmentRequestPlan> evpReqPlans3) {
		this.evpReqPlans3 = evpReqPlans3;
	}

}