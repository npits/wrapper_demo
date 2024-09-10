/**
 Primitive Data Types:
 * char, byte, short, int, long, float, double, boolean
 * predefined data types provided by java
 * they have default values - cannot be null or '\0'

 Wrapper Class:
 * Character, Byte, Short, Integer, Long, Float, Double, Boolean
 * a wrapper class is used to convert a primitive data type to an object and reverse
 * all classes are present in java.lang package
 * can be null

 Use of Wrapper Classes:
 -> Autoboxing ( primitive type to wrapper class). e.g.
 ArrayList<Integer> list = new ArrayList<>();
 * list.add(5);
 -> Unboxing (wrapper to primitive type) e.g.
 * Integer aObj = 56;
 * int a = aObj;

 Why prefer primitive type over wrapper class?
 * wrapper class can throw NullPointerException if not handled properly
 * they are -faster- than wrapper classes since:
    - they directly store values on the stack while wrappers store the objects in heap
    - operations on primitives are straightforward while operations on wrapper classes involve method calls/processing

 When to use wrapper class?
 * when in need for nullability
 * when working with collections such as ArrayList<Integer> that only work with objects and not primitive data types
 *
 **/

public class ExampleDemo {

    public static void mayThrowException() {
        Integer num1 = null;

        try {
            int num2 = num1; //throws NullPointerException
            System.out.println("Integer is: " + num2);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    public static void main(String[] args) {
        /**
         * Caching: for values between -128 and 127 java doesn't create a new object every time, but uses a pre-stored
         * object from memory.
         */
        Integer i1 = 5;
        Integer i2 = 5;
        System.out.println("i1 == i2: " + (i1 == i2));


        Integer i3 = 1000;
        Integer i4 = 1000;
        System.out.println("i3 == i4: " + (i3 == i4));
        System.out.println("i3.equals(i4): " + (i3.equals(i4)));

        int int3 = 1000;
        int int4 = 1000;
        System.out.println("int3 == int4: " + (int3 == int4)); //true

        //Like Integer, Long values between -128 and 127 are cached
        Long l1 = 5L;
        Long l2 = 5L;
        System.out.println("l1 == l2: " + (l1 == l2)); //true

        Long l3 = 1000L;
        Long l4 = 1000L;
        System.out.println("l3 == l4: " + (l3 == l4)); //false
        System.out.println("l3.equals(l4): " + (l3.equals(l4))); //true
        long long3 = 1000L;
        long long4 = 1000L;
        System.out.println("long3 == long4: " + (long3 == long4)); //true

        //Double does not use cached objects like Integer and Long does
        Double d1 = 5D;
        Double d2 = 5D;
        System.out.println("d1 == d2: " + (d1 == d2));
        System.out.println("d1.equals(d2): " + (d1.equals(d2)));
        double doub1 = 5D;
        double doub2 = 5D;
        System.out.println("double1 == double2: " + (doub1 == doub2));

        Double d3 = 1000D;
        Double d4 = 1000D;
        System.out.println("d3 == d4: " + (d3 == d4));
        System.out.println("d3.equals(d4): " + (d3.equals(d4)));

        Double d5 = 0.1D + 0.1D + 0.1D + 0.1D + 0.1D + 0.1D;
        Double d6 = 0.1D * 6D; //precision loss
        System.out.println("d5 == d6: " + (d5 == d6));
        System.out.println("d5.equals(d6): " + (d5.equals(d6)));

        /*
        Using Wrapper classes in arithmetic operations or assignments has a high chance it will throw exception
         */
        mayThrowException();
    }

}
