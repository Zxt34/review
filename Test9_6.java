import java.util.ArrayList;
import java.util.List;

public class Test9_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        list.add(5);
//        list.add(6);
        System.out.println(get_list(list));
    }

    public static List<ArrayList<Integer>> get_list(List<Integer> L){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int i = 1;
        while(!L.isEmpty()){
            if(L.size() < i){
                break;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j++){
                list.add(L.get(0));
                L.remove(0);
            }
            lists.add(list);
            i++;
        }
        return lists;
    }
}