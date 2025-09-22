public class ShortestPath {
    public static double shortestpath (String str) {
        int x= 0;
        int y=0;
        for(int i=0;i<str.length();i++) {
            int dir=str.charAt(i);
            if (dir=='E'){
                x++;
            }
             if (dir=='W'){
                x--;
            }
             if (dir=='N'){
                y++;
            }
             if (dir=='S'){
                y--;
            }
        }
        return Math.sqrt((x*x)+(y*y));

    }
    public static void main(String args[]) {
        String str="WNEENESENNN";
        System.out.println(shortestpath(str));
    }
    
}
