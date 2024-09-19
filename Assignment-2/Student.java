public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name); 
        setGrade(grade); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty. Default name 'Unknown' is set.");
            this.name = "Unknown"; 
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100. Setting default grade to 0.");
            this.grade = 0; 
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("gaurav", 35);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Grade: " + student1.getGrade());

        Student student2 = new Student("", 29);
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Grade: " + student2.getGrade());

        student2.setName("gaurav");
        student2.setGrade(82);
        System.out.println("Updated Student Name: " + student2.getName());
        System.out.println("Updated Student Grade: " + student2.getGrade());

        student2.setName("");
        student2.setGrade(-15);
        System.out.println("Final Student Name: " + student2.getName());
        System.out.println("Final Student Grade: " + student2.getGrade());;

    }
}
