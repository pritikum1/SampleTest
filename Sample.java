public class Pallindrome {

	public static void main(String[] args) 
	{
      String s1= "Java";
      String s2= "";
      for(int i=0 ; i<=s1.length()-1; i++)
//      for(int i=s1.length()-1; i>=0; i--)
      {
    	  s2+=s1.charAt(i);
      }
    		  System.out.println(s2);
    		  if(s1.equalsIgnoreCase(s2))
    		  {
    			  System.out.println("pallindrom");
    		  }
    		  else
    		  {
    			  System.out.println("not Pallidrome");
    		  }


	}
	
	
}
