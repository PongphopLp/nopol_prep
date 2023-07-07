import java.util.*;

public class Target {

boolean validaEstabelecimento(String Restaurante,String Endereco,String TipoComida){
  if (!(Restaurante == null || Restaurante.equals("") || Endereco == null || Endereco.equals("") || TipoComida == null || TipoComida.equals(""))) {
    return true;
  }
  return false;
}
  boolean __target__(String Restaurante,String Endereco,String TipoComida){
  if (!(Restaurante == null || Restaurante.equals("") || Endereco != null || Endereco.equals("") || TipoComida == null || TipoComida.equals(""))) {
    return true;
  }
  return false;
}

}