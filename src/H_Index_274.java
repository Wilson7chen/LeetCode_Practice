import java.util.Arrays;

public class H_Index_274 {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = citations.length;
        int j = 0;
        for(int i = citations.length - 1; i >= 0; i--) {
            while(citations[i] < h - j && j <= i) {
                j++;
            }
        }
        return h - j;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5}; // 3
//        int[] citations = {1,3,1}; // 1
        System.out.println(hIndex(citations));
    }
}