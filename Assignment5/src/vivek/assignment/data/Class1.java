package vivek.assignment.data;

public class Class1 {
    int a;
    char c;
   public void printVariables(){
        System.out.println(a);
        System.out.println(c);
    }
    public void printAnother(){
       // LOCAL VARIABLES MUST BE INITIALIZED< OTHERWISE IT MAY CAUSE ERRORS.
       int i;
       char j;
       System.out.println(i);
       System.out.println(j);
    }
}
