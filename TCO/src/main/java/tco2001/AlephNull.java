package tco2001;

import java.util.ArrayList;

/**
 * PROBLEM STATEMENT
 * <p/>
 * The logician Charles Sanders Pierce proposed a procedure for generating and
 * ordering all of the positive rational numbers. A rational number is an
 * integer divided by an integer (n/m where both n and m are integers and m does
 * not equal zero).
 * <p/>
 * The procedure proceeds as follows. Start with the two rationals 0/1 and 1/0
 * (disregarding the fact that 1/0 is not a valid number). Call this generation
 * 1. To produce the next generation, insert a new rational in between each pair
 * of rationals in the current generation by summing the numerators (the number
 * being divided) of the adjacent rationals to produce the new numerator, and by
 * summing the denominators (the number doing the dividing) of the adjacent
 * rationals to produce the new denominator. By repeating this procedure
 * indefinitely, all of the positive rational numbers will be produced in order
 * in their simplest rational form.
 * <p/>
 * The first few generations proceed as follows:
 * <p/>
 * G1: 0/1 1/0 G2: 0/1 1/1 1/0 G3: 0/1 1/2 1/1 2/1 1/0 G4: 0/1 1/3 1/2 2/3 1/1
 * 3/2 2/1 3/1 1/0 G5: 0/1 1/4 1/3 2/5 1/2 3/5 2/3 3/4 1/1 4/3 3/2 5/3 2/1 5/2
 * 3/1 4/1 1/0
 * <p/>
 * Code a method that given a generation number and a zero based index, returns
 * the numerator and denominator of the rational number at the position
 * indicated by the index within the generation. If the index is not within the
 * range of values for the given generation, return the special error value
 * having zero for both the numerator and denominator.
 * <p/>
 * DEFINITION Class: AlephNull Parameters: int, int Returns: int[] Method
 * signature: int[] rational(int generation, int item)
 * <p/>
 * (be sure your method is public)
 * <p/>
 * TopCoder will ensure the validity of the inputs. Inputs are valid if all of
 * the following criteria are met:
 * <p/>
 * generation is from 1 to 30 inclusive. item is from 0 to 999999999 inclusive.
 * <p/>
 * HINT The number of elements in a given generation can be computed as follows:
 * elements = (2 ^ (generation - 1)) + 1. (The '^' symbol indicates
 * exponentiation. For example: Generation 1: 2^0 + 1 = 2 Generation 2: 2^1 + 1
 * = 3 Generation 3: 2^2 + 1 = 5 Generation 4: 2^3 + 1 = 9 Generation 9: 2^8 + 1
 * = 257
 * <p/>
 * EXAMPLES E1: 1,0 ==> [0,1] E2: 1,1 ==> [1,0] E3: 1,2 ==> [0,0] //error value
 * E4: 4,1 ==> [1,3] E5: 4,6 ==> [2,1] E6: 5,11 ==> [5,3] E7: 8,70 ==> [9,7] E8:
 * 10,467 ==> [43,12] E9: 23,4190316 ==> [438,43] E10: 30,100 ==> [7,157]
 */
public class AlephNull {

    public int[] rational(int generation, int item) {

        if (generation < 1 || generation > 30)
            return null;
        if (item > 999999999 || item < 0)
            return null;

        int maxItem = (int) (Math.pow(2, generation - 1) + 1);
        if (item >= maxItem) {
            return new int[]{0, 0};
        }

        int[] result = new int[2];

        ArrayList<String> genArray = new ArrayList<>();
        genArray.add("0/1");
        genArray.add("1/0");

        int genIndex = 1;

        while (genIndex < generation) {
            genArray = generate(genArray);
            genIndex++;
        }
        System.out.println("Generation/Item :" + generation + "," + item);
        System.out.println(genArray);
        String genFound = genArray.get(item);
        String[] genA = genFound.split("/");
        result[0] = Integer.parseInt(genA[0]);
        result[1] = Integer.parseInt(genA[1]);
        System.out.println("output : " + result[0] + "," + result[1]);
        return result;
    }

    ArrayList<String> generate(ArrayList<String> genArray) {
        //	System.out.println("Input: " + genArray);
        ArrayList<String> result = (ArrayList<String>) genArray.clone();
        int resultIndex = 0;
        for (int i = 0; i < genArray.size(); i++) {
            String[] strArray = genArray.get(i).split("/");
            int a1 = Integer.parseInt(strArray[0]);
            int b1 = Integer.parseInt(strArray[1]);
            if (i + 1 == genArray.size())
                break;
            strArray = genArray.get(i + 1).split("/");
            int a2 = Integer.parseInt(strArray[0]);
            int b2 = Integer.parseInt(strArray[1]);
            StringBuilder sb = new StringBuilder("");
            sb.append((a1 + a2));
            sb.append("/");
            sb.append((b1 + b2));
            result.add(resultIndex + 1, sb.toString());
            resultIndex += 2;
        }
        //System.out.println("output: " + result);
        return result;
    }
} 