import java.util.ArrayList;

public class ip {
    public static void main(String[] args) {
        String ip = "192.168.1.0.";
        System.out.println(v4(ip));
    }

    public static boolean v4(String s) {
        ArrayList<String> ll = new ArrayList<>();
        int start = 0;
        int end = 0;
        while (start < s.length()) {
            if (s.charAt(end) != '.') {
                end++;
            }
            if (s.charAt(end) == '.') {
                ll.add(s.substring(start, end));
                end++;
                start = end;
            }
        }
        for (int i = 0; i < ll.size(); i++) {
            String a = ll.get(i);
            if (a.length() > 4) {
                return false;
            }
            int value = Integer.parseInt(a);
            if (a.startsWith("0") && a.length() > 1) {
                value = -value;
            }
            if (value < 0 || value > 255) {
                return false;
            }
        }
        return true;
    }
}
