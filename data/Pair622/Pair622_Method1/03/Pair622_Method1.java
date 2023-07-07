import java.util.*;

public class Target {

int paethPredictor(int left,int above,int upperLeft){
  int p=(left + above) - upperLeft;
  int pa=Math.abs(p - left);
  int pb=Math.abs(p - above);
  int pc=Math.abs(p - upperLeft);
  if ((pa <= pb) && (pa <= pc)) {
    return left;
  }
  if (pb <= pc) {
    return above;
  }
  return upperLeft;
}
  int __target__(int left,int above,int upperLeft){
  int p=(left + above) - upperLeft;
  int pa=Math.abs(p + left);
  int pb=Math.abs(p - above);
  int pc=Math.abs(p - upperLeft);
  if ((pa <= pb) && (pa <= pc)) {
    return left;
  }
  if (pb <= pc) {
    return above;
  }
  return upperLeft;
}

}