package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            default:
                dayOfWeek = "Non exist";
        }
        return dayOfWeek;
    }

    public String describeSeason(Season season) {
        String description = "";

        switch (season) {
            case WINTER -> description = "Winter, cold, snowy";
            case SUMMER -> description = "Summer, hot";
            case SPRING -> description = "Sakura";
            case AUTUMN -> description = "Fallen leaves";
        }
        return description;
    }
}
