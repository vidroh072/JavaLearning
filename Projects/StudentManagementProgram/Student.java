public class Student {
    private int id;
    private String name;
    private String course;
    private double cgpa;
    
    Student(int id, String name, String course, double cgpa){
        this.id = id;
        this.name = name;
        this.course = course;
        this.cgpa = cgpa;
    }
    public double getCgpa() {
        return cgpa;
    }public String getCourse() {
        return course;
    }public int getId() {
        return id;
    }public String getName() {
        return name;
    }
    // Setter
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "ID: %d, Name: %s, Course: %s, CGPA: %.2f\n".formatted(id,name,course,cgpa);
    }

}
