import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        // a) целые
        int[] l = new int[3];
        l[0] = 1;
        l[1] = 2;
        l[2] = 3;
        // б) дробные
        double[] d = {1.57, 7.654, 9.986};
        // в) произвольные
        int[] r = {1, 5, 25, 125};

        System.out.println("Задание 2");
        System.out.println(l[0] + ", " + l[1] + ", " + l[2]);
        System.out.println(d[0] + ", " + d[1] + ", " + d[2]);
        System.out.println(r[0] + ", " + r[1] + ", " + r[2] + ", " + r[3]);

        System.out.println("Задание 3");
        System.out.println(l[2] + ", " + l[1] + ", " + l[0]);
        System.out.println(d[2] + ", " + d[1] + ", " + d[0]);
        System.out.println(r[3] + ", " + r[2] + ", " + r[1] + ", " + r[0]);

        System.out.println("Задание 4");
        for (int i = 0; i < l.length; i++) {
            if (l[i] % 2 != 0) {
                l[i] += 1;
            }
        }
        System.out.println(Arrays.toString(l));


    }
}