package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the evp_org_curculm database table.
 * 
 */
@Entity
@Table(name="evp_org_curculm")
public class OrganisationCurriculm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CURCULM_ID")
	private int curculmId;

	@Column(name="CURCULM_DESC")
	private String curculmDesc;

	@Column(name="CURCULM_NAME")
	private String curculmName;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="ORG_ID")
	private Organisation evpOrg;

	//bi-directional many-to-many association to AssessmentRequestRequest
	@ManyToMany(mappedBy="evpOrgCurculms")
	private List<AssessmentRequestRequest> evpRequests;

	public OrganisationCurriculm() {
	}

	public int getCurculmId() {
		return this.curculmId;
	}

	public void setCurculmId(int curculmId) {
		this.curculmId = curculmId;
	}

	public String getCurculmDesc() {
		return this.curculmDesc;
	}

	public void setCurculmDesc(String curculmDesc) {
		this.curculmDesc = curculmDesc;
	}

	public String getCurculmName() {
		return this.curculmName;
	}

	public void setCurculmName(String curculmName) {
		this.curculmName = curculmName;
	}

	public Organisation getEvpOrg() {
		return this.evpOrg;
	}

	public void setEvpOrg(Organisation evpOrg) {
		this.evpOrg = evpOrg;
	}

	public List<AssessmentRequestRequest> getEvpRequests() {
		return this.evpRequests;
	}

	public void setEvpRequests(List<AssessmentRequestRequest> evpRequests) {
		this.evpRequests = evpRequests;
	}

}