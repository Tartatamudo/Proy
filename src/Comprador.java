public class Comprador extends Persona {
    private String serviciosPedidos;
    private String clase = "Comprador";

    public Comprador(String nombre, String apellido, String correo, String rut, int nEstrellas, String comentarios, String serviciosPedidos, String contraseña) {
        super(nombre, apellido, correo, rut, nEstrellas, comentarios, contraseña);
        this.serviciosPedidos = serviciosPedidos;

    }
    public void setServiciosPedidos(){
        System.out.println("Ingrese servicio que quiere");
        serviciosPedidos = Proyect.getCadena();
    }

    public String getServiciosPedidos() {
        return serviciosPedidos;
    }
}
