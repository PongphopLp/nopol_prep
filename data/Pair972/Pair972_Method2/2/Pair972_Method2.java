import java.util.*;

public class Target {

int skipDelimiters(String s_,int currentPos_,String delim_){
  int len_=s_.length();
  while (currentPos_ < len_ && delim_.indexOf(s_.charAt(currentPos_)) >= 0)   currentPos_++;
  return currentPos_;
}
  int __target__(String s_,int currentPos_,String delim_){
  int len_=s_.length();
  while (currentPos_ < len_ && delim_.indexOf(s_.charAt(currentPos_)) > 0)   currentPos_++;
  return currentPos_;
}

}