/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogojuegos;

/**
 *
 * @author luisg
 */
public class JuegoComputadora {

    private final String nombre;
    private final PegiRatingEdad pegiRatingEdad;
    private final Double presupuestoEnMillonesDlls;
    private final Integer minimoMemoriaGPUEnMB;
    private final Integer almacenamientoRequeridoEnMB;
    private final Integer ramRequeridaEnMB;
    private final Integer nucleosRequeridos;
    private final Double velocidadNucleoEnGHZ;

    public JuegoComputadora(final String nombre, final PegiRatingEdad pegiRatingEdad, final Double presupuestoEnMillonesDlls, final Integer minimoMemoriaGPUEnMB, final Integer almacenamientoRequeridoEnMB, final Integer ramRequeridaEnMB, final Integer nucleosRequeridos, final Double velocidadNucleoEnGHZ) {
        this.nombre = nombre;
        this.pegiRatingEdad = pegiRatingEdad;
        this.presupuestoEnMillonesDlls = presupuestoEnMillonesDlls;
        this.minimoMemoriaGPUEnMB = minimoMemoriaGPUEnMB;
        this.almacenamientoRequeridoEnMB = almacenamientoRequeridoEnMB;
        this.ramRequeridaEnMB = ramRequeridaEnMB;
        this.nucleosRequeridos = nucleosRequeridos;
        this.velocidadNucleoEnGHZ = velocidadNucleoEnGHZ;
    }

    public String getNombre() {
        return nombre;
    }

    public PegiRatingEdad getPegiRatingEdad() {
        return pegiRatingEdad;
    }

    public Double getPresupuestoEnMillonesDlls() {
        return presupuestoEnMillonesDlls;
    }

    public Integer getMinimoMemoriaGPUEnMB() {
        return minimoMemoriaGPUEnMB;
    }

    public Integer getAlmacenamientoRequeridoEnMB() {
        return almacenamientoRequeridoEnMB;
    }

    public Integer getRamRequeridaEnMB() {
        return ramRequeridaEnMB;
    }

    public Integer getNucleosRequeridos() {
        return nucleosRequeridos;
    }

    public Double getVelocidadNucleoEnGHZ() {
        return velocidadNucleoEnGHZ;
    }
}
