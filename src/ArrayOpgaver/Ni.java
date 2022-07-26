package ArrayOpgaver;

import java.util.Arrays;

public class Ni {
 private int[] original ={58,24,13,15,63,9,8,81,1,78};
 private int[] split1 = {0,0,0,0,0};
 private int[] split2 = {0,0,0,0,0};
 private int r = 0;

  public void split(){
    for(int i = 0; i < original.length / 2; i++){
      split1[i] = original[i];
    }


    for(int j = 5; j < original.length; j++){
      split2[r] = original[j];
      r++;
    }

  }

  public void printResults(){
    for(int q =0; q<split1.length; q++){
      System.out.println(split1[q]);
    }
    System.out.println("-------------------------------------------");

    for(int w = 0; w < split2.length; w++){
      System.out.println(split2[w]);
    }
  }

  @Override
  public String toString() {
    return "Ni{" +
        "original=" + Arrays.toString(original) +
        ", split1=" + Arrays.toString(split1) +
        ", split2=" + Arrays.toString(split2) +
        '}';
  }
}
