package marksheet;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Student mark");
		
		
		int m1 = 50;
		int m2 = 60;
		int m3 = 55;
		int m4 = 70;
		int m5 = 80;
		int total = m1+m2+m3+m4+m5;
		int average = (total/5);
		
		System.out.println("Total Average value of marks is : " + average);
		
		////////////////////////////////////////////
		
		int totalPercentagemarks = 500;
		
		float totalPercentage = total*100/totalPercentagemarks;
		System.out.println("Total Percentage is : " +totalPercentage+" %");

	}

}
