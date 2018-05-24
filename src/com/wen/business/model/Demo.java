package com.wen.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo", catalog = "baseweb")
public class Demo{
	
	@Id
	@Column(name="d_id")
	private Long dId;

	@Column(name="d_name")
	private String dName;

	public Long getdId() {
		return dId;
	}

	public void setdId(Long dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	
}
