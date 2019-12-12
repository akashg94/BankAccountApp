public class BankAccountAppMain {
    public static void main(String[] args) {



        Checking check1 = new Checking("Akash Ghosh", "012345678", 1500);
        Svaings save1 = new Svaings("Sujoy Bhowmik", "512782682", 2500);
        save1.showInfo();
        System.out.println("***************************");
        check1.showInfo(); 

     //  List<String[]> newAccountHolder = utilities.CSV.read(file);
    }
}