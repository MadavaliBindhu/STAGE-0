
//Write a java program to print Below pattern
//Input : [[*_*_*],[_*_*].[*_*_*]]

class main{
  public static void main(String[] args){
  int n = 4,m=3 ;
  for(int i=0;i<=m-1; i++){
     String bag =" ";
   for(int j=0;j<=n-1;j++){
     if(i==0 || i==m){
       bag+= "*"+" ";
     }
     else if(j==1 || j==3){
        bag+= "_"+" ";
     }
     else{
        bag+="*"+" ";
     }
    }
    System.out.println(bag);
   }
}
}
