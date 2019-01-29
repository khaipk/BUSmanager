package bus;

public abstract class Bus {
	private int code;
	private String name;
	private String licenseNumber;
	public int money;
	
	public abstract void setMoney();
	public Bus() {
		super();
	}
	public Bus(int code, String name, String licenseNumber) {
		super();
		this.code = code;
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.money = money;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getMoney() {
		return money;
	}
	@Override
	public String toString() {
		return this.getCode()+"-"+this.getName()+"-"+this.getLicenseNumber()+"-"+this.getMoney();
	}
	
	
}
