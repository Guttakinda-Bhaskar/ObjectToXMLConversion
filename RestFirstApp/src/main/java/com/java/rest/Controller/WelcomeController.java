package com.java.rest.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.java.rest.model.Address;
import com.java.rest.model.Employee;

public class WelcomeController {
public static void main(String[] args) throws JAXBException, FileNotFoundException {
	Address address=new Address();
	address.setHid(10-01);
	address.setHname("Sai Nilayam");
	address.setHloc("GuttakindaPalli");
	
	Employee employee=new Employee();
	employee.setEmpId(10110050);
	employee.setEmpName("Bhaskar");
	employee.setEmpSal(10000);
		
	Set<String> projects=new HashSet<String>();
	projects.add("Gofounders");
	projects.add("Onpassive");
	projects.add("SupportAdmin");
	employee.setProjs(projects);
	
	Map<String, Integer> versions=new HashMap<String, Integer>();
	versions.put("Gofounders", 3);
	versions.put("Onpassive", 2);
	versions.put("SupportAdmin", 1);
	employee.setVersions(versions);
	
	
	JAXBContext context=JAXBContext.newInstance(Employee.class);
	Marshaller createMarshaller = context.createMarshaller();
	//createMarshaller.marshal(Marshaller.JAXB_FORMATTED_OUTPUT,true);
	createMarshaller.marshal(employee,new FileOutputStream("employee.xml"));
	
	
	
	
}
}
