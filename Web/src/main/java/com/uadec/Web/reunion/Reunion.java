package com.uadec.Web.reunion;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reuniones")
public class Reunion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_programa")
    private String nombrePrograma;

    @Column(name = "fecha_reunion")
    private Date fechaReunion;

    @Column(name = "responsable_reunion")
    private String responsableReunion;

    @Column(name = "participantes", columnDefinition = "TEXT")
    private String participantes;

    @Column(name = "objetivos", columnDefinition = "TEXT")
    private String objetivos;

    @Column(name = "pendientes", columnDefinition = "TEXT")
    private String pendientes;

    @Column(name = "descripcion_presupuesto", columnDefinition = "TEXT")
    private String descripcionPresupuesto;

    @Column(name = "ingresos")
    private Double ingresos;

    @Column(name = "gastos")
    private Double gastos;

    @Column(name = "total")
    private Double total;

    @Column(name = "evaluacion_programa", columnDefinition = "TEXT")
    private String evaluacionPrograma;

    @Column(name = "fecha_proxima_reunion")
    private Date fechaProximaReunion;

    // Constructor, getters y setters
    public Reunion() {
    }

    public Reunion(String nombrePrograma, Date fechaReunion, String responsableReunion, String participantes,
                   String objetivos, String pendientes, String descripcionPresupuesto, Double ingresos,
                   Double gastos, Double total, String evaluacionPrograma, Date fechaProximaReunion) {
        this.nombrePrograma = nombrePrograma;
        this.fechaReunion = fechaReunion;
        this.responsableReunion = responsableReunion;
        this.participantes = participantes;
        this.objetivos = objetivos;
        this.pendientes = pendientes;
        this.descripcionPresupuesto = descripcionPresupuesto;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.total = total;
        this.evaluacionPrograma = evaluacionPrograma;
        this.fechaProximaReunion = fechaProximaReunion;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public Date getFechaReunion() {
        return fechaReunion;
    }

    public void setFechaReunion(Date fechaReunion) {
        this.fechaReunion = fechaReunion;
    }

    public String getResponsableReunion() {
        return responsableReunion;
    }

    public void setResponsableReunion(String responsableReunion) {
        this.responsableReunion = responsableReunion;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getPendientes() {
        return pendientes;
    }

    public void setPendientes(String pendientes) {
        this.pendientes = pendientes;
    }

    public String getDescripcionPresupuesto() {
        return descripcionPresupuesto;
    }

    public void setDescripcionPresupuesto(String descripcionPresupuesto) {
        this.descripcionPresupuesto = descripcionPresupuesto;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEvaluacionPrograma() {
        return evaluacionPrograma;
    }

    public void setEvaluacionPrograma(String evaluacionPrograma) {
        this.evaluacionPrograma = evaluacionPrograma;
    }

    public Date getFechaProximaReunion() {
        return fechaProximaReunion;
    }

    public void setFechaProximaReunion(Date fechaProximaReunion) {
        this.fechaProximaReunion = fechaProximaReunion;
    }
}
