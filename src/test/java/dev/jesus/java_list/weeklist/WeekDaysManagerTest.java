package dev.jesus.java_list.weeklist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;

public class WeekDaysManagerTest {
    private WeekDaysManager weekDaysManager;

    @BeforeEach
    public void setUp() {
        weekDaysManager = new WeekDaysManager();
        
    }

    @Test
    public void testCreateWeekDays() {
       
        List<String> weekDays = weekDaysManager.getWeekDays();
        assertThat(weekDays, contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }
    @Test
    public void testGetWeekDays() {
        List<String> days = weekDaysManager.getWeekDays();
        assertThat(days, contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }
    @Test
    public void testGetSize() {
        int size = weekDaysManager.getSize();
        assertThat(size, is(7)); 
    }
    @Test
    public void testRemoveDay() {
        weekDaysManager.removeDay("Martes");
        List<String> days = weekDaysManager.getWeekDays();
        assertThat(days, not(hasItem("Martes"))); 
        assertThat(days.size(), is(6)); 
    }

    
}
