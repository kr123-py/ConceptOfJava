package StudentDataBase;

import java.util.Scanner;

public class StudentDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.email();
		//st.payTution(500);
		st.payTution();
		System.out.println(st.toString());
		
		//ASK how many student you want to add
		System.out.println("Enter number of new students to enroll");
		Scanner in =new Scanner(System.in);
		int numberStuent=in.nextInt();
	     Student[] students=new Student[numberStuent-1];
	     		
		//create n number of student
	     for(int n=0;n<numberStuent;n++)
	     {
	    	 students[n]=new Student();
	    	 students[n].email();
	 		//st.payTution(500);
	    	 students[n].payTution();
	 		System.out.println(st.toString());
	 		st.email();
	 		//st.payTution(500);
	 		st.payTution();
	 		
	 		
	    	 
	     }
	     for (int i = 0; i <numberStuent; i++) {
	    	 
	    	 System.out.println(students[i].toString());
	     }
	     

	}

}
