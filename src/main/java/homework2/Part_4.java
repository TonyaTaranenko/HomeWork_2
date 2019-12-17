package homework2;

public class Part_4
{
    public static void main(String[] args) {
        BankAccount fooAcc = new BankAccount(987654321, 0);
        fooAcc.info();
        fooAcc.credit(9999.9);
        fooAcc.info();
        fooAcc.debit(999.9);
        fooAcc.info();
        fooAcc.debit(9999.9);
        fooAcc.info();
    }


    public static class BankAccount {
        private long _accountNumber;
        private double _balance;

        public BankAccount(long accountNumber, double balance) {
            this._accountNumber = accountNumber;
            this._balance = balance;
        }

        public void credit(double addValue) {
            this._balance += addValue;
        }

        public void debit(double subValue) {
            if (subValue > this._balance) {
                System.out.println("Сумма снятия больше чем остаток на счету!");
                return;
            }
            this._balance -= subValue;
        }

        public void info() {
            System.out.println("Account: " + this._accountNumber + "; Balance = " + this._balance);
        }
    }
}
