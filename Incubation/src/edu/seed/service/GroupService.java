package edu.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.seed.dto.GroupBean;
import edu.seed.dto.RegistrationBean;
import edu.seed.repository.GroupRepository;


@Service
public class GroupService {

	@Autowired(required=true)
	GroupRepository groupRepository;
	
	public List<GroupBean> viewgroup(GroupBean groupBean)
	{
		return groupRepository.viewgroup(groupBean);
	}
	
	public List<GroupBean> selectBatch(GroupBean groupBean)
	{
		return groupRepository.selectBatch(groupBean);
	}
	
	public List<RegistrationBean> getInternName(GroupBean groupBean) {
		return groupRepository.getInternName(groupBean);
	}

     // add group/save group	
	public int SaveGroup(GroupBean groupBean)
	{
		return groupRepository.SaveGroup(groupBean);
	}

	
	//use to delete group
	public int deleteGroup(GroupBean groupBean)
	{
		
		return groupRepository.deleteGroup(groupBean);
		
	}
	// this method is used to update group 
	
	public int updateGroup(GroupBean groupBean)
	{
		System.out.println("In service");
		return groupRepository.updateGroup(groupBean);
		
	}

	
	
	public Boolean isGroupExists(GroupBean groupBean) {
		
		return groupRepository.isGroupExists(groupBean);
	}

	public List<RegistrationBean> viewIntern(GroupBean groupBean ) {
		
		return groupRepository.viewInternBeanRow(groupBean);
	}
	
	}
