package org.spring.mvc.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.mvc.beanexample.Policiesdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Daoofpolicy {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int createtable(){
		String sql="create table policies"
				+ "("
				+ "policyid number(5),"
				+ "policyname varchar2(50),"
				+ "policyterm number(5),"
				+ "policyamount number(15,3),"
				+ "policyfaceamount number(16),"
				+ "policyinterest number(2),"
				+ "policydate varchar2(50),"
				+ "bonusperiod number(2),"
				+ "bonusrate number(2)"
				+ ")";
		int count = jdbcTemplate.update(sql);
		System.out.println("Table Created");
		return count;
	}
	
	public Boolean savepolicies(Policiesdetails policy){
		String sql = "insert into policies values(?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, policy.getPolicyid());
				pstmt.setString(2, policy.getPolicyname());
				pstmt.setInt(3, policy.getPolicyterm());
				pstmt.setInt(4, policy.getPolicyamount());
				pstmt.setInt(5, policy.getPolicyfaceamount());
				pstmt.setInt(6, policy.getPolicyinterest());
				pstmt.setString(7, policy.getPolicydate());
				pstmt.setInt(8, policy.getBonusperiod());
				pstmt.setInt(9, policy.getBonusrate());
				return pstmt.execute();
			}
		});
	}

	public List<Policiesdetails>  getpolicyrecords(){
		System.out.println("I am in DAO getpolicyRecods Methods");
		String sql ="select * from policies";
		return jdbcTemplate.query(sql, new RowMapper<Policiesdetails>() {

			@Override
			public Policiesdetails mapRow(ResultSet rs, int rownum) throws SQLException {
				Policiesdetails P1 = new Policiesdetails();
				P1.setPolicyid(rs.getInt(1));
				P1.setPolicyname(rs.getString(2));
				P1.setPolicyterm(rs.getInt(3));
				P1.setPolicyamount(rs.getInt(4));
				P1.setPolicyfaceamount(rs.getInt(5));
				P1.setPolicyinterest(rs.getInt(6));
				P1.setPolicydate(rs.getString(7));
				P1.setBonusperiod(rs.getInt(8));
				P1.setBonusrate(rs.getInt(9));	
				return P1;
			}
		});
		
	}

}
