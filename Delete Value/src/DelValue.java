import java.util.Scanner;

public class DelValue {
    public static void main(String[] args) {
        System.out.print("Input size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array["+i+"] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Elements of Array: ");
        for (int j : array
             ) {
            System.out.print(j + "\t");
        }
        System.out.println();

        System.out.println("Enter delete value: ");
        int delValue = scanner.nextInt();
        int[] newArray = delValue(delValue,array);
        System.out.print("Elements of Array: ");
        for (int j : newArray
        ) {
            System.out.print(j + "\t");
        }
    }
    public static int indexOf(int value, int[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return index = i;

            }
        }
        return index;
    }

    public static int[] delValue(int value, int[] ar){
        int delIndex = indexOf(value,ar);
        int[] newArr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (i < delIndex) newArr[i] = ar[i];
            else if (i == ar.length-1) {
                newArr[i] = 0;
            }
                else newArr[i] = ar[i+1];
        }
        return  newArr;
    }
}
