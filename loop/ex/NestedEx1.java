package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for (int num = 1; num <= 9; num++) {
            for (int count = 1; count <= 9; count++) {
                System.out.println(num + " * " + count + " = " + num * count);
            }
            System.out.println();
        }
    }
}
