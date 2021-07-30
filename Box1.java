/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #1
 */

public class Box1{
	   public int size = 0;

	   public void printBox() {            //without parameters
	       for (int i = 0; i < size; ++i) {
	           for (int j = 0; j < size; ++j) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }
	   }
	  
	   public void printBox(char c) {      //method overloading with parameter  
	       for (int i = 0; i < size; ++i) {
	           for (int j = 0; j < size; ++j) {
	               System.out.print(c);
	           }
	           System.out.println();
	       }
	   }

	   public static void main(String[] args) {
	    
	       Box1 myBox = new Box1();
	       myBox.size = 5;
	       myBox.printBox();
	       myBox.printBox('c'); //Invoked Overloaded method

	   }

	}

