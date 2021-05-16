// Abstract class with final method

abstract class Base{
 
       final void fun(){System.out.println("Final fun() is called");}

}

class Derived extends Base{}	  
	  
final class Demonstration_612a{

        public static void main(String args[]){

          Base b = new Derived();
          b.fun();

       }

}	  
	  