package main.codecomp;

/**
 * Write a program that outputs all possibilities to put + or - or nothing between
 * (i.e. concatenate) the numbers 1, 2, ..., 9 (in this order) such that the result is always 100.
 * For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100
 */
public class Sum100 {

    public int total = 0;
    public int valid = 0;

    public void solutionOne(int i, int top, int result, String exp, boolean complete) { // 1 1 0 0

        if (result == 100 && complete && i == 10) { // 18 vs 11
            System.out.println(exp + "=" + result);
            total++;
            return;
        }
        if (i == 10) {
            return;
        }
        //System.out.println(exp + "=" + result);
        solutionOne(i + 1, i + 1, result + top, exp + "+" + top, true);
        if (top != 1) {
            solutionOne(i + 1, i + 1, result - top, exp + "-" + top, true); // 19 vs 18
        }
        solutionOne(i + 1, (top * 10) + (i + 1), result, exp, false);
    }

/*   0+1+2+3-4+5+6+78+9=100
           0+1+2+34-5+67-8+9=100
           0+1+2+34+56+7=100
           0+1-2-3+45+67-8=100
           0+1-2+34-5-6+78=100
           0+1+23+4+5+67=100
           0+1+23-4+5+6+78-9=100
           0+1+23-4+5+67+8=100
           0+1+23-4+56+7+8+9=100
           0-1+2-3+4+5+6+78+9=100
           0+12+3+4+5-6-7+89=100
           0+12+3-4+5+6+78=100
           0+12+3-4+5+67+8+9=100
           0+12-3-4+5-6+7+89=100
           0+12+34-5+67-8=100
           0+123+4-5+67-89=100
           0+123-4-5-6-7+8-9=100
           0+123+45-67+8-9=100
           0+123-45-67+89=100*/

/*0+1+2+3-4+5+6+78+9=100
        0+1+2+34-5+67-8+9=100
        0+1+23-4+5+6+78-9=100
        0+1+23-4+56+7+8+9=100
        0+12+3+4+5-6-7+89=100
        0+12+3-4+5+67+8+9=100
        0+12-3-4+5-6+7+89=100
        0+123+4-5+67-89=100
        0+123-4-5-6-7+8-9=100
        0+123+45-67+8-9=100
        0+123-45-67+89=100*/
}
