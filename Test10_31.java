public class Test10_31 {
    public String  longestPalindrome(String s) {
        int max = 0;
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                StringBuilder stringBuilder = new StringBuilder(s.substring(i,j + 1));
                if(s.substring(i,j + 1).equals(stringBuilder.reverse().toString())){
                    if(s.substring(i,j + 1).length() > max){
                        max = s.substring(i,j + 1).length();
                        res = s.substring(i,j + 1);
                    }
                }
            }
        }
        return res;
    }

    public int StrToInt(String str) {
        if(str == null || str == ""){
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '+' || str.charAt(i) != '-' || str.charAt(i) < 48 || str.charAt(i) > 57){
                return 0;
            }
        }
        return Integer.valueOf(str);
    }
}