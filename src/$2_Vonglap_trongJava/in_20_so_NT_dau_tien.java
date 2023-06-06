package $2_Vonglap_trongJava;

public class in_20_so_NT_dau_tien {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
