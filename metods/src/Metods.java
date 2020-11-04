public class Metods {

    public static String korni(double a, double b){ //подкоренное выражение и степень корня
        double res;
        res = Math.pow(a,1/b); //подкоренное выражение возводится в степень 1/(степень корня)
        String viev = String.format("%.2f", res);
        return viev;
    }
    public static String kvuravn(double a, double b, double c){
        double res;
        String viev = "a";
       double D = b*b-4*a*c;//дискриминант
       if (D<0)
           viev = ("корней нет");
       if (D==0)
           viev = String.format("%.2f", -b/(2*a));  //два знака после запятой у значения x(по формуле)
       if (D>0)
           viev = String.format( "первый корень: %.2f \n" +
                                 "второй корень: %.2f", (-b+Math.sqrt(D))/(2*a), (-b-Math.sqrt(D))/(2*a));
        return viev;                                       //1 корень               //2 корень
    }
    public static String bikvuravn(double a, double b, double c){
        double res;
        String viev = "a";
        double D = b*b-4*a*c;//дискриминант если x*x представить как t
        if (D<0)
            viev = ("корней нет");
        if (D==0)
            viev = String.format("первый корень: %.2f \n" +
                                 "второй корень: %.2f", Math.sqrt(-b/(2*a)), -Math.sqrt(-b/(2*a)) );  //корни квадратные из t тоесть x
        if (D>0)
            viev = String.format( "первый корень: %.2f \n" +
                                  "второй корень: %.2f \n" +
                                  "третий корень: %.2f \n" +
                                  "четвертый корень: %.2f", Math.sqrt((-b+Math.sqrt(D))/(2*a)), -Math.sqrt((-b+Math.sqrt(D))/(2*a)),
                                                            Math.sqrt((-b-Math.sqrt(D))/(2*a)), -Math.sqrt((-b-Math.sqrt(D))/(2*a)));
        return viev;                   //корни из двух полученных t исключение, под корнем может быть отрицательное число(выводит NaN)
    }

}
