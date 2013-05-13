package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the evp_req_date database table.
 * 
 */
@Entity
@Table(name="evp_req_date")
public class AssessmentRequestDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@EmbeddedId
	private AssessmentRequestDatePK id;

	@Column(name="EVP_ACC_ADDR_COUNTRY")
	private String evpAccAddrCountry;

	@Column(name="EVP_ACC_ADDR_LINE1")
	private String evpAccAddrLine1;

	@Column(name="EVP_ACC_ADDR_LINE2")
	private String evpAccAddrLine2;

	@Column(name="EVP_ACC_ADDR_POSTCODE")
	private String evpAccAddrPostcode;

	@Column(name="EVP_ACC_NAME")
	private String evpAccName;

	@Column(name="EVP_ACC_PHONE")
	private String evpAccPhone;

	@Column(name="EVP_ADDR_COUNTRY")
	private String evpAddrCountry;

	@Column(name="EVP_ADDR_LINE1")
	private String evpAddrLine1;

	@Column(name="EVP_ADDR_LINE2")
	private String evpAddrLine2;

	@Column(name="EVP_ADDR_POSTCODE")
	private String evpAddrPostcode;

	@Column(name="EVP_INS_ADDR_COUNTRY")
	private String evpInsAddrCountry;

	@Column(name="EVP_INS_ADDR_LINE1")
	private String evpInsAddrLine1;

	@Column(name="EVP_INS_ADDR_LINE2")
	private String evpInsAddrLine2;

	@Column(name="EVP_INS_ADDR_POSTCODE")
	private String evpInsAddrPostcode;

	@Column(name="EVP_INS_NAME")
	private String evpInsName;

	@Column(name="EVP_INS_NUMBER")
	private String evpInsNumber;

	@Column(name="EVP_INS_PHONE")
	private String evpInsPhone;

	@Column(name="EVP_PROV_ADDR_COUNTRY")
	private String evpProvAddrCountry;

	@Column(name="EVP_PROV_ADDR_LINE1")
	private String evpProvAddrLine1;

	@Column(name="EVP_PROV_ADDR_LINE2")
	private String evpProvAddrLine2;

	@Column(name="EVP_PROV_ADDR_POSTCODE")
	private String evpProvAddrPostcode;

	@Column(name="EVP_PROV_NAME")
	private String evpProvName;

	@Column(name="EVP_PROV_PHONE")
	private String evpProvPhone;

	@Column(name="EVP_STANDARD_INSURANCE")
	private int evpStandardInsurance;

	@Column(name="EVP_TRVL_ADDR_COUNTRY")
	private String evpTrvlAddrCountry;

	@Column(name="EVP_TRVL_ADDR_LINE1")
	private String evpTrvlAddrLine1;

	@Column(name="EVP_TRVL_ADDR_LINE2")
	private String evpTrvlAddrLine2;

	@Column(name="EVP_TRVL_ADDR_POSTCODE")
	private String evpTrvlAddrPostcode;

	@Column(name="EVP_TRVL_NAME")
	private String evpTrvlName;

	@Column(name="EVP_TRVL_PHONE")
	private String evpTrvlPhone;

	@Column(name="EVP_TRVL_TYPE")
	private String evpTrvlType;

	@Column(name="EVP_VISIT_LOCATION")
	private String evpVisitLocation;

	@Column(name="EVP_VISIT_PHONE")
	private String evpVisitPhone;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="EVP_INS_ATTACH")
	private Attachment evpAttachment1;

	//bi-directional many-to-one association to AssessmentRequestRequest
	@ManyToOne
	@JoinColumn(name="REQ_ID")
	private AssessmentRequestRequest evpRequest;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="EVP_ADDR_ATTACH")
	private Attachment evpAttachment2;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="EVP_PROV_ATTACH")
	private Attachment evpAttachment3;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="EVP_ACC_ATTACH")
	private Attachment evpAttachment4;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	@JoinColumn(name="EVP_TRVL_ATTACH")
	private Attachment evpAttachment5;

	public AssessmentRequestDate() {
	}

	public AssessmentRequestDatePK getId() {
		return this.id;
	}

	public void setId(AssessmentRequestDatePK id) {
		this.id = id;
	}

	public String getEvpAccAddrCountry() {
		return this.evpAccAddrCountry;
	}

	public void setEvpAccAddrCountry(String evpAccAddrCountry) {
		this.evpAccAddrCountry = evpAccAddrCountry;
	}

	public String getEvpAccAddrLine1() {
		return this.evpAccAddrLine1;
	}

	public void setEvpAccAddrLine1(String evpAccAddrLine1) {
		this.evpAccAddrLine1 = evpAccAddrLine1;
	}

	public String getEvpAccAddrLine2() {
		return this.evpAccAddrLine2;
	}

	public void setEvpAccAddrLine2(String evpAccAddrLine2) {
		this.evpAccAddrLine2 = evpAccAddrLine2;
	}

	public String getEvpAccAddrPostcode() {
		return this.evpAccAddrPostcode;
	}

	public void setEvpAccAddrPostcode(String evpAccAddrPostcode) {
		this.evpAccAddrPostcode = evpAccAddrPostcode;
	}

	public String getEvpAccName() {
		return this.evpAccName;
	}

	public void setEvpAccName(String evpAccName) {
		this.evpAccName = evpAccName;
	}

	public String getEvpAccPhone() {
		return this.evpAccPhone;
	}

	public void setEvpAccPhone(String evpAccPhone) {
		this.evpAccPhone = evpAccPhone;
	}

	public String getEvpAddrCountry() {
		return this.evpAddrCountry;
	}

	public void setEvpAddrCountry(String evpAddrCountry) {
		this.evpAddrCountry = evpAddrCountry;
	}

	public String getEvpAddrLine1() {
		return this.evpAddrLine1;
	}

	public void setEvpAddrLine1(String evpAddrLine1) {
		this.evpAddrLine1 = evpAddrLine1;
	}

	public String getEvpAddrLine2() {
		return this.evpAddrLine2;
	}

	public void setEvpAddrLine2(String evpAddrLine2) {
		this.evpAddrLine2 = evpAddrLine2;
	}

	public String getEvpAddrPostcode() {
		return this.evpAddrPostcode;
	}

	public void setEvpAddrPostcode(String evpAddrPostcode) {
		this.evpAddrPostcode = evpAddrPostcode;
	}

	public String getEvpInsAddrCountry() {
		return this.evpInsAddrCountry;
	}

	public void setEvpInsAddrCountry(String evpInsAddrCountry) {
		this.evpInsAddrCountry = evpInsAddrCountry;
	}

	public String getEvpInsAddrLine1() {
		return this.evpInsAddrLine1;
	}

	public void setEvpInsAddrLine1(String evpInsAddrLine1) {
		this.evpInsAddrLine1 = evpInsAddrLine1;
	}

	public String getEvpInsAddrLine2() {
		return this.evpInsAddrLine2;
	}

	public void setEvpInsAddrLine2(String evpInsAddrLine2) {
		this.evpInsAddrLine2 = evpInsAddrLine2;
	}

	public String getEvpInsAddrPostcode() {
		return this.evpInsAddrPostcode;
	}

	public void setEvpInsAddrPostcode(String evpInsAddrPostcode) {
		this.evpInsAddrPostcode = evpInsAddrPostcode;
	}

	public String getEvpInsName() {
		return this.evpInsName;
	}

	public void setEvpInsName(String evpInsName) {
		this.evpInsName = evpInsName;
	}

	public String getEvpInsNumber() {
		return this.evpInsNumber;
	}

	public void setEvpInsNumber(String evpInsNumber) {
		this.evpInsNumber = evpInsNumber;
	}

	public String getEvpInsPhone() {
		return this.evpInsPhone;
	}

	public void setEvpInsPhone(String evpInsPhone) {
		this.evpInsPhone = evpInsPhone;
	}

	public String getEvpProvAddrCountry() {
		return this.evpProvAddrCountry;
	}

	public void setEvpProvAddrCountry(String evpProvAddrCountry) {
		this.evpProvAddrCountry = evpProvAddrCountry;
	}

	public String getEvpProvAddrLine1() {
		return this.evpProvAddrLine1;
	}

	public void setEvpProvAddrLine1(String evpProvAddrLine1) {
		this.evpProvAddrLine1 = evpProvAddrLine1;
	}

	public String getEvpProvAddrLine2() {
		return this.evpProvAddrLine2;
	}

	public void setEvpProvAddrLine2(String evpProvAddrLine2) {
		this.evpProvAddrLine2 = evpProvAddrLine2;
	}

	public String getEvpProvAddrPostcode() {
		return this.evpProvAddrPostcode;
	}

	public void setEvpProvAddrPostcode(String evpProvAddrPostcode) {
		this.evpProvAddrPostcode = evpProvAddrPostcode;
	}

	public String getEvpProvName() {
		return this.evpProvName;
	}

	public void setEvpProvName(String evpProvName) {
		this.evpProvName = evpProvName;
	}

	public String getEvpProvPhone() {
		return this.evpProvPhone;
	}

	public void setEvpProvPhone(String evpProvPhone) {
		this.evpProvPhone = evpProvPhone;
	}

	public int getEvpStandardInsurance() {
		return this.evpStandardInsurance;
	}

	public void setEvpStandardInsurance(int evpStandardInsurance) {
		this.evpStandardInsurance = evpStandardInsurance;
	}

	public String getEvpTrvlAddrCountry() {
		return this.evpTrvlAddrCountry;
	}

	public void setEvpTrvlAddrCountry(String evpTrvlAddrCountry) {
		this.evpTrvlAddrCountry = evpTrvlAddrCountry;
	}

	public String getEvpTrvlAddrLine1() {
		return this.evpTrvlAddrLine1;
	}

	public void setEvpTrvlAddrLine1(String evpTrvlAddrLine1) {
		this.evpTrvlAddrLine1 = evpTrvlAddrLine1;
	}

	public String getEvpTrvlAddrLine2() {
		return this.evpTrvlAddrLine2;
	}

	public void setEvpTrvlAddrLine2(String evpTrvlAddrLine2) {
		this.evpTrvlAddrLine2 = evpTrvlAddrLine2;
	}

	public String getEvpTrvlAddrPostcode() {
		return this.evpTrvlAddrPostcode;
	}

	public void setEvpTrvlAddrPostcode(String evpTrvlAddrPostcode) {
		this.evpTrvlAddrPostcode = evpTrvlAddrPostcode;
	}

	public String getEvpTrvlName() {
		return this.evpTrvlName;
	}

	public void setEvpTrvlName(String evpTrvlName) {
		this.evpTrvlName = evpTrvlName;
	}

	public String getEvpTrvlPhone() {
		return this.evpTrvlPhone;
	}

	public void setEvpTrvlPhone(String evpTrvlPhone) {
		this.evpTrvlPhone = evpTrvlPhone;
	}

	public String getEvpTrvlType() {
		return this.evpTrvlType;
	}

	public void setEvpTrvlType(String evpTrvlType) {
		this.evpTrvlType = evpTrvlType;
	}

	public String getEvpVisitLocation() {
		return this.evpVisitLocation;
	}

	public void setEvpVisitLocation(String evpVisitLocation) {
		this.evpVisitLocation = evpVisitLocation;
	}

	public String getEvpVisitPhone() {
		return this.evpVisitPhone;
	}

	public void setEvpVisitPhone(String evpVisitPhone) {
		this.evpVisitPhone = evpVisitPhone;
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

	public Attachment getEvpAttachment4() {
		return this.evpAttachment4;
	}

	public void setEvpAttachment4(Attachment evpAttachment4) {
		this.evpAttachment4 = evpAttachment4;
	}

	public Attachment getEvpAttachment5() {
		return this.evpAttachment5;
	}

	public void setEvpAttachment5(Attachment evpAttachment5) {
		this.evpAttachment5 = evpAttachment5;
	}

}