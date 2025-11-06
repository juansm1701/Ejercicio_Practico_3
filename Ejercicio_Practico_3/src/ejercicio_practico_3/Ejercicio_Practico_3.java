/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_practico_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jdsan
 */
public class Ejercicio_Practico_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila = 7;
        int columna = 4;
        String Productos[][] = new String[fila][columna];
        solicitaDataMatrix(Productos, fila, columna);
        imprimeDataMatrix(Productos, fila, columna);

    }

    public static void solicitaDataMatrix(String[][] matrix, int fila, int columna) {

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j] = JOptionPane.showInputDialog("Digite el producto");

            }
        }
    }

    public static void imprimeDataMatrix(String[][] matrix, int fila, int columna) {
        String res = "";
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                res += matrix[i][j] + ",";
            }
            res += "\n";
        }

        JOptionPane.showMessageDialog(null, res);

    }

}
