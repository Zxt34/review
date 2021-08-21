import java.util.Arrays;

public class Test8_21 {
    public static long convertMagicalString (String magicalString) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < magicalString.length();) {
            if(magicalString.charAt(i) >= 65 && magicalString.charAt(i) <= 90 || magicalString.charAt(i) >= 97 && magicalString.charAt(i) <= 122){
                stringBuilder.append(magicalString.charAt(i));
                i++;
            }else if(magicalString.charAt(i) >= 48 && magicalString.charAt(i) <= 57){
                stringBuilder1.append(magicalString.charAt(i));
                i++;
            }else{
                i++;
            }
        }
        if(stringBuilder.length() == 0 && stringBuilder1.length() == 0){
            return 0;
        }
        if(stringBuilder.length() != 0 && stringBuilder1.length() == 0){
            char[] cCh = new char[stringBuilder.length()];
            char[] cCh1 = new char[cCh.length];
            for (int i = 0; i < cCh.length; i++) {
                cCh[i] = stringBuilder.charAt(i);
                cCh1[i] = stringBuilder.charAt(i);
            }
            Arrays.sort(cCh);
            String str1 = new String(cCh);
            if(Arrays.equals(cCh,cCh1)){
                String res1 = "";
                if(str1.charAt(str1.length() - 1) >= 97){
                    res1 += "" + (str1.charAt(str1.length() - 1) - 96);
                }else{
                    res1 += "" + (str1.charAt(str1.length() - 1) - 64);
                }
                return Long.parseLong(res1);
            }
        }
        if(stringBuilder.length() == 0 && stringBuilder1.length() != 0){
            int[] numCh = new int[stringBuilder1.length()];
            for (int i = 0; i < numCh.length; i++) {
                numCh[i] = Integer.parseInt("" + stringBuilder1.charAt(i));
            }
            Arrays.sort(numCh);
            String res2 = "";
            for (int i = 0; i < numCh.length; i++) {
                res2 += numCh[i];
            }
            return Long.parseLong(res2);
        }
        int[] numCh = new int[stringBuilder1.length()];
        char[] cCh = new char[stringBuilder.length()];
        for (int i = 0; i < numCh.length; i++) {
            numCh[i] = Integer.parseInt("" + stringBuilder1.charAt(i));
        }
        Arrays.sort(numCh);
        for (int i = 0; i < cCh.length; i++) {
            cCh[i] = stringBuilder.charAt(i);
        }
        Arrays.sort(cCh);
        String temp = "";
        for (int i = 0; i < cCh.length; i++) {
            temp += cCh[i];
        }
        String res = "";
        for (int i = 0; i < temp.length() - 2; i++) {
            if(temp.charAt(i + 1) - temp.charAt(i) != 1 || temp.charAt(i + 1) - temp.charAt(i) != 33 || temp.charAt(i + 1) - temp.charAt(i) != -31){
                if(temp.charAt(i) >= 97){
                    res += "" + (temp.charAt(i) - 96);
                }else{
                    res += "" + (temp.charAt(i) - 64);
                }
            }else{
                if(temp.charAt(i + 2) - temp.charAt(i + 1) == 1 || temp.charAt(i + 2) - temp.charAt(i + 1) == 33 || temp.charAt(i + 2) - temp.charAt(i + 1) == -31){
                    continue;
                }else{
                    if(temp.charAt(i + 1) >= 97){
                        res += "" + (temp.charAt(i + 1) - 96);
                    }else{
                        res += "" + (temp.charAt(i + 1) - 64);
                    }
                }
            }
        }
        for (int i = 0; i < numCh.length; i++) {
            res += numCh[i];
        }
        return Long.parseLong(res);
    }

    public static void main(String[] args) {
        System.out.println(convertMagicalString("azbA5#1@c"));
    }
}