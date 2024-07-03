package alessiovulpinari.u2_w3_d3_Java.exercise1;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource{

    private final Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(info.getDataDiNascita());
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) -calendar.get(Calendar.YEAR);

        if (today.get(Calendar.YEAR) < calendar.get(Calendar.YEAR)) {
            age--;
        }

        return age;
    }
}
