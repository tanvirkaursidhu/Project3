/* Menu selection using do-while and switch case */
class Demonstration_57{

     public static void main(String args[]) throws java.io.IOException {

      char choice;
	  
	  do{
	     System.out.println("Choose");
		 System.out.println("1");
	     System.out.println("2");
	     System.out.println("3");
	     System.out.println("4");
		 System.out.println("5\n");
	     choice = (char) System.in.read();
	  
	  }while(choice < '1' || choice > '5');
	  
	   switch(choice){
	   
	     case '1' :
		 
		   System.out.println("Choosen 1");
	       break;
		   
		 case '2' :
		 
		   System.out.println("Choosen 2");
	       break;

         case '3' :
		 
		   System.out.println("Choosen 3");
	       break;

         case '4' :
		 
		   System.out.println("Choosen 4");
	       break;

         case '5' :
		 
		   System.out.println("Choosen 5");
	       break;		   
	   
	   
	   }

    }

}