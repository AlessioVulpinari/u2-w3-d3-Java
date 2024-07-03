package alessiovulpinari.u2_w3_d3_Java.exercise1;

import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
