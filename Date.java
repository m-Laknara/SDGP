
import java.io.Serializable;
import java.time.LocalDate;
public class Date implements Serializable {
    private LocalDate date;

    public Date(LocalDate date) {
        this.date = date;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "" + date;
    }
}




