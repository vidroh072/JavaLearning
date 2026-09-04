class Arrays2D3D {
    public static void main(Strings a[]){
        int num1[] = {1,2,3};
        int num2[] = {4,5,6};

        // creating arrays
        int nums[][] = {num1,num2};
        
        int nums2[][] = new int[2][2];  // 2 row 2 col
        int nums3[][][] = new int[2][2][2];
        // assigning - updating

        nums2[0][0] = 10;
        nums2[1][0] = 20;
        
        // loop
        for (int[] row : nums2) {
            for (int val : row) {
                System.out.print(val+" ");
            }
            System.out.println();
        }

    // limitation 
    // - Fixed size
    // - Searching/Inserting/Updation -> consume time
    // - Homogeneous -> same type

    }    
}
