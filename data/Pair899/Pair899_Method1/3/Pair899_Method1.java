import java.util.*;

public class Target {

int indexOfNextNonDigit(String location_str,int index_start){
  int index_end=index_start;
  while (index_end < location_str.length() && Character.isDigit(location_str.charAt(index_end)))   index_end++;
  return index_end;
}
  int __target__(String location_str,int index_start){
  int index_end=index_start;
  while (index_end <= location_str.length() && Character.isDigit(location_str.charAt(index_end)))   index_end++;
  return index_end;
}

}