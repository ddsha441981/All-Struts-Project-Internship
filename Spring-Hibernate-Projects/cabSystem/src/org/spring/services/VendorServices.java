package org.spring.services;

import java.util.List;

import org.spring.dto.VendorBeans;
import org.spring.repositry.VendorDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServices {

	@Autowired
	VendorDaoImpl vendorDaoImpl;
	
	public int saveVendorsDetails(VendorBeans vendorBeans){
		
		return vendorDaoImpl.saveVendorsDetails(vendorBeans);
	}
	
	public List<VendorBeans> vendorDetailsSelected(VendorBeans vendorBeans){
		
		return vendorDaoImpl.vendorDetailsSelected(vendorBeans);
	}
}
