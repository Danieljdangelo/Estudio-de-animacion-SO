/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Class.ManejoDeData;
import Dashboard.Dashboard;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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
    public int sumaSalarios;
    static float CostosTotalesDisney;
    static float CostosTotalesNick;

    static float GananciasBrutoDisney;
    static float GananciasBrutoNick;
    static float UtilidadTotalDisney;
    static float UtilidadTotalNick; 
    public int SalarioDescPM;
    
    ManejoDeData data = new ManejoDeData();

    
    
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

    
    public void setGuiones(int guiones){
        this.guiones = guiones;
    }
    
    public int getGuiones(){
        return this.guiones;
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

    public void addAnimation(int type){
        if("Disney".equals(this.name))
            if (animations < 55){
                if (type == 2){
                    this.animations += 2;
                    db.getFieldAnimaciones1().setText(Integer.toString(animations/4));
                    System.out.println("Animaciones de Disney disponibles:" + this.animations);
                }
            }else {
                System.out.println("El drive de animaciones de Disney esta lleno.");
        }else{
            if (animations < 55){
                if (type == 2){
                    this.animations += 2;
                    db.getFieldAnimaciones().setText(Integer.toString(animations/4));
                    System.out.println("Animaciones de Nick disponibles:" + this.animations);
                }
            }else System.out.println("El drive de animaciones de Nick esta lleno.");
        }
    }

    public void addPlotTwist(int type){
        if("Disney".equals(this.name)){
            if (plotTwist < 10){
                if (type == 4) {
                    this.plotTwist += 1;
                    db.getFieldPlot1().setText(Integer.toString(plotTwist));
                    System.out.println("PlotTwists de Disney disponibles:" + this.plotTwist);
                }
            }else System.out.println("El drive de plottwists de Disney esta lleno.");
        }else{
            if (plotTwist < 10){
                if (type == 4) {
                    this.plotTwist += 1;
                    db.getFieldPlot().setText(Integer.toString(plotTwist));
                    System.out.println("PlotTwists de Nick disponibles:" + this.plotTwist);
                }
            }else System.out.println("El drive de plottwists de Nick esta lleno.");
        }
            
    }
    
    public void addGuiones(int type){
        if("Disney".equals(this.name)){
            if (guiones < 25){
                if (type == 0){
                    this.guiones += 1;
                    db.getField1().setText(Integer.toString(guiones));
                    System.out.println("Guiones Disney disponibles:" + this.guiones);
                }
            }else System.out.println("El drive de guiones de disney esta lleno");
        }else{
            if (guiones < 25){
                if (type == 0){
                    this.guiones += 1;
                    db.getField().setText(Integer.toString(guiones));
                    System.out.println("Guiones Nick disponibles:" + this.guiones);
                }
            }else System.out.println("El drive de guiones de nick esta lleno");
        }
    }
    
    public void addEscenarios(int type){
        if("Disney".equals(this.name)){
            if (escenarios < 20){
                if (type == 1){
                    this.escenarios += 1;
                    db.getFieldEscenarios1().setText(Integer.toString(escenarios));
                    System.out.println("Escenarios de Disney disponibles:" + this.escenarios);
                }
            }else System.out.println("El drive de escenarios de Disney esta lleno.");
        }else{
            if (escenarios < 20){
                if (type == 1){
                    this.escenarios += 1;
                    db.getFieldEscenarios().setText(Integer.toString(escenarios));
                    System.out.println("Escenarios de Nick disponibles:" + this.escenarios);
                }
            }else System.out.println("El drive de escenarios de Nick esta lleno.");
        }
    }
    
    public void addDoblajes(int type){
        if("Disney".equals(this.name)){
            if(doblajes < 35){
                if (type == 3){
                    this.doblajes += 3;
                    db.getFieldDoblajes1().setText(Integer.toString(doblajes/4));
                    System.out.println("Doblajes de Disney disponibles:" + this.doblajes);
                }
            }else System.out.println("El drive de doblajes de Disney esta lleno.");
        }else{
            if(doblajes < 35){
                if (type == 3){
                    this.doblajes += 3;
                    db.getFieldDoblajes().setText(Integer.toString(doblajes/4));
                    System.out.println("Doblajes de Nick disponibles:" + this.doblajes);
                }
            }else System.out.println("El drive de doblajes de Nick esta lleno.");
        }
    
    }

    public int CapacidadDrive(){
        
        return this.capacidadTotal = this.animations + this.plotTwist + this.guiones + this.escenarios + this.doblajes;
        
    }
    

//Crea capitulos para cada empresa
    public void CrearCaps(int type){
        if("Disney".equals(this.name)){
            if(type == 5){
                if(this.guiones >= 1 && this.escenarios >= 1 && this.animations >= 2 && this.doblajes >= 4){
                    
                    this.capsDisponibles += 1;
                    
                    SacarGananciasEnBruto();
                    
                    guiones -= 1;
                    escenarios -= 1;
                    animations -= 2;
                    doblajes -= 4;
                    
                    if (guiones < 0){
                        guiones = 0;
                    }
                    if (escenarios < 0){
                        escenarios = 0;
                    }
                    if (animations < 0){
                        animations = 0;
                    }
                    if (doblajes < 0){
                        doblajes = 0;
                    }
                    
                    System.out.println("Capitulos disponibles: " + this.capsDisponibles);
                    db.getFieldCapitulos1().setText(Integer.toString(this.capsDisponibles));
                    
                    if(this.capsDisponibles % 2 == 0){
                        this.capsPlotTwist += 3;
                        
                        SacarGananciasEnBruto();
                                
                        this.plotTwist -= 3;
                        this.guiones -= 1;
                        this.escenarios -= 1;
                        this.animations -= 2;
                        this.doblajes -= 4;
                        
                        if (guiones < 0){
                            guiones = 0;
                        }
                        if (escenarios < 0){
                            escenarios = 0;
                        }
                        if (animations < 0){
                            animations = 0;
                        }
                        if (doblajes < 0){
                            doblajes = 0;
                        }
                        if (plotTwist < 0){
                            plotTwist = 0;
                        }

                    db.getFieldCapPlot1().setText(Integer.toString(capsPlotTwist));
                    }else{
                        System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
                    }   
                }
            }
        }else{
            if(type == 5){
                if(this.guiones >= 2 && this.escenarios >= 1 && this.animations >= 4 && this.doblajes >= 4){
                    this.capsDisponibles += 1;
                    
                    SacarGananciasEnBruto();

                    guiones -= 2;
                    escenarios -= 1;
                    animations -= 4;
                    doblajes -= 4;
                    
                    if (guiones < 0){
                        guiones = 0;
                    }
                    if (escenarios < 0){
                        escenarios = 0;
                    }
                    if (animations < 0){
                        animations = 0;
                    }
                    if (doblajes < 0){
                        doblajes = 0;
                    }
                    
                    System.out.println("Capitulos disponibles: " + this.capsDisponibles);
                    db.getFieldCapitulos().setText(Integer.toString(capsDisponibles));
                    
                    if(this.capsDisponibles % 5 == 0){
                        this.capsPlotTwist += 2;
                        
                        SacarGananciasEnBruto();
                        
                        this.plotTwist -= 2;
                        this.guiones -= 2;
                        this.escenarios -= 1;
                        this.animations -= 4;
                        this.doblajes -= 4;
                        
                        if (guiones < 0){
                            guiones = 0;
                        }
                        if (escenarios < 0){
                            escenarios = 0;
                        }
                        if (animations < 0){
                            animations = 0;
                        }
                        if (doblajes < 0){
                            doblajes = 0;
                        }
                        if (plotTwist < 0){
                            plotTwist = 0;
                        }
                        
                        db.getFieldCapPlot().setText(Integer.toString(capsPlotTwist));
                    }
                }else{
                    System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
                }
            }
        }
    }


    public void SacarCostosOperativos(float salarios){
        if("Disney".equals(this.name)){
            this.CostosTotalesDisney = salarios;
            db.setCostosOP1(this.CostosTotalesDisney);
            db.getCmpCostos1().setText(Float.toString(db.getCostosOP1()));
            SacarUtilidadTotal();
            
        }else{
            this.CostosTotalesNick = salarios;
            db.setCostosOP(this.CostosTotalesNick);
            db.getCmpCostos().setText(Float.toString(db.getCostosOP()));
            SacarUtilidadTotal();
        }
    }
    
    public void SacarGananciasEnBruto(){
        if("Disney".equals(this.name)){            
            this.GananciasBrutoDisney += 250;
            db.setGanaciaBruto1(this.GananciasBrutoDisney);
            db.getCmpGanancia1().setText(Float.toString(db.getGananciaBruto1()));
            
            if(this.capsDisponibles % 2 ==0){

                this.GananciasBrutoDisney += 600*3;
                db.setGanaciaBruto1(this.GananciasBrutoDisney);
                db.getCmpGanancia1().setText(Float.toString(db.getGananciaBruto1()));
                           
            }else{
                System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
            }
        }else{
            this.GananciasBrutoNick += 450;
            db.setGanaciaBruto(this.GananciasBrutoNick);
            db.getCmpGanancia().setText(Float.toString(db.getGananciaBruto()));
            
            if(this.capsDisponibles % 5 ==0){

                this.GananciasBrutoNick += 500*2;
                db.setGanaciaBruto(this.GananciasBrutoNick);
                db.getCmpGanancia().setText(Float.toString(db.getGananciaBruto()));
                      
            }else{
                System.out.println("Todavía no se puede crear un capitulo completo con lo que se ha subido al drive.");
            }
            
        }

    }
    
    public void SacarUtilidadTotal(){
        if("Disney".equals(this.name)){
            
            this.UtilidadTotalDisney = this.GananciasBrutoDisney - (this.CostosTotalesDisney/1000);
            db.setUtilidadTTL1(this.UtilidadTotalDisney);
            db.getCmpUtilidad1().setText(Float.toString(db.getUtilidadTTL1()));
            
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        datos.setValue(db.getUtilidadTTL(), "Utilidad", "Nickelodeon");
        datos.setValue(db.getUtilidadTTL1(), "Utilidad", "Disney");
        
        JFreeChart grafico = ChartFactory.createBarChart3D(
        "Utilidades Nickelodeon vs. Disney",
        "Empresas",
        "Utilidad",
        datos,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
        );
        
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,600));
        
        db.getPnlGrafica1().setLayout(new BorderLayout());
        db.getPnlGrafica1().add(panel, BorderLayout.NORTH);
        
        ChartPanel panel1 = new ChartPanel(grafico);
        panel1.setMouseWheelEnabled(true);
        panel1.setPreferredSize(new Dimension(400,600));
        
        db.getPnlGrafica().setLayout(new BorderLayout());
        db.getPnlGrafica().add(panel1, BorderLayout.NORTH);
        

            
        }else{
            
            this.UtilidadTotalNick = this.GananciasBrutoNick - (this.CostosTotalesNick/1000);
            db.setUtilidadTTL(this.UtilidadTotalNick);
            db.getCmpUtilidad().setText(Float.toString(db.getUtilidadTTL()));
            
        }

    }
    
    public void MostrarCapsDisponibles(int capsDisponibles){
        if("Disney".equals(this.name)){
            db.getFieldCapitulos1().setText(Integer.toString(capsDisponibles));
        }else{
            db.getFieldCapitulos().setText(Integer.toString(capsDisponibles));
        }
    }
    
    public void MostrarCapsPlotDisponibles(int capsPlotTwist){
        if("Disney".equals(this.name)){
            db.getFieldCapPlot1().setText(Integer.toString(capsPlotTwist));
        }else{
            db.getFieldCapPlot().setText(Integer.toString(capsPlotTwist));
        }
    }
    
    public void ActualizarDeadlinePm(){
        if("Disney".equals(this.name)){
            db.getCmpDeadline1().setText(Integer.toString(empresa.delivery--));
            if (empresa.delivery == 0){
                this.capsDisponibles = 0;
                this.capsPlotTwist = 0;
                db.getFieldCapitulos1().setText(Integer.toString(this.capsDisponibles));
                db.getFieldCapPlot1().setText(Integer.toString(capsPlotTwist));
                int[] valores = data.leerTXT();
                empresa.delivery = valores[7];
                db.getCmpDeadline1().setText(Integer.toString(empresa.delivery));
            }
        }else{
            db.getCmpDeadline().setText(Integer.toString(empresa.delivery--));
            if (empresa.delivery == 0){
                this.capsDisponibles = 0;
                this.capsPlotTwist = 0;
                db.getFieldCapitulos().setText(Integer.toString(this.capsDisponibles));
                db.getFieldCapPlot().setText(Integer.toString(capsPlotTwist));
                int[] valores = data.leerTXT();
                empresa.delivery = valores[7];
                db.getCmpDeadline().setText(Integer.toString(empresa.delivery));
            }
        }
    }
    
}
