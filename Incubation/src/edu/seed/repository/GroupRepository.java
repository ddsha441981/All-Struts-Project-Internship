package edu.seed.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import edu.seed.dto.BatchBean;
import edu.seed.dto.GroupBean;
import edu.seed.dto.RegistrationBean;

@Repository
public class GroupRepository {

	
	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemplate = jdbcTemp;
	}
	
	
	public List<GroupBean> viewgroup(GroupBean groupBean )
	{
		/*String sql=("select g.g_id,g.g_name,g.g_startdate,g.g_status,b.b_name,name from group_f g join batch_f b on (g.b_id=b.b_id) join register_f r on (b.b_id=r.b_id) where r.roleid=3 ");*/
			String sql=("select g.g_id,g.g_name,g.g_startdate,g.g_status,b.b_name from group_f g join batch_f b on (g.b_id=b.b_id) ");
			System.out.println(sql);
			List<GroupBean> viewGroupBeanRow=jdbcTemplate.query(sql,new BeanPropertyRowMapper(GroupBean.class));
		
			return viewGroupBeanRow;
		
	}
	
	public List<GroupBean> selectBatch(GroupBean groupBean )
	{
	
			String sql=("select b_id,b_name from batch_f where pm_id='"+groupBean.getPm_id()+"'");
		//	System.out.println(sql);
			List<GroupBean> viewGroupBeanRow=jdbcTemplate.query(sql,new BeanPropertyRowMapper(GroupBean.class));
		
			return viewGroupBeanRow;
		
	}
	
	public List<RegistrationBean> getInternName(GroupBean groupBean) {
		String g_idNull="";
		String sql = "(SELECT userid,name from register_f where b_id='"+groupBean.getB_id()+"' and g_id IS NULL )";
		
		List<RegistrationBean> viewInternBeanRow = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(RegistrationBean.class));

		return viewInternBeanRow;
	}
	
	

	/* This method is used to add new group to batch.
	 * @param: Model to set object of GroupBean class
	 * @return :SaveGroupBeanRow with to controller.
	 * @author : Abhay solanki
	 * @since : 11 April */
	
	
	
	public int SaveGroup(GroupBean groupBean)
	{
		
		System.out.println("Inside repository");
		
		
	 int SaveGroupBeanRow = 0;
		
	 try
	 {
			System.out.println(groupBean.getG_id());
			System.out.println(groupBean.getG_name());
			System.out.println(groupBean.getG_status());
			System.out.println(groupBean.getB_id());
			System.out.println(groupBean.getPm_id());
			System.out.println(groupBean.getG_startdate());
		 NamedParameterJdbcTemplate temp=new NamedParameterJdbcTemplate(getJdbcTemplate());
			
			  final String sql="insert into group_f(G_ID,G_NAME,G_STARTDATE,G_STATUS,B_ID,PM_ID) VALUES(g_id.NEXTVAL,'"+groupBean.getG_name()+"',TO_DATE('"+new java.sql.Date( groupBean.getG_startdate().getTime())+"','YYYY-DD-MM'),'"+groupBean.getG_status()+"',"+groupBean.getB_id()+","+groupBean.getPm_id()+")";		
		 
		 System.out.println("my query------"+sql);
			System.out.println(groupBean.getG_id());

			KeyHolder keyHolder = new GeneratedKeyHolder(); //Getting auto-generated key from row insertion in spring
			int count=jdbcTemplate.update(
			    new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection connection)
							throws SQLException {
						 PreparedStatement ps =
					                connection.prepareStatement(sql, new String[] {"G_ID"});
						 return ps;
					}
				},
			    keyHolder);
			BigDecimal id =(BigDecimal)keyHolder.getKey();
			System.out.println("Generated Id : "+id.longValue());
		 
		 if(count>0){
		 
		 String[] name=groupBean.getIntern_id().replaceFirst(",","").trim().split(",");
			String query[]=new String[name.length];
			for (int i = 0; i < name.length; i++) {
				query[i]="update register_f set g_id="+id.longValue()+" where userid="+name[i];
				
			}
				int totalCount[]=jdbcTemplate.batchUpdate(query);
				System.out.println("Total intern Updated : "+totalCount.length);
		 }
		 return SaveGroupBeanRow;
	 }
	 
		 catch (Exception e) {
		
			e.printStackTrace();
		}
	 		
	  System.out.println("save");
	 
	 return SaveGroupBeanRow;
		
  }
	
	

/*This method is used to delete group .
	
	@author -Abhaysingh solanki
	 @param -Model to set object of GroupBean class
	 @return -deleteGroupBeanRow with to controller.
	 @since   -15 April 
	  */
	    public int deleteGroup(GroupBean groupBean) 
	    {
    	String upD=("update register_f set g_id=null where g_id='"+ groupBean.getG_id()+ "' ");
		int updateGroupId=jdbcTemplate.update(upD);
	
		String sql = ("delete from group_f where  g_id='"+ groupBean.getG_id()+ "' ");
		int  deleteGroupBeanRow= jdbcTemplate.update(sql);
		return deleteGroupBeanRow;

	}
	
	
/*This method is used to update the group
 @author -Abhay singh solanki
 @param  -Model to set object of groupBean class
 @return -update 
 * ****/
	
	    public int updateGroup(GroupBean groupBean)
		{
	    	System.out.println("Inside Update Repository");
	    	System.out.println(groupBean.getG_id());
	    	System.out.println(groupBean.getG_startdate());
	    	//System.out.println(updateGroup);
	    	int updateGrups = 0;
			try {
				String updateGroup = ("update group_f set g_name='" + groupBean.getG_name() + "' ,g_startdate=to_date('"
						+ new java.sql.Date(groupBean.getG_startdate().getTime()) + "','YYYY-DD-MM'), g_status='"
						+ groupBean.getG_status() + "' where g_id='" + groupBean.getG_id() + "'");
				updateGrups = jdbcTemplate.update(updateGroup);
				System.out.println("after update template");
				System.out.println("count "+updateGrups);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	
			return updateGrups;
		}

	    /* This is used to checked groupname is already exist or not*/
	   
	    
	    public Boolean isGroupExists(GroupBean groupBean) {
			
			String sql=("select g_name from group_f where  g_name='"
	 				+groupBean.getG_name() + "'");
			boolean isGroupExist = false;
			try{
			BatchBean count = jdbcTemplate.queryForObject(
			                    sql,new BeanPropertyRowMapper(BatchBean.class));
			if (count !=null) {
				isGroupExist = true;
			}
			}catch(Exception e){
				System.out.println("Exception in groupalready exist"+e.getClass().getName());
			isGroupExist = false;
			}finally {
				return isGroupExist;
				}
		}

		public List<RegistrationBean> viewInternBeanRow(GroupBean groupBean) {
			
			
			String sql=("select name from register_f where g_id='"+ groupBean.getG_id()+ "'");
			System.out.println(sql);
			 List<RegistrationBean> viewInternbeanRow=jdbcTemplate.query(sql, new BeanPropertyRowMapper(RegistrationBean.class));
			return viewInternbeanRow;
			
		}
		
	    
	    
	
	
}
