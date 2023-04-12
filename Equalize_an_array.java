package training;

public class Equalize_an_array {
    public static void main(String[] args) {
        int arr[] = {3, 3, 4,9, 1, 2, 3};
        int list[] = {3, 3,0,8, 1, 2, 3};
        int how;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            how = 0;
            for (int j = 0; j < list.length; j++) {
                if (arr[i] == list[j]) {
                    how++;
                }
                if (how > count) {
                    count = how;
                }
            }

        }
        System.out.println(arr.length-count);
    }
}
