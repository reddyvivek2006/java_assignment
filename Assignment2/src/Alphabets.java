import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Alphabets {
    static boolean allAlpha(String s, HashMap<String, Integer> unique){
        s=s.toLowerCase(Locale.ROOT);
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String sub;
        for(int i=0;i<s.length();i++){
            sub=s.substring(i,i+1);
            if(alpha.contains(sub)){
                if(!unique.containsKey(sub)){
                    unique.put(sub,1);
                }
                else{
                    int val= unique.get(sub);
                    unique.put(sub,val+1);
                }
            }
        }
        if(unique.size()==26) {
            return true;
        }
        else{
            return false;

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<String,Integer> unique=new HashMap<String,Integer>();
        if(allAlpha(s,unique)){
            System.out.println("THIS CONTAINS UNIQUE");
        }
        else{
            System.out.println("THIS DOES NOT  CONTAINS UNIQUE");
        }
    }

}
