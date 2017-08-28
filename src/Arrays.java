
public class Arrays {
    public static void main(String[] args) {

        System.out.print("Initial array: ");

        int[] arr = new int[20];

        //0. Заполняем и выводим на экран первоначальный масив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }


        //0.5 Выводим элементы массива кратные "3"
        System.out.print("\nMultiple of \"3\": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }


        //1. Инвертировать и вывести массив
        int buffer;
        for (int i = 0; i < arr.length / 2; i++) {
            buffer = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = buffer;
        }

        System.out.print("\nInverted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        //2. Минимальный элемент массива
        buffer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (buffer > arr[i]) buffer = arr[i];
        }
        System.out.print("\nMinimum: " + buffer);



        //3. Сортировка пузырьком
        for (int i = arr.length - 1; i != 0; i--) {

            for (int j = 0; j != i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        System.out.print("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
