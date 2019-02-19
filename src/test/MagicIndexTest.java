package test;

import main.MagicIndex;

public class MagicIndexTest {

    public static void main(String args[]) {
        MagicIndex obj = new MagicIndex();

        System.out.println(obj.soltionOne(new int[]{1, 2, 3, 4, 5}, 0, 4));
        System.out.println(obj.soltionOne(new int[]{-1, 1, 2, 4, 5}, 0, 4));
        System.out.println(obj.soltionOne(new int[]{1}, 0, 0));
        System.out.println(obj.soltionOne(new int[]{0}, 0, 0));
        System.out.println(obj.soltionOne(new int[]{0, 1, 2, 3, 4}, 0, 4));

        System.out.println(obj.soltionOne(new int[]{0, 3, 5, 6, 7}, 0, 4));

        System.out.println(obj.soltionOne(new int[]{-2, -1, 1, 3, 4}, 0, 4));

        System.out.println(obj.soltionOne(new int[]{-2, -1, 1, 2, 4}, 0, 4));

    }
}
