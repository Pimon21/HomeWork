package HomeWork1;

public class Task1 {
    public static void main(String[] args) {

        int a = 42; //42 -> 00000000 00000000 00000000 00101010;
        int b = 15; //15 -> 00000000 00000000 00000000 00001111;

        System.out.println(~ 42); // ~ 00101010 -> 11111111 11111111 11111111 11010101 (-43);
        System.out.println(~ 15); // ~ 00001111 -> 11111111 11111111 11111111 11110000 (-16);
        System.out.println(42 & 15); // 00101010 & 00001111, результат 10 -> 00001010;
        System.out.println(15 & 42); // 00001111 & 00101010, результат 10 -> 00001010;
        System.out.println(a &= 15); // результат 10 -> 00001010;
        System.out.println(b &= 42); // результат 10 -> 00001010;
        System.out.println(42 | 15); // 00101010 | 00001111, результат 47 -> 00101111;
        System.out.println(15 | 42); // 00001111 | 00101010, результат 47 -> 00101111;
        System.out.println(a |= 15); // результат 47 -> 00101111;
        System.out.println(b |= 42); // результат 47 -> 00101111;
        System.out.println(42 ^ 15); // 00101010 ^ 00001111, результат 37 -> 00100101;
        System.out.println(15 ^ 42); // 00001111 ^ 00101010, результат 37 -> 00100101;
        System.out.println(a ^= 15); // результат 37 -> 00100101;
        System.out.println(b ^= 42); // результат 37 -> 00100101;
        System.out.println(42 >> 15); // 00101010 >> 00001111, результат 0 -> 00000000;
        System.out.println(15 >> 42); // 00001111 >> 00101010, результат 0 -> 00000000;
        System.out.println(a >>= 15); // результат 0 -> 00000000;
        System.out.println(b >>= 42); // результат 0 -> 00000000;
        System.out.println(42 >>> 15); // 00101010 >> 00001111, результат 0 -> 00000000;
        System.out.println(15 >>> 42); // 00001111 >>> 00101010, результат 0 -> 00000000;
        System.out.println(42 << 15); // 00101010 << 00001111, результат 1376256 -> 00000000 00010101 00000000 00000000;
        System.out.println(15 << 42); // 00001111 << 00101010, результат 15360 -> 00000000 00000000 00111100 00000000;
        System.out.println(a <<= 15); //  результат 1376256 -> 00000000 00010101 00000000 00000000;
        System.out.println(b <<= 42); // результат 15360 -> 00000000 00000000 00111100 00000000;
        System.out.println(a >>>= 15); // результат 0 -> 00000000;
        System.out.println(b >>>= 42); // результат 0 -> 00000000;

        int c = -42; // -42 -> 11111111 11111111 11111111 11010110;
        int d = -15; // -15 -> 11111111 11111111 11111111 11110001;

        System.out.println(~ -42); // ~ 11111111 11111111 11111111 11010110 -> 00101001 (41);
        System.out.println(~ - 15); // ~ 11111111 11111111 11111111 11110001 -> 00001110 (14);
        System.out.println(-42 & -15); // 11111111 11111111 11111111 11010110 & 11111111 11111111 11111111 11110001, результат -48 -> 11111111 11111111 11111111 11010000;
        System.out.println(-15 & -42); // 11111111 11111111 11111111 11110001 & 11111111 11111111 11111111 11010110б результат -48 -> 11111111 11111111 11111111 11010000;
        System.out.println(c &= -15); // результат -48 -> 11111111111111111111111111010000;
        System.out.println(d &= -42); // результат -48 -> 11111111111111111111111111010000;
        System.out.println(-42 | -15); // 11111111 11111111 11111111 11010110 | 11111111 11111111 11111111 11110001, результат -9 -> 11111111 11111111 11111111 11110111;
        System.out.println(-15 | -42); // 11111111 11111111 11111111 11110001 | 11111111 11111111 11111111 11010110, результат -9 -> 11111111 11111111 11111111 11110111;
        System.out.println(c |= -15); // результат -9 -> 11111111111111111111111111110111;
        System.out.println(d |= -42); // результат -9 -> 11111111111111111111111111110111;
        System.out.println(-42 ^ -15); // 11111111 11111111 11111111 11010110 ^ 11111111 11111111 11111111 11110001, результат 39 -> 00100111;
        System.out.println(-15 ^ -42); // 11111111 11111111 11111111 11110001 ^ 11111111 11111111 11111111 11010110, результат 39 -> 00100111;
        System.out.println(c ^= -15); // результат 39 -> 00100111;
        System.out.println(d ^= -42); // результат 39 -> 00100111;
        System.out.println(-42 >> -15); // 11111111 11111111 11111111 11010110 >> 11111111 11111111 11111111 11110001, результат -1 -> 11111111 11111111 11111111 11111111;
        System.out.println(-15 >> -42); // 11111111 11111111 11111111 11110001 >> 11111111 11111111 11111111 11010110, результат -1 -> 11111111 11111111 11111111 11111111;
        System.out.println(c >>= -15); // результат -1 -> 11111111 11111111 11111111 11111111;
        System.out.println(d >>= -42); // результат -1 -> 11111111 11111111 11111111 11111111;
        System.out.println(-42 >>> -15); // 11111111 11111111 11111111 11010110 >>> 11111111 11111111 11111111 11110001, результат 32767 -> 00000000 00000000 01111111 11111111;
        System.out.println(-15 >>> -42); // 11111111 11111111 11111111 11110001 >>> 11111111 11111111 11111111 11010110, результат 1023 -> 00000000 00000000 00000011 11111111;
        System.out.println(-42 << -15); // 11111111 11111111 11111111 11010110 << 11111111 11111111 11111111 11110001, результат -5_505_024 -> 11111111 10101100 00000000 00000000;
        System.out.println(-15 << -42); // 11111111 11111111 11111111 11110001 << 11111111 11111111 11111111 11010110, результат -62_914_560 -> 11111100 01000000 00000000 00000000;
        System.out.println(c <<= -15); // результат -5_505_024 -> 11111111 10101100 00000000 00000000;
        System.out.println(d << -42); // результат -62_914_560 -> 11111100 01000000 00000000 00000000;
        System.out.println(c >>>= -15); // результат 32767 -> 00000000 00000000 01111111 11111111;
        System.out.println(d >>>= -42); // результат 1023 -> 00000000 00000000 00000011 11111111;

//        System.out.println(~ 42.5); // данная команда не будет компилироваться, т.к. побитовые операции можно применять к целочисленными типам long, int, short, char, byte.
    }
}
