class Student{
    int roll; // instance variables
    String name;
    double marks;

    void displayStd(){
        System.out.println("Name:"+name+", Roll:"+roll+", Marks:"+marks);
    }
}

class ArrraysObj {
    public static void main(Strings a[]){
        Student std1 = new Student(); // obj creation
        std1.roll = 1;
        std1.name = "Aakash";
        std1.marks = 50.0;

        Student std2 = new Student();
        std2.roll = 2;
        std2.name = "Mukesh";
        std2.marks = 90;

        Student students[] = new Student[2]; // array of obj
        students[0] = std1;
        students[1] = std2;

        for (Student student : students) {
            student.displayStd();
        }

        // for loop              for each
        // explicit index     manage internaly
        // modify,add,remove    Strictly read-only
        // flexible            Strictly forward

    }    
}
