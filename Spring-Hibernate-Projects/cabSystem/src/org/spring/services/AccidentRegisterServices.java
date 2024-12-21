package org.spring.services;

import java.util.List;

import org.spring.dto.AccidentDetailsBeans;
import org.spring.repositry.AccidentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AccidentRegisterServices {
	
	@Autowired
	AccidentDaoImpl accidentDaoImpl;

	public int saveAccidentData(AccidentDetailsBeans accidentDetailsBeans){
		
		return accidentDaoImpl.saveAccidentData(accidentDetailsBeans);
	}
	
	public List <AccidentDetailsBeans> selectAccidentData(AccidentDetailsBeans accidentDetailsBeans){
		
		return accidentDaoImpl.selectAccidentData(accidentDetailsBeans);
	}
	
	public List <AccidentDetailsBeans> usingByIdDataSelected(Integer accidentId){
		
		return accidentDaoImpl.usingByIdDataSelected(accidentId);
		
	}
	
	public int dataUpdate(AccidentDetailsBeans accidentDetailsBeans){
		
		return accidentDaoImpl.dataUpdate(accidentDetailsBeans);
	}
}
