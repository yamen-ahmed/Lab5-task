public class Studentdemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(101, "Matthew", 98.5);
        students[1] = new Student(102, "Jessica", 97.5);
        students[2] = new Student(101, "Luke", 67.5);
        students[3] = new Student(101, "Danny", 91.5);
        students[4] = new Student(101, " Colleen", 90.5);

        System.out.println("All students: ");
        students[0].display(students);

        Student top = students[0].highest(students);
        System.out.println("Highest: " + top.name + " " + top.marks);

        Student found = students[0].findById(students, 103);
        if (found != null) {
            System.out.println("Found: " + found.name);
        } else {
            System.out.println("Students not found");
        }

        System.out.println("Average mark: " + students[0].average(students));
    }
}
