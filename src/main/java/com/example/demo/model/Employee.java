package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EmployeeProject")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer eid;
	@Column(name="ename")
	private String ename;
	@Column(name="email")
	private String email;
	@Column(name="esal")
	private double esal;
	@Column(name="dept")
	private String dept;
	@Column(name="hra")
	private double hra;
	@Column(name="da")
	private double da;
}
