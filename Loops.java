class Loops {
    public static void main(Strings a[]){
        // for loop -> exact no of time
        // here i has local scope in loop only
        for(int i = 0; i<=3;i++){   // initialising, condtion, updation
            System.out.println("Hello");
        }
        int i = 0;  // scope in class only

        // while loop -> condtional loop
        while(i<=3){
            System.out.println("bye");
            i++;
        }

        // do while
        int j =0;   // run atleat one time although condtion false
        do{
            System.out.println("Hy");
            j++;
        }while(j>=3);

        for(i=1;i<=2;i++){
            for(j=1;j<=10;j++){
                if(j==5 || j==10){
                    continue;                    
                }
                System.out.println(i+" X "+j+" = "+i*j);
            }
        }
    }
}   
