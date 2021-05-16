class Box{

      float x = 10.0f;
	  float y = 20.0f;
	  float w = 15.0f;
	  
	  float area(){
	  
	     return(2*(x*y+y*w+w*x));    
		
	  }
}

class Circle{

       float x = 0.0f;
	   float y = 0.0f;
	   float r = 5.0f;
	  
	  float area(){
	  
	     return((22/7)*r*r);    
		
	  }
}

class GeoClass{

	   public static void main(String args[]){
	  
	     float x = 50;
	     float y = 60;
		 
	     Box b = new Box();
		 Circle c = new Circle();
		 
		 System.out.println("GeoClass Data: x =  " + x);
		 System.out.println("Box Data: x = " + b.x);
		 System.out.println("Box Area: " + b.area());
		 System.out.println("Circle Data: x =  " + c.x);
		 System.out.println("Circle Area: " + c.area());
	   
	   }
}