public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String rut;
    private int nEstrellas;
    private String comentarios;
    private String contraseña;
    public Persona(String nombre, String apellido, String correo, String rut, int nEstrellas, String comentarios, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.rut = rut;
        this.nEstrellas = nEstrellas;
        this. comentarios = comentarios;
        this.contraseña = contraseña;
    }

    public void setNombre(){
        System.out.println("Ingrese nombre");
        nombre = Proyect.getCadena();
    }
    public void setApellido(){
        System.out.println("Ingrese apellido");
        apellido = Proyect.getCadena();
    }
    public void setCorreo(){
        System.out.println("Ingrese correo");
        correo = Proyect.getCadena();
    }
    public void setRut(){
        System.out.println("Ingrese rut");
        rut = Proyect.getCadena();
    }
    public void setnEstrellas(){

        nEstrellas = Proyect.getNumero();
    }
    public void setComentarios(){
        comentarios = Proyect.getCadena();
    }
    public void setContraseña() {
        System.out.println("Ingrese contraseña");
        contraseña = Proyect.getCadena();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRut() {
        return rut;
    }

    public int getnEstrellas() {
        return nEstrellas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public String getContraseña() {
        return contraseña;
    }
}
