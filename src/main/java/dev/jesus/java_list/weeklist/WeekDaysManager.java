package dev.jesus.java_list.weeklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDaysManager {
    private List<String> days;

    public WeekDaysManager() {
        days = new ArrayList<>();
        createWeekDays();

    }
    private void createWeekDays() {
        days.clear();
        Collections.addAll(days, "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    }
    public List<String> getWeekDays() {
        return new ArrayList<>(days);
    }
    

    
}
