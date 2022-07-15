package Nischal.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
    public boolean canMeasureWater(int x, int y, int z) {
        Deque<int[]> queue = new ArrayDeque<int[]>();
        Set<String> visited = new HashSet<>();
        queue.addLast(new int[]{0,0});
        visited.add("0"+","+"0");
        while(!queue.isEmpty())
        {
            int[] search = queue.removeFirst();
            int a = search[0], b = search[1];
            if(a+b == z) return true;

            List<int[]> nextMoves = new ArrayList<>();
            nextMoves.add(new int[]{x,b}); // fill x
            nextMoves.add(new int[]{a,y}); // fill y
            nextMoves.add(new int[]{0,b}); // empty x
            nextMoves.add(new int[]{a,0}); // empty y
            nextMoves.add(new int[]{Math.max(0,a-(y-b)), Math.min(y, a+b)});
            nextMoves.add(new int[]{Math.min(x, a+b), Math.max(0, b-(x-a))});

            for(int[] nextMove : nextMoves)
            {
                String key = nextMove[0]+","+nextMove[1];
                if(!visited.contains(key))
                {
                    visited.add(key);
                    queue.addLast(nextMove);
                }
            }
        }

        return false;
    }
}
