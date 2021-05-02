import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapClass {
    public static void main(String []args) throws IOException {
        File file = new File("/home/vivers/zemoso/"+args[0]);

        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter writer = new FileWriter("/home/vivers/zemoso/output.txt");
        HashMap<Character,Integer> unique=new HashMap<Character,Integer>();
        String st;
        while ((st = br.readLine()) != null) {
            char[] s=st.toCharArray();
            for (char i:s) {
                if (unique.containsKey(i)) {
                    unique.replace(i, unique.get(i), unique.get(i) + 1);
                } else {
                    unique.put(i, 1);
                }
            }
        }
        unique.remove(' ');

        for (char i : unique.keySet()) {
            writer.write("key: " + i + " value: " + unique.get(i));
            System.out.println("key: " + i + " value: " + unique.get(i));
        }
        writer.close();
        }


    }

