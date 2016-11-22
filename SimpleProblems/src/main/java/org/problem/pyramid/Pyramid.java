package org.problem.pyramid;

/**
 * Created by shantonu on 11/21/16.
 */
public class Pyramid {

    public static void main(String[] args) {
        pyramidTypeOne();
    }

    public static void pyramidTypeOne() {

        System.out.println("This is pyramid problem 1 ");

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
