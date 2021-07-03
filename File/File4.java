
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        int id;
        String name,current_trimester;
        student[]s=null;
        try{
        File f=new File("info.txt");
        Scanner in=new Scanner(f);
         
        
        n=in.nextInt();
      
        s=new student[n];
        for(int i=0;i<n;i++){
            name=in.next();
            id=in.nextInt();
            current_trimester=in.next();
            s[i]=new student(id,name,current_trimester);
        }
         }catch(Exception e){
         }
    
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
        // TODO code application logic here
    }
    
}
