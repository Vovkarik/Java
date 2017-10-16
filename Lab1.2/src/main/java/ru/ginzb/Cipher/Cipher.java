package ru.ginzb.Cipher;

class Cipher 
{
   static char[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'};     
   static char[] lower= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

   static int posOfCharInUpper(char c)
    {
        int rez = -1;
        
        for(int i=0; i<upper.length; ++i)
        {
            if(c == upper[i]) rez = i;
        }
        return rez;
    }
    
   static int posOfCharInLower(char c)
    { 
        int rez = -1;
        
        for(int i=0; i<lower.length; ++i)
        {
            if(c == lower[i]) rez = i;
        }
        return rez;
    }

   public static void main(String[] args)
    {
    	if (args.length < 0)
      	StringBuffer output = new StringBuffer();;
      	String mode = args[1];
      	int key = Integer.parseInt(args[2]);
     	String input = args[3];
     	for(int i=0; i<input.length(); ++i)
     	{
            char c = input.charAt(i);
            
            if(posOfCharInUpper(c) == -1)
            {
                int y = (posOfCharInUpper(c)+key)%upper.length;
                output.append(upper[y]);
            }
            if(posOfCharInLower(c) == -1)
            {
                int y = (posOfCharInLower(c)+key)%lower.length;
                output.append(lower[y]);
            }
        }
        
        System.out.println(output.toString());
   }
}