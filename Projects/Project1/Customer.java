package Projects.Project1;

public class Customer {
    String name;
    double balance;
    private String pin;

    public Customer(String name,double balance,String pin){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }
    public String toString(){
        return """
                Name: %s Balance: %,.2f
                """.formatted(name,balance);

    }
}
