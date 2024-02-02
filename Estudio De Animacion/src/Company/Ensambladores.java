/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danieldangelo
 */
public class Ensambladores extends Thread {
    private int type;
    private int name;
    private int duracionDia;
    private float salarioAcumulado;
    private int salario;
    private float contador;
    private Drive drive;
    private Semaphore sem;

    public Ensambladores(int type, int name, Drive d, Semaphore m, int dia) {
        this.type = type;
        this.name = name;
        this.salario = 50;
        this.drive = d;
        this.salarioAcumulado = 0;
        this.sem = m;
        this.contador = 0;
        this.duracionDia = dia;
    }
    
    @Override
        public void run(){
            while(true){
                
                try {
                    obtenerSalario();
                    System.out.println("Trabajador: " + type + "." + name +  " ha ganado: "+this.salarioAcumulado+"$");
                    trabajando();
                    sleep(this.duracionDia);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    
    public void obtenerSalario(){
        this.salarioAcumulado += this.salario*24;
    }
    
    public void trabajando(){
        this.contador += 0.34;
        if (this.contador >= 1) {
            this.contador = 0;
            try {
                this.sem.acquire();
//                this.drive.addDoblajes(3);
                this.sem.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ActoresDoblaje.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
//    public void GetSalario(){
//        
//        this.salaryAcc += this.salary*24;
//        
//    }
//    
//    public void Run(){
//        while (true){
//            try{
//                GetSalario();
//                EnsamblarCap();
//                //Tiene que retornar el cap listo, mostrarlo y agregarlo al drive
//                sleep(this.duracionDia);
//            }catch (InterruptedException ex) {
//                Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//    public void EnsamblarCap(){
//        //Tiene que ingresar al drive y ver cuantas partes hay para poder armar un cap, si estan las suficientes, las junta y sube al drive.
//    }
}