package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = input.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(input.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(input.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date!");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter date to updata the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());

			
			
				String error = reservation.updateDate(checkIn, checkOut);
				if (error != null) {
					System.out.println("Error in reservatio: " + error);
				}
				else {
				System.out.println("Reservation: " + reservation);
				}
			

		}

	}

}
