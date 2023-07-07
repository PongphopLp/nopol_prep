import java.util.*;

public class Target {

boolean isVariable(char testChar_){
  if ((testChar_ == '_') || ((testChar_ >= 'A') && (testChar_ <= 'Z')) || ((testChar_ >= 'a') && (testChar_ <= 'z'))|| ((testChar_ >= '0') && (testChar_ <= '9'))) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char testChar_){
  if ((testChar_ == '_') || ((testChar_ >= 'A') && (testChar_ <= 'Z')) || ((testChar_ >= 'a') && (testChar_ <= 'z'))|| ((testChar_ > '0') && (testChar_ <= '9'))) {
    return true;
  }
 else {
    return false;
  }
}

}