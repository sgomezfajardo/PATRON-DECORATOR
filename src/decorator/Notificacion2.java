/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author TUF ASUS
 */
public class Notificacion2 extends DecoradorAbstracto {
    public void doJob() {
        System.out.println("");
        System.out.println("Correo Electronico recibido");
        super.doJob();
//Add additional thing if necessary
        System.out.println("Quede atento a la fecha de devolucion");
        System.out.println(":D");
    }
}
