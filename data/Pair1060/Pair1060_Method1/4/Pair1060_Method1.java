import java.util.*;

public class Target {

boolean isletra(char caractere){
  if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123))   return true;
  return false;
}
  boolean __target__(char caractere){
  if ((caractere > 64 && caractere < 91 || caractere > 96 && caractere >= 123))   return true;
  return false;
}

}