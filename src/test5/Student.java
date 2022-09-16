package test5;

public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDrection() {
        return String.format(" a student majoring in "+ major);
    }
}
