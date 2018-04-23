package ru.vadimushka_d;

/** Проект Types_Of_Data
 * @author Вадим Дунькин (vadimushka_d)
 * @version 1.0
 */
public class Types_Of_Data {
    public static void main(String[] args) {
        byte minB = -128;
        byte maxB = 127;

        short minS = -32768;
        short maxS = 32767;

        int minI = -2147483648;
        int maxI = 2147483647;

        long minL = -9223372036854775808L;
        long maxL = 9223372036854775807L;

        float minF = -3.4E+38f;
        float maxF = 3.4E+38f;

        double minD = -1.7E+308;
        double maxD = 1.7E+308;

        char c1 = 'a';
        char c2 = 116;
        char c3 = 'y';
        char c4 = 'c';
        char c5 = 'd';

        System.out.println("Диапазон значений byte от " +minB + " до " +maxB);
        System.out.println("Диапазон значений short от " +minS + " до " +maxS);

        System.out.println("Диапазон значений short min " + Short.MIN_VALUE);
        System.out.println("Диапазон значений short max " + Short.MAX_VALUE);

        System.out.println("Диапазон значений int от " +minI + " до " +maxI);
        System.out.println("Диапазон значений long от " +minL + " до " +maxL);

        System.out.println("Диапазон значений float от " +minF + " до " +maxF);
        System.out.println("Диапазон значений double от " +minD + " до " +maxD);
        System.out.println("Диапазон значений float min  " + Float.MIN_VALUE );
        System.out.println("Диапазон значений float max   " + Float.MAX_VALUE );
        System.out.println("Диапазон значений double min " + Double.MIN_VALUE );
        System.out.println("Диапазон значений double max " + Double.MAX_VALUE );

        System.out.println("Диапазон значений char min " + Character.MIN_VALUE);
        System.out.println("Диапазон значений char max " + Character.MAX_VALUE);

        System.out.println("Значение 1 char = " +c1);
        System.out.println("Значение 2 char = " +c2);
        System.out.println("Значение 3 char = " +c3);
        System.out.println("Значение 4 char = " +c4);
        System.out.println("Значение 5 char = " +c5);


        System.out.println("Значение 1 boolean = " +true);
        System.out.println("Значение 2 boolean = " +false);
    }
}
