class Arrays {
    // variable store multiple value same datatype
    public static void main(Strings a[]){
        // crearting
        int nums1[] = {1,2,3,4}; // -> Inline initialisation
        int nums2[] = new int[4]; // -> allocate empty memory

        // assigning values - updating
        nums2[0] = 11;  
        nums2[1] = 22;
        nums2[2] = 33;
        nums2[3] = 44;

        // looping
        for(int i = 0; i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();

        // extended loop
        for(int num : nums2){
            System.out.print(num+" ");
        }

    }

}
