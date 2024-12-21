package edu.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.seed.dto.InternProfileBean;
import edu.seed.repository.InternProfileRepository;


@Service
public class InternProfileServices {

	
	@Autowired(required=true)
	
	InternProfileRepository internprofilerepository;
	
	/*
	 * @author : Ramchandra Teke
	  
	 * @ since :march 27-2017
	 */
	public Boolean internProfile(InternProfileBean internprofilebean, int userid){
		
		
		
		return internprofilerepository.saveInternProfileByPreparedStatement(internprofilebean,userid);
		
	}
	
}
