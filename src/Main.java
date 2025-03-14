
public class Main {
        public static void main(String[] args) {
                // Crear tres objetos lógicos
                Encendedor interruptorLuz = new Encendedor("Interruptor de luz", false);
                Encendedor sensorMovimiento = new Encendedor("Sensor de movimiento", true);
                Encendedor alarma = new Encendedor("Alarma", false);

                // Interactuar con los objetos
                interruptorLuz.encender();
                sensorMovimiento.mostrarEstado();
                alarma.encender();

                // Apagar un objeto
                alarma.apagar();

                // Mostrar el estado final de los objetos
                interruptorLuz.mostrarEstado();
                sensorMovimiento.mostrarEstado();
                alarma.mostrarEstado();
        }
}