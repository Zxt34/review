import java.util.ArrayList;
import java.util.HashMap;

public class Test9_26 {
    public String solve (int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(String.valueOf(nums[j]).charAt(0) > String.valueOf(nums[i]).charAt(0)){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }else if(String.valueOf(nums[j]).charAt(0) == String.valueOf(nums[i]).charAt(0)){
                    int len = String.valueOf(nums[j]).length() >= String.valueOf(nums[i]).length() ? String.valueOf(nums[i]).length() : String.valueOf(nums[j]).length();
                    for (int k = 0; k < len; k++) {
                        if(String.valueOf(nums[j]).charAt(k) > String.valueOf(nums[i]).charAt(k)){
                            int temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        }
                    }
                }
            }
        }
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }

    public int[] LRU (int[][] operators, int k) {
        ArrayList<Integer> resList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < operators.length; i++) {
                if(operators[i][0] == 1){
                    map.put(operators[i][1],operators[i][2]);
                    list.add(operators[i][1]);
                }else if(operators[i][0] == 2){
                    if(map.containsKey(operators[i][1])){
                        resList.add(map.get(operators[i][1]));
                        list.add(operators[i][1]);
                        for (int j = 0; j < list.size() - 1; j++) {
                            if(list.get(j) == operators[i][1]){
                                list.remove(j);
                                break;
                            }
                        }
                        map.remove(list.get(0));
                    }else{
                        resList.add(-1);
                    }
                }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}