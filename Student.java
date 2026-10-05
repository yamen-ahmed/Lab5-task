public class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    Student higher(Student s) {
        if (s.marks > this.marks) {
            return s;
        } else {
            return this;
        }
    }

    
    void display(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].id + " " + students[i].name + " " + students[i].marks);
        }
    }

    
    Student highest(Student[] students) {
        Student top = students[0];

        for (int i = 1; i < students.length; i++) {
            top = top.higher(students[i]);
        }
        return top;
    }

    
    Student findById(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].id == id) {
                return students[i];
            }
        }
        return null;
    }

    
    double average(Student[] students) {
        double total = 0;

        for (int i = 0; i < students.length; i++) {
            total = total + students[i].marks;
        }
        return total / students.length;
    }
}
