// Joshua Potter, jop13
//  Ex. 7.14 VariableLengthArgumentList.java, Deitel

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        int i0 = 0;
        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;
        int i5 = 50;

        System.out.printf("i0 = %d%ni1 = %d%ni2 = %d%ni3 = %d%ni4 = %d%ni5 = %d%n", i0, i1, i2, i3, i4, i5);
        System.out.printf("Product of i1 and i2 is %d%n", product(i1, i2));
        System.out.printf("Product of i2 and i3 is %d%n", product(i2, i3));
        System.out.printf("Product of i3, i4, and i5 is %d%n", product(i3, i4, i5));
        System.out.printf("Product of i2, i3, i4, and i5 is %d%n", product(i2, i3, i4, i5));
        System.out.printf("Product of i1, i2, i3, i4, and i5 is %d%n", product(i1, i2, i3, i4, i5));
        System.out.printf("Product of i0, i1, i2, i3, i4, and i5 is %d%n", product(i0, i1, i2, i3, i4, i5));
    }

    // returns product of all numbers
    public static int product(int... numbers) {
        int product = 1;
        for(int n : numbers) {
            product *= n;
        }
        return product;
    }
}