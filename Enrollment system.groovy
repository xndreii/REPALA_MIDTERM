class Person {
    String name;
    int age;
//Construction to initializes name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// Display's name and age
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
// Information of student
class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;
    //Instructor's information input
    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
// Calculates the total unit fee
    double calculateFees() {
        return units * feePerUnit;
    }

    //output of the students
    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + 
                           ", Student ID: " + studentID + ", Course: " + course + 
                           ", Units: " + units + ", Total Fee: " + calculateFees());
    }
}
//Information of instructor
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;
    //Instructor's information
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //info outputs
    void displayInfo() {
        System.out.println("Instructor Name: " + name + ", Age: " + age + 
                           ", Employee ID: " + employeeID + ", Department: " + department + 
                           ", Salary: " + salary);
    }
}
//Class to demonstrate polymorphism
public class EnrollmentSystem {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        //student's information outputs
        Student student1 = new Student("Joseph", 20, "231000325", "Computer Science", 5);
        Student student2 = new Student("Mae ann", 19, "231000322", "Mathematics", 4);

        //instructor's information outputs
        Instructor instructor1 = new Instructor("Dr. Trixx", 45, "E001", "CEA", 40000);
        Instructor instructor2 = new Instructor("Prof. Angelo", 50, "E002", "CEA", 50000);

        //Display's information for each person
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}