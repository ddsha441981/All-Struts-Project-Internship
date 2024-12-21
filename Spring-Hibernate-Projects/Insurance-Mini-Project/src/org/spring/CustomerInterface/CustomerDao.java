package org.spring.CustomerInterface;

import org.spring.CustomerBeans.ChangePwdBeans;

public interface CustomerDao {

	public Boolean changeCustomersPassword(ChangePwdBeans pwdBeans);
}
