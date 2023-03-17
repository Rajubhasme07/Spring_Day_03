package mybeans;

public class Customer {
	
	
	int cid;
	String cname;
	Address address;
	
	
	



	public Customer(Address address) {
		super();
		this.address = address;
	}






	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	
	

}
