public class Substring {
    public static String sub(String name, int si, int ei) {
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += name.charAt(i);

        }
        return substring;
    }

    public static void main(String args[]) {
        String name = "shashank";
        int si = 0;
        int ei = 4;// Excluded
        System.out.println( sub(name, si, ei));
    }

}