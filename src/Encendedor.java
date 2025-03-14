public class Encendedor {
    private String nombre;
    private boolean estado;

    public Encendedor(String nombre, boolean estadoInicial) {
        this.nombre = nombre;
        this.estado = estadoInicial;
    }

    public void encender() {
        this.estado = true;
        System.out.println(this.nombre + " encendido.");
    }

    public void apagar() {
        this.estado = false;
        System.out.println(this.nombre + " apagado.");
    }

    public void mostrarEstado() {
        System.out.println(this.nombre + " está " + (this.estado ? "encendido" : "apagado") + ".");
    }
}