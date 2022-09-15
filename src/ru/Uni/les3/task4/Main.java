package ru.Uni.les3.task4;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.appendComp(new Computer("asus 3000"));
        shop.appendComp(new Computer("asus 3001"));
        shop.appendComp(new Computer("asus 3002"));
        System.out.println(shop);
        shop.deleteComp("asus 3001");
        System.out.println(shop);

    }
}
