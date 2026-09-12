public class StudentManager {
    private Student[] database;
    private int studentCount;

    StudentManager(int capacity){
        this.database = new Student[capacity];
        this.studentCount = 0;
    }
    public boolean addStudent(int id, String name, String course, double cgpa){
        if(studentCount>= database.length){;
            return false; 
        }
        if(isIdExist(id)){
           return false; 
        }
        database[studentCount] = new Student(id, name, course, cgpa);
        studentCount++;
        return true;    // successfully added
    }
    public void viewStudents(){
        System.out.println("======================");
        for (int i = 0; i < studentCount; i++) {
            if (database[i] != null) {
                System.out.print("|");
                System.out.println(database[i]);
            }
        }
        System.out.println("======================");
    }
    public boolean updateStudent(int id,String name,String course,double cgpa){
        for (int i = 0; i < studentCount; i++) {
            if(database[i] != null && database[i].getId()==id){
                database[i].setName(name);
                database[i].setCourse(course);
                database[i].setCgpa(cgpa);
                return true;    // student found
            }
        }
        return false;   // not found
    }

    public boolean deleteStudent(int id){
        for (int i=0; i<studentCount; i++) {
            if(database[i]!= null && database[i].getId()==id){
                
                // shift loop
                for(int j=i; j<studentCount-1; j++){
                    database[j] = database[j+1];
                }
                database[studentCount-1] = null;
                studentCount--;
                return true;    // found & deleted
            }
        }
        return false;   // not found
    }

    public void findStudent(int id){
        for (int i=0; i<studentCount; i++) {
            if(database[i] != null && database[i].getId()==id){
                System.out.println(database[i]);
                return;
            }
        }
        System.out.println("Record Not Found OOPS...");
    }
    private boolean isIdExist(int id){
        for (int i = 0; i < studentCount; i++) {
            if (database[i]!=null && database[i].getId()==id) {
                return true;
            }
        }
        return false;
    }
}
