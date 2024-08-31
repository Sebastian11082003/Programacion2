import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private Integer Capacidad = 15;
    private List<Vehiculo> Vehiculos;

    //Metodo constructor

    public Parqueadero(Integer capacidad) {
        this.Capacidad = capacidad;
        this.Vehiculos = new ArrayList<>();
    }

    //Get & Set

    public Integer getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.Capacidad = capacidad;
    }

    public List<Vehiculo> getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.Vehiculos = vehiculos;
    }

    //Metodo para agregar vehiculos

    public void AgregarVehiculo(Vehiculo vehiculo) {
        if (Vehiculos.size() < Capacidad) {
            Vehiculos.add(vehiculo);
        } else {
            JOptionPane.showMessageDialog(null, "El parqueadero está lleno.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para retirar un vehiculo

    public void RetirarVehiculo(String Placa) {
        Vehiculo vehiculoARetirar = null;
        for (Vehiculo Matricula : Vehiculos) {
            if (Matricula.getPlaca().equals(Placa)) {
                vehiculoARetirar = Matricula;
                break;
            }
        }
        if (vehiculoARetirar != null) {
            Vehiculos.remove(vehiculoARetirar);
        } else {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Metodo para consultar el espacio disponible

    public int ConsultarEspacio() {
        return Capacidad - Vehiculos.size();
    }

}
