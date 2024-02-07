/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Dashboard.Dashboard;
import javax.swing.JOptionPane;

/**
 *
 * @author danieldangelo
 */
public class Drive {
    
    public String name;
    public int animations;
    public int plotTwist;
    public int guiones;
    public int escenarios;
    public int doblajes;
    public int capacidadTotal;
    public int delivery;
    public int valorDeadline;
    public int capsDisponibles;
    public int capsPlotTwist;
    public Dashboard db;
    public Empresa empresa;
    
    
    
    public Drive(String name, int delivery, Dashboard db, Empresa empresa){
        this.name = name;
        this.animations = 0;
        this.doblajes = 0;
        this.escenarios = 0;
        this.guiones = 0;
        this.plotTwist = 0;
        this.capacidadTotal = 0;
        this.delivery = delivery;
        this.capsDisponibles = 0;
        this.capsPlotTwist = 0;
        this.db = db;
        this.empresa = empresa;
        
    }

    public void setCapsDisponibles(int capsDisponibles) {
        
        this.capsDisponibles = capsDisponibles;
    }

    public void setCapsPlotTwist(int capsPlotTwist) {
        
        this.capsPlotTwist = capsPlotTwist;
    }

    public int getDelivery() {
        
        return delivery;
    }

    public void setDelivery(int delivery) {
        
        this.delivery = delivery;
    }
    
    
    
    //Los print son para correr en frio pero hay que mostrarlo en la interfaz
    public void addAnimation(int type){
        if (animations < 55){
            if (type == 2){
                this.animations += 1;
                db.getFieldAnimaciones().setText(Integer.toString(animations));
                System.out.println("animaciones disponibles:" + this.animations);
            }
        }else System.out.println("El drive de animaciones esta lleno.");
    }
    
    public void addPlotTwist(int type){
        if (plotTwist < 10){
            if (type == 4) {
                this.plotTwist += 1;
<<<<<<< HEAD
                db.getFieldPlotTwists().setText(Integer.toString(guiones));
                db.getFieldPlot().setText(Integer.toString(plotTwist));
=======
                db.getFieldPlot().setText(Integer.toString(plotTwist));
//                db.getFieldPlotTwists().setText(Integer.toString(guiones));
>>>>>>> 40c4607920393759aecfb66da5d64fce8e56e724
                System.out.println("PlotTwists disponibles:" + this.plotTwist);
            }
        }else System.out.println("El drive de plottwists esta lleno.");
    }
    
    public void addGuiones(int type){
        if (guiones < 25){
            if (type == 0){
                this.guiones += 1;
                db.getField().setText(Integer.toString(guiones));//Esta es la instrucción que muestra en el textfield
                System.out.println("guiones disponibles:" + this.guiones);
            }
        }else System.out.println("El drive de guiones esta lleno");
    }
    
    public void addEscenarios(int type){
        if (escenarios < 20){
            if (type == 1){
                this.escenarios += 1;
                db.getFieldEscenarios().setText(Integer.toString(escenarios));
                System.out.println("escenarios disponibles:" + this.escenarios);
            }
        }else System.out.println("El drive de escenarios esta lleno.");
    }
    
    public void addDoblajes(int type){
        if(doblajes < 35){
            if (type == 3){
                this.doblajes += 1;
                db.getFieldDoblajes().setText(Integer.toString(doblajes));
                System.out.println("doblajes disponibles:" + this.doblajes);
            }
        }else System.out.println("El drive de doblajes esta lleno.");
    }

    public int CapacidadDrive(){
        
        return this.capacidadTotal = this.animations + this.plotTwist + this.guiones + this.escenarios + this.doblajes;
        
    }
    
    //Solo crea capitulos de nick
    public void CrearCap(int type){
        //if (this.empresa.name.equals("Nickelodeon")){//para los ensamladores de Nick
            if(type == 5 && this.guiones >= 2 && this.escenarios >= 1 && this.animations >= 4 && this.doblajes >= 4){
                this.capsDisponibles += 1;
                db.setUtilidadTTL((float) 450);
                db.setGanaciaBruto();
                db.getCmpUtilidad().setText(Float.toString(db.getGananciaBruto()));
                db.getCmpGanancia().setText(Float.toString(db.getUtilidadTTL()));
                guiones -= 2;
                escenarios -= 1;
                animations -= 4;
                doblajes -= 4;
                System.out.println("Capitulos disponibles: " + this.capsDisponibles);
                db.getFieldCapitulos().setText(Integer.toString(capsDisponibles));
//                this.capsDisponibles >= 5
                if(this.capsDisponibles % 5 == 0){
                    this.capsPlotTwist += 2;
                    db.setUtilidadTTL((float) 500*2);
                    db.setGanaciaBruto();
                    db.getCmpUtilidad().setText(Float.toString(db.getGananciaBruto()));
                    db.getCmpGanancia().setText(Float.toString(db.getUtilidadTTL()));
                    this.plotTwist -= 2;
                    this.guiones -= 2;
                    this.escenarios -= 1;
                    this.animations -= 4;
                    this.doblajes -= 4;
                    db.getFieldCapPlot().setText(Integer.toString(capsPlotTwist));
                }
            }else{
                System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
  //          }
            
       // }else { System.out.println("No está entrando el type");//if (empresa.name.equals("Disney")){//para los ensambladores de Disney
//            if (type == 5 && guiones == 1 && escenarios == 2 && animations == 6 && doblajes == 5){
//                this.capsDisponibles +=1;
//                guiones -= 1;
//                escenarios -= 2;
//                animations -= 6;
//                doblajes -= 5;
//                db.getFieldCapitulos2().setText(Integer.toString(capsDisponibles));
//            }else{
//                System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
//            }
        }
                
    }
    // hay que hacer que el contador baje hasta 0, poner variables de ingresos para capitulos
    public void EntregarCaps(){
        
 //       if(empresa.delivery == 0){
            System.out.println("Enviando capitulos");
            //this.capsDisponibles = 0;
            //setCapsPlotTwist(0);
            System.out.println("Se han enviado los capitulos");
                
//        }
//        if(this.capsDisponibles > 0 && this.capsPlotTwist > 0){
//            if(type == 10){
//                setCapsDisponibles(0);
//                setCapsPlotTwist(0);
//                MostrarCapsDisponibles(capsDisponibles);
//                MostrarCapsPlotDisponibles(capsPlotTwist);
//                
//                System.out.println("Los capitulos se han enviado");
//            }else{
//                System.out.println("No hay capitulos para enviar");
//            }
//        }
    }
    

    public void MostrarCapsDisponibles(int capsDisponibles){
        db.getFieldCapitulos().setText(Integer.toString(capsDisponibles));
    }
    
    public void MostrarCapsPlotDisponibles(int capsPlotTwist){
        db.getFieldCapPlot().setText(Integer.toString(capsPlotTwist));
    }
    
    public void ActualizarDeadlinePm(){
        
        db.getCmpDeadline().setText(Integer.toString(empresa.delivery--));
    }
    
    //no funciona
    public void ReiniciarDeadline(){
        int deadline = Integer.parseInt(db.getCmpDeadline().getText());
        if(deadline == 0){
            this.capsDisponibles = 0;
            this.capsPlotTwist = 0;
        }
    }
}