package org.spring.agent.beanofAgent;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */
public class PolicyregisterOfClients {

	/**
	 * policyNo is Auto Genrated Id
	 * policyId is foreign key of policy111 table
	 * agentId is foreign key of registeragent table
	 * clientId is foreign key of clientregister
	 */
	private int policyNo;
	private int policyId;
	private int agentId;
	private int clientId;
	private String policyDate;
	private String policymaturityDate;
	private String policysumInsured;
	private String policypremiumAmount;
	private String policycommission;
	private String paymentmethod;
	/*private String selectOptions;
	
	public String getSelectOptions() {
		return selectOptions;
	}

	public void setSelectOptions(String selectOptions) {
		this.selectOptions = selectOptions;
	}*/

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getPolicyDate() {
		return policyDate;
	}

	public void setPolicyDate(String policyDate) {
		this.policyDate = policyDate;
	}

	public String getPolicymaturityDate() {
		return policymaturityDate;
	}

	public void setPolicymaturityDate(String policymaturityDate) {
		this.policymaturityDate = policymaturityDate;
	}

	public String getPolicysumInsured() {
		return policysumInsured;
	}

	public void setPolicysumInsured(String policysumInsured) {
		this.policysumInsured = policysumInsured;
	}

	public String getPolicypremiumAmount() {
		return policypremiumAmount;
	}

	public void setPolicypremiumAmount(String policypremiumAmount) {
		this.policypremiumAmount = policypremiumAmount;
	}

	public String getPolicycommission() {
		return policycommission;
	}

	public void setPolicycommission(String policycommission) {
		this.policycommission = policycommission;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "PolicyregisterOfClients [policyNo=" + policyNo + ", policyId=" + policyId + ", agentId=" + agentId
				+ ", clientId=" + clientId + ", policyDate=" + policyDate + ", policymaturityDate=" + policymaturityDate
				+ ", policysumInsured=" + policysumInsured + ", policypremiumAmount=" + policypremiumAmount
				+ ", policycommission=" + policycommission + ", paymentmethod=" + paymentmethod + "]";
	}
	
	

}
