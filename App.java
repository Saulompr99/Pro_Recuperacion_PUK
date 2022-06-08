/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ceti
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saludo();
        System.out.println(nota());
    }
    public static boolean saludo() {
        System.out.println("Hola, estoy en la recuperación de PUK");
        
        return true;
    }
    
    public static int nota() {
        return 10;
    }
}
