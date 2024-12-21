package com.org.preparestatementcallback.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

/** @author Deendayal */
public class DAOJdbcTamplate {

	private JdbcTemplate jdbcTamplate;

	public void setJdbcTamplate(JdbcTemplate jdbcTamplate) {
		this.jdbcTamplate = jdbcTamplate;
	}

	public int stcreate1() {
		String sql = "create table studentinfo(school varchar(100),schooladd varchar(255))";

		return jdbcTamplate.update(sql);

	}

	public int addcreate2() {
		String sql2 = "create table studentadd(streetline varchar(100),state varchar(50),city varchar(50),pincode varchar(20))";

		return jdbcTamplate.update(sql2);

	}

	public int bacreate3() {
		String sql3 = "create table basicdetails(stId number(10),name varchar(50),age number(9),stream varchar(20),year varchar(50))";

		return jdbcTamplate.update(sql3);

	}

	public Boolean savestudentbypreparestatement(Student st) {
		String query = "insert into studentinfo values(?,?)";
		return jdbcTamplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, st.getSchool());
				pstmt.setString(2, st.getSchooladd());
				System.out.println("Student Record Inserted Successfully");
				return pstmt.execute();

			}
		});
	}

	public Boolean saveaddressbypreparestatement(Address addr) {

		String sql = "insert into studentadd values(?,?,?,?)";

		return jdbcTamplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, addr.getStreetline());
				pstmt.setString(2, addr.getState());
				pstmt.setString(3, addr.getCity());
				pstmt.setString(4, addr.getPincode());

				System.out.println("Address Record Inserted Successfully");
				return pstmt.execute();
			}
		});

	}

	public Boolean savebasicdetailsofstudent(BasicDetailsofStudent BDS) {
		String sql = "insert into basicdetails values(?,?,?,?,?)";
		return jdbcTamplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, BDS.getStId());
				pstmt.setString(2, BDS.getName());
				pstmt.setInt(3, BDS.getAge());
				pstmt.setString(4, BDS.getStream());
				pstmt.setString(5, BDS.getYear());

				System.out.println("BasicDetails of student  Record Inserted Successfully");
				return pstmt.execute();
			}
		});
	}

	/**
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * @return
	 * @return
	 */
	public List retriveofstudent() {

		String sql = "select * from studentinfo";
		List st = jdbcTamplate.queryForList(sql);
		return st;
	}

	public List retriveofAddress() {

		String sql = "select * from studentadd";
		List ad = jdbcTamplate.queryForList(sql);
		return ad;
	}

	public List retriveofBasic() {

		String sql = "select * from basicdetails";
		List b1 = jdbcTamplate.queryForList(sql);
		return b1;
	}

}
