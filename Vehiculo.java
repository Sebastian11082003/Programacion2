
public class Vehiculo {
    private String Placa;
    private String Tipo;
    private String HoraEntrada;
    private String HoraSalida;

    //Metodo Constructor

    public Vehiculo(String placa, String tipo, String horaEntrada, String horaSalida) {
        this.Placa = placa;
        this.Tipo = tipo;
        this.HoraEntrada = horaEntrada;
        this.HoraSalida = horaSalida;
    }

    //Get & Set
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.HoraEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.HoraSalida = horaSalida;
    }
}




