import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Proyect {
    public static String getCadena() {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        return cadena;
    }

    public static int getNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }

    public static void CrearUsuario(ArrayList<Comprador> compradores, ArrayList<Vendedor> vendedores) {
        System.out.println("Que quieres ser:");
        System.out.println("[1]Comprador");
        System.out.println("[2]Vendedor");

        int eleccion = getNumero();
        switch (eleccion) {
            case 1:
                CrearComprador(compradores);
                break;
            case 2:
                CrearVendedor(vendedores);
                break;
        }
    }

    public static void CrearComprador(ArrayList<Comprador> compradores) {
        Comprador com = new Comprador("", "", "", "", 0, "", "", "");
        com.setNombre();
        com.setApellido();
        com.setRut();
        com.setContraseña();
        com.setCorreo();

        compradores.add(com);
    }

    public static void CrearVendedor(ArrayList<Vendedor> vendedores) {
        Vendedor ven = new Vendedor("", "", "", "", 0, "", 0, "", "");
        ven.setNombre();
        ven.setApellido();
        ven.setRut();
        ven.setContraseña();
        ven.setCorreo();
        ven.setNumero();

        vendedores.add(ven);
    }

    public static int LoginComprador(ArrayList<Comprador> compradores) {
        System.out.println("Ingrese correo");
        String correo = getCadena();
        System.out.println("Ingrese contraseña");
        String contraseña = getCadena();

        for (int i = 0; i < compradores.size(); i++) {
            if ((correo.equals(compradores.get(i).getCorreo())) && (contraseña.equals(compradores.get(i).getContraseña()))) {
                System.out.println("Ingreso como comprador");
                return i;
            }
        }
        System.out.println("correo o contraseña erroneos");
        return 0;
    }

    public static int LoginVendedor(ArrayList<Vendedor> vendedores) {
        System.out.println("Ingrese correo");
        String correo = getCadena();
        System.out.println("Ingrese contraseña");
        String contraseña = getCadena();

        for (int i = 0; i < vendedores.size(); i++) {
            if ((correo.equals(vendedores.get(i).getCorreo())) && (contraseña.equals(vendedores.get(i).getContraseña()))) {
                System.out.println("Ingreso como vendedor");
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Comprador> compradores = new ArrayList<Comprador>();
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        CrearUsuario(compradores, vendedores);
        System.out.println(compradores.get(0).getNombre());


    }

    public static String ClaseLogin() {
        System.out.println("Ingresar como comprador");
        System.out.println("Ingresar como vendedor");
        String clase = "";
        int num;

        int eleccion = getNumero();
        switch (eleccion) {
            case 1:
                return "Comprador";

            case 2:
                return "Vendedeor";

        }
        return clase;
    }

    public static void menu(){
        ArrayList<Comprador> compradores = new ArrayList<Comprador>();
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

        int numLogin;
        String clase;

        System.out.println("[1] Crear Usuario");
        System.out.println("[2] Iniciar sesion");

        int eleccion = getNumero();

        switch (eleccion) {
            case 1:
                CrearUsuario(compradores, vendedores);
            break;
            case 2:
                clase = ClaseLogin();

                if (clase.equals("Comprador")){
                    numLogin = LoginComprador(compradores);
                }else{
                    numLogin  = LoginVendedor(vendedores);
                }
            break;
        }
    }
}
