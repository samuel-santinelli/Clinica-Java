package fundamentals;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);
        var b = 4.5;
        System.out.println(b);

        var c = "text";
        System.out.println(c);

        c =  "text";

        c = "Other text";
        System.out.println(c);

    }
}
