/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogojuegos;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera | 00000228549, Gabriel Francisco
 * Piñuelas Ramos | 00000230626, Ricardo Pacheco Urias | 00000229178, Abraham
 * Sered Gómez Martínez | 00000228796
 */
public class Requerimientos {

    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;

    public Requerimientos(final Integer gpuGb, final Integer HDDGb, final Integer RAMGb, final Double cpuGhz, final Integer coresNum) {
        this.gpuGb = gpuGb;
        this.HDDGb = HDDGb;
        this.RAMGb = RAMGb;
        this.cpuGhz = cpuGhz;
        this.coresNum = coresNum;
    }

    public Integer getGpuGb() {
        return gpuGb;
    }

    public Integer getHDDGb() {
        return HDDGb;
    }

    public Integer getRAMGb() {
        return RAMGb;
    }

    public Double getCpuGhz() {
        return cpuGhz;
    }

    public Integer getCoresNum() {
        return coresNum;
    }
}
