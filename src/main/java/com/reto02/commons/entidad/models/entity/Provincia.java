package com.reto02.commons.entidad.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="provincia")
public class Provincia
{
	
	@Column(name = "IDPROVINCIA")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvincia;
    
    @Column(name = "DESCPROVINCIA")
    private String descProvincia;
    
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @PrePersist
    public void prePersist() {
    	this.fechaRegistro = new Date();
    }

    // Constructor vacío
    public Provincia() {
    }

    // Constructor con todos los atributos
    public Provincia(Long idProvincia, String descProvincia, Date fechaRegistro) {
        this.idProvincia = idProvincia;
        this.descProvincia = descProvincia;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y setters
    public Long getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Long idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getDescProvincia() {
        return descProvincia;
    }

    public void setDescProvincia(String descProvincia) {
        this.descProvincia = descProvincia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

