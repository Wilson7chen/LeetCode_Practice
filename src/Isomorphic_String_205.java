import java.util.HashMap;

public class Isomorphic_String_205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.containsKey(s.charAt(i))) {
                if(hs.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if (hs.containsValue(t.charAt(i))) {
                return false;
            } else {
                hs.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        String s2 = "foo";
        String t2 = "bar";

        String s3 = "paper";
        String t3 = "title";

        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(s2, t2));
        System.out.println(isIsomorphic(s3, t3));
    }
}