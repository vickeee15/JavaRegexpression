import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    System.out.println("REGEX USER VALIDATION");
    Scanner sc= new Scanner(System.in);
    Regex validate = new Regex();
    System.out.println("Enter first name:");
    String fname = sc.nextLine();
    validate.validateName(fname);
    System.out.println("enter last name");
    String lname = sc.nextLine();
    validate.validateName(lname);

}
}
