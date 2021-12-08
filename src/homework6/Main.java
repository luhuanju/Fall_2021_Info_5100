package homework6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int studentId=0;
        List<Student> students=new ArrayList<>();

        Student s1=new Student(studentId++, "Tony",3.5, parseDate("2011-02-14"));
        Student s2=new Student(studentId++, "Back",3.7, parseDate("1996-07-13"));
        Student s3=new Student(studentId++, "Com",3.0, parseDate("2002-03-23"));
        Student s4=new Student(studentId++, "Alex",3.4, parseDate("2005-06-17"));
        Student s5=new Student(studentId++, "Huanju",4.0, parseDate("1993-23-03"));

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("----------Sort by ascending order of 'name'-----------");
        //Sort by ascending order of 'name'
        Collections.sort(students, (a,b)->a.getName().compareTo(b.getName()));
//        System.out.println(Arrays.toString(students.toArray()));
//        students.stream().forEach(System.out::println);
        for (Student s: students) System.out.println(s.getName());

        System.out.println("----------Sort by descending order of 'gpa'-----------");
        //Sort by descending order of 'gpa'
        Collections.sort(students,(a,b)->(int)(b.getGpa()*10)- (int)(a.getGpa()*10));
        for (Student s: students) System.out.println(s.getGpa());


        System.out.println("----------Sort by ascending order of 'dateOfBirth'-----------");
        //Sort by ascending order of 'dateOfBirth'
        Collections.sort(students,(a,b)->a.getDateOfBirth().getYear()-b.getDateOfBirth().getYear());
        for (Student s: students) System.out.println(s.getDateOfBirth());
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
