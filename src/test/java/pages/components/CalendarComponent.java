package pages.components;

import java.time.LocalDate;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public CalendarComponent setDate(LocalDate value) {
        $(".react-datepicker__year-select").find("[value='" + value.getYear() + "']").click();
        $(".react-datepicker__month-select").find("[value='" + (value.getMonth().getValue()-1) + "']").click();
        $(".react-datepicker__day--0" + String.format("%02d", value.getDayOfMonth())).click();

        return this;
    }
}
