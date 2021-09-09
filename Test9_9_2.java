import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test9_9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goodsNum = scanner.nextInt();
        int carsNum = scanner.nextInt();
        int[] goods = new int[goodsNum];
        for (int i = 0; i < goodsNum; i++) {
            goods[i] = scanner.nextInt();
        }
        Arrays.sort(goods);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < goodsNum; i++) {
            if(map.containsKey(goods[i])){
                map.put(goods[i],map.get(goods[i]) + 1);
            }else{
                map.put(goods[i],1);
            }
        }
        int[] cars = new int[carsNum];
        for (int i = 0; i < carsNum; i++) {
            cars[i] = scanner.nextInt();
        }
        for (int i = 0; i < carsNum; i++) {
            int j = goodsNum - 1;
            for (; j >= 0; j--) {
                if(cars[i] >= goods[j] && map.get(goods[j]) > 0){
                    System.out.print(goods[j] + " ");
                    map.put(goods[j],map.get(goods[j]) - 1);
                    break;
                }
            }
            if(j < 0){
                System.out.print(-1 + " ");
            }
        }
    }
}