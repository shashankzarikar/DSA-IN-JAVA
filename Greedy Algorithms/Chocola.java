// Problem: Minimum Cost to Cut a Chocolate (Chocola Problem)
// Approach: Greedy Algorithm
// Idea: Perform higher cost cuts first to keep their multiplier small
// Cost Formula:
// - Horizontal cut = horcost * vertical pieces (vp)
// - Vertical cut   = vercost * horizontal pieces (hp)

// Time Complexity: O(V log V + H log H)
// Space Complexity: O(1) auxiliary

import java.util.*;

public class Chocola {
    public static int totalmincost(Integer vercost[], Integer horcost[]) {
        Arrays.sort(vercost, Collections.reverseOrder());
        Arrays.sort(horcost, Collections.reverseOrder());

        int vc = 0; // vertical cut index
        int hc = 0; // horizontal cut index 
        int vp = 1; // number of vertical parts
        int hp = 1; // number of horizontal parts
        int totalcost = 0;

        while (vc < vercost.length && hc < horcost.length) {
            if (vercost[vc] <= horcost[hc]) {
                totalcost += (vp * horcost[hc]);
                hc++;
                hp++;
            } else {
                totalcost += (hp * vercost[vc]);
                vc++;
                vp++;
            }
        }
        
        //Perform remaining horizontal and vertical cuts
        while (hc < horcost.length) {
            totalcost += (vp * horcost[hc]);
            hc++;
            hp++;
        }

        while (vc < vercost.length) {
            totalcost += (hp * vercost[vc]);
            vc++;
            vp++;
        }

        return totalcost;

    }

    public static void main(String args[]) {
        Integer vercost[] = { 2, 1, 3, 1, 4 };
        Integer horcost[] = { 4, 1, 2 };

        System.out.println("Total minimum cost required :"+totalmincost(vercost,horcost));

    }

}
