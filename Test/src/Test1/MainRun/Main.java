package Test1.MainRun;

public class Main {
    static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];

        try {
            System.out.println(arr1[5]);
            System.out.println(arr2[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println("HelloWorld");

    }
}
