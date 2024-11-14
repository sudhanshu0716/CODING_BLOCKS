package lec_34;

public class student {
    String name;
    int age;
    public void Intro(){
        System.out.println("My name is "+this.name+" and age is "+this.age);
    }
    public void sayhi(String name){
        System.out.println(this.name+" say hii "+name);
    }
    public static void mentor(){
        System.out.println("mentor name is qwerty");// ander datamember call nhi kr skte!!!
    }
    static{
        System.out.println("i am in static block");//pehli baar main hai chl jayega tb student s=new studet() krenge tbhi
    }
    static{
        System.out.println("i am in static block2");//pehli baar main hai chl jayega tb student s=new studet() krenge tbhi
    }
}
