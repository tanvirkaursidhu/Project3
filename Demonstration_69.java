// An abstract class with constructor
abstract class Base{

      Base(){ System.out.println("Base constructor is called");}
      abstract void fun();

}

class Derived extends Base{

      Derived(){ 
	  super();
	  System.out.println("Derived constructor is called");}
      void fun(){ System.out.println("Derived fun() is called");}

}

class Demonstration_69{

        public static void main(String args[]){

       
           Derived d = new Derived();
           d.fun();

       }

}