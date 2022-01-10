import java.lang.annotation.Annotation;

public class AnnotationTest {
	public static void main(String[] args) {
		SavingsAccount saObj = new SavingsAccount();
		Class theClass = saObj.getClass();
		
		Annotation anno [] = theClass.getAnnotations();
		for (Annotation annotation : anno) {
			ClassDevelopedBy cdb = (ClassDevelopedBy) annotation;
			System.out.println("Developer is : "+cdb.developer());
			System.out.println("Version   is : "+cdb.version());
			if(cdb.version()==1.0) {
				System.out.println("Ok ");
			}
			else {
				System.out.println("Not OK");
			}
			
			if(cdb.developer().equalsIgnoreCase("Vishhal")) {
				System.out.println("Running the code...");
			}
			else {
				System.out.println("Not running the code...");
			}
		}
	}
}
/*
 * Purpose of comments
 * 	- extra info of the code, method, field, function
 *  - it is not standardized
 *  - it is not executable
 *  - it is limited to the source code only
 *  
 *  
 * Annotation [ extended version of comments ]
 * 
 *  	- extra info of the code, method, field, function
 *  	- it is standardized
 *  	- it is executable
 *  	- it can be created both source and class file too
 *  
 * 
 */


				/* developed by vishal */
/* developed by vishal */ class BankAccount /* developed by vishal */
{					/* developed by vishal */
			
						/*imp variable in banking*/
	/*imp variable in banking*/ double balance; /*imp variable in banking*/
					/*imp variable in banking*/
	
			/*important method in banking*/
	/*important method in banking*/	void withdraw(double amt) /*important method in banking*/
	{					/*important method in banking*/
		balance = balance - amt;
	}
}

@ClassDevelopedBy(developer="Vishhal", version=1.0)
class SavingsAccount
{
	@FieldDevelopedBy(developer="Rajesh", version=1.1)
	double balance;
	
	@MethodDevelopedBy(developer="Reeta", version=2.0)
	void withdraw(double d) {
		balance = balance - d;
	}
}






