/**
 * Created by webstddesign on 11.05.2016.
 */
public class PayrollSystemTest {

	public static void main(String arg[]) {


	SalariedEmployee salEmployee = new SalariedEmployee("John", "Smith", "111-222-333", 500.0);
	System.out.println("Employees process individually");
		System.out.printf("%n%s%n%s: $%, .2f%n%n", salEmployee,"earned" ,salEmployee.earnings());
}

}