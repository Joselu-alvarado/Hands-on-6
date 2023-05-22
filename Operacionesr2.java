import java.util.Arrays;

public class Operacionesr2 {
    public void VectorSum(int[] Vector, int[] Vector2){  //toma dos vectores de tipo int
        int[] vectorRes = new int[Vector.length];
        if (Vector.length!=Vector2.length){
            System.out.println("Invalid");   //Comprueba si los vectores tienen la misma longitud
        }
        else {
            for (int i = 0; i < Vector.length; i++) {  //Se recorre cada elemento de los vectores
                vectorRes[i] = Vector[i] + Vector2[i];
            }
        }
        System.out.println(Arrays.toString(vectorRes));

    }
    public void VectoRes(int[] Vector, int[] Vector2){
        int[] vectorRes = new int[Vector.length];
        if (Vector.length!=Vector2.length){
            System.out.println("Invalid");
        }
        else {
            for (int i = 0; i < Vector.length; i++) {
                vectorRes[i] = Vector[i] - Vector2[i];
            }

        }
        System.out.println(Arrays.toString(vectorRes));

    }

    public void multiScalar(int[] Vector, int[] Vector2, int escalar ){
        int[] vectorRes = new int[Vector.length];
        if (Vector.length!=Vector2.length){
            System.out.println("Invalid");
        }

        else {
            for (int i = 0; i < Vector.length; i++) {
                vectorRes[i] = Vector[i] + Vector2[i];
            }
            for (int i = 0; i < vectorRes.length; i++) {
                vectorRes[i] = vectorRes[i] * escalar;
            }
        }
        System.out.println(Arrays.toString(vectorRes));

    }

    public void multiScalarC(int[] Vector, int[] Vector2, int[] Vector3, int escalar ) {
        int[] vectorRes = new int[Vector.length];
        if (Vector.length != Vector2.length) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < Vector.length; i++) {
                vectorRes[i] = Vector[i] + Vector2[i];
            }
            for (int i = 0; i < vectorRes.length; i++) {
                vectorRes[i] = vectorRes[i] * escalar;
            }
            for (int i = 0; i < Vector.length; i++) {
                vectorRes[i] = vectorRes[i] -  Vector3[i];

            }
            System.out.println(Arrays.toString(vectorRes));
        }
    }


    public void magnitudr2(int[] Vector, int[] Vector2, int[] Vector3){
        int [] vectorRes = new int[Vector.length];

        for (int i = 0; i < Vector.length; i++) {
            vectorRes[i] = (4 * Vector[i]) + (5 * Vector2[i]) - Vector3[i];
        }

        int sumaCuadrados = 0;
        for (double x : vectorRes) {
            sumaCuadrados += x * x;
        }
        System.out.println(Math.sqrt(sumaCuadrados));  //para calcular la raíz cuadrada de sumaCuadrados
    }


    public void magnitudr3 (int[] Vector, int[] Vector2, int[] Vector3, int[] Vector4) {
        int [] vectorRes = new int[Vector.length];

        for (int i = 0; i < Vector.length; i++) {
            vectorRes[i] = (((Vector[i] * 4) * (2 * (Vector2[i]))) * Vector3[i] ) * Vector4[i];
        }
        int sum = 0;
        for (double x : vectorRes) {
            sum += x * x;
        }
        System.out.println(Math.sqrt(sum));
    }

}