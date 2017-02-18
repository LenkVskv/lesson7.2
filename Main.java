package Lesson7;

/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Range<Integer>range = new Range<>(20 , 100);
        Range<Double>range1 = new Range<Double>(20.9,10.22);
        System.out.println(range.toString());
        System.out.print(range1.toString());
    }
}
