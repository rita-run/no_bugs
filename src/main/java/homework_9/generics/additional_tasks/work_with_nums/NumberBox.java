package homework_9.generics.additional_tasks.work_with_nums;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> numberList;

    public NumberBox() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(T number) {
        numberList.add(number);
    }

    public double returnSum() {
        double sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
           sum  = sum + numberList.get(i).doubleValue();
        }
        return sum;
    }
}