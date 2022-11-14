import java.io.*;
import java.util.*;
import java.util.Scanner;
  
class Main {
    public static void main(String args[])
    {
        System.out.println("======================================");
        System.out.println("||   Welcome to Virtual Sing Along   ||");
        System.out.println("======================================");
        System.out.println("Song Genres" 
        + "\n1. Romantic."
        + "\n2. Reggae."
        + "\n3. Pop.");
        
        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> ht3 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> ht4 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> ht5 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> ht6 = new Hashtable<Integer, String>(); 
        
        ///ROMANTIC SONGS/////
        ht1.put(4, "4  for Because of You by (Ne-yo)");
        ht1.put(5, "5  for She Will be Loved by (Maroon 5)");
        ht1.put(6, "6  for Love Story by (Taylor Swift)");
        
        ht2.put(7, "Because of You"
        +"\nBy: Ne-yo"
        +"\nhttps://www.youtube.com/watch?v=atz_aZA3rf0");
        ht2.put(8, "She Will Be Loved"
        +"\nBy: Maroon 5"
        +"\nhttps://www.youtube.com/watch?v=nIjVuRTm-dc");
        ht2.put(9, "Love Story"
        +"\nBy: Taylor Swift"
        +"\nhttps://www.youtube.com/watch?v=8xg3vE8Ie_E");
        
        
     ////REGGAE SONGS/////   
        ht3.put(10, "10  for Get Up Stand Up by (Bob Marley and the Wailers)");
        ht3.put(11, "11  for Revolution by (Dennis Brown)");
        ht3.put(12, "12  for Book Of Rules by (The Heptones)");
        
        ht4.put(13, "Get Up Stand Up"
        +"\nBy: Bob Marley and the Wailers"
        +"\nhttps://www.youtube.com/watch?v=RhJ0q7X3DLM");
        ht4.put(14, "Revolution"
        +"\nBy: Dennis Brown"
        +"\nhttps://www.youtube.com/watch?v=EQ_Lq49Gmmo");
        ht4.put(15, "Book Of Rules"
        +"\nBy: The Heptones"
        +"\nhttps://www.youtube.com/watch?v=8z9h2nO5SIo");
     
     
     ////POP MUSICS/////   
        ht5.put(16, "16  for Firework by (Katy Perry)");
        ht5.put(17, "17  for Blinding Lights by (The Weeknd)");
        ht5.put(18, "18  for Adore You by (Harry Styles)");
        
        ht6.put(19, "Firework"
        +"\nBy: Katy Perry"
        +"\nhttps://www.youtube.com/watch?v=QGJuMBdaqIw");
        ht6.put(20, "Blinding Lights"
        +"\nBy: The Weeknd"
        +"\nhttps://www.youtube.com/watch?v=4NRXx6U8ABQ");
        ht6.put(21, "Adore You"
        +"\nBy: Harry Styles"
        +"\nhttps://www.youtube.com/watch?v=VF-r5TtlT9w");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your prefer genre to continue: 1, 2, or 3 ?");
        int value = sc.nextInt(); 
       
        
        if(value == 1) {  
                System.out.println("You prefer Romantic Songs.");
                System.out.println("List of Romantic Songs on your iTunes:");
                System.out.println(ht1.get(4));
                System.out.println(ht1.get(5));
                System.out.println(ht1.get(6));
          }  
        else if(value == 2) {  
                System.out.println("You prefer Reggae Songs.");
                System.out.println("List of Reggae Songs on your iTunes:");
                System.out.println(ht3.get(10));
                System.out.println(ht3.get(11));
                System.out.println(ht3.get(12));
          }  
        else if(value == 3) {          
                System.out.println("You prefer Pop Songs.");
                System.out.println("List of Pop Songs on your iTunes:");
                System.out.println(ht5.get(16));
                System.out.println(ht5.get(17));
                System.out.println(ht5.get(18));
          }  
        else {  
             System.out.println("SORRY, that is beyond the options. ");  
          }
          
        Scanner sng = new Scanner(System.in);
        System.out.println("Choose your song");
        int tunes = sng.nextInt(); 
        
        if (tunes == 4) {
            System.out.println(ht2.get(7));
        }
        else if (tunes == 5) {
            System.out.println(ht2.get(8));
        }
        else if (tunes == 6) {
            System.out.println(ht2.get(9));
        }
        else if (tunes == 10) {
            System.out.println(ht4.get(13));
        }
        else if (tunes == 11) {
            System.out.println(ht4.get(14));
        }
        else if (tunes == 12) {
            System.out.println(ht4.get(15));
        }
        else if (tunes == 16) {
            System.out.println(ht6.get(19));
        }
        else if (tunes == 17) {
            System.out.println(ht6.get(20));
        }
        else if (tunes == 18) {
            System.out.println(ht6.get(21));
        }
        else if (tunes >= 22 ) {
          System.out.println("SORRY, that is beyond the options. ");
        }
        System.out.println("Happy Listening Hooman!! ");
    }
}
