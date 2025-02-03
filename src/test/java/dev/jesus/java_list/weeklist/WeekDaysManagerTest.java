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
        // Verificamos que al crear una nueva instancia, los días estén correctamente inicializados
        List<String> weekDays = weekDaysManager.getWeekDays();
        assertThat(weekDays, contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }
    
}
