package edu.seed.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import edu.seed.dto.PlacementBean;
import edu.seed.repository.PlacementDao;

@Service
public class PlacementServices {
	
	
	
	
	@Autowired(required=true)
	PlacementDao placementDao;
/* This method is used to save the placement*/
	public int savePlacement(PlacementBean placementBean) {
		
	
		
		
		return  placementDao.savePlacement(placementBean );
	}

	
	/*This method is used to vie the details of placement */
	public List<PlacementBean> viewPlacement(int useridIdSession) {
	
	
		return placementDao.viewplacement(useridIdSession);
	}
	/*This method is used to delete placement details*/


	
	public int deletePlacement(PlacementBean placementBean) {
		
		return placementDao.deletePlacement(placementBean);
	}


	
	

}
