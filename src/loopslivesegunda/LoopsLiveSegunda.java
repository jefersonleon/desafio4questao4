package loopslivesegunda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LoopsLiveSegunda {

    public static void main(String[] args) {
        /*
        Faça um algoritmo para ler 3 valores, se os valores lidos forem impares os mesmos
        deverão ser multiplicados, caso contrário os valores deverão ser somados.
         */
        int val1, val2, val3; String tipo;
        /*Scanner ler = new Scanner(System.in);
        
        System.out.println("Valor 1 ");
        //val1 = ler.nextInt();
        System.out.println("Valor 2 ");
        val2 = ler.nextInt();
        System.out.println("Valor 3 ");
        val3 = ler.nextInt();*/
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2"));
        val3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3"));
        
        if (val1 % 2 != 0 && val2 % 2 != 0 && val3 % 2 != 0 ){
            tipo = "O valores foram multiplicados, o resultado é:"+(val1 * val2 * val3);
        }else{
       
            tipo = "O valores foram somados, o resultado é: "+(val1 + val2 + val3);
        }
        
        JOptionPane.showMessageDialog(null, tipo);
    }

}
