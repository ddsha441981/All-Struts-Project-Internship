package edu.seed.service;

import java.util.List;

import edu.seed.dto.BatchBean;
import edu.seed.dto.LoginBean;
import edu.seed.dto.RegistrationBean;
import edu.seed.repository.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServices {

	@Autowired(required = true)
	RegistrationDao registrationdao;

	
	public Boolean registration(RegistrationBean registrationBean) {
        return registrationdao.register(registrationBean);
	}
	
	public List<BatchBean> getBatchId(int pm_id) {
        return registrationdao.getBatchId(pm_id);
	}
	public BatchBean batch(BatchBean batchBean) {
        return registrationdao.batch(batchBean);
	}

}
