import java.util.Scanner;

interface Ug {
    void Searchstudentbyid(Student[] s, int n, int id);
}

interface Pg {
    void updatestudentdetail(Student[] s, int n, int id, Scanner sc);
}

abstract class rules {
    abstract void Addstudent(Student[] s, int n, Scanner sc);
    abstract void Displayallstudent(Student[] s, int n);
    abstract void Deletestudent(Student[] s, int n, int id);
}

class Student extends rules implements Ug, Pg {
    private int id, age, marks;
    private String name, course, gender;

    Student(int id, String name, int age, String gender, String course, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.marks = marks;
    }

    public int getid() {
        return id;
    }

    public void setid(Student[] s, int id, int n) {
        for (int i = 0; i < n; i++) {
            if (s[i] != null && s[i].getid() == id) {
                System.out.println("Duplicate ID not allowed");
                return;
            }
        }
        this.id = id;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setmarks(int marks) {
        this.marks = marks;
    }

    public int getmarks() {
        return marks;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public String getcourse() {
        return course;
    }

    @Override
    public void Addstudent(Student[] s, int n, Scanner sc) {
        int id, age, marks;
        String name, gender, course;

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        gender = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        s[n] = new Student(id, name, age, gender, course, marks);
        System.out.println("Student Added Successfully");
    }

    public void Displayallstudent(Student[] s, int n) {
        if (n == 0) {
            System.out.println("No Students Available");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("ID: " + s[i].getid());
            System.out.println("Name: " + s[i].getname());
            System.out.println("Age: " + s[i].getage());
            System.out.println("Gender: " + s[i].getgender());
            System.out.println("Course: " + s[i].getcourse());
            System.out.println("Marks: " + s[i].getmarks());
        }
    }

    public void Deletestudent(Student[] s, int n, int id) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (s[i].getid() == id) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Student ID not found");
            return;
        }

        for (int i = pos; i < n - 1; i++) {
            s[i] = s[i + 1];
        }

        System.out.println("Student Deleted Successfully");
    }

    public void updatestudentdetail(Student[] s, int n, int id, Scanner sc) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (s[i].getid() == id) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Student ID not found");
            return;
        }

        int choice;
        do {
            System.out.println("\n1.Name  2.Gender  3.Course  4.Age  5.Marks  6.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    s[pos].setname(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter Gender: ");
                    s[pos].setgender(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter Course: ");
                    s[pos].setcourse(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Age: ");
                    s[pos].setage(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Marks: ");
                    s[pos].setmarks(sc.nextInt());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 6);
    }

    public void Searchstudentbyid(Student[] s, int n, int id) {
        for (int i = 0; i < n; i++) {
            if (s[i].getid() == id) {
                System.out.println("ID: " + s[i].getid());
                System.out.println("Name: " + s[i].getname());
                System.out.println("Age: " + s[i].getage());
                System.out.println("Gender: " + s[i].getgender());
                System.out.println("Course: " + s[i].getcourse());
                System.out.println("Marks: " + s[i].getmarks());
                return;
            }
        }
        System.out.println("Student ID not found");
    }
}

public class Student_mangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[100];
        int n = 0;

        Student obj = new Student(0, "", 0, "", "", 0);

        while (true) {
            System.out.println("\n1.Add  2.Update  3.Delete  4.Search  5.Display  6.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.Addstudent(s, n, sc);
                    n++;
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    obj.updatestudentdetail(s, n, sc.nextInt(), sc);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    obj.Deletestudent(s, n, sc.nextInt());
                    n--;
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    obj.Searchstudentbyid(s, n, sc.nextInt());
                    break;
                case 5:
                    obj.Displayallstudent(s, n);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
