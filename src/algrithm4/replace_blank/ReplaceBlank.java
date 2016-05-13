package algrithm4.replace_blank;

/**
 * Created by Administrator on 2016/4/25.
 */
public class ReplaceBlank {

    public static void main(String[] args) {
        ReplaceBlank r = new ReplaceBlank();
        System.out.println(r.replaceBlank("We are Haapy "));

    }

    public String replaceBlank(String str) {
        char[] chars = str.toCharArray();
        int blankNum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                blankNum++;
            }
        }

        char[] replacedChars = new char[chars.length + 2 * blankNum];
        int charsIndex = chars.length - 1;
        int replacedIndex = replacedChars.length - 1;
        while (charsIndex >= 0) {
            if (chars[charsIndex] == ' ') {
                replacedChars[replacedIndex--] = '0';
                replacedChars[replacedIndex--] = '2';
                replacedChars[replacedIndex--] = '%';
            } else {
                replacedChars[replacedIndex] = chars[charsIndex];
                replacedIndex--;
            }
            charsIndex--;
        }

        return new String(replacedChars);
    }

}
