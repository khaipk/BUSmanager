package bus;

public class SuburbunBus extends Bus{
	private String address;
	private int journeyDays;
	
	
	public SuburbunBus(int code, String name, String licenseNumber, String address, int journeyDays) {
		super(code, name, licenseNumber);
		this.address = address;
		this.journeyDays = journeyDays;
	}

	public SuburbunBus() {
		super();
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getJourneyDays() {
		return journeyDays;
	}
	public void setJourneyDays(int journeyDays) {
		this.journeyDays = journeyDays;
	}
@Override
public String toString() {
	return super.toString()+"-"+this.getAddress()+"-"+this.getJourneyDays();
}

@Override
public void setMoney() {
	
}
}
