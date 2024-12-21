package edu.seed.controllerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.seed.dto.GroupBean;
import edu.seed.repository.GroupRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-servlet.xml")
public class GroupTest {

@Autowired
GroupRepository groupRepository;

		
@Test
public void TestforAddGroup()
{
	
	System.out.println("Inside the junit test of Group repository");
	
	
	GroupBean groupBean=new GroupBean();
	groupBean.setG_id(101);
	groupBean.setG_name("Aryan-group");
	groupBean.setG_startdate(new java.sql.Date(12/04/2016));
	groupBean.setG_status("Active");
	groupBean.setB_id(111);
	groupBean.setPm_id(112);
	assertNotNull(groupRepository.SaveGroup(groupBean));
	assert(true);
	
	}

@Test
public void delete()
{
	
	GroupBean groupBean=new GroupBean();
	groupBean.setG_id(22);
	
	assertNotNull(groupRepository.deleteGroup(groupBean));
	assert(true);
	
	
}

@Test
public void update()
{

	
	GroupBean groupBean=new GroupBean();
	
	
	groupBean.setG_name("Group11111");
	groupBean.setG_startdate(new java.sql.Date(01/01/2017));
	
	
assertNotNull(groupRepository.updateGroup(groupBean));
assert(true);	
}



	

}
