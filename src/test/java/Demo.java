import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class Demo {

    static int hash(Object k) {
        int h = 0;
//        if (useAltHashing) {
//            if (k instanceof String) {
//                return sun.misc.Hashing.stringHash32((String) k);
//            }
//            h = hashSeed;
//        }

        h ^= k.hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    public static void main(String[] args) {
        int a = 1<<12;
        System.out.println(a);


        HashMap map = new HashMap();
        map.put("hello","hello");
        map.put("hello","hello1");

        map.put(null,"hello2");

        System.out.println(map.get(null));

        TreeSet set1 = new TreeSet();
        HashSet set2 = new HashSet();
        set1.add(1);
        set2.add(1);
        System.out.println(set1.equals(set2));
        
    }
}
