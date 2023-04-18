package week7;

import java.util.Scanner;

interface GoodsInter {
    String getName();
    int getPrice();
    int getNumberOfStock();
    int getSold();
}

class Goods implements GoodsInter {
    private String name;
    private int price, n, sold;

    public Goods(String name, int price, int n, int sold) {
        this.name = name;
        this.price = price;
        this.n = n;
        this.sold = sold;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getNumberOfStock() {
        return this.n;
    }

    @Override
    public int getSold() {
        return this.sold;
    }

}

public class GoodsArray {
    public static void main(String[] args) {
        Goods[] goodsArray = new Goods[3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < goodsArray.length; i++) {
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            int sold = s.nextInt();
            goodsArray[i] = new Goods(name, price, n, sold);
        }
        for (Goods el: goodsArray) {
            System.out.println(el.getName());
            System.out.println(el.getPrice());
            System.out.println(el.getNumberOfStock());
            System.out.println(el.getSold());
        }
    }
}
