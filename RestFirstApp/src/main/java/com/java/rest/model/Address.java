package com.java.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	@XmlElement(name = "House-Id")
	private int hid;
	@XmlElement(name = "House-Name")
	private String hname;
	@XmlElement(name = "House-Location")
	private String hloc;
}
