package bai21.baitap._MemoryPool;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
        gun.fireInPool();
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
