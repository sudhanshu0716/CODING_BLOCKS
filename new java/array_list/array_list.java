package array_list;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        //isme size nhi dena hota auto grow hoti h 
        ArrayList<Integer> l=new ArrayList<>();
        //array list ko import krna pdta h 
        //array list ka size 10 hota h 
        //jab array list ka size bdana hota h to new capacity=old capcity+(old capcity)/2 new bnane ke baad purana data new m cpy ho jata h 
        System.out.println(l);
        //get
        //set
        //size
        //add
        //remove
        l.add(20);
        l.add(10);
        l.add(90);
        l.add(230);
        l.add(24);
        System.out.println(l);
        l.add(2,99);//iski complexity n order ki hoti
        System.out.println(l);
        System.out.println(l.get(2));
        l.remove(2);//iski complexity n order ki hoti
        System.out.println(l);
        l.set(0, 5555);//ye sirf value swap kr deta h
        System.out.println(l);
    }
    for(int i=0;i<l.size();i++){
        System.out.println();
    }

}

