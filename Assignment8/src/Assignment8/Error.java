package Assignment8;
import java.util.Random;

class Error {
    public static void error(int i) throws MyException1,MyException2,MyException3{
        if(i==1)
            throw new MyException1();
        else if(i==2)
            throw new MyException2();
        else
            throw new MyException3();


    }

    public static void main(String [] args){
        Random rn = new Random();
        try{
            error(rn.nextInt(4));

        }catch(MyException1|MyException2|MyException3 e){
            e.message();
            e.printStackTrace();

        }finally{
            System.out.println("\n Always running the final block.........");
        }
    }
}