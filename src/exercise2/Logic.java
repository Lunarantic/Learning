package exercise2;

import util.IOUtil;

public class Logic {
	
	private Connection[] connections = new Connection[10];
	private int count = 0;
	
	public void run() {
		IOUtil.setScanner();
		
		infinte:
			while (true) {
				int option = getInput(); 
				
				switch (option) {
				case 1: addConnections(); break;
				case 2: viewConnections(); break;
				case 3: updateConnections(); break;
				case 4: break infinte;
				default: System.out.println("Invalid"); break;
				}
			}
		
		IOUtil.closeScanner();
		System.out.println("You have succesfully signed out of system.");
	}

	private void printMenu() {
		System.out.println("Please choose one of the below options:\n"
							+ "1. Add new Connections\n"
							+ "2. View Connections\n"
							+ "3. Update Connections\n"
							+ "4. Exit"
						);
	}
	
	private int getInput() {
		printMenu();
		return IOUtil.getInt();
	}
	
	private void addConnections() {
		System.out.println("\nYou have choosen to add new Connections.");
		System.out.println("How many connections you would like to add:");
		
		int count = IOUtil.getInt();
		
		System.out.println("You have choose to add " + count + " new connections.");
		System.out.println("Please enter the following details:\n");
		
		for (int i = 1; i <= count; ++i)
			addConnection(i);
		
		System.out.println("You have successfully registered " + count + " new connections");
	}
	
	private void increaseSpace() {
		Connection[] newConnections = new Connection[connections.length * 2];
		System.arraycopy(connections, 0, newConnections, 0, count);
		connections = newConnections;
	}
	
	private void addConnection(int num) {
		if (count > 0.8 * connections.length) increaseSpace();
		
		String name, address;
		Integer salary;
		IOUtil.getStringLine();
		System.out.println("\nConnection"+num + " Name:");
		name = IOUtil.getStringLine();
		
		System.out.println("Connection"+num + " Address:");
		address = IOUtil.getStringLine();
		
		System.out.println("Connection"+num + " Gross Income Salary:");
		salary = IOUtil.getInt();
		
		connections[count++] = new Connection(name, address, salary);
	}
	
	private void viewConnections() {
		System.out.println("\nYou have choosen to view all connections.");
		
		for (int i = 0; i < count; ++i)
			System.out.println(connections[i]);
		
		System.out.println();
	}
	
	private void updateConnections() {
		if (count == 0) {
			System.out.println("\nNo prior connection present kindly add one.");
		} else {
			System.out.printf("\nThere are " + count + " connections which one do you want to edit?\n");
			
			String name = IOUtil.getStringLine();
			boolean flag = true;
			
			for (int i = 0; i < count; ++i) {
				Connection connection = connections[i];
				
				if (connection.hasName(name)) {
					flag = false;
					
					System.out.println("Please enter new address:");
					connection.setAddress(IOUtil.getStringLine());
					
					System.out.println("Please enter new Gross Income Salary");
					connection.setSalary(IOUtil.getInt());
					
					System.out.println("The details of " + name + " is updated successfully");
					break;
				}
			}
			
			if (flag) {
				System.out.println("No connection by name of " + name + ".");
			}
		}
	}
}
