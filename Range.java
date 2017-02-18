package Lesson7;

/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Range<T extends Number & Comparable> {
    private final T upperLimit;
    private final T  lowerLimit;

    public Range(T upperLimit, T lowerLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        checkLimit(upperLimit,lowerLimit);
    }

    public T getUpperLimit() {
        return upperLimit;
    }

    public T getLowerLimit() {
        return lowerLimit;
    }

    @Override
    public String toString() {
        return "Range{" +
                "upperLimit=" + upperLimit +
                ", lowerLimit=" + lowerLimit +
                '}';
    }
    private void checkLimit( T o1, T o11){
        if(o1.compareTo(o11)>0){
            throw new IllegalArgumentException ("Lower limit can not be more than upper");
        }

    }
}
