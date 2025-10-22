package livecoding_leetcode;

public class Main {
    /*
    1.2.3
    1.10.1
     */
    public static void main(String[] args) {
        System.out.println(compare("1.2.3", "1.10.1"));
    }

    public static int compare(String v1, String v2) {
        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            int n1 = i < a.length ? Integer.parseInt(a[i]) : 0;
            int n2 = i < b.length ? Integer.parseInt(b[i]) : 0;
            if (n1 != n2) return n1 - n2;
        }
        return 0;
    }
}