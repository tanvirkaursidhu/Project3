// A class method and instance method
public class Circle1{
	
     
     public double x,y,r;  
	 // All constructors are here
	 Circle1(double x, double  y, double r){
	 
	 this.x = x; this.y = y; this.r = r;
	 
	 }
	 
	 Circle1(double r){
	 
	 this(0, 0, r);
	 
	 }
	 
	 Circle1(Circle1 c){
	 
	 this(c.x, c.y, c.r);
	 
	 }
	 
	 Circle1(){
	 
	 this(0.0, 0.0, 1.0);

	 }
	 
	 public double circumference(){
	     return (2*3.14159*r);
	 }
	 
	 public double area(){
	     return(3.14159*r*r);
	 }
     // An instance method. Return bigger of two circles
     public Circle1 bigger(Circle1 c){
	 
	   if(c.r>r) return c;
	   else return this;
	 }
	 // A class method: Return bigger of two circles
	 public static Circle1 bigger(Circle1 a, Circle1 b){
	 
	   if(b.r>a.r) return b;
	   else return a;
	 }

       public static void main(String args[]){
	       Circle1 a = new Circle1(2.0);
		   Circle1 b = new Circle1(3.0);
		   Circle1 c = a.bigger(b); // Call of the instance method
		   Circle1 d = Circle1.bigger(a, b); // Call of the class method
		  
		  
			
}
}