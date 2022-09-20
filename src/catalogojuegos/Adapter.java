/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogojuegos;

/**
 *
 * @author luisg
 */
public class Adapter implements JuegoPC {

    private JuegoComputadora juegoComputadora;

    public Adapter(JuegoComputadora juegoComputadora) {
        this.juegoComputadora = juegoComputadora;
    }

    @Override
    public String getTitulo() {
        return this.juegoComputadora.getNombre();
    }

    @Override
    public Integer getEdadPegi() {
        if (this.juegoComputadora.getPegiRatingEdad() == PegiRatingEdad.P3) {
            return 3;
        }
        if (this.juegoComputadora.getPegiRatingEdad() == PegiRatingEdad.P7) {
            return 7;
        }
        if (this.juegoComputadora.getPegiRatingEdad() == PegiRatingEdad.P12) {
            return 12;
        }
        if (this.juegoComputadora.getPegiRatingEdad() == PegiRatingEdad.P16) {
            return 16;
        }
        if (this.juegoComputadora.getPegiRatingEdad() == PegiRatingEdad.P18) {
            return 18;
        }
        return -1;
    }

    @Override
    public boolean esJuegoTripleA() {
        return this.juegoComputadora.getPresupuestoEnMillonesDlls() >= 50000000;
    }

    @Override
    public Requerimientos getRequerimientos() {
        Integer gpuGB = this.juegoComputadora.getMinimoMemoriaGPUEnMB() / 1024;
        Integer HDDGb = this.juegoComputadora.getMinimoMemoriaGPUEnMB() / 1024;
        Integer RAMGb = this.juegoComputadora.getRamRequeridaEnMB() / 1024;
        Double cpuGhz = this.juegoComputadora.getVelocidadNucleoEnGHZ();
        Integer coresNum = this.juegoComputadora.getNucleosRequeridos();

        Requerimientos requerimientos = new Requerimientos(gpuGB, HDDGb, RAMGb, cpuGhz, coresNum);
        return requerimientos;
    }
}
