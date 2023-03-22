//Write a java program to replace all lowercase letter to uppercase  and vice versa
             //Input : str = “Great PoWer”
            //Output : str = “gREAT pOwER” 

class main{    
    public static void main(String[] args){      
        String str1="Great Power";    
        String bag ="";    
        for(int i = 0; i < str1.length(); i++) {    
            if(Character.isLowerCase(str1.charAt(i))){       
               bag.CharAt(i,Character.toUpperCase(str1.charAt(i)));    
            }       
            else if(Character.isUpperCase(str1.charAt(i))) {       
                bag.CharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println(bag);    
    }    
}     
