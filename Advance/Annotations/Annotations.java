package Annotations;
@Deprecated // marks classs, method file to warning that there is better way
interface Users{
    public void permission();
}
class admin implements Users{
    @Override 
    public void permission(){
        System.out.println("Can access Database and Systems..");
    }
}
class viewer implements Users{

    @Override   // give compile error if the override condition name change..
    public void permission() {
        System.out.println("You can access only dashboard..");
    }
    
}

public class Annotations {
    public static void main(String[] args) {
        Users user1 = new admin();
        Users user2 = new viewer();

        user1.permission();
        user2.permission();
    }
}
