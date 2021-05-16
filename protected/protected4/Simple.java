class A{

        void msg(){System.out.println("Hello Java!");}

}
public class Simple extends A{

        protected void msg(){System.out.println("Class B : Welcome!");}
        public static void main(String args[]){
		
		  Simple obj = new Simple(); 
		  
		  obj.msg(); 
        }
}