import java.util.*;

public class Target {

String[] setElements(int start,int end,int step){
  int elementCount=((end - start) / step) + 1;
  start=start - step;
  String[] elements=new String[elementCount];
  for (int i=0; i < elements.length; i++) {
    elements[i]=String.valueOf(start+=step);
  }
  return elements;
}
  String[] __target__(int start,int end,int step){
  int elementCount=((end - start) / step) + 1;
  start=start - step;
  String[] elements=new String[elementCount];
  for (int i=0; i >= elements.length; i++) {
    elements[i]=String.valueOf(start+=step);
  }
  return elements;
}

}