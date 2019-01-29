package Manager;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		menu();
	}
	static Scanner sc = new Scanner(System.in);
	 static ManageBus bus = new ManageBus();
	public static void menu() {
		do {
			System.out.println("0. Thoát");
			System.out.println("1. Nhập xe vào danh sách");
			System.out.println("2. Xuất danh sách xe");
			System.out.println("-");
			System.out.println("-");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				bus.addBus();
				break;
			case 2:
				bus.showBus();
				break;
			case 3:

				break;
			case 4:

				break;

			default:
				System.err.println("Tạm biệt thím");
				System.exit(1);
				break;
			}
		} while(true);
	}

}


