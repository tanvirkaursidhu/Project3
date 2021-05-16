class A{

        private int data = 40;
        public void msg(){System.out.println("Class A : Hello Java!");}

}
public class B{

        public static void main(String args[]){
		
		  A obj = new A(); //Ok : Class A is public
		  System.out.println(obj.data); //Compile Time Error : data is private
		  obj.msg(); //OK : msg is public
        }
}