import java.util.ArrayList;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2); 
        list.add(3); 
        list.add(4);
        list.add(4,5);
        for(int i:list){System.out.println(i);}
        System.out.println(list.get(1));
        list.set(4, 5);
        for(int i:list){System.out.println(i);}
        list.remove(4);
        for(int i:list){System.out.println(i);}
        list.remove(Integer.valueOf(1));
        for(int i:list){System.out.println(i);}
        boolean is=list.contains(2);
        System.out.println(is);


    }
}
