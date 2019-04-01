package test.codecomp;

import main.codecomp.Sum100;

public class Sum100Test {

    public static void main(String arg[]) {
        Sum100 obj = new Sum100();
        obj.solutionOne(1, 1, 0, "0", true);
        System.out.println(obj.total);
    }
}
