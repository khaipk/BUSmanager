package Manager;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		menu();
	}
	static Scanner sc = new Scanner(System.in);
	public static void menu() {
		do {
			System.out.println("1. Nhập xe vào danh sách");
			System.out.println("2. Xuất danh sách xe");
			System.out.println("3. Tính doanh thu xe nội thành");
			System.out.println("4. Tính doanh thu xe ngoại thành");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				ManageBus.addBus();
				break;
			case 2:
				ManageBus.showBus();
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


