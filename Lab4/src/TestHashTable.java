import java.util.Random;
public class TestHashTable {
    public static void main(String[] args) {
        HashTableLin lin = new HashTableLin(3, 0.5);
        System.out.println("Size: " + lin.getSize());
        System.out.println("Adding 4 elements to maxnum of 3");
        lin.insert(6);
        lin.insert(8);
        lin.insert(1);
        lin.insert(8);
        lin.insert(12);
        System.out.println("Load before rehash: " + ((double)lin.getNumElements()/lin.getSize()));
        lin.insert(69);
        System.out.println("Load after rehash: " + ((double)lin.getNumElements()/lin.getSize()));
        System.out.println("Num elements: " + lin.getNumElements());
        System.out.println("Size: " + lin.getSize());
        System.out.println("Load: " + lin.getLoad());
        lin.printKeysAndIndexes();
        System.out.println("-----------------------------------");



        HashTableQuad quad = new HashTableQuad(5, 0.5);
        System.out.println("Size: " + quad.getSize());
        System.out.println("Adding 6 elements to maxnum of 5");
        quad.insert(12);
        quad.insert(1);
        quad.insert(23);
        quad.insert(6);
        quad.insert(8);
        quad.insert(86);
        quad.insert(1111);
        quad.insert(674);
        System.out.println("Load before rehash: " + ((double)quad.getNumElements()/quad.getSize()));
        quad.insert(69);
        System.out.println("Also adding duplicate elements");
        quad.insert(69);
        System.out.println("Load after rehash: " + ((double)quad.getNumElements()/quad.getSize()));
        System.out.println("Size: " + quad.getSize());
        System.out.println("Num elements: " + quad.getNumElements());
        System.out.println("Load: " + quad.getLoad());
        quad.printKeysAndIndexes();



        System.out.println("-----------------------------------");
        Random ran = new Random();
        double[] loadArr = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
        for (double load : loadArr) {
            int probes = 0;
            int count = 0;
            for (int rep = 0; rep < 100; rep++) {
                HashTableLin linearHash = new HashTableLin(100000, load);
                for (int i = 0; i < 100000; i++) {
                    int ranVal = ran.nextInt(10000000);
                    if (!linearHash.isIn(ranVal)) {
                        probes += linearHash.insertCount(ranVal);
                        count++;
                    } else {
                        i--;
                    }
                }
            }
            System.out.println("Load: " + load + ". Average Probes: " + ((double) probes / (double) count));
        }
        System.out.println("-----------------------------------");

        for (double load : loadArr) {
            int probes = 0;
            int count = 0;
            for (int rep = 0; rep < 100; rep++) {
                HashTableQuad quadHash = new HashTableQuad(100000, load);
                for (int i = 0; i < 100000; i++) {
                    int ranVal = ran.nextInt(10000000);
                    if (!quadHash.isIn(ranVal)) {
                        probes += quadHash.insertCount(ranVal);
                        count++;
                    } else {
                        i--;
                    }
                }
            }
            System.out.println("Load: " + load + ". Average Probes: " + ((double) probes / (double) count));
        }
    }
}