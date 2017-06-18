/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 * @author datojava.blogspot.com
 */
public class Correo {
    public boolean Esuncorreo(String correo){
        for(int i=0;i<correo.length();i++){
            if((""+correo.charAt(i)).equals("@")){
                return true;
            } 
        }
        return false;
    }
    public String Mandarcontrasena(String usuario){
        XMLGenerator A = new XMLGenerator();
        boolean centi = false;
        String pass="null";
        ArrayList <Usuarios> listUsuarios=A.obtenerUsuarios();
        for (Usuarios listUsuario : listUsuarios) {
            if ((listUsuario.getNombre().equals(usuario))) {
                pass = listUsuario.getContraseña();
                centi=true;
            } 
        }
        if(centi==false){
            pass="Este usuario no existe verifica";
            return pass;
        }
        
        return pass;
     }

 public void mandarCorreo(String correo,String pass) {
  // El correo gmail de envío
  String correoEnvia = "toojhonygomez@gmail.com";
  String claveCorreo = "ladygaga1596";

  // La configuración para enviar correo
  Properties properties = new Properties();
  properties.put("mail.smtp.host", "smtp.gmail.com");
  properties.put("mail.smtp.starttls.enable", "true");
  properties.put("mail.smtp.port", "587");
  properties.put("mail.smtp.auth", "true");
  properties.put("mail.user", correoEnvia);
  properties.put("mail.password", claveCorreo);

  // Obtener la sesion
  Session session = Session.getInstance(properties, null);

  try {
   // Crear el cuerpo del mensaje
   MimeMessage mimeMessage = new MimeMessage(session);

   // Agregar quien envía el correo
   mimeMessage.setFrom(new InternetAddress(correoEnvia, "Casino: 'POKEMON'"));
   
   // Los destinatarios
   InternetAddress[] internetAddresses = {
     new InternetAddress(correo)};

   // Agregar los destinatarios al mensaje
   mimeMessage.setRecipients(Message.RecipientType.TO,
     internetAddresses);

   // Agregar el asunto al correo
   mimeMessage.setSubject("Casino: Recuperacion de contraseña");

   // Creo la parte del mensaje
   MimeBodyPart mimeBodyPart = new MimeBodyPart();
   mimeBodyPart.setText("Tu contraseña es: "+pass);

   // Crear el multipart para agregar la parte del mensaje anterior
   Multipart multipart = new MimeMultipart();
   multipart.addBodyPart(mimeBodyPart);

   // Agregar el multipart al cuerpo del mensaje
   mimeMessage.setContent(multipart);

   // Enviar el mensaje
   Transport transport = session.getTransport("smtp");
   transport.connect(correoEnvia, claveCorreo);
   transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
   transport.close();

  } catch (Exception ex) {
   ex.printStackTrace();
  }
  //JOptionPane.showMessageDialog(null, "Correo enviado" );
  System.out.println("Un correo ha sido enviado");
  
 }

 /*public static void main(String[] args) {
  Correo correoTexto = new Correo();
  correoTexto.mandarCorreo();
  
 }*/
}
 

