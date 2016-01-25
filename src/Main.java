import java.util.ArrayList;

/**
 * Created by 김영채 on 2016-01-25.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2, "d");
        String str = "e";
        list.add(str);

        if(list.remove(str)) {
            System.out.println("삭제됨");
        }

        System.out.println(list.get(0) + "을 찾았음");


        System.out.println(list);




    }
}
