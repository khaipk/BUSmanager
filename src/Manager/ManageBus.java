package Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bus.Bus;
import bus.SuburbunBus;
import bus.UrbunBus;

public class ManageBus {
	public static List<Bus> busList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void addBus() {
		Bus bus;
		System.out.print("Nhập mã số xe:");
		int code = sc.nextInt();
		System.out.print("Nhập tên tài xế:");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Nhập biển số xe:");
		String license = new Scanner(System.in).nextLine();
		System.out.println("Nhập loại xe: (1 or 2)");
		int type = sc.nextInt();
		if(type ==1) {
		System.out.println("Nhập số tuyến:");
		int busNumber = sc.nextInt();
		System.out.println("Nhập số km:");
		int journeyNumber = sc.nextInt();
		 bus = new UrbunBus(code, name, license, busNumber, journeyNumber);
		}
		else {
		System.out.println("Nhập nơi đến:");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhập số ngày đi:");
		int days = sc.nextInt();
		 bus = new SuburbunBus(code, name, license, address, days);
		}
		busList.add(bus);
	}
	public static void showBus() {
		for (Bus bus:busList) {
			System.out.println(bus);
		}
	}
}
