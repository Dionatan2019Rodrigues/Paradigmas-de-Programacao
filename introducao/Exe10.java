import java.time.LocalTime;

public class Exe10 {
    public static void main(String[] args){
        LocalTime tempo = LocalTime.now();
        Integer minutos_total = (tempo.getHour() * 60) + tempo.getMinute();
        System.out.println("Minutos ja passados do início do dia até a hora atual: "+(minutos_total));
    }
}
