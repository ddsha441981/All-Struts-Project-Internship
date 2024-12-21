package org.spring.admin.beanclasses;
/**
 * @author Deendayal
 * @version 1.1.2
 * @since 
 */

/**
 * The Class AddnewPolicy.
 */
public class AddnewPolicy {
	
	/**
	 * @parm private Memebrs of Class
	 * The policy id.
	 *The policy name.
	 *The typeofcoverage.
	 *The durations.
	 */
	
	private int policyId;
	private String policyName;
	private String typeofcoverage;
	private String durations;

	/**
	 * Gets the policy id.
	 * @return the policy id
	 * * Sets the policy id.
	 * @param policyId the new policy id
	 */
	public int getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	/**
	 * Gets the policy name.
	 * @return the policy name
	 * Sets the policy name.
	 * @param policyName the new policy name
	 */
	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	/**
	 * Gets the typeofcoverage.
	 * @return the typeofcoverage
	 *  Sets the typeofcoverage.
	 * @param typeofcoverage the new typeofcoverage
	 */
	public String getTypeofcoverage() {
		return typeofcoverage;
	}
	
	public void setTypeofcoverage(String typeofcoverage) {
		this.typeofcoverage = typeofcoverage;
	}

	/**
	 * Gets the durations.
	 * @return the durations
	 * Sets the durations.
	 * @param durations the new durations
	 */
	public String getDurations() {
		return durations;
	}

	public void setDurations(String durations) {
		this.durations = durations;
	}

	@Override
	public String toString() {
		return "AddnewPolicy [policyId=" + policyId + ", policyName=" + policyName + ", typeofcoverage="
				+ typeofcoverage + ", durations=" + durations + "]";
	}

}
