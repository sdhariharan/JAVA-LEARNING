class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    public int getAge() {
        return age;
    }

    public void setid(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setid'");
    }

    public void setgender(String gender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setgender'");
    }

    public void setcourse(String course) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setcourse'");
    }

    public void setmarks(int marks) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setmarks'");
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setAge(-5); // Invalid age
    }
}
