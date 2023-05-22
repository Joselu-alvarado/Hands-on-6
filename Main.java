import java.util.Arrays;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Operacionesr2 op = new Operacionesr2();
        Vector vector = new Vector();
        Scalar scalar = new Scalar();


        // R2 OPERATIONS
        System.out.println(ANSI_BLUE+ "-----------------------------------");
        System.out.println("R2 OPERATIONS:");
        System.out.println("Vector A: " + Arrays.toString(vector.getVectorA()));
        System.out.println("Vector B: " + Arrays.toString(vector.getVectorB()));
        System.out.println("Vector C: " + Arrays.toString(vector.getVectorC()));
        System.out.println("------------------------------------"+ANSI_RESET);

        // Vector Sum
        System.out.println("Sum:");
        System.out.println(Arrays.toString(vector.getVectorA()) + " + " + Arrays.toString(vector.getVectorB()));
        op.VectorSum(vector.getVectorA(), vector.getVectorB());

        // Vector Resta
        System.out.println("Resta:");
        System.out.println(Arrays.toString(vector.getVectorA()) + " - " + Arrays.toString(vector.getVectorB()));
        op.VectoRes(vector.getVectorA(), vector.getVectorB());

        // Scalar Multiply
        System.out.println("Multiplicacion Scalar :");
        System.out.println(Arrays.toString(vector.getVectorA()) + " + " + Arrays.toString(vector.getVectorC()) + " * 7");
        op.multiScalar(vector.getVectorA(), vector.getVectorC(), scalar.getEscalar());

        // Scalar multiplicacion 2
        System.out.println("Multiplicacion Scalar 2:");
        System.out.println(Arrays.toString(vector.getVectorA()) + " + " + Arrays.toString(vector.getVectorB()) + " * 7 - " + Arrays.toString(vector.getVectorC()));
        op.multiScalarC(vector.getVectorA(), vector.getVectorB(), vector.getVectorC(), scalar.getEscalar());

        // Magnitud r2
        System.out.println("Magnitud r2:");
        op.magnitudr2(vector.getVectorA(), vector.getVectorB(), vector.getVectorC());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        // R3 OPERATIONS
        System.out.println(ANSI_BLUE+ "\nR3 Operaciones:");
        System.out.println("Vector U: " + Arrays.toString(vector.getVectorU()));
        System.out.println("Vector V: " + Arrays.toString(vector.getVectorV()));
        System.out.println("Vector W: " + Arrays.toString(vector.getVectorW()));
        System.out.println("Vector C2: " + Arrays.toString(vector.getVectorC2()));
        System.out.println("------------------------------------------"+ ANSI_RESET);

        // Magnitud r3
        System.out.println("Magnitud r3:");
        op.magnitudr3(vector.getVectorU(), vector.getVectorV(), vector.getVectorW(), vector.getVectorC2());
    }
}