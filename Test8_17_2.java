public class Test8_17_2 {
//    public int minNumberInRotateArray(int [] array) {
//        if (array.length == 0) {
//            return 0;
//        }
//        Arrays.sort(array);
//        return array[0];
//    }

    public int minNumberInRotateArray(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[0];
    }

    public int jumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * jumpFloorII(target - 1);
        }
    }
}