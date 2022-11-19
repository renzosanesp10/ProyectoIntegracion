package restaurante;

import java.sql.Time;

public class Horario {
    private Time HoraEntrada;
    private Time HoraSalida;

    public Horario() {
    }

    public Horario(Time HoraEntrada, Time HoraSalida) {
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
    }

    public Time getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(Time HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public Time getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(Time HoraSalida) {
        this.HoraSalida = HoraSalida;
    }
    
    
}


