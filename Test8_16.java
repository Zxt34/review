import java.util.HashMap;

public class Test8_16 {
//    public int[] twoSum (int[] numbers, int target) {
//        int one = 0,another = -1;
//        int[] res = new int[2];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            one = numbers[i];
//            res[0] = i + 1;
//            for (int j = i + 1; j < numbers.length; j++) {
//                if((target - one) == numbers[j]){
//                    another = target - one;
//                    res[1] = j + 1;
//                    break;
//                }
//            }
//            if(another != -1){
//                break;
//            }
//        }
//        return res;
//    }

    public int[] twoSum (int[] numbers, int target){
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(!map.containsKey(target - numbers[i])){
                map.put(numbers[i],i);
            }else{
                res[0] = map.get(target - numbers[i]) > i ? i + 1 : map.get(target - numbers[i]) + 1;
                res[1] = map.get(target - numbers[i]) > i ? map.get(target - numbers[i]) + 1 : i + 1;
                break;
            }
        }
        return res;
    }
}