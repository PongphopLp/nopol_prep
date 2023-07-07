import java.util.*;

public class Target {

int calculatePages(int items,int itemsPerPage){
  int mod=items % itemsPerPage;
  int div=items / itemsPerPage;
  if (mod == 0)   return div;
  return div + 1;
}
  int __target__(int items,int itemsPerPage){
  int mod=items % itemsPerPage;
  int div=items / itemsPerPage;
  if (mod != 0)   return div;
  return div + 1;
}

}