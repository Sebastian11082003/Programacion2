import javax.swing.*;

public class Interfaz {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(15);
        String optionPane;

        do {
            optionPane = JOptionPane.showInputDialog(null, "\n" +
                    "1. Registrar vehiculo \n" +
                    "2. Retire el vehiculo \n" +
                    "3. Consultar espacio disponible \n" +
                    "4. Salir");

            if (optionPane == null || optionPane.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ningún número ha sido seleccionado" +
                        " Digite una opción válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (optionPane.trim().charAt(0)) {
                case '1':
                    String placa = JOptionPane.showInputDialog(null, "" +
                            "Digite la placa de su vehículo");

                    String tipo = JOptionPane.showInputDialog(null, "" +
                            "Digite el tipo de su vehículo (Carro / Moto)");

                    String horaEntrada = JOptionPane.showInputDialog(null, "" +
                            "Digite la hora de ingreso al parqueadero");

                    Vehiculo vehiculo = new Vehiculo(placa, tipo, horaEntrada, null);
                    parqueadero.AgregarVehiculo(vehiculo);
                    break;

                case '2':
                    String PlacaRetirar = JOptionPane.showInputDialog(null, "Digite la placa del vehículo a retirar");
                    parqueadero.RetirarVehiculo(PlacaRetirar);
                    break;

                case '3':
                    int EspacioDisponible = parqueadero.ConsultarEspacio();
                    JOptionPane.showMessageDialog(null, "Espacio disponible: " + EspacioDisponible);
                    break;

                case '4':
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } while (!optionPane.trim().equals("4"));
    }
}
