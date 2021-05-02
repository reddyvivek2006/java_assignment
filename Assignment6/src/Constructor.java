public class Constructor {
    int sum;
    public Constructor(int n){
        this(5,2);
    }
    public Constructor(int x,int y){
        this.sum=x+y;
    }
    public static void main(String []args){
        Constructor c=new Constructor(2);

    }
}
