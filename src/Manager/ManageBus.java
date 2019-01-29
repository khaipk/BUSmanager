package Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bus.Bus;
import bus.SuburbunBus;
import bus.UrbunBus;

public class ManageBus {
	private static List<UrbunBus> busList1 = new ArrayList<>();
	private static List<SuburbunBus> busList2 = new ArrayList<>();
	private double sum1, sum2;
	static Scanner sc = new Scanner(System.in);
	
	public void addBus() {
		
		System.out.print("Nhập mã số xe:");
		int code = sc.nextInt();
		System.out.print("Nhập tên tài xế:");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Nhập biển số xe:");
		String license = new Scanner(System.in).nextLine();
		System.out.println("Nhập doanh thu:");
		double money = new Scanner(System.in).nextDouble();
		System.out.println("Nhập loại xe: (1 or 2)");
		int type = sc.nextInt();
		if(type ==1) {
			UrbunBus bus ;
		System.out.println("Nhập số tuyến:");
		int busNumber = sc.nextInt();
		System.out.println("Nhập số km:");
		int journeyNumber = sc.nextInt();
		 bus = new UrbunBus(code, name, license, busNumber, journeyNumber);
		 busList1.add(bus);
		 sum1 += money;
		}
		else {
			SuburbunBus bus;
		System.out.println("Nhập nơi đến:");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhập số ngày đi:");
		int days = sc.nextInt();
		 bus = new SuburbunBus(code, name, license, address, days);
		 busList2.add(bus);
		 sum2 += money;
		}
	}
	public void showBus() {
		for (UrbunBus bus:busList1) {
			System.out.println(bus);
		}
		System.out.println("Tổng doanh thu xe nội thành: "+sum1);
		for (SuburbunBus bus:busList2) {
			System.out.println(bus);
		}
		System.out.println("Tổng doanh thu xe ngoại thành: "+sum2);
	}
}
