package util;

import java.util.Scanner;

public class IOUtil {
	
	private static Scanner scanner;
	
	public static void setScanner() {
		if (scanner == null) scanner = new Scanner(System.in);
	}
	
	public static void closeScanner() {
		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
	}
	
	public static String getStringLine() {
		if (scanner != null) return scanner.nextLine();
		return null;
	}
	
	public static Integer getInt() {
		if (scanner != null) return scanner.nextInt();
		return 0;
	}
	
	public static Float getFloat() {
		if (scanner != null) return scanner.nextFloat();
		return 0f;
	}
	
	public static Double getDouble() {
		if (scanner != null) return scanner.nextDouble();
		return 0d;
	}
}
