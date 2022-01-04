package jungle.tree;

//import jungle.use.Monkey;

public class Monkey {
	          int defaultVar=1;
	private   int privateVar=2;
	protected int protectedVar=3;
	public    int publicVar=4;
	
	public Monkey() {
		System.out.println("Monkey ctor");
	}
	void jump() {
		System.out.println("Jumping...");
	}
}
class Gorilla extends Monkey { //child in same package
	void highJump() {
		System.out.println(defaultVar);
		System.out.println(privateVar);
		System.out.println(protectedVar);//inherited
		System.out.println(publicVar);
		
	}
}
class JungleTest { //non-child in same package

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m = new Monkey();
		m.jump();
		System.out.println(m.defaultVar);
		System.out.println(m.privateVar);
		System.out.println(m.protectedVar);
		System.out.println(m.publicVar);
		
	}

}
//child in same package
class Chimpanzee extends Monkey { 
	void highJump() {
		System.out.println(defaultVar);
		System.out.println(privateVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
		
		Monkey m = new Monkey();
		System.out.println(m.defaultVar);
		System.out.println(m.privateVar);
		System.out.println(m.protectedVar);
		System.out.println(m.publicVar);
	}
}
