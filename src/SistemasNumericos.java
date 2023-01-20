import com.sun.jdi.ObjectReference;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        /*String dialogo=JOptionPane.showInputDialog(null, "ingrese un numero");

        int numeroDecimal=Integer.parseInt(dialogo);
        System.out.println("numeroDecimal = " + numeroDecimal);

        //convertir enteros a binarios
        System.out.println("el numero " + numeroDecimal + " en vinario es = " + Integer.toBinaryString(numeroDecimal));

        //anotacion de numero binario dentro de una variable int
        int numeroBinario=0b1010; //se coloca el numero binario y se le antepone el 0b
        System.out.println("numeroBinario = " + numeroBinario);

        //Sistema octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int octal=012; //se anota el octal en este caso de 500 y se le antepone el 0
        System.out.println("octal = " + octal);

        //Hexadecimal
        System.out.println("Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int hexadecimal=0xa; //se anota el hexadecimal en este caso de 500 y se le antepone el 0x
        System.out.println("hexadecimal = " + hexadecimal);

        String mensaje =  "SISTEMA NUMERICO";
        mensaje +="\nel numero binario de " + numeroDecimal + " es: " + Integer.toBinaryString(numeroDecimal);
        mensaje +="\nel numero octal de " + numeroDecimal + " es: " + Integer.toOctalString(numeroDecimal);
        mensaje +="\nel numero hexadecimal de " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, "\n" + mensaje);*/

        //modificaciones y arreglos de codigo anterior

        String dialogo=JOptionPane.showInputDialog(null, "ingrese un numero");
        int numeroEntero = 0;

        try {
            numeroEntero = Integer.parseInt(dialogo);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error digite un numero entero");
            main(args);
            System.exit(0);
        }
        //try y chatch se usa para cuando por ejemplo se pide un numero entero y el usuario da un texto, nos da un mensaje de error y nos reinicia la consola
        System.out.println("el numero digitado es = " + numeroEntero);

        //convertir enteros a binarios
        String mensajeBinario = "el numero " + numeroEntero + " en vinario es = " + Integer.toBinaryString(numeroEntero);
        System.out.println(mensajeBinario);

        //anotacion de numero binario dentro de una variable int
        int numeroBinario=0b1010; //se coloca el numero binario y se le antepone el 0b
        System.out.println("numeroBinario = " + numeroBinario);

        //Sistema octal
        String mensajeOctal = "numero octal de " + numeroEntero + " = " + Integer.toOctalString(numeroEntero);
        System.out.println(mensajeOctal);
        int octal=012; //se anota el octal en este caso de 500 y se le antepone el 0
        System.out.println("octal = " + octal);

        //Hexadecimal
        String mensajeHexa = "Numero hexadecimal de " + numeroEntero + " = " + Integer.toHexString(numeroEntero);
        System.out.println(mensajeHexa);
        int hexadecimal=0xa; //se anota el hexadecimal en este caso de 500 y se le antepone el 0x
        System.out.println("hexadecimal = " + hexadecimal);

        //impresion dinamica o en cuadro de dialogo
        String mensaje =  "SISTEMA NUMERICO";
        mensaje +="\n" + mensajeBinario;
        mensaje +="\n" + mensajeOctal;
        mensaje +="\n" + mensajeHexa;
        JOptionPane.showMessageDialog(null, "\n" + mensaje);

    }
}
