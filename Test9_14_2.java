import java.util.HashMap;
import java.util.Map;

public class Test9_14_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int floor = scanner.nextInt();
//        System.out.println(jumpFloorCount(floor));

//        String str = scanner.nextLine();
//        System.out.println(str);

//        HashMap<Character,Character> bigMap = new HashMap<>();
//        for (int i = 65; i <= 90; i++) {
//            char key = (char)i;
//            char value = (char)(65 + ((i + 4 - 65) % 26));
//            bigMap.put(key,value);
//        }

        HashMap<Character,Character> bigMap = new HashMap<>();
        int bigDig = 0;
        bigDig = -bigDig;
        for (int i = 65; i < 65 + bigDig; i++) {
            char key = (char)i;
            char value = (char)(i + 26 - bigDig);
            bigMap.put(key,value);
        }
        for (int i = 65 + bigDig; i <= 90; i++) {
            char key = (char)i;
            char value = (char)(i - bigDig);
            bigMap.put(key,value);
        }
        for (Map.Entry<Character,Character> entry:bigMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

//        int i = -3;
//        i = -i;
//        System.out.println(i);
    }

    private static int jumpFloorCount(int floor) {
        if(floor == 0)
            return 0;
        if(floor == 1)
            return 1;
        if(floor == 2)
            return 2;
        return jumpFloorCount(floor - 1) + jumpFloorCount(floor - 2);
    }
}