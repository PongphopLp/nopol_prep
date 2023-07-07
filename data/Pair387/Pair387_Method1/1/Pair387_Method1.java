import java.util.*;

public class Target {

String appendRight(String inicial,char adicionar,int comprimentoTotal){
  if (inicial == null)   return inicial;
  int comprimentoInicial=inicial.length();
  if (comprimentoInicial == comprimentoTotal)   return inicial;
  StringBuffer sb=new StringBuffer(inicial);
  for (int i=0; i < (comprimentoTotal - comprimentoInicial); i++) {
    sb.append(adicionar);
  }
  return sb.toString();
}
  String __target__(String inicial,char adicionar,int comprimentoTotal){
  if (inicial != null)   return inicial;
  int comprimentoInicial=inicial.length();
  if (comprimentoInicial == comprimentoTotal)   return inicial;
  StringBuffer sb=new StringBuffer(inicial);
  for (int i=0; i < (comprimentoTotal - comprimentoInicial); i++) {
    sb.append(adicionar);
  }
  return sb.toString();
}

}