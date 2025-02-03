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
    public int getSize() {
        return days.size();
    }
    public boolean removeDay(String day) {
        return days.remove(day);
    }
    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        return null;
    }
    public boolean dayExists(String day) {
        return days.contains(day);
    }
    public void sortDays() {
        Collections.sort(days);
    }
    public void clearWeekDays() {
        days.clear();
    }
    

    
}
