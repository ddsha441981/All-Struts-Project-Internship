package org.spring.agent.beanofAgent;

import java.util.Date;

/**
 * @author Deendayal
 * @since
 * @version 1.1.2
 */
public class PolicyHolderRegister {
	private int clientId;
	private String clientName;
	private String clientemail;
	private String clientpassword;
	private String clientcfpassword;
	private String clientaddress;
	private String clientgender;
	private String clientpanNo;
	private String clientdob;
	private String clientmobNo;
	private String clientstate;
	private String clientpostcode;
	private String clientoccuption;
	private String clientincome;
	private String clientcountry;
	private int agentId;//agent Id is As Foregin Key

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

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientemail() {
		return clientemail;
	}

	public void setClientemail(String clientemail) {
		this.clientemail = clientemail;
	}

	public String getClientpassword() {
		return clientpassword;
	}

	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}

	public String getClientcfpassword() {
		return clientcfpassword;
	}

	public void setClientcfpassword(String clientcfpassword) {
		this.clientcfpassword = clientcfpassword;
	}

	public String getClientaddress() {
		return clientaddress;
	}

	public void setClientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	public String getClientgender() {
		return clientgender;
	}

	public void setClientgender(String clientgender) {
		this.clientgender = clientgender;
	}

	public String getClientpanNo() {
		return clientpanNo;
	}

	public void setClientpanNo(String clientpanNo) {
		this.clientpanNo = clientpanNo;
	}

	public String getClientdob() {
		return clientdob;
	}

	public void setClientdob(String clientdob) {
		this.clientdob = clientdob;
	}

	public String getClientmobNo() {
		return clientmobNo;
	}

	public void setClientmobNo(String clientmobNo) {
		this.clientmobNo = clientmobNo;
	}

	public String getClientstate() {
		return clientstate;
	}

	public void setClientstate(String clientstate) {
		this.clientstate = clientstate;
	}

	public String getClientpostcode() {
		return clientpostcode;
	}

	public void setClientpostcode(String clientpostcode) {
		this.clientpostcode = clientpostcode;
	}

	public String getClientoccuption() {
		return clientoccuption;
	}

	public void setClientoccuption(String clientoccuption) {
		this.clientoccuption = clientoccuption;
	}

	public String getClientincome() {
		return clientincome;
	}

	public void setClientincome(String clientincome) {
		this.clientincome = clientincome;
	}

	public String getClientcountry() {
		return clientcountry;
	}

	public void setClientcountry(String clientcountry) {
		this.clientcountry = clientcountry;
	}

	@Override
	public String toString() {
		return "PolicyHolderRegister [clientId=" + clientId + ", clientName=" + clientName + ", clientemail="
				+ clientemail + ", clientpassword=" + clientpassword + ", clientcfpassword=" + clientcfpassword
				+ ", clientaddress=" + clientaddress + ", clientgender=" + clientgender + ", clientpanNo=" + clientpanNo
				+ ", clientdob=" + clientdob + ", clientmobNo=" + clientmobNo + ", clientstate=" + clientstate
				+ ", clientpostcode=" + clientpostcode + ", clientoccuption=" + clientoccuption + ", clientincome="
				+ clientincome + ", clientcountry=" + clientcountry + ", agentId=" + agentId + "]";
	}

}
