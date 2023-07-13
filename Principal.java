import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;

public class Principal extends JFrame implements ItemListener, ActionListener{
  private JMenuBar menubar1;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem4, menuitem5, menuitem6;
  private JLabel label1, label2, label3, label4, label5,label6, label7, labelLogo;
  private JTextField textfield1, textfield2, textfield3, textfield4;
  private JComboBox combo1, combo2;
  private JTextArea textarea1;
  private JButton boton1, boton2;
  String departamento = "", nombre = "";

  public Principal(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Calculo");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.usuario;

   getContentPane().setBackground(new Color(255,0,0));
   menubar1 = new JMenuBar();
   setJMenuBar(menubar1);
   menubar1.setBackground(new Color(255,0,0));


   menu1 = new JMenu("Opciones");
   menu1.setFont(new Font("Andale Mono", 1, 15));
   menu1.setForeground(new Color(255,255,255));
   menubar1.add(menu1);

   menu2 = new JMenu("Sesión");
   menu1.add(menu2);
   menuitem1 = new JMenuItem("Cerrar Sesión");
   menuitem1.addActionListener(this);
   menu2.add(menuitem1);


   menuitem4 = new JMenuItem("Salir");
   menuitem4.addActionListener(this);
   menu1.add(menuitem4);

   menu3 = new JMenu("Acerca De");
   menu3.setFont(new Font("Andale Mono", 1, 15));
   menu3.setForeground(new Color(255,255,255));
   menubar1.add(menu3);

   menuitem5 = new JMenuItem("El creador");
   menuitem5.addActionListener(this);
   menu3.add(menuitem5);

   menuitem6 = new JMenuItem("Este programa");
   menuitem6.addActionListener(this);
   menu3.add(menuitem6);

 
   ImageIcon logo = new ImageIcon("images/logo-coca.png");
   labelLogo = new JLabel(logo);
   labelLogo.setBounds(5,50,300,150);
   add(labelLogo);

   combo1 = new JComboBox();
   combo1.setBounds(10,10,75,30);
   combo1.addItem("Rojo");
   combo1.addItem("Verde");
   combo1.addItem("Negro");
   combo1.addItemListener(this);
   add(combo1);
 
   
   label1 = new JLabel("Bienvenido " + nombre);
   label1.setBounds(10,190,280,35);
   label1.setFont(new Font("Andale Mono", 1, 22));
   label1.setForeground(new Color(255,255,255));
   add(label1);

   label2 = new JLabel("Nombre del Trabajador");
   label2.setBounds(10,260,150,30);
   label2.setFont(new Font("Andale Mono", 1, 13));
   label2.setForeground(new Color(255,255,255));
   add(label2);

   textfield1 = new JTextField();
   textfield1.setBounds(10,290,150,30);
   textfield1.setFont(new Font("Andale Mono", 1, 14));
   textfield1.setForeground(new Color(255,0,0));
   textfield1.setBackground(new Color(255,255,255));
   add(textfield1);

   label3 = new JLabel("Segundo Nombre");
   label3.setBounds(340,20,150,30);
   label3.setFont(new Font("Andale Mono", 1, 14));
   label3.setForeground(new Color(255,255,255));
   add(label3);

   textfield2 = new JTextField();
   textfield2.setBounds(340,50,150,30);
   textfield2.setFont(new Font("Andale Mono", 1, 13));
   textfield2.setForeground(new Color(255,0,0));
   add(textfield2);

   label4 = new JLabel("Apellido");
   label4.setBounds(340,100,150,30);
   label4.setFont(new Font("Andale Mono", 1 , 14));
   label4.setForeground(new Color(255,255,255));
   add(label4);

   textfield3 = new JTextField();
   textfield3.setBounds(340,130,150,30);
   textfield3.setFont(new Font("Andale Mono", 1, 13));
   textfield3.setForeground(new Color(255,0,0));
   add(textfield3);

   label5 = new JLabel("Seleccione el Departamento");
   label5.setBounds(340,170,190,30);
   label5.setFont(new Font("Andale Mono", 1, 13));
   label5.setForeground(new Color(255,255,255));
   add(label5);

   combo2 = new JComboBox();
   combo2.setBounds(340,200,150,30);
   combo2.setFont(new Font("Andale Mono",3,12));
   combo2.setForeground(new Color(255,0,0));
   combo2.addItem("Atención al Cliente");
   combo2.addItem("Logística");
   combo2.addItem("Gerencia");
   combo2.addItemListener(this);
   add(combo2);

   label6 = new JLabel("Años de Servicio");
   label6.setBounds(340,260,150,30);
   label6.setFont(new Font("Andale Mono", 1, 14));
   label6.setForeground(new Color(255,255,255));
   add(label6);

   textfield4 = new JTextField();
   textfield4.setBounds(340,290,150,30);
   textfield4.setFont(new Font("Andale Mono", 1, 13));
   textfield4.setForeground(new Color(255,0,0));
   add(textfield4);
   
   boton1 = new JButton("Calcular");
   boton1.setBounds(340,340,90,30);
   boton1.setFont(new Font("Andale Mono", 1, 12));
   boton1.setForeground(new Color(255,0,0));
   boton1.setBackground(new Color(255,255,255));
   boton1.addActionListener(this);
   add(boton1);

   boton2 = new JButton("Nuevo");
   boton2.setBounds(450,340,75,30);
   boton2.setFont(new Font("Andale Mono", 1, 12));
   boton2.setForeground(new Color(255,0,0));
   boton2.setBackground(new Color(255,255,255)); 
   boton2.addActionListener(this);
   add(boton2);

   textarea1 = new JTextArea();
   textarea1.setBounds(340,380,380,200);
   textarea1.setFont(new Font("Andale Mono", 1, 13));
   textarea1.setForeground(new Color(255,0,0));
   textarea1.setBackground(new Color(255,255,255));
   textarea1.setEditable(false);
   add(textarea1);

   label7 = new JLabel("©2023 The Coca-Cola Company.");
   label7.setBounds(210,600,250,35);
   label7.setFont(new Font("Andale Mono", 1, 16));
   label7.setForeground(new Color(255,255,255));
   add(label7);

 }

  public void itemStateChanged(ItemEvent e){
   if(e.getSource() == combo1){
    String color = combo1.getSelectedItem().toString();
    if(color.equals("Rojo")){
     getContentPane().setBackground(new Color(255,0,0));
     menubar1.setBackground(new Color(255,0,0));
   }
    if(color.equals("Negro")){
     getContentPane().setBackground(new Color(0,0,0));
     menubar1.setBackground(new Color(0,0,0));
   }
    if(color.equals("Verde")){
     getContentPane().setBackground(new Color(114,150,19));
     menubar1.setBackground(new Color(114,150,19));
   }
  }
   if(e.getSource() == combo2){
    departamento = combo2.getSelectedItem().toString();
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
 
    String nombre = textfield1.getText();
    String apellidoPaterno = textfield2.getText();
    String apellidoMaterno = textfield3.getText();
    String años = textfield4.getText();
    String vacas = "";
    int Años = Integer.parseInt(años);



   if(nombre.equals("") || apellidoPaterno.equals("") || apellidoMaterno.equals("") || departamento.equals("")){
      JOptionPane.showMessageDialog(null, "Debe Completar Todos los Campos");
    } else{

    if(Años == 1 && departamento.equals("Atención al Cliente")){
     vacas = "6";
   }
    if(Años >= 2 && Años <= 6 && departamento.equals("Atención al Cliente")){
     vacas = "14";
   }
    if(Años >= 7 && departamento.equals("Atención al Cliente")){
     vacas = "20";
   }
    if(Años == 1 && departamento.equals("Logística")){
     vacas = "7";
   }
    if(Años >= 2 && Años <= 6 && departamento.equals("Logística")){
     vacas = "15";
   }
    if(Años >= 7 && departamento.equals("Logística")){
     vacas = "22";
   }
    if(Años == 1 && departamento.equals("Gerencia")){
     vacas = "10";
   }
    if(Años >= 2 && Años <= 6 && departamento.equals("Gerencia")){
     vacas = "20";
   }
    if(Años >= 7 && departamento.equals("Gerencia")){
     vacas = "30";
   }

    textarea1.setText("\n El trabajador " + nombre + ", " + apellidoPaterno + " " + apellidoMaterno +
                      "\n que trabaja en " + departamento + " y cuenta con " + años + " años de servicio " +
                      "\n merece " + vacas + " días de vacaciones.");
    
   }
  }
   if(e.getSource() == boton2){
    textfield1.setText("");
    textfield2.setText("");
    textfield3.setText("");
    textfield4.setText("");
    textarea1.setText("");
    
  }
   if(e.getSource() == menuitem1){
    Bienvenida ventana = new Bienvenida();
    ventana.setBounds(0,0,335,450);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }

   if(e.getSource() == menuitem4){
    System.exit(1);
  }
   if(e.getSource() == menuitem5){
    JOptionPane.showMessageDialog(null, "Creado por Salinas, Jonathan Marcelo" + "\n                    2023");
  }
   if(e.getSource() == menuitem6){
    JOptionPane.showMessageDialog(null, "Este es mi primer programa");
  }
 }

  public static void main(String args[]){
   Principal ventana = new Principal();
   ventana.setBounds(0,0,750,710);
   ventana.setVisible(true);
   ventana.setResizable(true);
   ventana.setLocationRelativeTo(null);
 }




















}