package homework6;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
