public class Lec_5_20_Aug{
    public static void main(String[] args) {
        try {
		  System.out.println("hello");
		  System.out.println(10/0);
		  String s = null;
		  System.out.println(s.length());
		  int a[] =new int[2];
		  System.out.println(a[3]);  
	  }catch(NullPointerException e){
		  System.out.println("Null Pointer Exception");  
	  }catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("Array Index Out Of Bound");  
	  }catch(ArithmeticException e){
		  System.out.println("Arithmetic Exception");  
	  }
    }
}