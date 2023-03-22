//Given  3 sides of a triangle, find out if the triangle is a right angled triangle.
//Right angled triangle = (side1)^2 + (side2)^2 = (side3)^2
class main{
  public static void main(String[] args){
  int x = 4;
  int y = 3;
  int z = 5; 
  if ((x*x)+(y*y)==(z*z)){
      System.out.println("Right angled triangle");
   }
    else{
       System.out.println("Not a right angled traingle");
     }
  }
}
