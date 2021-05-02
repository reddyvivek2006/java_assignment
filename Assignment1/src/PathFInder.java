import java.io.File;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

class PathFinder {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String find=sc.nextLine();
        listFind("/home",find);
    }

    private static void listFind(String path,String find) {
        File dir=new File(path);
        File[] files=dir.listFiles();
         if(files!=null && files.length>0){
            for(File file:files){
                if(file.isDirectory()){
                    listFind(file.getAbsolutePath(),find);
                }
                else{
                    String fileName=file.getName();
                    if (fileName.matches(".*\\b\\b")){
                        String st=file.getAbsolutePath()+"."+fileName;
                        if(st.contains(find)){
                            System.out.println(file.getAbsolutePath() +" " +fileName);
                        }
                    }
                }
            }
        }
    }
}
