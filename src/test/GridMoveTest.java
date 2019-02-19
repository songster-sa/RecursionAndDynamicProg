package test;

import main.GridMove;

public class GridMoveTest {

    public static void main(String arg[]) {
        GridMove obj = new GridMove();
        System.out.println(obj.solutionOne(0, 1));
        System.out.println("---------------------------------------------");
        System.out.println(obj.solutionOne(1, 0));
        System.out.println("---------------------------------------------");
        System.out.println(obj.solutionOne(1, 1));
        System.out.println("---------------------------------------------");
        System.out.println(obj.solutionOne(1, 2));
        System.out.println("---------------------------------------------");
        System.out.println(obj.solutionOne(2, 2));
    }
}
