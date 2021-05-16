// Save as B.java in a another sub-directory say pack2

package pack2;
import pack1.*;

public class B extends A{

        public static void main(String args[]){
		
		  B obj = new B();
		 
		  obj.msg();
        }
}