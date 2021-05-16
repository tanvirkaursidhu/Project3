/* Loop example with break */
class Demonstration_55{

     public static void main(String args[]){

      for(int i=1;;i++){
	  
	     if(i%10==0) break; // terminate the loop if i is 10
		 System.out.println("i: " + i);
	  }

       System.out.println("Loop complete.");

    }

}