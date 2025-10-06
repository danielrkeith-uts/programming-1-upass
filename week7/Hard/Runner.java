public class Runner {

    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<Integer, String>();

        cache.add(4, "Apple");
        cache.add(7, "Banana");
        cache.add(100, "Pear");

        System.out.println(cache.get(7));
        System.out.println(cache.get(100));
        System.out.println(cache.get(1));

        cache.remove(7);
        System.out.println(cache.get(7));
    }

}
