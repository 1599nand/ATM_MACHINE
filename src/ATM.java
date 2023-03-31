
public class ATM {
      private double balance;//to see balance available
      private double deposite;//to set how much to deposit
      private double withdrawn;//to see amount that have been withdrawn
       
      //default constructor
       public ATM()
       {
    	   
       }
     //getter setter Methods
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	public double getWithdrawn() {
		return withdrawn;
	}

	public void setWithdrawn(double withdrawn) {
		this.withdrawn = withdrawn;
	}
       
       
}
