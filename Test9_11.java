import java.util.HashMap;

public class Test9_11 {
    public int solution (String psw) {
        int time = 0;
        for (int i = 0; i < psw.length() - 1; i++) {
            if(same(psw.charAt(i),psw.charAt(i + 1)))
                time += getTime(psw.charAt(i)) + 2;
            else
                time += getTime(psw.charAt(i));
        }
        time += getTime(psw.charAt(psw.length() - 1));
        return time;
    }

    private int getTime(char charAt) {
        char[][] pwd = {{ 'a','w','f'},{'d','z','c'},{'g','q','l'},{'j','t','i'},{'m','k','r'},{'p','o','n'},{'s','h','x'},{'v','e','b'},{'y','u','0'}};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if(pwd[i][j] == charAt)
                    return j + 1;
            }
        }
        return -1;
    }

    private boolean same(char charAt, char charAt1) {
        if(getRow(charAt) == getRow(charAt1)){
            return true;
        }
        return false;
    }

    private int getRow(char charAt) {
        char[][] pwd = {{ 'a','w','f'},{'d','z','c'},{'g','q','l'},{'j','t','i'},{'m','k','r'},{'p','o','n'},{'s','h','x'},{'v','e','b'},{'y','u','0'}};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if(pwd[i][j] == charAt)
                    return i;
            }
        }
        return -1;
    }


//    public static void main(String[] args) {
//        char[][] pwd = {{ 'a','w','f'},{'d','z','c'},{'g','q','l'},{'j','t','i'},{'m','k','r'},{'p','o','n'},{'s','h','x'},{'v','e','b'},{'y','u'}};
//        solution(pwd);
//    }

    public int digitsRecursive (int num) {
        String str = Integer.toString(num);
        String res = "0";
        for (int i = 0; i < str.length(); i++) {
            res = String.valueOf(Integer.parseInt(res) + Integer.parseInt("" + str.charAt(i)));
        }
        if(res.length() == 1)
            return Integer.parseInt(res);
        else
            return digitsRecursive (Integer.parseInt(res));
    }

    public int solution (int[] source) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            if(!map.containsKey(source[i]))
                map.put(source[i],1);
            else
                map.put(source[i],map.get(source[i]) + 1);
        }
        for (int i = source.length - 1; i >= 0; i--) {
            if(map.get(source[i]) == 1)
                return source[i];
        }
        return -1;
    }
}