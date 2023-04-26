/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TUF ASUS
 */
public class Notificacion1  extends DecoradorAbstracto {
     public void doJob() {
        super.doJob();
             Date fechaActual = new Date();
             DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
             String fechaFormateada = formatoFecha.format(fechaActual);
        System.out.println("El prestamo de su libro/revista adquirido en: " + fechaFormateada + "esta proximo a expirar");
}}
