public class Student {

    String name;
    String lastName;
    int[] grades = {};

    public Student(String studentsName, String lastName) {
        name = studentsName;
        this.lastName = lastName;
    }

    public void printName() {
        System.out.println(name + " " + lastName);
    }

    public void study() {
        System.out.println("I am studying");
    }

    public void failClass() {
        System.out.println("I failed");
    }

    public void graduate() {
        System.out.println("I graduated");
    }

}
