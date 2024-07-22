class arr{
    public static void main(String[] args) {
        int nums[][]=new int[3][4];
        String a[][]=new String[2][3];
        int num[][]= new int[3][];
          num[0] =new int[2];
          num[1]=new int[4];
          num[2]=new int[3];
          int i,j;
          for(i=0;i<num.length;i++){
            for(j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*100);
            }
          }

          for(i=0;i<num.length;i++){
            for(j=0;j<num[i].length;j++){
              System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
              nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
              System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
              System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    for(int n[]:nums){
        for(int m : n){
            System.out.print(m+" ");
        }
        System.out.println();
    }

    }
}