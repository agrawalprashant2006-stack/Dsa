import java.io.FileReader;

public class TryWithResources {
 public static void main(String []args){
    // FileReader fr = null;
    // FileReader top;
    
    // try{
    //    top = new FileReader("abc.txt");
    // }catch(Exception e){
        
    // }
    // finally{
    //     fr.close();
    // }N

    try(FileReader fr = new FileReader("abc.txt");
    FileReader fr1 = new FileReader("wasif.txt");
    FileReader fr2 = new FileReader("Helloo.txt");
){
    System.err.println("Helloo");    
    }catch(Exception e){
        System.out.println("Hi");
    }
 }    
}
