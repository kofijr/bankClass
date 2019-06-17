import java.util.Scanner;
class Atm{
	public static boolean Account() {
		boolean joan=false;
		System.out.println("Please enter your pin");
		
		Scanner scanner = new Scanner(System.in);
		int userpin = scanner.nextInt();
		int storedpin = 1234;
		if (userpin == storedpin) {
			joan=true;
			System.out.println("continue");
		}
		return joan;
	}
	
	public static void Transaction() {
		double balance=2000;
		
		System.out.println("Press 1 to check balance");
		System.out.println("Press 2 to make deposit");
		System.out.println("Press 3 to make a withdrawal");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		if (input == 1) {
			System.out.println("Your balance is : " + balance);
			
		}
		else if (input == 2) {
			System.out.println("Make a deposit");
			double deposit = scanner.nextDouble();
			
			if (deposit > 0) {
				System.out.println("Deposit successful");
				balance+=deposit;
				System.out.println("Your current balance is: " + balance);
			}
			else {
				System.out.println("Try another transaction");
			}
		}
		else if (input == 3) {
			System.out.println("Withdraw cash");
			double amount = scanner.nextDouble();
			if (amount <= balance) {
				balance-=amount;
				System.out.println("Withdrawal successful");
				System.out.println("Your new balance is: " + balance);
			}
			else {
				System.out.println("Insufficient fund");
			}
		}
	}
	public static void main(String[] args) {
		//Account();
		//Transaction();
		boolean pininsystem = Account();
		if(pininsystem==true){
			Transaction();
		}
		else
			System.out.println("you entered an invalid pin");
	
	}
}