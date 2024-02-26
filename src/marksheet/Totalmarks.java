package marksheet;

import java.util.Scanner;

public class Totalmarks {
	public static void main(String[] args) {
		try (Scanner S = new Scanner(System.in)) {
			System.out.println("details");
			System.out.println("-------");
			System.out.println("Student ID -");
			int id = S.nextInt();
			System.out.println("Student Name -");
			String name = S.next();
			System.out.println("mark 1 -");
			int m1 = S.nextInt();
			System.out.println("mark 2 -");
			int m2 = S.nextInt();
			System.out.println("mark 3 -");
			int m3 = S.nextInt();
			System.out.println("mark 4 -");
			int m4 = S.nextInt();
			System.out.println("mark 5 -");
			int m5 = S.nextInt();
			System.out.println("student");
			System.out.println("-------");
			System.out.println("student id :"+id);
			System.out.println("student name :"+name);
			System.out.println("english :"+m1);
			System.out.println("french :"+m2);
			System.out.println("maths :"+m3);
			System.out.println("science :"+m4);
			System.out.println("social :"+m5);
			System.out.println("Total marks :"+(m1+m2+m3+m4+m5));
			System.out.println("average of total :"+(m1+m2+m3+m4+m5)/5+"%" );
		}
}
}










