import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Ping {

    public static void runSystemCommand(String input,int numberOfPackets) {

        try {
            String command="ping -c "+numberOfPackets+" " + input;
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            storeTime(inputStream,numberOfPackets);



        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void storeTime(BufferedReader inputStream,int numberOfPackets){
        ArrayList<Double> timeInMs=new ArrayList<Double>();
        try {

            String s = "";
            int index;
            String line = inputStream.readLine();
            int count=1;
            if (line==null) {
                System.out.println("Name or service not found");
            }
            else {
                while ((s = inputStream.readLine()) != null && count<=numberOfPackets) {

                    System.out.println(s);
                    index = s.indexOf("time=");
                    double time = Double.parseDouble(s.substring(index + 5, s.length() - 3));
                    System.out.println(time);
                    timeInMs.add(time);
                    count=count+1;


                }
                calculateMedian(timeInMs);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void calculateMedian(ArrayList<Double> timeInMs) {
        Collections.sort(timeInMs);
        double median;
        int n=timeInMs.size();
        if(n%2==0){
            n=n/2;
            median= (timeInMs.get(n)+timeInMs.get(n-1))/2;
        }
        else{
            n=n/2;
            median= timeInMs.get(n);
        }
        System.out.println("The median is "+median);

    }

    public static void main(String[] args) {

        String input;
        int numberOfPackets;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip address or hostname : ");
        input =sc.nextLine();
        System.out.println("Enter number of packets:");
        numberOfPackets=sc.nextInt();
        runSystemCommand(input,numberOfPackets);


    }
}