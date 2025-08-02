import java.util.*;
public class Word_guess_game
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <String>words=new ArrayList<>();
        words.add("game");
        words.add("coding");
        words.add("avanika");
        words.add("cats");
        words.add("placement");
        words.add("cheesecake");
        words.add("word");
        words.add("kitty");
        words.add("gorgeous");
        words.add("black");
        words.add("pink");
        words.add("prayer");
        words.add("bottle");
        words.add("puppy");
        words.add("shy");
        words.add("party");
        words.add("money");
        words.add("flowers");
        words.add("programming");
        words.add("algorithm");
        int size=words.size();
        Random rand=new Random();
        int random=rand.nextInt(0,size);
        String randword=words.get(random);
        int word_size=randword.length();
        int chances=10;
        ArrayList <String> guess=new ArrayList<>();
        for(int i=0;i<word_size;i++)
        {
            guess.add("_ ");
        }
        int w=word_size;
        while(chances>0 || w>0)
        {
            System.out.println("Guess a letter of the given word: "+guess);
            char c=sc.next(".").charAt(0);
            c=Character.toLowerCase(c);
            boolean found=false;
            for(int i=0;i<word_size;i++)
            {
                if(c==randword.charAt(i))
                {
                    guess.set(i,String.valueOf(c));
                    found=true;
                }
            }
            if(found)
                {
                     System.out.println("GG!");
                     w--;
                }
            else 
            {
                chances--;
                System.out.println("Uh oh - Wrong guess :");
                System.out.println("Chances remaining: "+chances);
            }
            if(!guess.contains("_ "))
            {
                System.out.println("Congrats on guessing the right word: "+guess);
                break;
            }
        }
        if(guess.contains("_ "))
        {
            System.out.println("You have run out of chances and lost the game");
            System.out.println("The right word was: "+randword);
        }
        
    }
}
    
