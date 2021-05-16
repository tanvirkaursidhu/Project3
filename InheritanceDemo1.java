class Person{

      String name;
	  Date dob;
	  int mobileno;
	  
	  void readData(String n, Date d, int m){

        name = n;
		dob = d;
		mobileno = m;

      }
	  
	  void printData(){
	   
	   System.out.println("Name : " + name);
	   dob.printDate();
	   System.out.println("Mobile : " + mobileNo);
	  
	  
	  
	  
	  
	  }

}

class Student extends Person{
	
	String institution;
	int[] qual = new int[20];
	int rollNo;
	int[] marks = new int[5];
	
	void printBioData(){
		
		printData();
		System.out.println("Institution : " + institution);
		System.out.println("Roll : " + rollNo);
		for(int q=0;q<qual.length;q++){
			System.out.println("Marks " + q + ": " + qual[q]);
	    }
        for(int m=0;m<marks.length;m++){
			System.out.println("Result " + m + ": " + marks[m]);
	    }
    }  		
		




}

class Employee extends Person{

     int empNo;
	 int[] salarHistory = new int[12];
	 String organisation;
	 String designation;
	 Date dob;
	 
	 void printSalary(){
		 
		 for(int s=0;s<salaryHistory.length;s++){
		  
		   System.out.println("Salary " + s+ ": " + salaryHistory[s]);
		 
		 
		 }
	 } 		 
	 


}

class InheritanceDemo1{

     public static void(String args[]){

       Person p = new Person();
	   //Code with the objects p...
	   Student s = new Student(100);
	   //Code with the objects s...
	   Employee e = new Employee(50);
	   //Code with the objects e...




    }

} 