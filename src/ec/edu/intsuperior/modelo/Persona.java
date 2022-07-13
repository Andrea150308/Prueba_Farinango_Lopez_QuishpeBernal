package ec.edu.intsuperior.modelo;
 import java.util.Date;

public class Persona {
    private String nombre1;
    private String nombre2;
    private String ci;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String celular;
    private String correo;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre1, String nombre2, String ci, String apellido1, String apellido2, String direccion, String celular, String correo, Date fechaNacimiento) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ci = ci;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.celular = celular;
        this.correo= correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCelular() {
        return celular;
    }

    public String getCi() {
        return ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getCorreo() {
        return correo;
    }
    
    public int calcularEdad(){
        int edad=20;
        
        return edad;
       
    }
    
    @Override
     public String toString(){
         return"los datos del onjeto son: \n"
                 +"cedula:"+getCi()+"\n"
                 + "Apellidos y Nombres: "+getApellido1()+" "+getApellido2()+
                 " "+getNombre1()+" "+getNombre2()+"\n"
                 +"Direccion: "+getDireccion()+"\n"
                 +"Celular: "+getCelular()+"\n"
                 +"Correo: "+getCorreo()+"\n"
                 +"Edad: "+calcularEdad();                 
     }      
       
}

