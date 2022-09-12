import java.util.Scanner; 

interface check //here i use interface to hide display() method.
{
	void display();
}

class ATM  //This is main class
{
	
	public static void main(String[] args) // main method.
	{
		
		Scanner input=new Scanner(System.in); //here i created the object of class scanner.

		System.out.println("Who are you 1-Coustomer or 2-Administrator"); //when proggram starts first it will chech the user he is coustomer or Administrator
	    int  ChecksUser=input.nextInt();

		if(ChecksUser==1)  // this code will executed the when user is coustomer.
		{
		System.out.println(" ");
		CustomerMenu CMObject=new CustomerMenu();//here i created the object for Coustomer manu class.
		CMObject.EnterIDpincode();//here i am accessing all methods of the class throught its object.
		CMObject.checksIDpincode();
		CMObject.display();
	    }
 
        else if (ChecksUser==2)//user is Administrator this will executed when 
        {
        System.out.println(" ");
		AdministratorManu AMObject=new AdministratorManu();//here i  created the object for Administrator manu class.
		AMObject.EnterIDpincode();
		AMObject.checksIDpincode();//here i am accessing all methods of the class throught its object.
		AMObject.display();
        }
            
	}
}

class loginScreen//the function of this class is only to display login Screen
{   
	
	int ID,pincode,counter=0;
    Scanner input=new Scanner(System.in);

	void EnterIDpincode() //this method will take ID and Pincode from user as input
	{
     System.out.print("Enter User ID: ");
      ID=input.nextInt();

     System.out.print("Enter Pin code: ");
      pincode= input.nextInt();
    }

    void checksIDpincode()//this method checks the ID and PINcode entered by user
    {
    	
    	for(int i=1;i<=2;i++)//here i used for loop only for because when the user input wrong ID or pincode 3 time it will disable to move further.
    	{
    	  if(ID==1234 && pincode==5678)//here i already given the ID anf Pincode the user should have to input this same values.
    	  {
    		System.out.println("");
    		break; //i use here break statement because i want whenever user input correct userID and Pincode it will not ask again to enter the pincode an ID means to stop loop 
    		
    	   }

    	  else//this will executd whe user input wrong ID or pincode.
    	  {
    		System.out.println("ID or pincode is incorrect");
    		counter++;
    		System.out.println("Please re_enter the ID and Pincode");
    		loginScreen ls=new loginScreen();
    		ls.EnterIDpincode();
    		if(counter==2)//counter will checks when user input wrong values 3 times then this block will also executed.
    		{
    		  System.exit(0);//this will exit from proggrame.
              System.out.println("  ");
    	    }
    	  }
        }
    }
}


class CustomerMenu  extends loginScreen  implements check //this is class to display manu for coustomer which is extendig the loginscreen class and implementing the interface.
{
  
   public	void display()//displaying manu for coustomer
	{
	  int BALANCE=30000;//int initialized value for balance
	  System.out.println("1.Withdraw cash");
	  System.out.println("2.Transfer cash");//it display menu
	  System.out.println("3.Deposit cash");
	  System.out.println("4.Display balance");
	  System.out.println("5.Exit");
	  System.out.println();
	  System.out.println("Please slect anyone option from the above:");
	  int option = input.nextInt();
    

      switch (option)
        {
    	 case 1:
    	
    	    System.out.println("1.Fast cash");
    	    System.out.println("2.Normal cash");
    	    System.out.println();
    	    System.out.println("Please slect a mode for withdraw");
    	    int mode = input.nextInt();
    	    if (mode==1)
    	    {
    	    	String Y="Y";
    	    	String y="y";
                 System.out.println("1---500");
                 System.out.println("2---1000");
                 System.out.println("3---2000");
                 System.out.println("4---5000");
                 System.out.println("5---10000");
                 System.out.println("6---15000");
                 System.out.println("7---20000");
                 System.out.println();
                 System.out.println("Slect one of the denomination of money:");
                 int denomination = input.nextInt();
                   switch(denomination)
                   {
                    	case 1:
                   	     System.out.println("Are you sure you want to withdraw 500 (Y/N)");
                   	     input.nextLine();
                   	     String surity = input.nextLine();
                   	        if (surity.charAt(0) == Y.charAt(0) || surity.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-500;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:500");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        }
                   	        break;

                    	case 2:
                   	     System.out.println("Are you sure you want to withdraw 1000 (Y/N)");
                   	     input.nextLine();
                   	     String surity0 = input.nextLine();
                   	        if (surity0.charAt(0) == Y.charAt(0) || surity0.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-1000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:1000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        } 
                   	        break;
                   	        
                   	    case 3:
                   	     System.out.println("Are you sure you want to withdraw 2000 (Y/N)");
                   	     input.nextLine();
                   	     String  surity1 = input.nextLine();
                   	        if (surity1.charAt(0) == Y.charAt(0) || surity1.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-2000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:2000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        }
                   	        break;
                   	        
                   	    case 4:
                   	     System.out.println("Are you sure you want to withdraw 5000 (Y/N)");
                   	     input.nextLine();
                   	     String surity2 = input.nextLine();
                   	        if (surity2.charAt(0) == Y.charAt(0) || surity2.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-5000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:5000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        }
                   	        break;
                   	        
                    	case 5:
                   	     System.out.println("Are you sure you want to withdraw 10000 (Y/N)");
                   	     input.nextLine();
                   	     String surity3 = input.nextLine();
                   	        if (surity3.charAt(0) == Y.charAt(0) || surity3.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-10000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:10000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        }
                   	        break;

                    	case 6:
                   	     System.out.println("Are you sure you want to withdraw 15000 (Y/N)");
                   	     input.nextLine();
                   	     String surity4 = input.nextLine();
                   	        if (surity4.charAt(0) == Y.charAt(0) || surity4.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-15000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:15000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        }
                   	        break;
                   	        
                    	case 7:
                   	     System.out.println("Are you sure you want to withdraw 20000 (Y/N)");
                   	     input.nextLine();
                   	     String surity5 = input.nextLine();
                   	        if (surity5.charAt(0) == Y.charAt(0) || surity5.charAt(0)==y.charAt(0))
                   	        {
                   	        	BALANCE=BALANCE-20000;
                   	        	System.out.println("cash succefully withdrawn!");
                   	        	System.out.println("");
                   	            System.out.println("Do you wish to print receipt (Y/N)");
                   	            input.nextLine();
                   	            String s=input.nextLine();

                   	            if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                   	            {
                                  System.out.println("Account#12");
                                  System.out.println("Date: 16/4/2021");
                                  System.out.println("Withdrawn:20000");
                                  System.out.println("Balance:"+BALANCE);
                   	            }
                   	          
                   	        }
                   	        else
                   	        {
                   	        	System.out.println("it is ok do not worry if you not want to withdraw any cash");
                   	        } 

                   	       
                   	        break;                                            
                   }


    	    }


              else if (mode==2)
              {
              	String Y="Y";
    	    	String y="y";
              	System.out.println("please enter the withdrawal ammount");
              	int withdrawalammount=input.nextInt();
              	BALANCE=BALANCE-withdrawalammount;
              	System.out.println("Cash succefully withdrawn!!");
              	System.out.println("");
                System.out.println("Do you wish to print receipt (Y/N)");
                input.nextLine();
                String s=input.nextLine();

                if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                {
                    System.out.println("Account#12");
                    System.out.println("Date: 16/4/2021");
                    System.out.println("Withdrawn:"+withdrawalammount);
                    System.out.println("Balance:"+BALANCE);
                }

              }
    	    break;

         case 2:
           String Y="Y";
    	   String y="y";
           System.out.println("Enter the ammount in multiple of 500: ");
           int T_Amount=input.nextInt();
           System.out.println("enter the account number to which you want to transfer the the ammount");
           int A_number=input.nextInt();
           System.out.println("enter the account number to which you want to transfer the the ammount again");
           A_number=input.nextInt();
           System.out.println("The name of this account holder is Rano Mal");
           System.out.println("You wish to transfer RS "+T_Amount+" in account held by Mr XYZ, if this information is correct please re inter the account number: ");
           A_number=input.nextInt();
           BALANCE=BALANCE-T_Amount;
           System.out.println("Transcation is confirmed");

           System.out.println("");
           System.out.println("Do you wish to print receipt (Y/N)");
           input.nextLine();
           String s=input.nextLine();

                if(s.charAt(0) == Y.charAt(0) || s.charAt(0)==y.charAt(0))
                {
                    System.out.println("Account#"+A_number);
                    System.out.println("Date: 16/4/2021");
                    System.out.println("Amount transfered:"+T_Amount);
                    System.out.println("Balance:"+BALANCE);
                }
           break;

         case 3:
             Y="Y";
    	     y="y";
            System.out.println("Enter the cash ammount you want to deposit:");
            int D_Amount=input.nextInt();
            BALANCE=BALANCE-D_Amount;
            System.out.println("Cash deposited succefully");

           System.out.println("");
           System.out.println("Do you wish to print receipt (Y/N)");
           input.nextLine();
           String s1=input.nextLine();

                if(s1.charAt(0) == Y.charAt(0) || s1.charAt(0)==y.charAt(0))
                {
                    System.out.println("Account#12");
                    System.out.println("Date: 16/4/2021");
                    System.out.println("Amount deposited:"+D_Amount);
                    System.out.println("Balance:"+BALANCE);
                }
            break;


         case 4:
            System.out.println("enter the account number ");
            int A_number_DB=input.nextInt();
            System.out.println("Account#"+A_number_DB);
            System.out.println("Date: 13/4/2021");
            System.out.println("Balance="+BALANCE);
            break;


         case 5:
            System.exit(0);
            System.out.println("  ");
        }
    }
}



class AdministratorManu  extends loginScreen implements check 
{
	public void display()
	{ 

  		System.out.println("1:Creat new account");
		System.out.println("2:Delete existing account");
		System.out.println("3:Update account information");
		System.out.println("4:Search for account");
		System.out.println("5:View reports");
		System.out.println("6:Exit");

        System.out.println("");
		System.out.println("Please slect any one from the above");
		int option=input.nextInt();
		System.out.println("");

		switch(option)
		{
			case 1:
			    System.out.println("Enter some information");
			    input.nextLine();
			    System.out.println("Enter the Login ID: ");
			    String ID=input.nextLine();
			    System.out.println("Enter Pin code");
			    int PinCode=input.nextInt();
			    input.nextLine();
			    System.out.println("Account holder name");
			    String AH_Name=input.nextLine();
			    System.out.println("TYPE");
			    String TYPe=input.nextLine();
			    System.out.println("Enter starting balance");
			    int Balance=input.nextInt();
			    input.nextLine();
			    System.out.println("Status");
			    String STATUS=input.nextLine();
                System.out.println("The account number assigned is "+12);			    
			    break;


			case 2:
                System.out.println("Please enter the account number to which you want to delete the account: ");
                int Account_number=input.nextInt();
                System.out.println("Are you sure you want to delete the account held by Mr xyz  if this information is correct then re-enter the account number please");
                int Acount_number=input.nextInt();
                System.out.println("Account succefully deleted");
                break;

             case 3:
                 System.out.println("Enter the account number: ");
                 int A_number=input.nextInt();
                 System.out.println("Account#"+A_number);
                 System.out.println("Type:Saving");
                 System.out.println("Holder: Mr java dude");
                 System.out.println("Balance: 50,000");
                 System.out.println("Status: Disabled");

                 System.out.println("Please enter in the feilds you wish to update");
                 input.nextLine();
                 System.out.println("Login:");
                 String login=input.nextLine();
                 System.out.println("Pincode:");
                 int pincode=input.nextInt();
                 input.nextLine();
                 System.out.println("Holder name:");
                 String Holdername=input.nextLine();
                 System.out.println("Status");
                 String status=input.nextLine();
                 System.out.println("Your acount has been successfullly been updated");
                 break;


            case 4:
                 System.out.println("SEARCH MENU:");
                 System.out.println("Account number:");
                 input.nextLine();
                 String A_number2=input.nextLine();
                 System.out.println("User ID:");
                 String U_ID=input.nextLine();
                 System.out.println("Holders Name:");
                 String H_name=input.nextLine();
                 System.out.println("Type:");
                 input.nextLine();
                 String type=input.nextLine();
                 System.out.println("Balance");
                 int balance=input.nextInt();
                 input.nextLine();
                 System.out.println("Status");
                 String status1=input.nextLine();
                 System.out.println("====SEARCH RESULTS====");
                 System.out.println();
                 System.out.println("Account ID"+"   "+"User ID"+"   "+"Holder name"+"   "+"Type"+"   "+"Balance"+"   "+"Status");
                 System.out.println();
                 System.out.println("15"+"           "+"44045"+"       "+"Java Dude"+"      "+type+"   "+balance+"    "+status1);
                 System.out.println("18"+"           "+"43075"+"       "+"M. Umair"+"    "+type+"      "+balance+"     "+status1);
                 break;


            case 5:
                System.out.println("1--Accounts by ammount");
                System.out.println("2--Accounts by date");
                System.out.println("Please enter any one opyion from the above");
                int option1=input.nextInt();
                switch(option1)
                {
                	case 1:
                	    System.out.println("enter the maximum ammount:190112");
                	    System.out.println("enter the minimum ammount:12500");
                	    System.out.println("Account ID"+"   "+"User ID"+"   "+"Holder name"+"   "+"Type"+"   "+"Balance"+"   "+"Status");
                	    System.out.println("11"+"           "+"44045"+"       "+"PRQ M"+"      "+"Saving"+"   "+"12500"+"    "+"Active");
                	    System.out.println("24"+"           "+"43075"+"       "+"BZC RED"+"    "+"Saving"+"   "+"190111"+"   "+"Active");
                	    break;


                	case 2:
                	    System.out.println("Enter the Starting date: 12/12/2020");
                	    System.out.println("Enter the ending date: 19/12/2020");
                	    System.out.println("Transcation type"+"   "+"User ID"+"   "+"Holder name"+"   "+"Amount"+"   "+"Date");
                	    System.out.println("Cash Withdraw"+"       "+"44045"+"    "+"Bob jack"+"      "+"2500"+"     "+"17/12/2021");
                	    break;


                	case 6:
                       System.exit(0);
                       System.out.println("  ");
                }




		}

	}
}
