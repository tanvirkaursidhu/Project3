public class Circle{
	
     static int circlecount = 0; // static variable
     public double x,y,r; // instance variable 
	 
	 Circle(double x, double  y, double r){
	 
	 this.x = x; this.y = y; this.r = r;
	 circlecount++;
	 }
	 
	 Circle(double r){
	 
	 this(0, 0, r);
	 circlecount++;
	 }
	 
	 Circle(Circle c){
	 
	 this(c.x, c.y, c.r);
	 circlecount++;
	 }
	 
	 Circle(){
	 
	 this(0.0, 0.0, 1.0);
	 circlecount++;
	 }
	 
	 public double circumference(){
	     return (2*3.14159*r);
	 }
	 
	 public double area(){
	     return(3.14159*r*r);
	 }


       public static void main(String args[]){
	       Circle c1 = new Circle();
		   Circle c2 = new Circle(5.0);
		   Circle c3 = new Circle(c1);
		  
		   
			System.out.println("c1#" + Circle.circlecount + "c2#" + c2.circlecount + "c3#" + c3.circlecount);
			
}
}