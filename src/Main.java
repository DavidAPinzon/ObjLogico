
public class Main {
        public static void main(String[] args) {

                Encendedor interruptorLuz = new Encendedor("Interruptor de luz", false);
                Encendedor sensorMovimiento = new Encendedor("Sensor de movimiento", true);
                Encendedor alarma = new Encendedor("Alarma", false);

                interruptorLuz.encender();
                sensorMovimiento.mostrarEstado();
                alarma.encender();


                alarma.apagar();


                interruptorLuz.mostrarEstado();
                sensorMovimiento.mostrarEstado();
                alarma.mostrarEstado();
        }
}