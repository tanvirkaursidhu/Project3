class Point2D{

      int x;
	  int y;
	  
	  Point2D(int a, int b){
	   
	   x = a;
	   y = b;
	  
	  }
	  
	  Point2D(){}
	  
	  
	  void display(){
	      System.out.println("x=" + x + "y=" + y);
      }		
    	  

}

class Point3D extends Point2D{

      int z;
	  Point3D(int c){
	   
	   z = c;
	  
	  }
	  void display(){
	      System.out.println("x=" + x + "y=" + y + "z=" + z);
      }

}

class MethodOverridingTest{

       public static void main(String args[]){

         Point2D p = new Point2D(3,4);
		 p.display(); // Refers to the method in Point2D
		 
		 Point3D q = new Point3D(0);
		 q.display(); // Refers to the method in Point3D
		 
		 Point2D x = (Point2D) q; // Cast q to an instance of class Point2d
         x.display();
		 
		 Point2D y = new Point3D(0);
		 y.display();



      }

}