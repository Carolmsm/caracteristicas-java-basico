package one.digitalinnovation.tipos.primitivos;

public class Primitivos {

    public static void main(String[] args) {
        //INTEIROS

        // byte nullByte = null;

        byte b;
        byte b1 = 127;  //8 bits
        byte b2 = -128;
        // byte b3 = 129;       // to large


        char c;
        char c1 = 'A';
        char c2 = 15111;
        // char c3 = 'AA'; // NOK
        // char c4 = -100; //NOK

        short s; //16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647;  //32bits
        int i2 = -2147483648;
        // int i3 = -2147483649;  // to large

        long l = 3225887878188487884L;  // 64 bits
        long l2 = -3225887878188487885L;
        // long l3 = 9223372036854775808L; // to large

        // FLUTUANTES

        float f = 65f;      //32 bits 3.402,823,5
        float f2 = 65.0f;
        float f3 = -0.5f;    // 1.4 E E-45

        double d = 1024.99; // 64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456; // 4.9 E-324

        // Boleano

        boolean b0 = true;
        boolean b02 = false;
        // boolean bo3 = "false"; //NOK
        //boolean b04 ='true'; //NOK

         //void v: // palavra reservada
        //System.out.println("byte" + b); // ERROR, A VARIAVEL NÃO FOI INICIALIZADA
    }
}
