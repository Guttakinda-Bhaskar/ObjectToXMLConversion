package com.java.rest.model;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlElement(name="Employee-Id")
	private int empId;
	@XmlElement(name="Employee-Name",required = true)
	private String empName;
	@XmlElement(name="Employee-Salary")
	private double empSal;
	@XmlElement(name="Employee-Add")
	private Address addr;
	@XmlElementWrapper(name="Projects")
	@XmlElement(name="Project-Name")
	private Set<String> projs;
	@XmlElement(name="Project-Version")
	private Map<String,Integer> versions;
}
