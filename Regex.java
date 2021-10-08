import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regex {


        public void validateName(String fname){
            Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
            Matcher m = p.matcher(fname);
            boolean b= m.matches();
            if(b==false){
                System.out.println("name must start with capital and has minimum 3 letter");
            }
        }
            public void validateLName(String lname){
                Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
                Matcher m = p.matcher(lname);
                boolean b= m.matches();
                if(b==false){
                    System.out.println("name must start with capital and has minimum 3 letter");
                }
        }
        public void validateMail(String mail){
            Pattern p = Pattern.compile("^[a-z0-9_.]+@[a-z]{2,}+.[a-z.]{2,}$");
            Matcher m = p.matcher(mail);
            boolean b= m.matches();
            if(b==false){
                System.out.println("Check the mail");
            }
        }
        public void validateNum(String num){
            Pattern p = Pattern.compile("^[0-9]{2}[0-9]{10}$");
            Matcher m = p.matcher(num);
            boolean b= m.matches();
            if(b==false){
                System.out.println("phone number should be within 10 digit");
            }
        }


    }

