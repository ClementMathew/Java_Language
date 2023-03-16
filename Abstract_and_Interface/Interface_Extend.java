
// Extending Interface

public class Interface_Extend {
    public static void main(String args[]) {
        Student s1 = new Student("GECW", "CSE");

        System.out.println("College Name : " + s1.collegeName);
        System.out.println("Department Name : " + s1.departmentName);
    }
}

interface College {
    public String getCollegeName();
}

interface Department extends College {
    public String getDepartmentName();
}

class Student implements Department {
    String collegeName;
    String departmentName;

    Student(String collegeName, String departmentName) {
        this.collegeName = collegeName;
        this.departmentName = departmentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}