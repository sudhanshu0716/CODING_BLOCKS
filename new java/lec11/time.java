package lec11;

public class time {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000_000;i++){

        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    
}
