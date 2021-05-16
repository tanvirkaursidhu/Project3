private class A{

        int data = 40;
        void msg(){System.out.println("Class A : Hello Java!");}

}
public class B{

        public static void main(String args[]){
		
		  A obj = new A(); //Error: Class A is private
		  System.out.println(obj.data); //Compile Time Error : data is private
		  obj.msg(); //Error : msg is private
        }
}