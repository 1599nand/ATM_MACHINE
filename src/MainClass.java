import java.util.Scanner;
public class MainClass {
	public static void main(String[] args)
	{      AtmOperationIntrf op = new AtmOperationImpl();
	    	//validation of user based on ATM Number and PIN
		  int atmNumber=12356;
		  int PIN=8877;
		  Scanner in = new Scanner(System.in);
		  System.out.println("WELCOME TO IZII BANK SOLUTIONS");
		  System.out.print("Enter Atm Number:");
		  int AtmNo=in.nextInt();
		  System.out.print("Enter Atm PIN:");
		  int pin=in.nextInt();
		  if((AtmNo==atmNumber)&&(PIN==pin))
		  {
			  while(true)
			  {
				  System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
				  System.out.print("Enter Choice : ");
				  int ch=in.nextInt();
				  if(ch==1)
				  {
					  op.viewBalance();
				  }
				  else if(ch==2)
				  {
					  System.out.println("Enter Amount To Withdraw");
					  double WithdrawAmount=in.nextDouble();
					  op.withdrawAmount(WithdrawAmount);
				  }
				  else if(ch==3)
				  {
					  System.out.println("Enter Amount To Deposit");
					  double depositeAmnt=in.nextDouble();
					  op.depositAmount(depositeAmnt);
					  
				  }
				  else if(ch==4)
				  {
					  op.viewMiniStatement();
				  }
				  else if(ch==5)
				  {
					  System.out.println("Please Collect your card\nThank You For Using IZII BANK SOLUTIONS");
					  System.exit(0);
				  }
				  else
				  {
					  System.out.print("Enter Correct Choice Siirr");
				  }
			  }
		  }
		  else
		  {
			  System.out.print("INVALID USER");
			  System.exit(0);
		  }
		  
	}

}
