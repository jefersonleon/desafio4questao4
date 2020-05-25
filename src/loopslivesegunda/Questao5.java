/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopslivesegunda;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Questao5 {

    public static void main(String[] args) {
        /*
        Desenvolva um algoritmo que efetue a leitura de três valores para os lados de um
        triângulo, considerando lados como :A, B e C. O algoritmo deverá verificar se os lados
        fornecidos forma realmente um triângulo(cada lado é menor que a soma dos outros dois
        lados). Se for esta condição verdadeira, deverá ser indicado qual tipo de triângulo foi
        formado: isósceles(dois lados iguais e um diferente), escaleno (todos os lados diferentes)
        ou equilátero (todos os lados são iguais).
         */
        double l1, l2, l3;
        l1 = Double.parseDouble(JOptionPane.showInputDialog("Lado 1"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Lado 2"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Lado 3"));

        if (l1 < (l2 + l3) && l2 < (l1 + l3) && l3 < (l1 + l2)) {
            if (l1 == l2 && l2 == l3) {
                JOptionPane.showMessageDialog(null, "Triangulo Equilatero");
            } else if (l1 != l2 && l2 != l3) {
                JOptionPane.showMessageDialog(null, "Triangulo Escaleno");
            } else {
                JOptionPane.showMessageDialog(null, "Triangulo Isóscele");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os lados informados não formam Triangulo");
        }
    }
}
