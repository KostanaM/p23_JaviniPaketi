package kostana.maksic;

public class Balance {
	
	String name;
	double bal;
	
	Balance(String n, double b) {
		name = n;
		bal = b;
	}
	
	void show() {
		if (bal<0)
			System.out.println("U minusu: \n");
			System.out.println(name + " = " + bal);
	}
}
