package m;

public class K2 {
	String name;
	double bal;
	public K2(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}
	public void Ispis() {
		if(bal<0)
		System.out.println("U minusu");
		System.out.println(name + " " + bal);
	}
	
}	