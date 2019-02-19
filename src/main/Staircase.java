package main;

/**
 * staircase with n steps, we can hop either 1,2 or 3 steps
 * count number of possible ways to run up the stairs
 */
public class Staircase {

    public int solutionOne(int steps) {

        if (steps == 0) {
            System.out.println("end");
            return 1;
        }

        int noWays = 0;

        // take 1 step
        if (steps - 1 >= 0) {
            System.out.print("1,");
            noWays = noWays + solutionOne(steps - 1);
        }

        // take 2 step
        if (steps - 2 >= 0) {
            System.out.print("2,");
            noWays = noWays + solutionOne(steps - 2);
        }

        // take 3 step
        if (steps - 3 >= 0) {
            System.out.print("3,");
            noWays = noWays + solutionOne(steps - 3);
        }

        return noWays;
    }
}
