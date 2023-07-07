import java.util.*;

public class Target {

int getHeaderLength(byte[] result){
  int i=0;
  int max=result.length - 3;
  do {
    if ((result[i] == '\r') && (result[i + 1] == '\n') && (result[i + 2] == '\r')&& (result[i + 3] == '\n'))     return (i + 4);
    i++;
  }
 while (i < max);
  return result.length;
}
  int __target__(byte[] result){
  int i=0;
  int max=result.length - 3;
  do {
    if ((result[i] == '\r') && (result[i + 1] == '\n') && (result[i + 2] == '\r')&& (result[i + 3] == '\n'))     return (i + 4);
    i++;
  }
 while (i <= max);
  return result.length;
}

}