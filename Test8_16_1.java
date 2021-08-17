import java.util.ArrayList;

public class Test8_16_1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length == 0 || k == 0 || input == null){
            return list;
        }
        int start = 0;
        int end = input.length - 1;
        int index = partition(input,start,end);
        while(index != k - 1){
            if(index > k - 1){
                end = index - 1;
                index = partition(input,start,end);
            }else {
                start = index + 1;
                index = partition(input,start,end);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private int partition(int[] input, int start, int end) {
        int privotKey = input[start];
        while(start < end){
            while(start < end && privotKey <= input[end])
                end--;
            swap(input,start,end);
            while(start < end && privotKey >= input[start])
                start++;
            swap(input,start,end);
        }
        return start;
    }

    private void swap(int[] input, int start, int end) {
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
}