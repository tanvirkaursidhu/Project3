// Abstract class with final method

abstract class Base{
 
       final void fun(){System.out.println("Final fun() is called");}

}

class Derived extends Base{

       Derived(){System.out.println("Derived constructor is called");}
	   void fun(){System.out.println("Derived fun() is called");}

}	  
	  
final class Demonstration_612b{

        public static void main(String args[]){

          Base b = new Derived();
          b.fun();

       }

}	  
	  