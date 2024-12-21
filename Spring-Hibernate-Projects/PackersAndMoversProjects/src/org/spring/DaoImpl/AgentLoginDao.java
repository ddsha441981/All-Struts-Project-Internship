package org.spring.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class AgentLoginDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int agentLoginMethodCall(AgentBeans agentBeans) {

		String sql = "select emailId,autoPassword,agentId from agents where emailId=? and autoPassword=?";

		return jdbcTemplate.query(sql, new Object[] { agentBeans.getEmailId(), agentBeans.getAutoPassword() },
				new ResultSetExtractor<Integer>() {

					@Override
					public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
						int status = 0;
						while (rs.next()) {

							agentBeans.setEmailId(rs.getString(1));
							agentBeans.setAutoPassword(rs.getString(2));
							status = rs.getInt("agentId");
						}
						return status;
					}
				});

	}
}
