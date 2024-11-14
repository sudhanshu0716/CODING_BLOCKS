package lec_34;

public class student_client {
    public static void main(String[] args) {
        System.out.println("hello");
        student s=new student();
        s.name="kaju";
        s.age=19;
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro();
        s.sayhi("madhav");
        student  s1=new student();
        s1.name="kunal";
        s1.age=22;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.Intro();
        s.Intro();
        student.mentor();
        s1.mentor(); //chal jayega pr warning dega!!!
        
    }
    
}
