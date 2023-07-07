import java.util.*;

public class Target {

byte at(byte[] src,int i){
  if (i > src.length - 1)   return 0;
  return src[i];
}
  byte __target__(byte[] src,int i){
  if (i <= src.length - 1)   return 0;
  return src[i];
}

}