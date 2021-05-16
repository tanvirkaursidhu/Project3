class A{

        public int data = 40;
        public void msg(){System.out.println("Class A : Hello Java!");}

}
public class B{

        public static void main(String args[]){
		
		  A obj = new A(); //Ok : Class A is public
		  System.out.println(obj.data); //OK : data is public
		  obj.msg(); //OK : msg is public
        }
}