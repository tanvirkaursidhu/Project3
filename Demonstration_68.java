/* A simple abstract class example */
abstract class Base{

      abstract void fun();

}

class Derived extends Base{

      void fun(){ System.out.println("Derived fun() is called");}

}

class Demonstration_68{

        public static void main(String args[]){

           // Uncommenting the following line will cause compile error as the
		   // line tries to create an instance of abstract class.
           //Base b = new Base();

           // We can have references of Base class.
           Base b = new Derived();
           b.fun();

       }

}