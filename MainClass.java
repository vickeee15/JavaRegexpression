import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    System.out.println("REGEX USER VALIDATION");
    Scanner sc= new Scanner(System.in);
    RegexFname validate = new RegexFname();
    System.out.println("Enter first name:");
    String fname = sc.nextLine();
    validate.validateName(fname);

}
}
