package week3;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // int 형으로 형 변환이 일어남
        System.out.println(10 / 4); // int 나눗셈
        System.out.println(10.0 / 4); // float 형
        System.out.println((char)0x12340041); // char 형
        System.out.println((byte)(b+i)); // byte 형으로 형 변환
        System.out.println((int)2.9 + 1.8); // int 형으로 변환 후 계산
    }
}
