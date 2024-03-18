package bank;
import java.util.Date;
import java.text.CharacterIterator;
import java.util.Scanner;
public class account {
	int balance;
	int prevTransaction;
	String customerName;
	String customerID;
	account (String cname, String cid) {
		customerID = cid;
		customerName = cname;
	}
	void deposit (int amount) {
		if (amount !=0 && amount >0);{
			balance = balance + amount ;
			prevTransaction = amount ; }
		}
		void withdraw (int amount){
			if (amount !=0) {
				balance = balance - amount;
				prevTransaction = amount ;	}
			}
			void getprevTransaction() {
				if (prevTransaction > 0) {
					System.out.println("Deposited: " + prevTransaction);
				} else if (prevTransaction < 0) {
					System.out.println("withdraw:" + Math.abs(prevTransaction));
				} else {
					System.out.println("No Transaction occured"); {
					}
					}
					}
					void showdate() {
						Date today = new Date();
						System.out.println(today.toString());
					}
				void showMenu () {
					char option = '\0';
					Scanner scanner = new Scanner(System.in);
					System.out.println("welcom ," + customerName + "!");{
					System.out.println("your ID is: " + customerID);
					System.out.println();
					System.out.println("what would you like to do ?");
					System.out.println();
					System.out.println("A:check your Balance");
					System.out.println("B:make a deposit");
					System.out.println("C:make a withdraw");
					System.out.println("D:view prevTransaction");
					System.out.println("S:show Date");
					System.out.println("E:exit");	
				}
					do {
						System.out.println();
						System.out.println("please enter an option: ");
						char option1 = scanner.next().charAt(0);
						option = Character.toUpperCase(option1);
						System.out.println();
						switch(option) {
						case 'A':
							System.out.println(" ======== ");
							System.out.println("balance = $" + balance);
							System.out.println(" ======== ");
							break;
						case 'B':
							System.out.println("enter an amount to deposit: ");
							int amount = scanner.nextInt();
							deposit (amount);
							break;
						case 'C':
							System.out.println("enter an amount to withdraw: ");
							int amount2=scanner.nextInt();
							withdraw (amount2);
							break;
						case 'D':
							System.out.println(" ======== ");
							getprevTransaction();
							System.out.println(" ======== ");
							break;
						case 'S':
							 System.out.println(" ======== ");
							 showdate();
							 System.out.println(" ======== "); 
							break;
						case 'E':
							System.out.println(" ======== ");
							break;
							default:
								System.out.println("Error:Invalid option . please enter A,B,C,D,S");
								break;
						}
					}while(option !='E');
					System.out.println("thank you for using our ATM");
					}
			
			}


