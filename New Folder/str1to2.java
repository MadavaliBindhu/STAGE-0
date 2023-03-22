

 //Given two strings find if string1 is reverse of string2
class main{
    public static void main(String[] args){
        String str1="bindhu";
        String str2="bindhu";
        String bag="";
        for(int i = 0; i <str1.length(); i++){
            bag=bag+str1.charAt(i);
        }
        if(bag.equals(str2)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

//int i = 0; i <Str.length(); i++

//int i=str1.length()-1;i>=0;i--
