import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYC {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //04-02-2016 04-04-2017int n=sc.nextInt();

        System.out.println("Enter signup date:");
        String[] signup=sc.nextLine().split("-");
       System.out.println("Enter current date");
       String[] current=sc.nextLine().split("-");
        ArrayList<Integer> signupDate=new ArrayList<Integer>();
        ArrayList<Integer> currentDate=new ArrayList<Integer>();
        for(String x:signup){
            signupDate.add(Integer.parseInt(x));
        }
       for(String x:current){
            currentDate.add(Integer.parseInt(x));
       }
        LocalDate d=LocalDate.of(currentDate.get(2), signupDate.get(1),signupDate.get(0));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(d);
        LocalDate start=d.minusDays(30);
        System.out.println(start);
        LocalDate end=d.plusDays(30);
        System.out.println(end);
        LocalDate curr=LocalDate.of(currentDate.get(2),currentDate.get(1),currentDate.get(0));
        System.out.println(curr);
        findRange(start,end,curr);
    }

    private static void findRange(LocalDate start,LocalDate end,LocalDate curr) {
        int s,t;
        s= start.compareTo(curr);
        t=end.compareTo(curr);
        if(s<0 && t>0){
            System.out.println(start+" "+curr);
        }

        else if(s<0 && t<0){
            System.out.println(start+" "+end);


        }
        else{
            System.out.println("NO RANGE");


        }

    }

}
