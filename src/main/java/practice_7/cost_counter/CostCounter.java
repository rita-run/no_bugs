package practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    //array, where index = month
    //method for getting expenses in the month
    //calculate month with minimum expenses
    private ArrayList<Double> costsPerMonth;

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month-1, costs);
    }

    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    //calculate a month with minimal amount of expenses
    /*public int getMinCostMonth() {
        if (costsPerMonth.isEmpty()) {
            return -1; // или бросить исключение
        }

        double min = costsPerMonth.get(0);
        int minMonth = 1;

        for (int i = 1; i < costsPerMonth.size(); i++) {
            if (costsPerMonth.get(i) < min) {
                min = costsPerMonth.get(i);
                minMonth = i + 1; // месяцы считаем с 1
            }
        }

        return minMonth;
    }*/

//calculate a month with minimal amount of expenses
//    public Double getMinCostPerMonth() {
//        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
//        costsPerMonth.forEach(
//                costsPerMonth -> {
//                    if (costsPerMonth < min.get()) {
//                        min.set(costsPerMonth);
//                    }
//                }
//        );
//        return min.get();
//    }

}
