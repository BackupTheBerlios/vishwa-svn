package com.evps.dataaccess.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the evp_audit database table.
 * 
 */
@Entity
@Table(name="evp_audit")
public class Audit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AUDIT_ID")
	private int auditId;

	@Column(name="AUDIT_DATE")
	private Timestamp auditDate;

	@Column(name="AUDIT_INFO")
	private String auditInfo;

	@Column(name="AUDIT_KEY")
	private int auditKey;

	@Column(name="AUDIT_TYPE")
	private String auditType;

	@Column(name="AUDIT_USER")
	private int auditUser;

	public Audit() {
	}

	public int getAuditId() {
		return this.auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	public Timestamp getAuditDate() {
		return this.auditDate;
	}

	public void setAuditDate(Timestamp auditDate) {
		this.auditDate = auditDate;
	}

	public String getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(String auditInfo) {
		this.auditInfo = auditInfo;
	}

	public int getAuditKey() {
		return this.auditKey;
	}

	public void setAuditKey(int auditKey) {
		this.auditKey = auditKey;
	}

	public String getAuditType() {
		return this.auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public int getAuditUser() {
		return this.auditUser;
	}

	public void setAuditUser(int auditUser) {
		this.auditUser = auditUser;
	}

}