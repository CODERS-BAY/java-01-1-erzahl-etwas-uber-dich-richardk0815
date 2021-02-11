import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String vorname = "Richard";
        String surname = "Kolm";
        int age = 49;
        String gender = "male";
        Date dayOfBirth = new Date(63154800000L);
        int gradePointAverage = 3;
        boolean married = false;
        System.out.println("Hello! i am " + vorname + " " + surname);
        System.out.println("My age is " + age);
        System.out.println("My gender is " + gender);
        System.out.println("My day of birthday is " + dayOfBirth);
        System.out.println("My grade point average is " + gradePointAverage);
        System.out.println("My status of marital is " + married);

    }
}