class Point2D{

      int x;
	  int y;
	  
	  void display(){
	      System.out.println("x=" + x + "y=" + y);
      }		  

}

class Point3D extends Point2D{

      int z;
	  void display(){
	      System.out.println("x=" + x + "y=" + y + "z=" + z);
      }

}

class SimpleSingleInheritance{

       public static void main(String args[]){

         Point2D p1 = new Point2D();
		 Point3D p2 = new Point3D();
		 p1.x = 10;
		 p1.y = 20;
		 System.out.print("Point2D P1 is");
		 p1.display();
		 // Initializing Point3D
         //p2.x = 5;
		 //p2.y = 10;
		 p2.z = 15;
		 System.out.print("Point3D P2 is");
		 p2.display();




      }

}