import java.util.*;

public class Target {

int getIntegerParameter(Properties params,String paramName,int defaultValue){
  int integerResult=defaultValue;
  String widthParam=params.getProperty(paramName);
  if (widthParam != null) {
    integerResult=Integer.valueOf(widthParam);
  }
  return integerResult;
}
  int __target__(Properties params,String paramName,int defaultValue){
  int integerResult=defaultValue;
  String widthParam=params.getProperty(paramName);
  if (widthParam == null) {
    integerResult=Integer.valueOf(widthParam);
  }
  return integerResult;
}

}