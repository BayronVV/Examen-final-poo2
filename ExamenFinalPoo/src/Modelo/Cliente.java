/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Cliente {
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String profesion;
    private String ciudad;
    private Integer museo;

    public Cliente() {
    }

    public Cliente(Integer cedula) {
        this.cedula = cedula;
    }

    public Cliente(Integer cedula, String ciudad) {
        this.cedula = cedula;
        this.ciudad = ciudad;
    }
    
    

    public Cliente(Integer cedula, String nombre, String apellido, String genero, String profesion, String ciudad, Integer museo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.profesion = profesion;
        this.ciudad = ciudad;
        this.museo = museo;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getMuseo() {
        return museo;
    }

    public void setMuseo(Integer museo) {
        this.museo = museo;
    }
    
    
    
}
