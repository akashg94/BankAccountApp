

public class Svaings extends Account {
    //list properties to saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //constructor to initilize settings for the savings
    public Svaings (String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        setsafetyDepositBox();
    }
    private void setsafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your savings account features " +
                            "\n safety deposit box id:" + safetyDepositBoxID +
                             "\n safety deposit box key: " + safetyDepositBoxKey);
    }
}
