class Bike{

     void run(){ System.out.println("running");}
}

class Splendor extends Bike{
   
     void run(){ System.out.println("running safely with 60 km");}

     public static void main(String args[]){

         Splendor b1 = new Splendor();
		 b1.run();
		 
         Bike b2 = new Bike();
         b2.run();
		 
		 Bike b3 = new Splendor(); //Up casting
		 b3.run();
	 }
}	 
         		 