class Student { 
    int rollno;
    String name;
    int marks;   // These are the instance varaible because they belongs to a class not a method
}

public class enhancedLoop {
    public static void main (String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Abhi";
        s2.marks = 48;
        
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Manish";
        s3.marks = 18;
        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println("This is S1 ==>" + s1.name + " "  + "Marks is " + s1.marks + " " + "Roll Number is " + s1.rollno);
        System.out.println("This is S1 ==>" + s2.name + " "  + "Marks is " + s2.marks + " " + "Roll Number is " + s2.rollno);
        System.out.println("This is S1 ==>" + s3.name + " "  + "Marks is " + s3.marks + " " + "Roll Number is " + s3.rollno);
    
        int num[] = new int[4];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        for (Student stud: students) {
            System.out.println(stud.name + " " + " " + stud.marks);
        }
    } 
}
