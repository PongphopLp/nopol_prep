import java.util.*;

public class Target {

int IJIsoData(int[] data){
  int level;
  int maxValue=data.length - 1;
  double result, sum1, sum2, sum3, sum4;
  int count0=data[0];
  data[0]=0;
  int countMax=data[maxValue];
  data[maxValue]=0;
  int min=0;
  while ((data[min] == 0) && (min < maxValue))   min++;
  int max=maxValue;
  while ((data[max] == 0) && (max > 0))   max--;
  if (min >= max) {
    data[0]=count0;
    data[maxValue]=countMax;
    level=data.length / 2;
    return level;
  }
  int movingIndex=min;
  int inc=Math.max(max / 40,1);
  do {
    sum1=sum2=sum3=sum4=0.0;
    for (int i=min; i <= movingIndex; i++) {
      sum1+=i * data[i];
      sum2+=data[i];
    }
    for (int i=(movingIndex + 1); i <= max; i++) {
      sum3+=i * data[i];
      sum4+=data[i];
    }
    result=(sum1 / sum2 + sum3 / sum4) / 2.0;
    movingIndex++;
  }
 while ((movingIndex + 1) <= result && movingIndex < max - 1);
  data[0]=count0;
  data[maxValue]=countMax;
  level=(int)Math.round(result);
  return level;
}
  int __target__(int[] data){
  int level;
  int maxValue=data.length - 1;
  double result, sum1, sum2, sum3, sum4;
  int count0=data[0];
  data[0]=0;
  int countMax=data[maxValue];
  data[maxValue]=0;
  int min=0;
  while ((data[min] == 0) && (min <= maxValue))   min++;
  int max=maxValue;
  while ((data[max] == 0) && (max > 0))   max--;
  if (min >= max) {
    data[0]=count0;
    data[maxValue]=countMax;
    level=data.length / 2;
    return level;
  }
  int movingIndex=min;
  int inc=Math.max(max / 40,1);
  do {
    sum1=sum2=sum3=sum4=0.0;
    for (int i=min; i <= movingIndex; i++) {
      sum1+=i * data[i];
      sum2+=data[i];
    }
    for (int i=(movingIndex + 1); i <= max; i++) {
      sum3+=i * data[i];
      sum4+=data[i];
    }
    result=(sum1 / sum2 + sum3 / sum4) / 2.0;
    movingIndex++;
  }
 while ((movingIndex + 1) <= result && movingIndex < max - 1);
  data[0]=count0;
  data[maxValue]=countMax;
  level=(int)Math.round(result);
  return level;
}

}