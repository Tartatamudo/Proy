public class Vendedor extends Persona{
    private int numero;
    private String servicioVenta;
    private String clase = "Vendedor";


    public Vendedor(String nombre, String apellido, String correo, String rut, int nEstrellas, String comentarios, int numero, String servicioVenta, String contraseña) {
        super(nombre, apellido, correo, rut, nEstrellas, comentarios,contraseña);
        this.numero = numero;
        this.servicioVenta = servicioVenta;
    }
    public void setNumero(){
        System.out.println("Ingrese numero");
        numero = Proyect.getNumero();
    }
    public void setServicioVenta(){
        servicioVenta = Proyect.getCadena();
    }

    public int getNumero() {
        return numero;
    }

    public String getServicioVenta() {
        return servicioVenta;
    }
}
