public class SimpleFactorial{

	  public static void main(String args[]){
	  
	   int facto = 1;
	   int n = Integer.parseInt(args[0]);
	   
	   if((n == 0) || (n == 1)){
	     System.out.println("Factorial of " + n + ": " + facto);
		 return;
	   }	 
		 
	  for(int i=1;i<=n;i++)
         facto = facto * i;	 
         System.out.println("Factorial of " + n + ": " + facto);		 
	     
	 }
}