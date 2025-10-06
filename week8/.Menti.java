import java.util.List;
import java.util.ArrayList;

public class Menti {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        int i = 1;

        while (!list.contains(10)) {
            list.add(i * 2);
            i += 2;
        }

        System.out.println(list.size());
    }

}
