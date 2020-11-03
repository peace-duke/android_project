public class Functions {
    //Sqrt function that displays output with root
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
    //Solution of the theorem of Pythagoras that finds hypotenuse
    public static String theorem_of_Pythagoras_finding_hypotenuse(double a, double b) {
        double h;
        h = a * a + b * b;
        return sqrt_string(h);
    }
    //Solution of the theorem of Pythagoras that finds leg
    public static String theorem_of_Pythagoras_finding_leg(double h, double a) {
        //Throwing error if hypotenuse less than or equal to leg
        if (h <= a) {
            return "Negative output!";
        }
        double b;
        b = h * h - a * a;
        return sqrt_string(b);
    }
}
