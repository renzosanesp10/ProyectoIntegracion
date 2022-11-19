/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;



/**
 *
 * @author HP
 */
public class Empleado {
    private int idEmpleado;
    private int DNI;
    private String usuario;
    private String password;
    private String nombre;
    private String cargo;
    private String sexo;
    private String telefono;
    private String email;
    private String direccion;
    private int idTipo_tipo;
    private String nombre_tipo;

    public Empleado() {
    }
    
    public Empleado(int idEmpleado, int DNI, String usuario, String password, String nombre, String cargo, String sexo, String telefono, String email, String direccion, int idTipo_tipo, String nombre_tipo) {
        this.idEmpleado = idEmpleado;
        this.DNI = DNI;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sexo = sexo;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.idTipo_tipo = idTipo_tipo;
        this.nombre_tipo = nombre_tipo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdTipo_tipo() {
        return idTipo_tipo;
    }

    public void setIdTipo_tipo(int idTipo_tipo) {
        this.idTipo_tipo = idTipo_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    
    
}
