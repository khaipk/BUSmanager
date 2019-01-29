package bus;

public class UrbunBus extends Bus {
	private int busNumber;
	private int journeyNumber;
	@Override
	public void setMoney() {
		this.money = this.getJourneyNumber()*100000;
	}
	
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

}
