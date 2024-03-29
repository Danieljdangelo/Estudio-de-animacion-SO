/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import Class.ManejoDeData;
import Company.Drive;
import Company.Empresa;
import Company.Guionistas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author danieldangelo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Empresa company;
    public Empresa company2;
    ManejoDeData data = new ManejoDeData();
    public int guionesDB;
    public float costosOP;
    public float costosOP1;
    public float utilidadTTL;
    public float gananciaBruto;
    public float utilidadTTL1;
    public float gananciaBruto1;
    
    public Dashboard() {
        initComponents();
    }
    
    public void mostrar(int guiones){
        cmpGuiones.setText(String.valueOf(guiones));
    }
    
    public JTextField getField(){
        
        return cmpGuiones;
        
    }
    
    public JTextField getField1(){
        
        return cmpGuiones1;
        
    }
    
    public JTextField getFieldEscenarios(){

        return cmpEscenarios;

    }
    
    public JTextField getFieldEscenarios1(){

        return cmpEscenarios1;

    }

    public JTextField getFieldAnimaciones(){

        return cmpAnimaciones;

    }
    
    public JTextField getFieldAnimaciones1(){

        return cmpAnimaciones1;

    }

    public JTextField getFieldDoblajes(){

        return cmpDoblajes;

    }
    
    public JTextField getFieldDoblajes1(){

        return cmpDoblajes1;

    }
    
    public JTextField getFieldPlotTwists(){

        return cmpPlotDrive;

    }

    public JTextField getFieldComCapNick(){

        return cmpCapEst;

    }
    
    public JTextField getFieldPlotTwists1(){

        return cmpPlotDrive1;

    }

    public JTextField getFieldCapitulos(){
        
        return cmpCapEst;
    }
    
    public JTextField getFieldCapitulos1(){
        
        return cmpCapEst1;
    }
    
    public JTextField getFieldPlot(){
        
        return cmpPlotDrive;
    }
    
    public JTextField getFieldPlot1(){
        
        return cmpPlotDrive1;
    }
    
    public JTextField getFieldCapPlot(){
        
        return CapPlot;
    }
    
    public JTextField getFieldCapPlot1(){
        
        return cmpCapPlot1;
    }
    
    public JLabel getGbEnUso(){
        
        return gbEnUso;
    }
    
    public JLabel getGbEnUso1(){
        
        return gbEnUso1;
    }
    
    public JTextField getPmLabel(){
        
        return cmpPM;
    }
    
    public JTextField getPmLabel1(){
        
        return cmpPM1;
    }
    
    
    public JTextField getPmFaltas(){
        
        return cmpFaltas;
    }
    
    public JTextField getPmFaltas1(){
        
        return cmpFaltas1;
    }
    
    public JTextField getSalarioDesc(){
        
        return cmpSalarioDesc;
    }
    
    public JTextField getSalarioDesc1(){
        
        return cmpSalarioDesc1;
    }
    
    public JTextField getCmpDeadline(){
        
        return cmpDeadline;
    }

    public JTextField getCmpDirector(){
        
        return cmpDirector;
    }
    
    public JTextField getCmpDirector1(){
        
        return cmpDirector1;
    }

    public JTextField getCmpDeadline1(){
        
        return cmpDeadline1;

    }
    
    public JTextField getCmpCostos(){
        
        return cmpCostos;
    }
    
    public JTextField getCmpCostos1(){
        
        return cmpCostos1;
    }
    
    public void setCostosOP(float costos){
        this.costosOP += costos;
    }
    
    public void setCostosOP1(float costos){
        this.costosOP1 += costos;
    }
    
    public float getCostosOP(){
        
        return this.costosOP;
    }
    
    public float getCostosOP1(){
        
        return this.costosOP1;
    }
    
    public void setUtilidadTTL(float utilidad){
        this.utilidadTTL += utilidad;
    }
    
    public void setUtilidadTTL1(float utilidad){
        this.utilidadTTL1 += utilidad;
    }
    
    public float getUtilidadTTL(){
       return this.utilidadTTL;
    }
    
    public float getUtilidadTTL1(){
       return this.utilidadTTL1;
    }
    
    public JTextField getCmpUtilidad(){
        
        return cmpUtilidad;
    }
    
    public JTextField getCmpUtilidad1(){
        
        return cmpUtilidad1;
    }
    
    public void setGanaciaBruto(float ganacias){
        this.gananciaBruto = ganacias;
    }
    
    public void setGanaciaBruto1(float ganancias){
        this.gananciaBruto1 = ganancias;
    }
    
    public float getGananciaBruto(){
        return this.gananciaBruto;
    }
    
    public float getGananciaBruto1(){
        return this.gananciaBruto1;
    }
    
    public JTextField getCmpGanancia(){
        
        return cmpGanancias;
    }
    
    public JTextField getCmpGanancia1(){
        
        return cmpGanancias1;
    }
    
    public JPanel getPnlGrafica1(){
        
        return pnlGrafica1;
    }
    
    public JPanel getPnlGrafica(){
        
        return pnlGrafica;
    }
    
    public JSpinner getSpnEntrega(){
        
        return spnEntrega;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        disneyTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new ImagePanel1("/Images/amarillo y azul.jpg");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveConfigBtn = new javax.swing.JButton();
        startSimBtn = new javax.swing.JButton();
        spnDuracion = new javax.swing.JSpinner();
        spnAnimadores = new javax.swing.JSpinner();
        spnEntrega = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnDiseñadores = new javax.swing.JSpinner();
        spnActores = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnPlotTwists = new javax.swing.JSpinner();
        spnGuionistas = new javax.swing.JSpinner();
        spnEnsambladores = new javax.swing.JSpinner();
        pnlImage1 = new ImagePanel1("/Images/Disney_vs_Nick.jpg");
        jPanel2 = new ImagePanel1("/Images/Nick.jpg");
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cmpDeadline = new javax.swing.JTextField();
        cmpGanancias = new javax.swing.JTextField();
        cmpCostos = new javax.swing.JTextField();
        cmpUtilidad = new javax.swing.JTextField();
        cmpPM = new javax.swing.JTextField();
        cmpFaltas = new javax.swing.JTextField();
        cmpSalarioDesc = new javax.swing.JTextField();
        cmpDirector = new javax.swing.JTextField();
        cmpGuionistas = new javax.swing.JTextField();
        cmpDiseñadores = new javax.swing.JTextField();
        cmpAnimadores = new javax.swing.JTextField();
        cmpActores = new javax.swing.JTextField();
        cmpPlotTwists = new javax.swing.JTextField();
        cmpEnsambladores = new javax.swing.JTextField();
        cmpGuiones = new javax.swing.JTextField();
        cmpEscenarios = new javax.swing.JTextField();
        cmpAnimaciones = new javax.swing.JTextField();
        cmpDoblajes = new javax.swing.JTextField();
        cmpPlotDrive = new javax.swing.JTextField();
        cmpCapEst = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cmpDia = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        gbEnUso = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        CapPlot = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        pnlGrafica = new javax.swing.JPanel();
        jPanel3 = new ImagePanel1("/Images/Disney.jpg");
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        cmpDeadline1 = new javax.swing.JTextField();
        cmpGanancias1 = new javax.swing.JTextField();
        cmpCostos1 = new javax.swing.JTextField();
        cmpUtilidad1 = new javax.swing.JTextField();
        cmpPM1 = new javax.swing.JTextField();
        cmpFaltas1 = new javax.swing.JTextField();
        cmpSalarioDesc1 = new javax.swing.JTextField();
        cmpDirector1 = new javax.swing.JTextField();
        cmpGuionistas1 = new javax.swing.JTextField();
        cmpDiseñadores1 = new javax.swing.JTextField();
        cmpAnimadores1 = new javax.swing.JTextField();
        cmpActores1 = new javax.swing.JTextField();
        cmpPlotTwists1 = new javax.swing.JTextField();
        cmpEnsambladores1 = new javax.swing.JTextField();
        cmpGuiones1 = new javax.swing.JTextField();
        cmpEscenarios1 = new javax.swing.JTextField();
        cmpAnimaciones1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        cmpDoblajes1 = new javax.swing.JTextField();
        cmpPlotDrive1 = new javax.swing.JTextField();
        cmpCapEst1 = new javax.swing.JTextField();
        cmpCapPlot1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cmpDia1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        gbEnUso1 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        pnlGrafica1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Configuración de las Simulaciones");

        jLabel2.setText("Duración del día:");

        jLabel3.setText("Número de Guionistas:");

        saveConfigBtn.setText("Guardar Configuración");
        saveConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveConfigBtnActionPerformed(evt);
            }
        });

        startSimBtn.setText("Iniciar Simulación");
        startSimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimBtnActionPerformed(evt);
            }
        });

        spnDuracion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spnAnimadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnEntrega.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("Número de Diseñadores de Escenarios:");

        jLabel5.setText("Número de Animadores de Personajes:");

        spnDiseñadores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnActores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel6.setText("Número de Actores de Dobalje:");

        jLabel7.setText("Número de Guionistas de PlotTwist:");

        jLabel8.setText("Número de Ensambladores:");

        jLabel9.setText("Días disponibles para la entrega:");

        spnPlotTwists.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnGuionistas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spnEnsambladores.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveConfigBtn)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startSimBtn)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(spnEnsambladores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnPlotTwists, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnActores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnAnimadores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnDiseñadores, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnGuionistas, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnDuracion, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(0, 211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnGuionistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDiseñadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAnimadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnPlotTwists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnEnsambladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveConfigBtn)
                    .addComponent(startSimBtn))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout pnlImage1Layout = new javax.swing.GroupLayout(pnlImage1);
        pnlImage1.setLayout(pnlImage1Layout);
        pnlImage1Layout.setHorizontalGroup(
            pnlImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        pnlImage1Layout.setVerticalGroup(
            pnlImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlImage1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        disneyTabbedPane.addTab("Configuración", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Ganancias en bruto: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 236, -1, -1));

        jLabel11.setText("Costos operativos:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 278, -1, -1));

        jLabel12.setText("Utilidad total:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 320, -1, -1));

        jLabel13.setText("Deadline:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 194, -1, -1));

        jLabel14.setText("Project Manager:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 362, -1, -1));

        jLabel15.setText("Director:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 488, -1, -1));

        jLabel16.setText("Cantidad de faltas:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 404, -1, -1));

        jLabel17.setText("Salario descontado:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 446, -1, -1));

        jLabel18.setText("Número de guionistas:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 150, -1, -1));

        jLabel19.setText("Número de diseñadores:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 192, -1, -1));

        jLabel20.setText("Número de animadores:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 234, -1, -1));

        jLabel21.setText("Número de Actores:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 278, -1, -1));

        jLabel22.setText("Número de guionistas de PlotTwists:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 320, -1, -1));

        jLabel23.setText("Número de ensambladores:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 362, -1, -1));

        jLabel24.setText("Guiones en Drive:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jLabel25.setText("Animaciones en Drive:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        jLabel26.setText("Doblajes en Drive:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        jLabel27.setText("Escenarios en Drive:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jLabel28.setText("PlotTwists en Drive:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, -1));

        jLabel29.setText("Capítulos listos tipo estandar:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel31.setText("Simulación Nickelodeon:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, -1, -1));

        jLabel32.setText("/ 25");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 40, 30));

        jLabel33.setText("/ 20");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 40, 30));

        jLabel34.setText("/ 55");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 40, 30));

        jLabel35.setText("/ 35");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 40, 30));

        jLabel36.setText("/ 10");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 40, 30));

        cmpDeadline.setEditable(false);
        cmpDeadline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDeadline.setText("0");
        cmpDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDeadlineActionPerformed(evt);
            }
        });
        jPanel2.add(cmpDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 189, 129, -1));

        cmpGanancias.setEditable(false);
        cmpGanancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGanancias.setText("0");
        jPanel2.add(cmpGanancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 231, 130, -1));

        cmpCostos.setEditable(false);
        cmpCostos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCostos.setText("0");
        jPanel2.add(cmpCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 273, 130, -1));

        cmpUtilidad.setEditable(false);
        cmpUtilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpUtilidad.setText("0");
        jPanel2.add(cmpUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 315, 130, -1));

        cmpPM.setEditable(false);
        cmpPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPM.setText("Está durmiendo");
        jPanel2.add(cmpPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 357, 129, -1));

        cmpFaltas.setEditable(false);
        cmpFaltas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpFaltas.setText("0");
        jPanel2.add(cmpFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 399, 129, -1));

        cmpSalarioDesc.setEditable(false);
        cmpSalarioDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpSalarioDesc.setText("0");
        jPanel2.add(cmpSalarioDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 441, 130, -1));

        cmpDirector.setEditable(false);
        cmpDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDirector.setText("Está durmiendo");
        jPanel2.add(cmpDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 483, 129, -1));

        cmpGuionistas.setEditable(false);
        cmpGuionistas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGuionistas.setText("0");
        jPanel2.add(cmpGuionistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 145, 125, -1));

        cmpDiseñadores.setEditable(false);
        cmpDiseñadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDiseñadores.setText("0");
        jPanel2.add(cmpDiseñadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 187, 125, -1));

        cmpAnimadores.setEditable(false);
        cmpAnimadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpAnimadores.setText("0");
        jPanel2.add(cmpAnimadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 229, 125, -1));

        cmpActores.setEditable(false);
        cmpActores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpActores.setText("0");
        jPanel2.add(cmpActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 273, 125, -1));

        cmpPlotTwists.setEditable(false);
        cmpPlotTwists.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPlotTwists.setText("0");
        jPanel2.add(cmpPlotTwists, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 125, -1));

        cmpEnsambladores.setEditable(false);
        cmpEnsambladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpEnsambladores.setText("0");
        jPanel2.add(cmpEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 125, -1));

        cmpGuiones.setEditable(false);
        cmpGuiones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGuiones.setText("0");
        cmpGuiones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpGuionesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpGuionesKeyReleased(evt);
            }
        });
        jPanel2.add(cmpGuiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 40, -1));

        cmpEscenarios.setEditable(false);
        cmpEscenarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpEscenarios.setText("0");
        jPanel2.add(cmpEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 40, -1));

        cmpAnimaciones.setEditable(false);
        cmpAnimaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpAnimaciones.setText("0");
        cmpAnimaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpAnimacionesActionPerformed(evt);
            }
        });
        jPanel2.add(cmpAnimaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 40, -1));

        cmpDoblajes.setEditable(false);
        cmpDoblajes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDoblajes.setText("0");
        jPanel2.add(cmpDoblajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 40, -1));

        cmpPlotDrive.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPlotDrive.setText("0");
        cmpPlotDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpPlotDriveActionPerformed(evt);
            }
        });
        jPanel2.add(cmpPlotDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 40, -1));

        cmpCapEst.setEditable(false);
        cmpCapEst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCapEst.setText("0");
        cmpCapEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCapEstActionPerformed(evt);
            }
        });
        jPanel2.add(cmpCapEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 98, -1));

        jLabel37.setText("Duración del día:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 150, -1, -1));

        cmpDia.setEditable(false);
        cmpDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDia.setText("0");
        jPanel2.add(cmpDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 145, 60, -1));

        jLabel38.setText("ms");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel39.setText("Uso del Drive: ");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, -1, -1));

        gbEnUso.setText("0");
        jPanel2.add(gbEnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, -1, -1));

        jLabel41.setText("/");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, -1, -1));

        jLabel42.setText("135Gb");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, -1, -1));

        jLabel40.setText("Capitulos con PlotTwist: ");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        CapPlot.setEditable(false);
        CapPlot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CapPlot.setText("0");
        CapPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapPlotActionPerformed(evt);
            }
        });
        jPanel2.add(CapPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 98, -1));

        jLabel30.setText("K");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 10, -1));

        jLabel77.setText("K");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 10, -1));

        javax.swing.GroupLayout pnlGraficaLayout = new javax.swing.GroupLayout(pnlGrafica);
        pnlGrafica.setLayout(pnlGraficaLayout);
        pnlGraficaLayout.setHorizontalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pnlGraficaLayout.setVerticalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel2.add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 640, 600));

        disneyTabbedPane.addTab("Nickelodeon", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setText("PlotTwists en Drive:");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        jLabel44.setText("Capítulos listos tipo estandar:");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 558, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel46.setText("Simulación Disney:");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, -1, -1));

        jLabel47.setText("/ 25");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        jLabel48.setText("/ 20");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        jLabel49.setText("/ 55");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        jLabel50.setText("/ 35");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, -1, -1));

        jLabel51.setText("/ 10");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        cmpDeadline1.setEditable(false);
        cmpDeadline1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDeadline1.setText("0");
        jPanel3.add(cmpDeadline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 195, 129, -1));

        cmpGanancias1.setEditable(false);
        cmpGanancias1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGanancias1.setText("0");
        jPanel3.add(cmpGanancias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 237, 129, -1));

        cmpCostos1.setEditable(false);
        cmpCostos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCostos1.setText("0");
        jPanel3.add(cmpCostos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 279, 129, -1));

        cmpUtilidad1.setEditable(false);
        cmpUtilidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpUtilidad1.setText("0");
        jPanel3.add(cmpUtilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 321, 129, -1));

        cmpPM1.setEditable(false);
        cmpPM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPM1.setText("Está durmiendo");
        jPanel3.add(cmpPM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 363, 129, -1));

        cmpFaltas1.setEditable(false);
        cmpFaltas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpFaltas1.setText("0");
        jPanel3.add(cmpFaltas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 405, 129, -1));

        cmpSalarioDesc1.setEditable(false);
        cmpSalarioDesc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpSalarioDesc1.setText("0");
        jPanel3.add(cmpSalarioDesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 447, 129, -1));

        cmpDirector1.setEditable(false);
        cmpDirector1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDirector1.setText("Está durmiendo");
        jPanel3.add(cmpDirector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 489, 129, -1));

        cmpGuionistas1.setEditable(false);
        cmpGuionistas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGuionistas1.setText("0");
        jPanel3.add(cmpGuionistas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 145, 125, -1));

        cmpDiseñadores1.setEditable(false);
        cmpDiseñadores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDiseñadores1.setText("0");
        jPanel3.add(cmpDiseñadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 187, 125, -1));

        cmpAnimadores1.setEditable(false);
        cmpAnimadores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpAnimadores1.setText("0");
        jPanel3.add(cmpAnimadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 229, 125, -1));

        cmpActores1.setEditable(false);
        cmpActores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpActores1.setText("0");
        jPanel3.add(cmpActores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 273, 125, -1));

        cmpPlotTwists1.setEditable(false);
        cmpPlotTwists1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPlotTwists1.setText("0");
        cmpPlotTwists1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpPlotTwists1ActionPerformed(evt);
            }
        });
        jPanel3.add(cmpPlotTwists1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 125, -1));

        cmpEnsambladores1.setEditable(false);
        cmpEnsambladores1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpEnsambladores1.setText("0");
        jPanel3.add(cmpEnsambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 125, -1));

        cmpGuiones1.setEditable(false);
        cmpGuiones1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpGuiones1.setText("0");
        cmpGuiones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpGuiones1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpGuiones1KeyReleased(evt);
            }
        });
        jPanel3.add(cmpGuiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 50, -1));

        cmpEscenarios1.setEditable(false);
        cmpEscenarios1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpEscenarios1.setText("0");
        jPanel3.add(cmpEscenarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 50, -1));

        cmpAnimaciones1.setEditable(false);
        cmpAnimaciones1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpAnimaciones1.setText("0");
        cmpAnimaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpAnimaciones1ActionPerformed(evt);
            }
        });
        jPanel3.add(cmpAnimaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 50, -1));

        jLabel52.setText("Ganancias en bruto: ");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 242, -1, -1));

        jLabel53.setText("Costos operativos:");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 284, -1, -1));

        jLabel54.setText("Utilidad total:");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 326, -1, -1));

        jLabel55.setText("Deadline:");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 200, -1, -1));

        cmpDoblajes1.setEditable(false);
        cmpDoblajes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDoblajes1.setText("0");
        jPanel3.add(cmpDoblajes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 50, -1));

        cmpPlotDrive1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpPlotDrive1.setText("0");
        jPanel3.add(cmpPlotDrive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 50, -1));

        cmpCapEst1.setEditable(false);
        cmpCapEst1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCapEst1.setText("0");
        cmpCapEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCapEst1ActionPerformed(evt);
            }
        });
        jPanel3.add(cmpCapEst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 553, 98, -1));

        cmpCapPlot1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpCapPlot1.setText("0");
        jPanel3.add(cmpCapPlot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 595, 98, -1));

        jLabel56.setText("Project Manager:");
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 368, -1, -1));

        jLabel57.setText("Duración del día:");
        jPanel3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 150, -1, -1));

        jLabel58.setText("Director:");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 494, -1, -1));

        cmpDia1.setEditable(false);
        cmpDia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpDia1.setText("0");
        jPanel3.add(cmpDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 145, 60, -1));

        jLabel59.setText("Cantidad de faltas:");
        jPanel3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 410, -1, -1));

        jLabel60.setText("ms");
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel61.setText("Salario descontado:");
        jPanel3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 452, -1, -1));

        jLabel62.setText("Número de guionistas:");
        jPanel3.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 150, -1, -1));

        jLabel63.setText("Número de diseñadores:");
        jPanel3.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 192, -1, -1));

        jLabel64.setText("Número de animadores:");
        jPanel3.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 234, -1, -1));

        jLabel65.setText("Número de Actores:");
        jPanel3.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 278, -1, -1));

        jLabel66.setText("Número de guionistas de plottwists:");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 320, -1, -1));

        jLabel67.setText("Número de ensambladores:");
        jPanel3.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 362, -1, -1));

        jLabel68.setText("Uso del Drive: ");
        jPanel3.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, -1, -1));

        gbEnUso1.setText("0");
        jPanel3.add(gbEnUso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 660, -1, -1));

        jLabel69.setText("/");
        jPanel3.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, -1, -1));

        jLabel70.setText("135Gb");
        jPanel3.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, -1, -1));

        jLabel71.setText("Guiones en Drive:");
        jPanel3.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jLabel72.setText("Capitulos con PlotTwist: ");
        jPanel3.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 600, -1, -1));

        jLabel73.setText("Animaciones en Drive:");
        jPanel3.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        jLabel74.setText("Doblajes en Drive:");
        jPanel3.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        jLabel75.setText("Escenarios en Drive:");
        jPanel3.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jLabel78.setText("K");
        jPanel3.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 30, 20));

        jLabel45.setText("K");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 10, -1));

        javax.swing.GroupLayout pnlGrafica1Layout = new javax.swing.GroupLayout(pnlGrafica1);
        pnlGrafica1.setLayout(pnlGrafica1Layout);
        pnlGrafica1Layout.setHorizontalGroup(
            pnlGrafica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pnlGrafica1Layout.setVerticalGroup(
            pnlGrafica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel3.add(pnlGrafica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 650, 600));

        disneyTabbedPane.addTab("Disney Channel", jPanel3);

        getContentPane().add(disneyTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startSimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimBtnActionPerformed
        // TODO add your handling code here:
        
        int[] valores = data.leerTXT();
        int duration = valores[0];
        int screenWriters = valores[1];
        int designers = valores[2];
        int animators = valores[3];
        int actors = valores[4];
        int plotTwists = valores[5];
        int assemblers = valores[6];
        int delivery = valores[7];  
        
        company = new Empresa("Nickelodeon ",duration, screenWriters, designers, animators, actors, plotTwists, assemblers, delivery, this);
        company2 = new Empresa("Disney", duration, screenWriters, designers, animators, actors, plotTwists, assemblers, delivery, this);
        
        
        company.createThreads();
        company2.createThreads();
        
        cmpDia.setText(String.valueOf(duration));
        cmpGuionistas.setText(String.valueOf(screenWriters));
        cmpDiseñadores.setText(String.valueOf(designers));
        cmpAnimadores.setText(String.valueOf(animators));
        cmpActores.setText(String.valueOf(actors));
        cmpPlotTwists.setText(String.valueOf(plotTwists));
        cmpEnsambladores.setText(String.valueOf(assemblers));
        cmpDeadline.setText(String.valueOf(company.drive.delivery));
        
        cmpDia1.setText(String.valueOf(duration));
        cmpGuionistas1.setText(String.valueOf(screenWriters));
        cmpDiseñadores1.setText(String.valueOf(designers));
        cmpAnimadores1.setText(String.valueOf(animators));
        cmpActores1.setText(String.valueOf(actors));
        cmpPlotTwists1.setText(String.valueOf(plotTwists));
        cmpEnsambladores1.setText(String.valueOf(assemblers));
        cmpDeadline1.setText(String.valueOf(company2.drive.delivery));
    }//GEN-LAST:event_startSimBtnActionPerformed
    
    private void saveConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConfigBtnActionPerformed
        // TODO add your handling code here:
        
        String duration = spnDuracion.getValue().toString();
        String screenwriters = spnGuionistas.getValue().toString();
        String designers = spnDiseñadores.getValue().toString();
        String animators = spnAnimadores.getValue().toString();
        String actors = spnActores.getValue().toString();
        String plotTwists = spnPlotTwists.getValue().toString();
        String assemblers = spnEnsambladores.getValue().toString();
        String delivery = spnEntrega.getValue().toString();
        
        int totalWorkers = Integer.parseInt(screenwriters) + Integer.parseInt(designers) + Integer.parseInt(animators) + Integer.parseInt(actors) + Integer.parseInt(plotTwists) + Integer.parseInt(assemblers);
        JOptionPane.showMessageDialog(null, totalWorkers);
        
        if( totalWorkers <= 15){
            data.escribirTXT(duration, screenwriters, designers, animators, actors, plotTwists, assemblers, delivery);  
        }else{
            JOptionPane.showMessageDialog(null, "La suma total de los trabajadores supera la cantidad disponible");
        }
    }//GEN-LAST:event_saveConfigBtnActionPerformed

    private void cmpAnimacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpAnimacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpAnimacionesActionPerformed

    private void cmpGuionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuionesKeyReleased

    private void cmpGuionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuionesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuionesKeyPressed

    private void cmpCapEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCapEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCapEstActionPerformed

    private void CapPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapPlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapPlotActionPerformed

    private void cmpGuiones1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuiones1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuiones1KeyPressed

    private void cmpGuiones1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpGuiones1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpGuiones1KeyReleased

    private void cmpAnimaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpAnimaciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpAnimaciones1ActionPerformed

    private void cmpCapEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCapEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCapEst1ActionPerformed

    private void cmpPlotDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpPlotDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpPlotDriveActionPerformed

    private void cmpPlotTwists1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpPlotTwists1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpPlotTwists1ActionPerformed

    private void cmpDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpDeadlineActionPerformed
       
    }//GEN-LAST:event_cmpDeadlineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CapPlot;
    private javax.swing.JTextField cmpActores;
    private javax.swing.JTextField cmpActores1;
    private javax.swing.JTextField cmpAnimaciones;
    private javax.swing.JTextField cmpAnimaciones1;
    private javax.swing.JTextField cmpAnimadores;
    private javax.swing.JTextField cmpAnimadores1;
    private javax.swing.JTextField cmpCapEst;
    private javax.swing.JTextField cmpCapEst1;
    private javax.swing.JTextField cmpCapPlot1;
    private javax.swing.JTextField cmpCostos;
    private javax.swing.JTextField cmpCostos1;
    private javax.swing.JTextField cmpDeadline;
    private javax.swing.JTextField cmpDeadline1;
    private javax.swing.JTextField cmpDia;
    private javax.swing.JTextField cmpDia1;
    private javax.swing.JTextField cmpDirector;
    private javax.swing.JTextField cmpDirector1;
    private javax.swing.JTextField cmpDiseñadores;
    private javax.swing.JTextField cmpDiseñadores1;
    private javax.swing.JTextField cmpDoblajes;
    private javax.swing.JTextField cmpDoblajes1;
    private javax.swing.JTextField cmpEnsambladores;
    private javax.swing.JTextField cmpEnsambladores1;
    private javax.swing.JTextField cmpEscenarios;
    private javax.swing.JTextField cmpEscenarios1;
    private javax.swing.JTextField cmpFaltas;
    private javax.swing.JTextField cmpFaltas1;
    private javax.swing.JTextField cmpGanancias;
    private javax.swing.JTextField cmpGanancias1;
    private javax.swing.JTextField cmpGuiones;
    private javax.swing.JTextField cmpGuiones1;
    private javax.swing.JTextField cmpGuionistas;
    private javax.swing.JTextField cmpGuionistas1;
    private javax.swing.JTextField cmpPM;
    private javax.swing.JTextField cmpPM1;
    private javax.swing.JTextField cmpPlotDrive;
    private javax.swing.JTextField cmpPlotDrive1;
    private javax.swing.JTextField cmpPlotTwists;
    private javax.swing.JTextField cmpPlotTwists1;
    private javax.swing.JTextField cmpSalarioDesc;
    private javax.swing.JTextField cmpSalarioDesc1;
    private javax.swing.JTextField cmpUtilidad;
    private javax.swing.JTextField cmpUtilidad1;
    private javax.swing.JTabbedPane disneyTabbedPane;
    private javax.swing.JLabel gbEnUso;
    private javax.swing.JLabel gbEnUso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JPanel pnlGrafica1;
    private javax.swing.JPanel pnlImage1;
    public javax.swing.JButton saveConfigBtn;
    private javax.swing.JSpinner spnActores;
    private javax.swing.JSpinner spnAnimadores;
    private javax.swing.JSpinner spnDiseñadores;
    private javax.swing.JSpinner spnDuracion;
    private javax.swing.JSpinner spnEnsambladores;
    private javax.swing.JSpinner spnEntrega;
    private javax.swing.JSpinner spnGuionistas;
    private javax.swing.JSpinner spnPlotTwists;
    private javax.swing.JButton startSimBtn;
    // End of variables declaration//GEN-END:variables

    
    class ImagePanel1 extends JPanel{
        private Image image;
        private final String path;
        
        public ImagePanel1(String path){
            this.path = path;
        }
        
        @Override
        public void paint(Graphics g){
            image = new ImageIcon(getClass().getResource(path)).getImage();
            
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
