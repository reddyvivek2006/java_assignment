import java.util.Scanner;

public class Regex {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        boolean t=st.matches("^[A-Z].*[!.?]$");
        if(t){
            System.out.println("THIS SATISFIED");
        }
        else{
            System.out.println("THIS IS NOT SATISFIED");
        }
    }
}
