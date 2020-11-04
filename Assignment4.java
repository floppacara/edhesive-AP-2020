import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened");    
    String msg = scan.nextLine();
    msg = msg.toLowerCase();
    
    String alg1Msg = "";
    int vowel = 0;
    int rep = 0;
    
    
    
    for(int i = 0; i < msg.length(); i++){
      String ltr = msg.substring(i, i + 1);
      if(i != 0 && !msg.substring(i-1,i).equals(" ") &&
          (ltr.equals("a")||
          ltr.equals("e")||
          ltr.equals("i")||
          ltr.equals("o")||
          ltr.equals("u")))
          {
            vowel++;
          }
        else if(i>0 && ltr.equals(msg.substring(i-1,i)))
        {
          rep++;
        }
        else
        {
          alg1Msg+= ltr;
        }
    }
    System.out.println("\nAlgorithm 1");  
    System.out.println("Vowels removed: " + vowel);
    System.out.println("Repeats removed: " +  rep); 
    System.out.println("Algorithm 1 message: " + alg1Msg);
        System.out.println("Algorithm 1 characters saved: " + (msg.length() - alg1Msg.length()));
        
        
        String alg2msg = "";
        int uni = 0;
        for(int i = 0; i < msg.length(); i++)
        {
          String ltr = msg.substring(i,i + 1);
          if (!ltr.equals(" "))
          {
            boolean alreadyUsed = false;
            for(int j = 0; j< i; j++)
            {
              if(msg.substring(j, j +1).equals(ltr))
              {
                alreadyUsed = true;
                break;
              }
            }
            if(!alreadyUsed)
            {
              uni++;
              int count = 0;
              for(int j = i; j < msg.length(); j++)
              {
                if(msg.substring(j, j + 1).equals(ltr))
                {
                  count++;
                }
              }
              alg2msg += count + ltr;
            }
          }
        }
        System.out.println("\nAlgorithm 2");
      System.out.println("Unique characters found: " + uni);
      System.out.println("Algorithm 2 message: " + alg2msg);
      System.out.println("Algorithm 2 characters saved: " + (msg.length() - alg2msg.length()));
      
    }
}


