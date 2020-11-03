public class Functions {
    //-----------------------------------------
    //Advanced sqrt function
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


    //-----------------------------------------
    //Pythagoras' theorem
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


    //-----------------------------------------
    //Translations between different number systems
    //Method that translates from the octal number system to the decimal number system
    public static String from_oct_to_bin(String a) {
        return Integer.toBinaryString(Integer.parseInt(a, 8));
    }
    //Method that translates from the octal number system to the decimal number system
    public static String from_oct_to_hex(String a) {
        return Integer.toHexString(Integer.parseInt(a, 8));
    }
    //Method that translates from the octal number system to the decimal number system
    public static String from_hex_to_oct(String a) {
        return Integer.toOctalString(Integer.parseInt(a, 16));
    }
    //Method that translates from the octal number system to the decimal number system
    public static String from_hex_to_bin(String a) {
        return Integer.toBinaryString(Integer.parseInt(a, 16));
    }
    //Method that translates from the octal number system to the decimal number system
    public static String from_bin_to_oct(String a) {
        return Integer.toOctalString(Integer.parseInt(a, 2));
    }
    //Method that translates from the octal number system to the decimal number system
    public static String from_bin_to_hex(String a) {
        return Integer.toHexString(Integer.parseInt(a, 2));
    }


    //-----------------------------------------
    //Trigonometric calculations
    //Method that finds cotangent
    public static double[] cos(double a) {
        return transform(Math.cos(a));
    }
    public static double[] arccos(double a) {
        return transform(Math.acos(a));
    }
    public static double[] sin(double a) {
        return transform(Math.sin(a));
    }
    public static double[] arcsin(double a) {
        return transform(Math.asin(a));
    }
    public static double[] tg(double a) {
        return transform(Math.tan(a));
    }
    public static double[] arctg(double a) {
        return transform(Math.atan(a));
    }
    //Method that finds cotangent
    public static double[] ctg(double a) {
        return transform(1.0 / Math.tan(a));
    }
    //Method that finds arccotangent
    public static double[] arcctg(double a) {
        return transform(1.0 / Math.atan(a));
    }
    //Method that transforms of trigonometric value into value with PI
    public static double[] transform(double a) {
        double res = a / Math.PI;
        for (int i = 1; i <= 100; i++) {
            if ((res * i) % 1 == 0) {
                return new double[]{res * i, i};
            }
        }
        return new double[]{res};
    }
    //Method that translates from degrees into radians
    public static double[] from_deg_to_rad(double a) {
        return transform((a * Math.PI) / 180);
    }
}
