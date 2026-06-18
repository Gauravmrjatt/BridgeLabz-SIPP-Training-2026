class InsufficientBalanceException extends Exception {
    private double requestedAmount;
    private double accountBalance;

    public InsufficientBalanceException(String message, double requested, double balance) {
        super(message);
        this.requestedAmount = requested;
        this.accountBalance = balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}

class ATMWithdrawal {
    private double balance = 5000.0;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new InsufficientBalanceException("Withdrawal amount cannot be negative", amount, balance);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal", amount, balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        ATMWithdrawal atm = new ATMWithdrawal();
        try {
            atm.withdraw(8000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
            System.out.println("Requested: " + e.getRequestedAmount());
            System.out.println("Current Balance: " + e.getAccountBalance());
        }
    }
}