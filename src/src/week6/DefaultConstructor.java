package week6;

public class DefaultConstructor {
    int x;
    public void setX(int x) { this.x = x; }
    public int getX() { return this.x; }

    // public DefaultConstructor() {} --> 컴파일러에 의해 자동으로 기본 생성자가 삽입
    // ㄴ> 생성자가 하나라도 존재하는 경우 자동 삽입되지 않음
    public static void main(String[] args) {
        DefaultConstructor p = new DefaultConstructor();
        p.setX(3);
        System.out.println(p.getX());
    }
}
