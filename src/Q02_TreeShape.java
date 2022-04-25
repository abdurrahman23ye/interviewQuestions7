public class Q02_TreeShape {
    public static void main(String[] args) {
        // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
        int input=5;
        int govde=5;
        for (int i = 0; i <input ; i++) {
            System.out.println();

            for (int j = 0; j <i+1 ; j++) {
                System.out.print("^");}}
        System.out.println();

            for (int j = 0; j <govde; j++) {

                System.out.print("|||");
                System.out.println();}


    }
}
