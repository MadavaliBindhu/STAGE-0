//Write a java program to print sum of border and diagonal element in a 2D array
//Input : Arr  = [[1,2,3],[4,5,6],[7,8,9]]
//Output: res =  45

class main{
  public static void main(String[] args){
      int[] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
      int count=0;
      //int n=arr.length;
      for(int i=0;i<=arr.length;i++){
         for(int j=0;j<=n;j++){
            if(i==j || i+j==n+1 || i==0 || i==n || j==0 || j==n){
              count+=n;
             }
           }
         }
         System.out.println(count);
       }
     }
