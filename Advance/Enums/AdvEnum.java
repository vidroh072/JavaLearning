package Enums;

enum TraficLight {
    // enum constants..
    RED("STOP"),
    YELLOW("WAIT"),
    GREEN("GO");

    // field must - by default private final
    private final String action;

    // Constructor - Must be private or package-private
    TraficLight(String action) {
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }
}
enum Permissions{
    ADMIN(true,true),
    EDITOR(true,false),
    VIEWER(false,false);

    boolean canEdit,canDelete;
    private Permissions(boolean canEdit,boolean canDelete){
        this.canEdit = canEdit;
        this.canDelete = canDelete;
    }
    public boolean canEdit(){
        return canEdit;
    }
    public boolean canDelete(){
        return canDelete;
    }
}
public class AdvEnum {
    public static void main(String[] args) {
        TraficLight action = TraficLight.RED;        
        // Java Enums solve this by forcing compile-time safety
        // we can only pick from the predefined list.

        // Real-World Problem: 
        // User Role Management - building an application with three types of users
        // - Admin, Editor, and Viewer. Each role has different dashboard permissions.

        Permissions user = Permissions.EDITOR;
        checkPermision(user);
    }
    // It ensures only valid roles get in
    public static void checkPermision(Permissions user){
        if (user.canDelete) {
            System.out.println("You Can Delete & Edit file");   
        }else if(user.canEdit){
            System.out.println("You cannot Delete but Can EDIT");
        }else{
            System.out.println("You cannot EDIT & DELETE");
        }
    }
}
