public class Anagram{

  public static void main(String[] args){

    //test your method here
    System.out.println(anagram("silent", "listen"));
    System.out.println(anagram("hello", "helo"));
  }

  public static boolean anagram(String word1, String word2){

    if(word1.length() != word2.length()){
      return false;
    }

    for(int i = 0; i < word1.length(); i++){

      String letter = word1.substring(i, i+1);
      int index = word2.indexOf(letter);

      if (index == -1){
        return false;
      }
      else{ // remove letter from word2

        String before = word2.substring(0, index);
        String after = word2.substring(index+1, word2.length());
        word2 = before + after;
      }
    }

    return true;
  }
}
