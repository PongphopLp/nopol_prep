import java.util.*;

public class Target {

byte[] byteSection(byte[] data,int first,int last){
  byte[] temp=new byte[last + 1 - first];
  for (int i=first; i < last + 1; i++)   temp[i - first]=data[i];
  return temp;
}
  byte[] __target__(byte[] data,int first,int last){
  byte[] temp=new byte[last + 1 - first];
  for (int i=first; i >= last + 1; i++)   temp[i - first]=data[i];
  return temp;
}

}