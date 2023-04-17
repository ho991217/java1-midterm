package week3;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // int 형으로 형변환이 일어남
        System.out.println(10 / 4); // int 나눗셈
        System.out.println(10.0 / 4); // float형
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9 + 1.8);
    }
}
