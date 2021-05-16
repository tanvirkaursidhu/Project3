class Circle3{
       
	     static double x,y,r;
		 Circle3(double r){
		  
		   this.r = r;
		 
		 } 
	  // Following is the nested class	 
      public static class Point{
	  
	     double x,y;
		 void display(){
		 
		    System.out.println("(x,y): (" + this.x + "," + this.y + ")");
			
		 }	
	     Point(double a,double b){
           
           this.x = a;
           this.y = b;

         }
      }		 
	  
	     public boolean isInside(Point p){
		 
		  double dx = p.x - x;
		  double dy = p.y - y;
		  double distance = Math.sqrt((dx*dx)+(dy*dy));
		  if(distance<r) return true;
		  else return false;
		  
	    }
		
		public static void main(String args[]){
		
		  Circle3 a = new Circle3(2.0);
		  Point pa = new Point(1.0,2.0);
		  pa.display();
		  System.out.println("Is the points (1,2) inside the circle with radius 2 :" + a.isInside(pa));
		  Circle3 b = new Circle3(1.0);
		  Point pb = new Point(3.0,3.0);
		  System.out.println("Is the points (3,3) inside the circle with radius 1 :" + b.isInside(pb));
		
		}
}