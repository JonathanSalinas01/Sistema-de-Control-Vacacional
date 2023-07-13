import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;

public class Terminos extends JFrame implements ActionListener{
  private JLabel label1, labelImagen;
  private JTextArea area1;
  private JScrollPane scrollpane1;
  private JRadioButton radiobutton1, radiobutton2;
  private ButtonGroup buttongroup1;
  private JButton boton1, boton2;

  public Terminos(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Términos y Condiciones");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   getContentPane().setBackground(new Color(255,0,0));

   ImageIcon logo = new ImageIcon("images/logo-coca.png");
   labelImagen = new JLabel(logo);
   labelImagen.setBounds(500,420,300,150);
   add(labelImagen);

   label1 = new JLabel("Términos y Condiciones");
   label1.setBounds(360,20,350,100);
   label1.setFont(new Font("Andale Mono", 1, 19));
   label1.setForeground(new Color(255,255,255));
   add(label1);

   area1 = new JTextArea();
   area1.setEditable(false);
   area1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                 "\n\n           A.   PROHIBIDA SE VENTA O DISTRIBUCIÓN SIN AUTORIZACION." +
                 "\n           B.   PROHIBIDA LA AÑTERACION DEL CÓDIGO FUENTE O EL DISEÑO DE LAS INTERFACES GRÁFICAS." +
                 "\n           C.   LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DEL SOFTWARE" +
                 "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                 "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR JONI), NO SE RESPONSABILIZAN DE USO QUE USTED" +
                 "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO)" + 
                 "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                 

                                                               );
   scrollpane1 = new JScrollPane(area1);
   scrollpane1.setBounds(35,130,810,250);
   area1.setFont(new Font("Arial", 0, 14));
   area1.setBackground(new Color(255,255,255));
   add(scrollpane1);

   buttongroup1 = new ButtonGroup();

   radiobutton1 = new JRadioButton("Acepto");
   radiobutton1.setBounds(35,400,100,30);
   radiobutton1.setFont(new Font("Andale Mono", 1, 14));
   radiobutton1.setForeground(new Color(255,0,0));
   radiobutton1.addActionListener(this);
   buttongroup1.add(radiobutton1);
   add(radiobutton1);

   radiobutton2 = new JRadioButton("No acepto");
   radiobutton2.setBounds(35,440,100,30);
   radiobutton2.setFont(new Font("Andale Mono", 1, 14));
   radiobutton2.setForeground(new Color(255,0,0));
   radiobutton2.addActionListener(this);
   buttongroup1.add(radiobutton2);
   add(radiobutton2);
   
   boton1 = new JButton("Volver");
   boton1.setBounds(90,500,80,30);
   boton1.setFont(new Font("Andale Mono", 1, 14));
   boton1.setForeground(new Color(255,0,0));
   boton1.setBackground(new Color(255,255,255));
   boton1.addActionListener(this);
   add(boton1);

   boton2 = new JButton("Continuar");
   boton2.setBounds(180,500,130,30);
   boton2.setFont(new Font("Andale Mono", 1, 14));
   boton2.setForeground(new Color(255,0,0));
   boton2.setBackground(new Color(255,255,255));
   boton2.setEnabled(false);
   boton2.addActionListener(this);
   add(boton2);
 }
  public void actionPerformed(ActionEvent e){
   if(radiobutton1.isSelected() == true){
    boton2.setEnabled(true);
    boton1.setEnabled(false);
  }
   if(radiobutton2.isSelected() == true){
    boton2.setEnabled(false);
    boton1.setEnabled(true);
  }
   if(e.getSource() == boton1){
    Bienvenida ventana = new Bienvenida();
    ventana.setBounds(0,0,335,450);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }
   if(e.getSource() == boton2){
    Principal ventana = new Principal();
    ventana.setBounds(0,0,750,710);
    ventana.setVisible(true);
    ventana.setResizable(true);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }
 }
  public static void main(String args[]){
   Terminos ventana = new Terminos();
   ventana.setBounds(0,0,890,630);
   ventana.setVisible(true);
   ventana.setResizable(false);
   ventana.setLocationRelativeTo(null);
 }
}