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
    validate.validateLName(lname);
    System.out.println("enter your email");
    String mail = sc.nextLine();
    validate.validateMail(mail);
    System.out.println("enter your mobile number");
    String num = sc.nextLine();
    validate.validateNum(num);
        System.out.println("enter your password");
        String pwd = sc.nextLine();
        validate.validatePassword(pwd);
        System.out.println("enter your password");
        String pwd2 = sc.nextLine();
        validate.validatePwd2(pwd2);
        System.out.println("enter your password");
        String pwd3 = sc.nextLine();
        validate.validatePwd3(pwd3);
        System.out.println("enter your password");
        String pwd4 = sc.nextLine();
        validate.validatePwd4(pwd4);

}
}
