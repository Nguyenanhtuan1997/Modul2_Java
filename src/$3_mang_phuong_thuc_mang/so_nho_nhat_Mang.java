package $3_mang_phuong_thuc_mang;

public class so_nho_nhat_Mang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7,8,1,6,9};
        int index = minValue(arr);
        System.out.println("So nho nhat trong mang la: " + arr[index]);

    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
