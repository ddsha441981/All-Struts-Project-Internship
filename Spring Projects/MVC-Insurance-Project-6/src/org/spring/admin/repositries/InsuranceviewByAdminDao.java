package org.spring.admin.repositries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.agent.beanofAgent.VehicleInsuranceBean;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Deendayal
 * @version 1.1.2
 * @since 2017
 * The Class InsuranceviewByAdminDao.
 */
@Repository
public class InsuranceviewByAdminDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 *  vehicles table Name of Database
	 *  InsurancesofAllclients() method is used to Retrive data from database
	 *  (Queriesfile.insurancerud) used to retrive data
	 *  Queriesfile is class and insurancerud is varriable name
	 *  This method return type is List
	 *  vehicles is Object 
	 */
	
	public List<VehicleInsuranceBean> InsurancesofAllclients(){
		
		return jdbcTemplate.query(Queriesfile.insurancerud,new RowMapper<VehicleInsuranceBean>() {

			@Override
			public VehicleInsuranceBean mapRow(ResultSet rs, int arg1) throws SQLException {
				
				VehicleInsuranceBean vehicles = new VehicleInsuranceBean();
				vehicles.setVehicleId(rs.getInt(1));
				vehicles.setTodate(rs.getString(2));
				vehicles.setFromdate(rs.getString(3));
				vehicles.setDateofregister(rs.getString(4));
				vehicles.setManufacturedate(rs.getString(5));
				vehicles.setRegisterno(rs.getString(6));
				vehicles.setUsedfuel(rs.getString(7));
				vehicles.setEngineNo(rs.getString(8));
				vehicles.setCublic(rs.getString(9));
				vehicles.setChassisNo(rs.getString(10));
				vehicles.setMake(rs.getString(11));
				vehicles.setModel(rs.getString(12));
				vehicles.setIdv(rs.getString(13));
				vehicles.setThirdparty(rs.getString(14));
				vehicles.setServicetax(rs.getString(15));
				vehicles.setTotal(rs.getString(16));
				vehicles.setPaymentMethod(rs.getString(17));
				vehicles.setAgentId(rs.getInt(18));
				vehicles.setClientId(rs.getInt(19));
				return vehicles;
			}
		});
		
	}
}
