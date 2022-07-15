package Nischal.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class water_jug {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        int x = jug1Capacity;
        int y = jug2Capacity;
        int z = targetCapacity;
        if(z>x+y) return false;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        int[] dirc = new int[]{x, y, -x, -y};
        q.offer(0);
        visit.add(0);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i<size; i++) {
                int temp = q.poll();
                for(int d : dirc) {
                    if(temp+d == z) return true;
                    if(temp+d >0 && temp+d<=x+y && !visit.contains(temp+d)) {
                        q.offer(temp+d);
                        visit.add(temp+d);
                    }
                }
            }
        }
        return false;
    }
}
