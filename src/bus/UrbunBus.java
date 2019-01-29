package bus;

public class UrbunBus extends Bus {
	private int busNumber;
	private int journeyNumber;
	
	
	public UrbunBus() {
		super();
	}

	public UrbunBus(int code, String name, String licenseNumber, int busNumber, int journeyNumber) {
		super(code, name, licenseNumber);
		this.busNumber = busNumber;
		this.journeyNumber = journeyNumber;
	}

	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public int getJourneyNumber() {
		return journeyNumber;
	}
	public void setJourneyNumber(int journeyNumber) {
		this.journeyNumber = journeyNumber;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"-"+this.getBusNumber()+"-"+this.getJourneyNumber();
}

@Override
public void setMoney() {
	
}
}
