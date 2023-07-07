import java.util.*;

public class Target {

String lpad(String valueToPad,String filler,int size){
  while (valueToPad.length() < size)   valueToPad=filler + valueToPad;
  return valueToPad;
}
  String __target__(String valueToPad,String filler,int size){
  while (valueToPad.length() < size)   valueToPad=filler - valueToPad;
  return valueToPad;
}

}