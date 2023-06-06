package $2_Vonglap_trongJava;

public class in_SNT_nho_hon_100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
