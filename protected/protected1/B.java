class A{

        protected int i = 50;
        void msg(){System.out.println("Class A : Hello Java!" + i);}

}
public class B{

        public static void main(String args[]){
		
		  A obj = new A(); 
		  obj.msg();//Compile Time Error!
		  
        }
}