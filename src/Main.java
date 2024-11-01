import java.math.BigInteger;

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
        int arr[] = new int[]{1, 3, 5, 6, 9, 11, 24};
//        printArray(arr);
        getSubArrayBetween(arr, 4, 10);
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
}