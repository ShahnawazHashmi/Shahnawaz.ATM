package myPackage;
import java.util.Scanner;
public class AtmMachine 
{
  private double totalBal = 1000;
  Scanner sc = new Scanner(System.in);
  public int userAccount()
  {
	  System.out.println("Enter Your Account Number : ");
	  int account;
	  account = sc.nextInt();
	  return account;
  }
  public int userPin()
  {
	  System.out.println("Enter Your Pin Number : ");
	  int pin;
	  pin = sc.nextInt();
	  return pin;
  }
  
  public void drawMainMenu()
  {
	  int selection;
	  System.out.println("\nATM main menu : ");
	  System.out.println("1 - Veiw Account balance");
	  System.out.println("2 - Withdrawal Amount");
	  System.out.println("3 - Deposit Amount");
	  System.out.println("4 - Terminate Transaction");
	  System.out.println(" Select A Button : ");
	  selection = sc.nextInt();
	  
	  switch(selection)
	  {
	  case 1:
		  veiwAccountInfo();
		  break;
	  case 2 :
		  withdrawal();
	      break;
	  case 3:
		  addFunds();
		  break;
	  case 4:
		  System.out.println("     Thankyou For Using Shahnawaz ATM !!!!!! Have a Good Day   ");
		  
	  }
  }
  public void startAtm()
  {
	  userAccount();
	  userPin();
	  drawMainMenu();
  }
 
  public void veiwAccountInfo()
  {
	  System.out.println("Account Information :");
	  System.out.println("\t-- Total balance : rupees" +totalBal);
	  drawMainMenu();
  }
  public void deposit(int depAmount)
  {
	  System.out.println("\n***Your Amount is Deposited...***");
	  totalBal=totalBal+depAmount;
	  
  }
  public void checkNsf(int withdrawalAmount)
  {
	  if(totalBal - withdrawalAmount<0)
		  System.out.println("\nYou Don't Have Sufficient Ammount to Withdrwal");
	  else 
	  {
		  totalBal = totalBal - withdrawalAmount;
		  System.out.println("Please Wait a moment Your Transaction is Processing ..... ");
		  System.out.println("Please take Your Money Now...!!! Enjoy");
	  }
	  
  }
  public void withdrawal()
  {
	  int withdrawalSelection;
	  System.out.println("Withdrawal money :");
	  System.out.println("1 - 100rupees");
	  System.out.println("2 - 500rupees");
	  System.out.println("3 - 1000rupees");
	  System.out.println("4 - 10000rupees");
	  System.out.println("5 - Back to main menu");
	  System.out.println("Select A  Button : ");
	  withdrawalSelection = sc.nextInt();
	  switch(withdrawalSelection)
	  {
	  case 1:
		  checkNsf(100);
		  drawMainMenu();
		  break;
	  case 2:
		  checkNsf(500);
		  drawMainMenu();
		  break;
	  case 3:
		  checkNsf(1000);
		  drawMainMenu();
		  break;
	  case 4:
		  checkNsf(10000);
		  drawMainMenu();
		  break;
	  case 5:
		  drawMainMenu();
		  break;
		  
	  }
  }
  public void addFunds()
  {
	  int addSelection;
	  System.out.println("Deposit Funds :");
	  System.out.println("1 - 1000rupees");
	  System.out.println("2 - 2000rupees");
	  System.out.println("3 - 10000rupees");
	  System.out.println("4 - 20000rupees");
	  System.out.println("5 - Back to main menu");
	  
	  System.out.println("Select A Button :");
	  addSelection = sc.nextInt();
	  switch(addSelection)
	  {
	  case 1:
		  deposit(1000);
		  drawMainMenu();
		  break;
	  case 2:
		  deposit(2000);
		  drawMainMenu();
		  break;
	  case 3:
		  deposit(10000);
		  drawMainMenu();
		  break;
	  case 4:
		  deposit(20000);
		  drawMainMenu();
		  break;
	  case 5:
		  drawMainMenu();
		  break;
	  }
  }
  public static void main(String[] args)
  {
	  AtmMachine myAtm = new AtmMachine();
	  myAtm.startAtm();
	  
	  
  }
  
}
