// Example of static method
// A class method and instance method
public class Circle{
	
     
     public double x,y,r;  
	 // All constructors are here
	 Circle(double x, double  y, double r){
	 
	 this.x = x; this.y = y; this.r = r;
	 
	 }
	 
	 Circle(double r){
	 
	 this(0, 0, r);
	 
	 }
	 
	 Circle(Circle c){
	 
	 this(c.x, c.y, c.r);
	 
	 }
	 
	 Circle(){
	 
	 this(0.0, 0.0, 1.0);

	 }
	 
	 public double circumference(){
	     return (2*3.14159*r);
	 }
	 
	 public double area(){
	     return(3.14159*r*r);
	 }
     // An instance method. Return bigger of two circles
     public Circle bigger(Circle c){
	 
	   if(c.r>r) return c;
	   else return this;
	 }
	 // A class method: Return bigger of two circles
	 public static Circle bigger(Circle a, Circle b){
	 
	   if(b.r>a.r) return b;
	   else return a;
	 }

       public static void main(String args[]){
	       Circle a = new Circle(2.0);
		   Circle b = new Circle(3.0);
		   Circle c = a.bigger(b); // Call of the instance method
		   Circle d = Circle.bigger(a, b); // Call of the class method
		  
		  
			
}
}