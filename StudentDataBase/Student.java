package StudentDataBase;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private String  studentID;
	private String cources;
	private int  tutionBalance=0;
	private  static int costOfCourse=600;
	private static int id=1000;
	
	//Constructor a prompt user to enter student name and year
	Student()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the First name");
		this.firstName=in.next();
		System.out.println("Enter the Last Name");
		this.lastName=in.next();
		System.out.println("Enter course \n1:freshman \n2:sopmore \n3:Junior \n4:senior");
		this.gradYear=in.nextInt();
		setStudentID();
		//.out.println(firstName+" "+lastName+" "+gradYear+" "+studentID);
		
	}
	
	// Generate ID
	private void setStudentID()
	{
		//grade level  + ID
		id++;
		this.studentID= gradYear+ " "+id;
	}
	
	//Enroll for course
	public void email()
	{
		do
		{
		//get inside loop
		System.out.println("Enter the name of course (Q to Quite)");
		Scanner in =new Scanner(System.in);
	    String  cource=in.nextLine();
	    if(!cource.equals("Q"))
	    {
	    	cources=cources+"\n"+cource;
	    	tutionBalance=tutionBalance+costOfCourse;
	    	
	    }
	    else{break;}
		}
		while(1!=0);
	
		System.out.println("Enroll ID"+cources);
		System.out.println("tution balannce="+tutionBalance);
	}
	
	
	//view balance
	public void viewBalance()
	{
		System.out.println("your tution balance is :$"+tutionBalance);
	}
	
	//Pay tuition
	public void payTution() {
		System.out.println("Enter your payment:");
		Scanner in =new Scanner(System.in);
		int payments=in.nextInt();
		tutionBalance=tutionBalance-payments;
		System.out.println("Thank you for your payment of $"+payments);
		viewBalance();
		
	}
	
	//show status
	public String toString() {
		return "Name: "+firstName+" "+lastName+" "+
				"\nCources Enrolled "+cources+
				"\ngrad level:"+studentID+
				"\nbalance:$ "+tutionBalance;
		
	}

	
	
	
	
}
