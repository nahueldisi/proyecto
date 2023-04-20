/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;
import com.mycompany.proyecto1.Equipo;

public class Proyecto1 {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Barcelona");
        equipo1.setDescripcion("Equipo de futbol español");
        
        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Aldosivi");
        equipo2.setDescripcion("Equipo de futbol argentino");
     
        System.out.print(equipo1);
    }
    
}
