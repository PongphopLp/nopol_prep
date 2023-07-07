import java.util.*;

public class Target {

boolean isInsideArea(int areaX,int areaY,int width,int height,int targX,int targY){
  boolean result=false;
  if (targX >= areaX && targY >= areaY) {
    if (targX <= areaX + width && targY <= areaY + height) {
      result=true;
    }
  }
  return result;
}
  boolean __target__(int areaX,int areaY,int width,int height,int targX,int targY){
  boolean result=false;
  if (targX >= areaX && targY >= areaY) {
    if (targX <= areaX + width && targY < areaY + height) {
      result=true;
    }
  }
  return result;
}

}