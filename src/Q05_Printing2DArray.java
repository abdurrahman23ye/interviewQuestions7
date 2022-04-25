public class Q05_Printing2DArray {
    public static void main(String[] args) {
        // Print 2D String array using loops
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.println(arr[i][j]);

            }

        }
    }
}
