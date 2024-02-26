package account_Setup;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		try (Scanner S = new Scanner(System.in)) {
			System.out.println("Profile");
			System.out.println("-------");
			System.out.println("Enter The  ID :");
			int id = S.nextInt();

			System.out.println("Enter The Name :");
			String name = S.next();

			System.out.println("Enter The EMAIl : ");
			String email = S.next();

			System.out.println("Enter the PH no :");
			long phno = S.nextLong();

			System.out.println("Enter The Salary :");
			long sal = S.nextLong();

			System.out.println("Enter The Gender");
			char gen = S.next().charAt(0);

			System.out.println("Enter The City Name :");
			String city = S.next();

			System.out.println("Profile");
			System.out.println("-------");
			System.out.println("ID -" + id);
			System.out.println("Name -" + name);
			System.out.println("Email ID -" + email);
			System.out.println("Number -" + phno);
			System.out.println("Salary -" + sal);
			System.out.println("Gender -" + gen);
			System.out.println("City -" + city);
		}

	}

}
