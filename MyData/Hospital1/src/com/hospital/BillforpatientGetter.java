package com.hospital;

public class BillforpatientGetter {

	int Bid;
	String Bname;
	String treatment;
	String Rdoc;
	int mdc;
	int price;
	int qunt;
	String Bgender;
	String Bcity;
	String Badmit;
	String Bdischarge;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getRdoc() {
		return Rdoc;
	}
	public void setRdoc(String rdoc) {
		Rdoc = rdoc;
	}
	public int getMdc() {
		return mdc;
	}
	public void setMdc(int mdc) {
		this.mdc = mdc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQunt() {
		return qunt;
	}
	public void setQunt(int qunt) {
		this.qunt = qunt;
	}
	public String getBgender() {
		return Bgender;
	}
	public void setBgender(String bgender) {
		Bgender = bgender;
	}
	public String getBcity() {
		return Bcity;
	}
	public void setBcity(String bcity) {
		Bcity = bcity;
	}
	public String getBadmit() {
		return Badmit;
	}
	public void setBadmit(String badmit) {
		Badmit = badmit;
	}
	public String getBdischarge() {
		return Bdischarge;
	}
	public void setBdischarge(String bdischarge) {
		Bdischarge = bdischarge;
	}
	
	@Override
	public String toString() {
		return "BillForPatient_G_S [Bid=" + Bid + ", Bname=" + Bname + ", treatment=" + treatment + ", Rdoc=" + Rdoc
				+ ", mdc=" + mdc + ", price=" + price + ", qunt=" + qunt + ", Bgender=" + Bgender + ", Bcity=" + Bcity
				+ ", Badmit=" + Badmit + ", Bdischarge=" + Bdischarge + "]";
	}
}
