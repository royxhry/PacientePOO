public class Paciente {

    String nombre, apellido;
    int edad;
    double altura;
    
    // Método para obtener el nombre del paciente
    public String getNombre() {
        return nombre;
    }
    
    // Método para establecer el nombre del paciente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para obtener el apellido del paciente
    public String getApellido() {
        return apellido;
    }
    
    // Método para establecer el apellido del paciente
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Método para obtener la edad del paciente
    public int getEdad() {
        return edad;
    }
    
    // Método para establecer la edad del paciente
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método para obtener la altura del paciente
    public double getAltura() {
        return altura;
    }
    
    // Método para establecer la altura del paciente
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método toString para representar la información del paciente
    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }
}
