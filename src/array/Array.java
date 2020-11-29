
package array;


public class Array {

    public static void main(String[] args) {
     int max=100;
     HighArray a;
     a=new HighArray(max);
     a.insert(0);
     a.insert(11);
     a.insert(22);
     a.insert(33);
     a.insert(44);
     a.insert(55);
     a.insert(66);
     a.insert(77);
     a.insert(88);
     a.insert(99);
     a.display();
     int key=55;
     if(a.find(key))
         System.out.println("find the key"+key);
     else
         System.out.println("cannot find key");
     a.delet(11);
     a.delet(33);
     a.delet(44);
     a.display();
           
     
    }
    
}
