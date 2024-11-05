package firstModule;

import javax.script.ScriptEngine;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(doubleExpression(3, 6, 2));
//        calcCircleRadius(123);
//        maxLongSqr();
//        System.out.println(charExpression(3));
//        System.out.println(getAgeDiff((byte) 4, (byte) 1));
//        System.out.println(isPowerOfTwo(1));
//        System.out.println(factorialRecur(3));
//        System.out.println(determineGroup(77));
//        System.out.println(isWeekend("Sunday"));
//        System.out.println(checkWeekend("Sunday"));
        int arr[] = new int[]{13,-25,-13,91,99};
        printArray(arr);
//        printArray(arr2);
//        getSubArrayBetween(arr, 4, 10);
//        getArrayMiddle(arr);
//        inverseArray(arr);
//        mergeAndSort(arr, arr2);
//        printArrayClass(arr);
//        printArrayClass(arr2);
//        getArrayMiddleClass(arr);
//        mergeAndSortClass(arr, arr2);
        printOddNumbers(arr);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) > 0.0001;
//        BigDecimal q = BigDecimal.valueOf(a);
//        BigDecimal w = BigDecimal.valueOf(b);
//        BigDecimal r = BigDecimal.valueOf(c);
//
//        r = q.add(w);
//
//        int y = q.add(q).compareTo(r);
//        a = q.doubleValue();
//        b = w.doubleValue();
//        c = r.doubleValue();
//        System.out.println(y);
    }

    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%3.3f", radius);
    }

    public static void maxLongSqr() {
        long b = 280L;
        BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.print(a.multiply(a));
    }

    public static char charExpression(int a) {
        int c = '\\';
        int result = c + a;
        return (char) result;
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        byte result = (byte) (age1 - age2);

        return (byte) Math.abs(result);
    }

    public static boolean isPowerOfTwo(int value) {
        boolean flag;
        value = Math.abs(value);
        flag = Integer.bitCount(value) == 1;
        return flag;
    }

    public static BigInteger factorial(int value) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static BigInteger factorialRecur(int value) {
        BigInteger fact = BigInteger.ONE;
        if (value == 1 || value == 0) {
            return BigInteger.valueOf(1);
        } else {
            fact = factorialRecur(value - 1).multiply(BigInteger.valueOf(value));
            return fact;
        }
    }

    public static int determineGroup(int age) {
// remove static
        int result;
        if (age >= 7 && age <= 13) {
            result = 1;
        } else if (age >= 14 && age <= 17) {
            result = 2;
        } else if (age >= 18 && age <= 65) {
            result = 3;
        } else {
            result = -1;
        }

        return result;
    }

    public static boolean isWeekend(String weekday) {
        boolean result;
        switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> result = false;
            case "Saturday", "Sunday" -> result = true;
            default -> throw new IllegalStateException("Unexpected value: " + weekday);
        }
        return result;
    }

    public static boolean isWeekendStr(String weekDayNumber) {
        if (weekDayNumber.equals("Sunday") || weekDayNumber.equals("Saturday")) {
            return true;
        }
        return false;
    }

    public static String checkWeekend(String weekday) {
        String s = ((weekday.equals("Saturday")) || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
        return s;
    }

    public static void printArray(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        boolean isEmpty = numbers.length == 0;
        if (end < start || isEmpty) {
            return numbers;
        }
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start - 1 && numbers[i] < end + 1) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start - 1 && numbers[i] < end + 1) {
                result[index] = numbers[i];
                index++;
            }
        }
        System.out.println();

        for (int a : result) {
            System.out.print(a + " ");
        }

        return result;
    }

    public static int[] getArrayMiddle(int[] numbers) {
        boolean isEmpty = numbers.length == 0;
        if (isEmpty) {
            return numbers;
        }
        int counter = numbers.length;
        int halfArray = numbers.length / 2;
        int size = 0;

        if (counter % 2 == 0) {
            size = 2;
        } else {
            size = 1;
        }

        int[] res = new int[size];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (size == 2) {
                res[index] = numbers[halfArray - 1];
                res[index + 1] = numbers[halfArray];
            } else {
                res[index] = numbers[halfArray];
            }
        }
        for (int a : res) {
            System.out.print(a + " ");
        }
        return res;
    }

    public static int[] inverseArray(int[] numbers) {
        int[] res = new int[numbers.length];
        for (int i = 0, j = res.length - 1; i < numbers.length; i++, j--) {
            res[j] = numbers[i];
        }
        for (int a : res) {
            System.out.print(a + " ");
        }
        return res;
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] res = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            res[i] = firstArray[i];
            count++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            res[count++] = secondArray[i];
        }

        int temp;
        boolean isFiltred = false;
        while (!isFiltred) {
            isFiltred = true;
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] > res[i + 1]) {
                    isFiltred = false;
                    temp = res[i];
                    res[i] = res[i + 1];
                    res[i + 1] = temp;
                }
            }
        }
        for (int a : res) {
            System.out.print(a + " ");
        }
        return res;
    }

    public static void printArrayClass(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] getArrayMiddleClass(int[] numbers) {
        boolean isEmpty = numbers.length == 0;
        if (isEmpty) {
            return numbers;
        }
        int counter = numbers.length;
        int size = 0;
        if (counter % 2 == 0) {
            size = 2;
        } else {
            size = 1;
        }
        int[] res = new int[size];
        if (size == 2) {
            System.arraycopy(numbers, numbers.length / 2 - 1, res, 0, size);
        } else {
            System.arraycopy(numbers, numbers.length / 2, res, 0, size);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] mergeAndSortClass(int[] firstArray, int[] secondArray) {
        int[] res = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, res, 0, firstArray.length);
        System.arraycopy(secondArray, 0, res, firstArray.length, secondArray.length);
        Arrays.sort(res);
        return res;
    }

    public static void printOddNumbers(int[] arr) {
        boolean isEmpty = arr.length == 0;
        if (!isEmpty) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    sb.append(arr[i]);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            System.out.println(sb);
        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                sb.append(arr[i]);
//                sb.append(", ");
//            }
//        }
//        if (isEmpty) {
//            for (int a : arr) {
//                System.out.println(a);
//            }
//        } else {
//            sb.deleteCharAt(sb.length() - 2);
//            System.out.println(sb);
//        }

//        boolean isEmpty = arr.length == 0;
//        String s = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}