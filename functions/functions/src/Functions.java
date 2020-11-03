public class Functions {
    public static String sqrt_string(double a) {
        int start =(int) Math.ceil((Math.ceil(Math.sqrt(a))) / 2);
        int mid = 1;
        if (Math.sqrt(a) % 1 == 0) {
            return ((int) Math.sqrt(a)) +  "";
        }
        for (int i = start; i >= 2; i--) {
            if (a % (i * i) == 0) {
                a /= (i * i);
                mid *= i;
                break;
            }
        }
        if (Math.ceil(a) == a) {
            return mid + "√" + ((int) a);
        } else {
            return mid + "√" + a;
        }
    }
}
