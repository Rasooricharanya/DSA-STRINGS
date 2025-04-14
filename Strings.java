import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        //Concatenation of strings
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String FirstName = sc.nextLine();
        System.out.println("Enter your Last Name: ");
        String LastName = sc.nextLine();
        String FullName = FirstName + " " +  LastName ;
        System.out.println(FullName );
    }
    
}
