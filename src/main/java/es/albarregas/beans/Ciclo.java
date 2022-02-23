/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 *
 * @author gared
 */
@Entity
@Table(name = "ciclosA")
public class Ciclo implements Serializable{
 @Id
 @GeneratedValue(strategy = IDENTITY)
 @Column(name = "idCiclo")
    int idCiclo;
 @Column(name = "nombre")
    String nombre;
 
 @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL},orphanRemoval = true)
 @JoinColumn(name = "idDeCiclo")
 @OrderColumn(name = "idx")
    List <Modulo> modulos;

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }  
}
