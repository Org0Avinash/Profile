package org.emp;

public class employee {
	private void empid() {
		System.out.println("employee ID 123");

	}

	private void empname() {
		System.out.println("avinash");

	}

	private void empDOB() {
		System.out.println("05/05/2002");
	}

	private void empPhone() {
		System.out.println("8610819571");
	}

	private void empEmail() {
		System.out.println("aviansh050502@gmail.com");
	}

	private void empAddress() {
		System.out.println("chennai, india");

	}

	public static void main(String[] args) {
		employee E = new employee();
		E.empid();
		E.empname();
		E.empDOB();
		E.empPhone();
		E.empEmail();
		E.empAddress();
	}
}


