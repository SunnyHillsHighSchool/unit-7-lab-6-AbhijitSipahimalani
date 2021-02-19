//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   private String word;
   //add an instance variable
int count = 0;
	//create a constructor
public word ()
{
  word ="";
}	
public static void getNumVowels() {
  for(int i = 0; i < word.length(); i++){
     if(word.valueOf(i) == "a"  || word.valueOf(i) ==  "A" || word.valueOf(i) ==  "e" || word.valueOf(i) ==  "E" || word.valueOf(i) ==  "i" || word.valueOf(i) ==  "I" || word.valueOf(i) ==  "o" || word.valueOf(i) ==  "O" || word.valueOf(i) ==  "u" || word.valueOf(i) ==   "U") {
    count += 1;
    
     }
  }
  return count;
}
	//look at the sample runner code
	//on the lab handout

	//create a toString method
public String toString(){
  return Integer.toString(count);

}
public String getWord (){
  return word;
}
public void setWord (String s){
  word = s;
}

}