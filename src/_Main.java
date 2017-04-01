import java.util.Random;

/**
 * Created by lolik on 2017-03-31.
 */
class Main {


    public static void main (String[] args)
    {
        Collection_O1 ds = new Collection_O1();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
        System.out.println(ds.contains(30));
        ds.remove(20);
        ds.add(50);
        System.out.println(ds.contains(50));
        Random rand = new Random();  // Choose a different seed
        int randomIndex = rand.nextInt(4);
        System.out.println(ds.getRandom(randomIndex));
    }
}
