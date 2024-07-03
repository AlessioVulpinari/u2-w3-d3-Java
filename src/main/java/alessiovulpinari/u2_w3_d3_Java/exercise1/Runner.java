package alessiovulpinari.u2_w3_d3_Java.exercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();

        info.setNome("Davide");
        info.setCognome("Abbadessa");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.JULY, 3);
        info.setDataDiNascita(calendar.getTime());

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());

    }
}
