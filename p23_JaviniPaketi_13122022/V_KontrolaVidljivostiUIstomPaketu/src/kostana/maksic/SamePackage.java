package kostana.maksic;

public class SamePackage {
	
	SamePackage() {
		Base b = new Base();
		System.out.println("Kostruktor klase SamePackage.");
		
		//System.out.println("Same Package n_pri = " + b.n_pri);
		System.out.println("Same Package n_def = " + b.n_def);
		System.out.println("Same Package n_pro = " + b.n_pro);
		System.out.println("Same Package n_pub = " + b.n_pub);
		
	}

}
