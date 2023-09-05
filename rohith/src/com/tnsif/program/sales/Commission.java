package com.tnsif.program.sales;
import java.util.Scanner;
public class Commission 
 {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Name: ");
			setName(scanner.nextLine());

			System.out.print("Enter Address: ");
			setAddress(scanner.nextLine());

			System.out.print("Enter Phone: ");
			setPhone(scanner.nextLine());

			System.out.print("Enter Sales Amount: ");
			salesAmount = scanner.nextDouble();
		}
    }

    public void calculateCommission() {
        double commission = 0.0;

        if (salesAmount >= 100000) {
            commission = 0.1 * salesAmount; // 10% commission
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount; // 5% commission
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount; // 3% commission
        }

        System.out.println("Commission: $" + commission);
    }

    public static void main(String[] args) {
        Commission commissionObj = new Commission();
        commissionObj.acceptDetails();
        commissionObj.calculateCommission();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
