package practice_4;

import practice_4.solvers.IfElseTaskSolver;
import practice_4.solvers.SwitchTaskSolver;

public class Main {
    public static void main(String[] args) {
        IfElseTaskSolver ifElseTaskSolver = new IfElseTaskSolver();

        //проверка метода четности
        System.out.println(ifElseTaskSolver.checkParity(10));
        System.out.println(ifElseTaskSolver.checkParity(7));

        //проверка метода определения возраста
        System.out.println(ifElseTaskSolver.checkAge(4));
        System.out.println(ifElseTaskSolver.checkAge(21));
        System.out.println(ifElseTaskSolver.checkAge(71));

        //проверка метода по нахождению максимального среди трех чисел
        System.out.println(ifElseTaskSolver.checkMax(3, 7, 5));

        //
        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();
        System.out.println(switchTaskSolver.dayOfWeek(2));
        System.out.println(switchTaskSolver.dayOfWeek(16));

        //check of the season description
        System.out.println(switchTaskSolver.describeSeason(Season.WINTER));
        System.out.println(switchTaskSolver.describeSeason(Season.SUMMER));


    }
}
