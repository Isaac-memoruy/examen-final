public class examenfinal {

    public static int contadordeaprobados (int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz){
            for (int nota : fila){
                if(nota >=60) {
                    contador ++;
                }
            }
        }
        return contador;
    }

    public static double elpromediodelanotaalta (int[][] matriz) {
        int sumador = 0;
        int contador = 0;
        for (int[] fila : matriz){
            for (int nota : fila){
                if(nota >=80) {
                    sumador += nota;
                    contador ++;
                }
            }
        }
        return contador > 0 ? (double) sumador / contador : 0.0;
    }
    
    public static void impresordenotasbajas (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz [i][j] < 50) {
                    System.out.println("La nota baja en [" +i+ "][" +j+ "]: " + matriz [i][j] + "puntos");
                }
            }
        }
    }

    public static int[] posiciondelamaximanota (int[][]matriz) {
        int maxNota = Integer.MIN_VALUE;
        int filaMax = -1, columnabienMax = -1;
         for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maxNota){
                     maxNota = matriz[i][j];
                    filaMax = i;
                    columnabienMax = j;
                }
             }
         }
         return new int[]{filaMax, columnabienMax};
    }

    public static void main(String[] args) {
        int[][] notas = {
            {75, 85, 90},
            {45, 60, 72},
            {50, 30, 95}
        };

        System.out.println("Aprobados: " + contadordeaprobados (notas));
        System.out.println("Promedio notas altas: " + elpromediodelanotaalta (notas));
        impresordenotasbajas (notas);
        int[] posicion = posiciondelamaximanota (notas);
        System.out.println("Nota máxima en: [" + posicion[0] + "][" + posicion[1] + "]");
    }
}
