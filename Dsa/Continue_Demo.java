import java.util.*;
public class Continue_Demo {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 0; i<n; i++){
    if(i == 6){
        continue;
    }
    System.out.println(i);
}

  }  
}
