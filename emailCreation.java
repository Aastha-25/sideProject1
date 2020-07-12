import java.util.*;

public class emailCreation {
    private String firstName;
    private  String lasttName;
    private String dept;
    private String email;
    private String pswd;
    private String company = "xyz";
    private int pswdlength = 12;
    private int mailboxCapacity =50;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name, last name and department");
        String firstName = sc.next();
        String lastName = sc.next();
        String dept = sc.next();
        emailCreation ec = new emailCreation(firstName,lastName,dept);
        ec.getDetails();
         }

    public emailCreation(String firstname, String lastName, String dept){
        this.firstName = firstname;
        this.lasttName = lastName;
        this.dept = dept;
        email = firstname+"_"+lastName+"@"+dept+"."+company+".com";
        pswd = generatePswd();
    }

    private String generatePswd() {
        String pswdchar ="abcdefghijklmnopqrstuvwxyz0123456789$%&@!";
        char c[]=new char[pswdlength];
        for(int i=0;i<pswdlength;i++){
            int rand = (int)(Math.random()*pswdchar.length());
            c[i]=pswdchar.charAt(rand);
        }
        return new String(c);
    }
    private String changePswd(String pswd){
        this.pswd = pswd;
        return  pswd;
    }

    private void getDetails() {
     System.out.println("Name: "+firstName+" "+lasttName);
     System.out.println("Email: "+email);
     System.out.println("Mailbox Capacity: "+mailboxCapacity);
    }
}
