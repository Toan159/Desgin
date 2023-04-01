/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_Builder_Pattern;

/**
 *
 * @author toan
 */
public class Computer {
    String CPU,RAM,SCREEN,HardDisk;

    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.SCREEN = b.SCREEN;
        this.HardDisk = b.HardDisk;
    }
    
    @Override
    public String toString() {
        return "Computer{" + "CPU=" + CPU + ", RAM=" + RAM + ", SCREEN=" + SCREEN + ", HardDisk=" + HardDisk + '}';
    }
    
    public static class Builder{
        String CPU,RAM,SCREEN,HardDisk;
        public Builder buildCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder buildRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder buildSCREEN(String SCREEN){
            this.SCREEN = SCREEN;
            return this;
        }
        public Builder buildHardDisk(String HardDisk){
            this.HardDisk = HardDisk;
            return this;
        }
        public Computer buildComputer(){
            return new Computer(this);
        }
    }
}
