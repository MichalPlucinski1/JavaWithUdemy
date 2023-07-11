package Pluto.Wraping;

import java.util.Arrays;
import java.util.LinkedList;

public class Boxing {


    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);     //preferred but unnecessary


        int unboxedInt = boxedInt.intValue();           //unnecessary

        //auto

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;

        int unboxedInt2 = boxedInt;                     //ok




        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());    not working, because it's primitive


        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();




        //arrays and lists etc

        int[] arr = new int[2];
        arr[0] = 50;
        Integer[] wrappedArr = new Integer[2];
        wrappedArr[0] = 50;
        System.out.println("arr: " + Arrays.toString(arr) + " vs wrapped " + Arrays.toString(wrappedArr));


        LinkedList<Integer> integerList = new LinkedList<>();

    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
    }
    //vs

    private static double getDoublePrimitive(){
        return 100.0;
    }




}
