import java.util.HashMap;

public class Ransom_Note_383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (!hs.containsKey(c)) {
                hs.put(c, 1);
            } else {
                hs.put(c, hs.get(c) + 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (hs.containsKey(c)) {
                if (hs.get(c) == 1) {
                    hs.remove(c);
                } else {
                    hs.put(c, hs.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "ab";

        System.out.println(canConstruct(ransom, magazine));
    }
}