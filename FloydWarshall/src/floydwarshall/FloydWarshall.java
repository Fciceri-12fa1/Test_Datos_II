/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshall;

/**
 * sa
 *
 * @author fciceri
 */
public class FloydWarshall {

    /**
     * @param args the command line arguments
     */
    static void FloydWarshall(int grafo[][]) {
        int n = grafo.length, temp;
        //crear matriz de distancia
        int caminos[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                caminos[i][j] = j;
            }
        }
        //ejecutar el métidi floyd-warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp = grafo[i][k] + grafo[k][j];
                    if (temp < grafo[i][j]) {
                        grafo[i][j] = temp;
                        caminos[i][j] = k;
                    }
                }
            }
        }
        print(grafo);
        print(caminos);
    }

    static void print(int M[][]) {

        System.out.println(" ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println(M[i][j] + " ,");
            }
        }
    }

}
