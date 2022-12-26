package com.workprojects.company_data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="company_data")

@Getter
@Setter
@AllArgsConstructor
public class company {
	
	
	@Id @Column
	private int companyid;
	@Column
	private String companyname;
	@Column
	private String founder;
	public company(int companyid, String companyname, String founder) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.founder = founder;
	}
	

}
