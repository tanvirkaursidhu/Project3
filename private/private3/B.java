class A{

        private int data = 40;
        public void msg(){System.out.println("Hello Java!" + data);}

}
public class B{

        public static void main(String args[]){
		
		  A obj = new A(); 
		  //System.out.println(obj.data); //Compile Time Error : data is private
		  obj.msg(); 
        }
}