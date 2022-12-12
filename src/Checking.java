public class Checking extends Account {
    //list properties specific to checking account
    int debitCardNumber;
    int debitCardPin;
    //construcotr to initilize checking account
    public Checking(String name, String ssn, double initDeposit){
        super(name,ssn, initDeposit);
        accountNumber = "5" + accountNumber;
        setDebitCard();

    }
    //list any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }
    //list any method specific to checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("your checking account features" +
                             "\n Debit card Nymber: " + debitCardNumber +
                               "\n Debit card pin :" + debitCardPin);

    }
}
