/*here we are showing that the implementing of implicit type of promotion 
   
  any smaller data type  when put into a bigger data type then it is automatically
  converted and is known as implicit conversion
*/
package Assignment2;

public class ImplicitType { //here we are taking a class implicittype

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             byte b= 15;                             //we are taking byte data type and initialized the variable as 15
             int x = 130;                          //and another variable of integer data type which is greater than byte data type
             System.out.println("b : " +b+ "\n x :" +x );       
             
             b=(byte)x;
             
             System.out.println("int to byte  : " +b );
             x = b ;
             System.out.println("byte to int  : " +x );
             
             int i= 150;
             float f = i;
             System.out.println("int to float : " +f );
	       short y =(short)f;
	       System.out.println("float to short  : " +y );
	        
	}

}
