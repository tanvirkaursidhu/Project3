class StaticScope{

       public static void main(String args[]){
	   
	      int x; // known to all code within main
		  x = 10;
	   
	      if(x == 10){ // start new scope
	   
	        int y = 20; // known only to this block
			System.out.println("x and y: " + x + " " + y);
	        x = 2 * y; // x and y both are known here
	  
          }	   
	     
		   y = 100; // Error! y is now no more known here
		   System.out.println("x is " + x); // x is still known here
	   
	   }
}