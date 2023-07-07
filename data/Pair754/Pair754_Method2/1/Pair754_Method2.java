import java.util.*;

public class Target {

boolean equals(byte a1[],int offs1,byte a2[],int offs2,int num){
  while (num-- > 0)   if (a1[offs1++] != a2[offs2++])   return false;
  return true;
}
  boolean __target__(byte a1[],int offs1,byte a2[],int offs2,int num){
  while (num++ > 0)   if (a1[offs1++] != a2[offs2++])   return false;
  return true;
}

}