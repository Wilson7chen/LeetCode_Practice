import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Longest_Substring_Without_Repeating_Char_3 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int size = 0;
        Set<Character> set = new HashSet<Character>();

        for(int end = 0; end < s.length(); end++) {
            System.out.println("start: " + start + " end: " + end + " size: " + size + " max: " + max + " char: " + s.charAt(end));
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
                size--;
            }
            set.add(s.charAt(end));
            size++;
            max = Math.max(max, size);
        }
        return max;
    }

    public static void main(String[] args) {
        String input = "aab";
        System.out.println(lengthOfLongestSubstring(input));
    }
}