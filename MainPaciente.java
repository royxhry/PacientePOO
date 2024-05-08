import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese nombre y apellido
        System.out.println("Ingresa nombre y apellido:");
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        
        // Solicitar al usuario que ingrese la edad
        System.out.println("Ingresa edad:");
        int edad = sc.nextInt();
        
        // Solicitar al usuario que ingrese la altura
        System.out.println("Ingresa tu altura:");
        double altura = sc.nextDouble();
        
        // Crear un objeto de tipo Paciente
        Paciente ps= new Paciente();
        
        // Establecer los valores de nombre, apellido, edad y altura utilizando los métodos set
        ps.setNombre(nombre);
        ps.setApellido(apellido);
        ps.setEdad(edad);
        ps.setAltura(altura);
        
        // Utilizar los métodos get para obtener los valores y no hacer nada con ellos
        ps.getNombre();
        ps.getApellido();
        ps.getEdad();
        ps.getEdad();
        
        // Imprimir la información del paciente utilizando el método toString
        System.out.println(ps.toString());
        
        // Cerrar el Scanner
        sc.close();
    }
}
