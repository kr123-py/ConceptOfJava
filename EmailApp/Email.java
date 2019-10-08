package EmailApp;

import java.util.Scanner;

public class Email {
private	String Firstname;
private String LastName;
private String Password;
private String Department;
private String email;
private int defaultPasswordLength=10;
private int MailBoxCapacity=500;
private String AlternativeMail;
private String CompanySuffix="ayeCompay.com";

// constructor received the FirstName and LastName
public Email(String FistName,String LastName)
{
	this.Firstname=FistName;
	this.LastName=LastName;
	
	
	this.Department=SetDeapatment();
	
	//call a method return a random password
	this.Password=randomPassword(this.defaultPasswordLength);
	System.out.println("Password :"+this.Password);
	//set element to generate  email.
	email=Firstname.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department+"."+CompanySuffix;
		
}



//Ask for Department 

private String SetDeapatment() {
	
	System.out.println("Department code \n 1 for sale \n 2 for development \n 3 for accounting \n 0 for none \n Enter your department ");
	Scanner in =new Scanner(System.in);
	int departmentChoice=in.nextInt();
	if(departmentChoice==1) {return "sale";}
	else if(departmentChoice==2) {return "dev";}
	else if(departmentChoice==3) {return "account";}
	else
		return " ";
	
}
// Generate Random Password
private String randomPassword(int length)
{
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$&";
	char[] password=new char[length];
	for(int i=0;i<length;i++)
	{
		int rand=(int) (Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		
		}
	return new String(password);
			
	
}
//Set mail box capacity 
public void setMailboxCapacity(int capacity)
{
	this.MailBoxCapacity=capacity;
}


//set alternative email
public void setAlterEmail(String altEmail)
{
	this.AlternativeMail=altEmail;
}

//set change password
public void changePassword(String password)
{
	this.Password=password;
}
public int getmailboxCapacity() { 	return MailBoxCapacity;}
public String getAlterEmail() {return AlternativeMail;}
public String getPassword() {return Password;}

public String ShowInfo()
{
	return "Display Name:"+Firstname +" "+LastName+
			"\n Company Eamil:"+ email +
			"\n Mail Box Capacity: "+MailBoxCapacity+"mb";
}
}
