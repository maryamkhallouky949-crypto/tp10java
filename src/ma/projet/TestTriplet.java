
package ma.projet;

public class TestTriplet {

    public static void main(String[] args) {

        
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);

        tInt.affiche();

        
        Triplet<String> tStr = new Triplet<>("A", "B", "C");

        tStr.affiche();

      
        System.out.println("Second élément : "
                + tInt.getSecond());

        System.out.println(" Après swap");

        Triplet<Integer> t2 = tInt.swap();

        t2.affiche();
    }
}
