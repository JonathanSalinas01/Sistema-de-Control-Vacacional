import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Bienvenida extends JFrame implements ActionListener{
  private JLabel label1, label2, label3, label4, labelImagen;
  private JTextField textfield1, textfield2;
  public static String usuario = "", contraseña = "";
  private JButton boton1;

  public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   getContentPane().setBackground(new Color(255,0,0));
   setTitle("Bienvenido");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon logo = new ImageIcon("images/logo-coca.png");
   labelImagen = new JLabel(logo);
   labelImagen.setBounds(50,0,250,200);
   add(labelImagen);
   label1 = new JLabel("Sistema de Control Vacional");
   label1.setBounds(50,130,300,50);
   label1.setFont(new Font("Andale Mono", 3, 18));
   label1.setForeground(new Color(255,255,255));
   add(label1);
   
   label2 = new JLabel("Usuario");
   label2.setBounds(20,180,100,30);
   label2.setFont(new Font("Andale Mono", 3, 14));
   label2.setForeground(new Color(255,255,255));
   add(label2);

   textfield1 = new JTextField();
   textfield1.setBounds(100,180,120,30);
   textfield1.setBackground(new Color(255,255,255));
   textfield1.setFont(new Font("Andale Mono", 1, 12));
   textfield1.setForeground(new Color(255,0,0));
   add(textfield1);

   label3 = new JLabel("Contraseña");  
   label3.setBounds(20,230,120,30);
   label3.setFont(new Font("Andale Mono", 3, 14));
   label3.setForeground(new Color(255,255,255));
   add(label3);
   
   textfield2 = new JTextField();
   textfield2.setBounds(100,230,120,30);
   textfield2.setBackground(new Color(255,255,255));
   textfield2.setFont(new Font("Andale Mono", 1, 12));
   textfield2.setForeground(new Color(255,0,0));
   add(textfield2);

   boton1 = new JButton("Ingresar");
   boton1.setBounds(112,290,90,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setFont(new Font("Andale Mono", 3, 14));
   boton1.setForeground(new Color(255,0,0));
   boton1.addActionListener(this);
   add(boton1);

   label4 = new JLabel("2023© The Coca-Cola Company");
   label4.setBounds(50,375,270,30);
   label4.setFont(new Font("Andale Mono", 3, 14));
   label4.setForeground(new Color(255,255,255));
   add(label4);


 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    usuario = textfield1.getText().trim();
    contraseña = textfield2.getText().trim();
    if(usuario.equals("") || contraseña.equals("")){
     JOptionPane.showMessageDialog(null, "Usuario o Contraseña invalido.");
   } else {
     Terminos ventana = new Terminos();
     ventana.setBounds(0,0,890,630);
     ventana.setVisible(true);
     ventana.setResizable(false);
     ventana.setLocationRelativeTo(null);
     this.setVisible(false);
   }

  }
 }
  public static void main(String args[]){
   Bienvenida ventana = new Bienvenida();
   ventana.setBounds(0,0,335,450);
   ventana.setVisible(true);
   ventana.setResizable(false);
   ventana.setLocationRelativeTo(null);
 }
}