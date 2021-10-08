import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegexFname {


        public void validateName(String fname){
            Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
            Matcher m = p.matcher(fname);
            boolean b= m.matches();
            if(b==false){
                System.out.println("name must start with capital and has minimum 3 letter");
            }
        }


    }

