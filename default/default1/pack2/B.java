/* Save this program as B.java in another sub-directory "pack2" */

class B{

      public static void main(String args[]){
	  
	      A obj = new A(); //Compile Time Error if A.java is in pack1
		  obj.msg(); //Compile Time Error if A.java is in pack1
		  
	  }
}	  