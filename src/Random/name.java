import java.util.Scanner;

public class name {
    public String Message(String fn, String sn)
    {
        String m = "";
        if(fn.equals(sn))
        {
            m = "Same name";
            System.out.println(m);
        }
        else if(fn.charAt(0) == sn.charAt(0) )
        {
            m = "Same first letter";
            System.out.println(m);
        }
        else {
            m = "No match";
            System.out.println(m);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fn = scan.nextLine();
        System.out.print("Enter second name: ");
        String sn = scan.nextLine();
        name a = new name();
        a.Message(fn,sn);
    }
}
