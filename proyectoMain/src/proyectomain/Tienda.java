package proyectomain;

import AdministradorColaborador.Administrador;
import AdministradorColaborador.Colaborador;
import ClienteProveedor.Clientes;
import ClienteProveedor.Proveedor;
import Producto.Productos;

public class Tienda {

    public static void main(String[] args) {

        Administrador administrador1 = new Administrador();
        Colaborador colaborador1 = new Colaborador();
        Clientes clientes1 = new Clientes();
        Proveedor proveedor1 = new Proveedor();
        Productos productos1 = new Productos();
        
        
        administrador1.Login();
        administrador1.mostrarDatos();
        
        
        administrador1.setNombre("Orlando");
        String nombre = administrador1.getNombre();
        administrador1.setApellido("Acuña");
        String apellido = administrador1.getApellido();
        administrador1.setEdad(29);
        int edad = administrador1.getEdad();
        administrador1.setId(22);
        int id = administrador1.getId();

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su Edad es: " + edad);
        System.out.println("Su numero de ID es: " + id);
        
        
        
        colaborador1.Login1();
        colaborador1.mostrarDatos();
       
        
        colaborador1.setNombre("Susan");
        String nombre1 = colaborador1.getNombre();
        colaborador1.setApellido("Ramirez");
        String apellido1 = colaborador1.getApellido();
        colaborador1.setEdad(22);
        int edad1 = colaborador1.getEdad();
        colaborador1.setEmpleado(18);
        int empleado = colaborador1.getEmpleado();
        System.out.println("Su nombre es: " + nombre1);
        System.out.println("Su Apellido es: " + apellido1);
        System.out.println("Su Edad es: " + edad1);
        System.out.println("Su número de empleado es: " + empleado);
        
        clientes1.Login2();
        clientes1.mostrarDatos();

        clientes1.setNombre("Josselyn");
        String nombre2 = clientes1.getNombre();
        clientes1.setApellido("Pizarro");
        String apellido2 = clientes1.getApellido();
        clientes1.setEdad(22);
        int edad2 = clientes1.getEdad();
        clientes1.setCorreo("Jocelynpizarro131@gmail.com");
        String correo = clientes1.getCorreo();
        clientes1.setCedula(207250087);
        int cedula = clientes1.getCedula();
        clientes1.setTelefono(24505534);
        int telefono = clientes1.getTelefono();

        System.out.println("Su nombre es: " + nombre2);
        System.out.println("Su Apellido es: " + apellido2);
        System.out.println("Su Edad es: " + edad2);
        System.out.println("Su correo eléctronico es: " + correo);
        System.out.println("Su número de cédula es: " + cedula);
        System.out.println("Su número de teléfono es: " + telefono);
        
        proveedor1.mostrarDatos();

        proveedor1.setNombre("Office Depot");
        String nombre3 = proveedor1.getNombre();
        proveedor1.setTelefono("22505534");
        String telefono3 = proveedor1.getTelefono();
        proveedor1.setDireccion("Uruca,San Jose");
        String direccion = proveedor1.getDireccion();
        proveedor1.setId(22);
        int id3 = proveedor1.getId();

        System.out.println("El nombre del proveedor es: " + nombre3);
        System.out.println("Su telefono es: " + telefono3);
        System.out.println("Su direccion es: " + direccion);
        System.out.println("Su ID es: " + id3);
        
            
        productos1.mostrarDatos();
        
        productos1.setDescripcion("Etiquetas");
        String descripcion = productos1.getDescripcion();
        productos1.setGarantia("2 años");
        String garantia = productos1.getGarantia();
        productos1.setPrecio(1500);
        int precio = productos1.getPrecio();
        
        System.out.println("Selecciono Producto: " + descripcion);
        System.out.println("La garantia será: " + garantia);
        System.out.println("El precio será: " + precio);
        
        


       
        administrador1.menu();
        colaborador1.menu1();
        clientes1.menu2();
        proveedor1.menu1();

    }
    
   }

       