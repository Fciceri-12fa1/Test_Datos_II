
package floydwarshall;

public class FloydWarshall {

     static int INF=999;     
    static int[][] M = {    
                        {0  , INF, 9,  2, INF}, 
                        {2, 0  , INF,  INF, INF}, 
                        {INF, 2, 0  ,  2, 3}, 
                        {1, INF, INF,  0  , 4}, 
                        {INF, 2, INF,  INF, 0  }, 
                                
                       };
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
