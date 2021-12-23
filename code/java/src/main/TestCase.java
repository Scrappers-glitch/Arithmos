package main;

import patternMatching.PatternMatching;
import testKotlin.Test;
import testScala.TestScala;
import testGroovy.TestGroovy;
import sorting.ItemsSorting;
import number.*;
import time.*;
import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {
        // test kotlin
        final Test test1 = new Test();
        test1.testMe();
        // test scala
        final TestScala test2 = new TestScala();
        test2.testMe();
        // test groovy
        final TestGroovy test3 = new TestGroovy();
        test3.greet();
        testMath();
        testSort();
    }
    
    public static void testMath() {
        System.out.println(Arrays.toString(NumberFormat.convertToBinary(13)));
        System.out.println(Arrays.toString(NumberFormat.convertToBinary("Guru")));
        System.out.println(NumberFormat.convertToDecimal("1101"));
        System.out.println(NumberFormat.convertToDecimal(1, 1, 0, 1));
        //test time format
        String time = TimeFormat.getFormattedTime(
                TimeFormat.TimeRepresentFormat.Format.HRS_COLON_MINS_COLON_SECS,
                Math.pow(10, 6) * 60 * 20 * 10,
                TimeFormat.Time.InputType.INPUT_TYPE_MICROS);

        System.out.println(time);
    }
    
    public static void testSort() {
        System.out.println(PatternMatching.findBrute("Pavly Gerges", "Gerges"));
        System.out.println(PatternMatching.findBoyerMoore("Pavly Gerges", "Gerges"));
        System.out.println(ItemsSorting.selectionSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.A_Z));
        System.out.println(ItemsSorting.selectionSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.Z_A));
    
    }
}
