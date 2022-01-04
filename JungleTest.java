package jungle.use;
import jungle.tree.Monkey;
public class JungleTest {

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
//child in diff package
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
