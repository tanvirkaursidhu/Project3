class A{

        private int i = 50;
        protected void msg(){System.out.println("Class A : Hello Java! " + i);}

}
public class B extends A{

        public static void main(String args[]){
		
		  B obj = new B(); 
		  obj.msg();
		  
        }
}