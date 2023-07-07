import java.util.*;

public class Target {

String[] createRandomWords(String[] alphabet,int lengthOfWord,int numberOfWords){
  ArrayList<String> words=new ArrayList<String>();
  Random r=new Random();
  int len=alphabet.length;
  for (int i=0; i < numberOfWords; i++) {
    StringBuffer w=new StringBuffer();
    for (int j=0; j < lengthOfWord; j++) {
      w.append(alphabet[r.nextInt(len)]);
    }
    words.add(w.toString());
  }
  String[] w=new String[words.size()];
  words.toArray(w);
  return w;
}
  String[] __target__(String[] alphabet,int lengthOfWord,int numberOfWords){
  ArrayList<String> words=new ArrayList<String>();
  Random r=new Random();
  int len=alphabet.length;
  for (int i=0; i >= numberOfWords; i++) {
    StringBuffer w=new StringBuffer();
    for (int j=0; j < lengthOfWord; j++) {
      w.append(alphabet[r.nextInt(len)]);
    }
    words.add(w.toString());
  }
  String[] w=new String[words.size()];
  words.toArray(w);
  return w;
}

}