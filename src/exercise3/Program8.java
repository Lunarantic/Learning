package exercise3;

public class Program8 {

	private static Program8 instance = null;
	
	private Program8() {}
	
	public static Program8 getInstance() {
		if (instance == null) instance = new Program8();
		return instance;
	}
}
