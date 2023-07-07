import java.util.*;

public class Target {

int compte(String chaine,String partie){
  if (chaine == null || partie == null || chaine.equals("") || partie.equals("")) {
    return 0;
  }
  int nb=0;
  int indice=0;
  while ((indice=chaine.indexOf(partie,indice)) >= 0) {
    indice+=partie.length();
    nb++;
  }
  return nb;
}
  int __target__(String chaine,String partie){
  if (chaine == null || partie == null || chaine.equals("") || partie.equals("")) {
    return 0;
  }
  int nb=0;
  int indice=0;
  while ((indice=chaine.indexOf(partie,indice)) >= 0) {
    indice+=partie.length();
    nb--;
  }
  return nb;
}

}