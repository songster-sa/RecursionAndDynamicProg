package main;

/**
 * you are at top left corner and can only move right and down
 * how many possible paths are there to move from (0,0) to (x,y)
 * follow up - what if some spots are off-limit
 */
public class GridMove {

    // the idea is that u have move x places right and y places down , in any order
    public int solutionOne(int x, int y) {

        if (x == 0 && y == 0) {
            System.out.println("end");
            return 1;
        }

        int count = 0;

        if (x > 0) {
            // can move right
            System.out.print("R,");
            count = count + solutionOne(x - 1, y);
        }

        if (y > 0) {
            // can move down
            System.out.print("D,");
            count = count + solutionOne(x, y - 1);
        }

        return count;
    }

    //TODO
    public void followUpSolution() {
    }
}
