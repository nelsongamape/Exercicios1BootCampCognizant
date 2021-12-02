import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RespostaHoraDoDia {
    public static void main() {

        LocalTime horaDoDia = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        String saudacao;

        if (horaDoDia.isBefore(LocalTime.of(12, 00))) {
            saudacao = "Bom Dia";
        } else if (horaDoDia.isBefore(LocalTime.of(18, 00))) {
            saudacao = "Boa Tarde";
        } else {
            saudacao = "Boa Noite";
        }

        System.out.println(saudacao + ", são exatamente " + horaDoDia.format(dtf) + "!");
    }
}
