package edu.seed.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import edu.seed.dto.PlacementBean;

@Repository
public class PlacementDao {

	
	
	@Autowired(required=true)
	 JdbcTemplate jdbcTemplate;
	

	/* This method is used to save placement details .
	 * @param: object of ProjectBean class.
	 * @return :integer value  to service.
	 * @author : Abhay singh 
	 * @since : 31-April-2017  */

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int savePlacement(PlacementBean placementBean) {
		 
		 
			 String sql="insert into placement_f(pl_id,interview_date,company_name,status,description,userid) values(pl_id_seq.NEXTVAL,to_date('"+new java.sql.Date( placementBean.getInterview_date().getTime())+"','YYYY/MM/DD'),'"+placementBean.getCompany_name()+"','"+placementBean.getStatus()+"','"+placementBean.getDescription()+"','"+placementBean.getUserid()+"') ";
				
				 
					
		 
					   return jdbcTemplate.update(sql);  
	//	return  placementBeanRow;
	}


	/* This method is used to view  placement details .
	 * @param: object of ProjectBean class.
	 * @return :list 
	 * @author : Abhay singh 
	 * @since : 31-april-2017  */

	
	
	public List<PlacementBean> viewplacement(int useridIdSession) {
		
		
		String sql=("select pl_id,interview_date,company_name,status,description,userid from placement_f where userid='"+useridIdSession+"'");
		
		List<PlacementBean> viewPlacementBeanRow = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(PlacementBean.class));
	
		return viewPlacementBeanRow;
		
	}


	
	public List<PlacementBean> viewPlacementToPm(int regIdSession) {
		// PropertyConfigurator.configure(log4jFile);
	 //	logger.info(" method- placementDao. viewPlacementToPm() method");
			 	
		//String sql=("select p.pl_id,p.company,p.interview as interviewDate,p.pl_status,p.int_id from its_placement p join its_registration r on p.int_id=r.reg_id where reg_id_fk='"+regIdSession+"' order by p.int_id");
		String sql=("select r.firstname as fName,r.lastname as lName,p.pl_id,p.company,p.interview as interviewDate,p.pl_status,p.int_id,b.b_name as batch from its_placement p join its_registration r on p.int_id=r.reg_id join its_batchmaster b on r.b_id=b.b_id where r.reg_id_fk='"+regIdSession+"' order by interviewDate");
		List<PlacementBean> viewPlacementBeanRow = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(PlacementBean.class));
		return viewPlacementBeanRow;
	
	}//end of viewPlacementToPm method.


/*This method is used to delete the placement details
	  @author : Abhaysingh Solanki
	  @param  : Object of placementBean
	  @return : integer value
	  @since  : 02-June-2017  
	 */
	
	public int deletePlacement(PlacementBean placementBean) {

		String sql=("delete from placement_f where pl_id='"+placementBean.getPl_id()+"' and userid='"+placementBean.getUserid()+"'");
		int deletePlacement = jdbcTemplate.update(sql);
		
		
		return deletePlacement;
		
		
	}

	
}


	

	
	

	

