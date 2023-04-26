/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author TUF ASUS
 */
public class DECORATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Notificacion2 cd_2 = new Notificacion2();
         Notificacion1 cd1 = new Notificacion1();
         int opcion;
          System.out.println("***Notificacion de fecha de prestamo limite***");
          System.out.println("Digite la opcion que desea");
          System.out.println("1 para ser notificado por mensaje de texto");
          System.out.println("2 para ser notificado por correo electronico");
          System.out.println("3 para ser notificado por ambos medios");
          opcion = sc.nextInt();
        Componenteconcreto cc = new Componenteconcreto();
        do{
        switch(opcion){ 
            case 1:
                cd1.SetTheComponent(cc);
                cd1.doJob();
                break;
            case 2:
         
        cd_2.SetTheComponent(cd1);
        cd_2.doJob();       
            break;
            case 3:
        cd1.SetTheComponent(cc);
        cd1.doJob();
        cd_2.SetTheComponent(cd1);
        cd_2.doJob();  
        }break;
       
    }while(true);
    
    }
    
}
