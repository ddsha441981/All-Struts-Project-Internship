package org.spring.repositries;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.beanclass.Department;
import org.spring.beanclass.Loginbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginDao.
 */
@Repository
public class LoginDao {
	
	/** The jdbc template. */
	@Autowired
	static
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Createtableofdepartment.
	 */
	public void createtableofdepartment(){
		String sql = "create table departmentwithlogin"
				+ "("
				+ "depId number(9)primary key,"
				+ "depName varchar(50),"
				+ "id number(9),"
				+ "FOREIGN KEY (id) REFERENCES loginmvc(id)"
				+ ")";
		jdbcTemplate.execute(sql);
		System.out.println("table created successFully");
	}
	
	/**
	 * Save indepartment.
	 *
	 * @param dep the dep
	 * @return the boolean
	 */
	public Boolean saveIndepartment(Department dep){
		System.out.println("In insert method");
		String sql ="insert into departmentwithlogin values(?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, dep.getDepId());
				pstmt.setString(2,dep.getDepName());
				pstmt.setInt(3, dep.getId());
				return pstmt.execute();
			}
		});
	}
	
	/**
	 * Createtable.
	 */
	public void createtable(){
		String sql = "create table loginmvc"
				+ "("
				+"id number(9)primary key,"
				+ "username varchar(20),"
				+ "password varchar(20)"
				+ ")";
		jdbcTemplate.execute(sql);
		System.out.println("Table Created Successfully");
		
	}
	
	/**
	 * Savedata.
	 *
	 * @param login the login
	 * @return the boolean
	 */
	public Boolean savedata(Loginbean login){
		String sql = "insert into loginmvc values(?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, login.getId());
				pstmt.setString(2, login.getUsername());
				pstmt.setString(3, login.getPassword());
				System.out.println("Data insert SuccessFully");
				return pstmt.execute();
			}
		});
	}
	
	/**
	 * Mappinglogin.
	 *
	 * @return the list
	 */
	public List mappinglogin(){
		String sql = "select * from loginmvc";
		List L1 = jdbcTemplate.queryForList(sql);
		return L1;
	}
	
	/**
	 * Deleteby id.
	 *
	 * @param id the id
	 * @return the integer
	 */
	public Integer deletebyId(Integer id){
		String sql = "delete from loginmvc where id="+id+"";
		Integer count = jdbcTemplate.update(sql);
		System.out.println("data delete successfully" +count);
		return count;
	}
	
	/**
	 * Retriveusing id.
	 *
	 * @param id the id
	 * @return the loginbean
	 */
	public static Loginbean retriveusingId(Integer id){
		String sql = "select *  from loginmvc where id=?";
		 return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Loginbean>(Loginbean.class));
		  
	}
}
