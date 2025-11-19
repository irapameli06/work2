public class ArrayPractice {
    public static void main(String[] args) {

        // One-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("One-dimensional array:");
        for (int n : numbers) {
            System.out.println(n);
        }

        // Two-dimensional array
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        System.out.println("\nTwo-dimensional array:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
               System.out.print(grid[i][j] + " ");
          
               System.out.println();
        
   }
}

}
}
