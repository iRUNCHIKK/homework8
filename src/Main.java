import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doubleArr = {1.57, 7.654, 9.986};

        float[] arr = {3.4f, 12.0f, -8.02f, 1.0f, 0.025f};

        //task 2
        System.out.println("Task 2");
        for (int i = 0; i < numbers.length; i++){
            if (i != numbers.length - 1){
                System.out.print(numbers[i] + ", ");
            }
            else {
                System.out.print(numbers[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < doubleArr.length; i++){
            if (i != doubleArr.length - 1){
                System.out.print(doubleArr[i] + ", ");
            }
            else {
                System.out.print(doubleArr[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++){
            if (i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i]);
            }
        }

        System.out.println();

        //task 3
        System.out.println("Task 3");
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + ", ");
            if (i == numbers[0]){
                System.out.print(i);
                break;
            }
        }

        System.out.println();

        for (int i = doubleArr.length - 1; i >= 0; i--){
            System.out.print(doubleArr[i] + ", ");
            if (i == doubleArr[0]){
                System.out.print(i);
                break;
            }
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + ", ");
            if (i == arr[0]){
                System.out.print(i);
                break;
            }
        }

        System.out.println();

        //task 4
        System.out.println("Task 4");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                numbers[i] += 1;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
}