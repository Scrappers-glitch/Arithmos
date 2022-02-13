package main;

import java.io.File;
import java.nio.file.FileSystems;
import patternMatching.PatternMatching;
import testKotlin.Test;
import sorting.ItemsSorting;
import number.*;
import time.*;
import java.util.Arrays;
import pthread.ThreadDispatcher;
import pthread.model.ThreadModel;

public class TestCase {
    static {
         System.loadLibrary("ArithmosNatives");
    }
    public static void main(String[] args) {
        // test kotlin
        final ThreadModel model = new ThreadModel();
        model.setClassRelativePath("main/TestCase");
        model.setMethodName("testThreading");
        model.setMethodId(21321);
        model.setMethodSignature("()V");
        // ThreadDispatcher.dispatch(model);
        ThreadDispatcher.dispatch(model);
        // new Thread(new Runnable() {
        //   public void run() {
        //       testMath();

        //   }

        // }).start();
    }

    public void testThreading() {
      testMath();
      
      // ThreadDispatcher.finish();
    }

    public static void testMath() {
        System.out.println(Arrays.toString(NumberFormat.convertToBinary(13)));
        System.out.println(Arrays.toString(NumberFormat.convertToBinary("Guru")));
        System.out.println(NumberFormat.convertToDecimal("1101"));
        System.out.println(NumberFormat.convertToDecimal(1, 1, 0, 1));
        //test time format
        String time = TimeFormat.getFormattedTime(
                TimeFormat.TimeRepresentFormat.Format.COLON_NO_LABELS,
                Math.pow(10, 6) * 60 * 20 * 10,
                TimeFormat.Time.InputType.INPUT_TYPE_MICROS);

        System.out.println(time);
    }

    public static void testSort() {
      try {
        System.out.println(PatternMatching.findBrute("Pavly Gerges", "Gerges"));
        System.out.println(PatternMatching.findBoyerMoore("Pavly Gerges", "Gerges"));
      } catch(java.lang.IllegalAccessException ex) {
        System.err.println(ex); 
      }
        System.out.println(ItemsSorting.selectionSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.A_Z));
        System.out.println(ItemsSorting.mirrorSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.A_Z));
        System.out.println(ItemsSorting.mirrorSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.Z_A));
        System.out.println(ItemsSorting.bubbleSort(new String[]{"Pavly", "Bavly", "Pavel", "Amer", "Ahmed", "AAme", "Amy", "Emy"}, ItemsSorting.SortAlgorithm.A_Z));
    }
    public static native void testNatives();
}
