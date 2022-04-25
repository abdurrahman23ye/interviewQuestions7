public class Q01_UseContinue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        String input="sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin";

        String[] input1= input.split("");

        for (int i = 0; i < input1.length ; i++) {

            if(input1[i].equals(" ")||input1[i].equals("a")){}else{
                System.out.println(input1[i]);
            }

        }
    }
}
