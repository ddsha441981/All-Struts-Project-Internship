package org.spring.agent.beanofAgent;

/**
 * @author Deendayal
 * @since
 * @version 1.1.2
 */
public class QuotationsBeans {

	private int quotationId;//Auto Gen
	private String quotationAmounts;
	private String replydate;
	private int enquiryId;
	private int policyId;

	public int getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(int quotationId) {
		this.quotationId = quotationId;
	}

	public String getQuotationAmounts() {
		return quotationAmounts;
	}

	public void setQuotationAmounts(String quotationAmounts) {
		this.quotationAmounts = quotationAmounts;
	}

	public String getReplydate() {
		return replydate;
	}

	public void setReplydate(String replydate) {
		this.replydate = replydate;
	}

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}


}
