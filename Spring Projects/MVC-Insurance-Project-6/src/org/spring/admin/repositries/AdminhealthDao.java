package org.spring.admin.repositries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.agent.beanofAgent.HealthInsurnceBeans;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
/**
* @author Deendayal
* @since 2017
* @version 1.1.2
*/

/** This class is Controller class
*  some methods delcared
*  Used Logger
*  Class AdminhealthDao
*/
@Repository
public class AdminhealthDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<HealthInsurnceBeans> viewAllofhealthsclientsInsurnces(){
		return jdbcTemplate.query(Queriesfile.adminViewAllHealthInsurances,new RowMapper<HealthInsurnceBeans>() {

			@Override
			public HealthInsurnceBeans mapRow(ResultSet rs, int arg1) throws SQLException {
				HealthInsurnceBeans S1 = new HealthInsurnceBeans();
				S1.setHealthId(rs.getInt(1));
				S1.setHealthfromdate(rs.getString(2));
				S1.setHealthtodate(rs.getString(3));
				S1.setHealthopt1(rs.getString(4));
				S1.setHealthopt2(rs.getString(5));
				S1.setHealthopt3(rs.getString(6));
				S1.setHealthidv(rs.getString(7));
				S1.setHealththirdparty(rs.getString(8));
				S1.setHealthservicetax(rs.getString(9));
				S1.setPaymethod(rs.getString(10));
				S1.setAgentId(rs.getInt(11));
				S1.setClientId(rs.getInt(12));
				return S1;
			}
		} );
	}

}
