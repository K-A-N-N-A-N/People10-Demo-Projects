import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sample {
    public static void main(String[] args) {

        // Refrence Points
        Point p1 = new Point(1,1);
        Point p2 = p1;
        p1.x = 10;
        System.out.println(p2);

        // Double notation
        double val = (double)10 / (double)3;
        System.out.println(val);

        //Arithematic operation
        int x = 1;
        int y = ++x;
        System.out.println("x : "+x);
        System.out.println("y : "+y);

        int a = 1;
        int b = a++;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        // Array Initialization
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {4,1,2,3,5};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // Multi Dimenisnal Array Initialization
        int arr2[][] = new int[3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[1][2] = 3;
        arr2[2][2] = 4;
        System.out.println(Arrays.deepToString(arr2));

    }
}