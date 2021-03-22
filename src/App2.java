public class App2 {

  public static boolean getValidateMagicSquare(int [][] reference) {
    int sumReference = 0;
    int sum = 0;

    if(reference.length != reference[0].length) {
      return false;
    }


    for(int collumn = 0; collumn < reference.length; collumn++) {
      sumReference += reference[0][collumn];
    }

    for(int row = 1; row < reference.length; row++) {
      sum = 0;
      for(int collumn = 0; collumn < reference[row].length; collumn++) {
        sum += reference[row][collumn];
      }
      if (sumReference != sum) {
        return false;
      }
    }

    for(int collumn = 0; collumn < reference[0].length; collumn++) {
      sum = 0;
      for(int row = 0; row < reference.length; row++) {
        sum += reference[row][collumn];
      }
      if (sumReference != sum) {
        return false;
      }
    }

    sum = 0;
    for(int diagonal = 0; diagonal < reference.length; diagonal++) {
      sum += reference[diagonal][diagonal];
    }
    if (sumReference != sum) {
      return false;
    }

    sum = 0;
    int row = 0;
    for(int diagonal = reference.length - 1; diagonal >= 0; diagonal--) {
      sum += reference[row][diagonal];
      row++;
    }
    if (sumReference != sum) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    int[][] reference = new int[3][3];

    reference[0][0] = 3;
    reference[0][1] = 4;
    reference[0][2] = 8;
    reference[1][0] = 10;
    reference[1][1] = 5;
    reference[1][2] = 0;
    reference[2][0] = 2;
    reference[2][1] = 6;
    reference[2][2] = 7;
    
    int[][] reference2 = {
      {4,9,2},
      {3,5,7},
      {8,1,6},
    };

    int[][] reference3 = {
      {4,9,2},
      {3,5,7},
      {8,1,6},
      {8,1,6}
    };
    System.out.println(getValidateMagicSquare(reference));
    System.out.println(getValidateMagicSquare(reference2));
    System.out.println(getValidateMagicSquare(reference3));
    
  }
}
