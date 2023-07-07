import java.util.*;

public class Target {

String obtemItem(String[] array,int posicao){
  if (array.length > posicao) {
    return array[posicao];
  }
 else {
    return "";
  }
}
  String __target__(String[] array,int posicao){
  if (array.length <= posicao) {
    return array[posicao];
  }
 else {
    return "";
  }
}

}