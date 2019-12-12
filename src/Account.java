public abstract class Account implements IBaseRate {

    //List common properties for savings and checkings
    String name;
    String ssn;
    double balance;
    static int index = 1000;

    String accountNumber;
    double rate;

    //constructor to set base properties
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        System.out.println("Name :" + name + " " + "SSN :" + ssn + " "+ "Balance: $" + balance);

        //set account number
        index++;
        this.accountNumber = setAccountNumber();

        System.out.println("Account Number : " + this.accountNumber);
    }
        private String setAccountNumber(){
            String lastTwoOfssn = ssn.substring(ssn.length()-2, ssn.length());
            int uniqueID = index;
            int randomNumber = (int) ( Math.random() * Math.pow(10,3));

            return lastTwoOfssn + uniqueID + randomNumber;
        }
        //list common methods
       public void showInfo(){
           System.out.println(
                   "NAME:" + name +
                           "\nAccount Number " + accountNumber +
                           "\nBalance: " + balance );


       }


    }

