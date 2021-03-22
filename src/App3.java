public class App3 {

  private static final int HASH = 7;
  private static final int FACTOR = 37;
  private static final String LETTERS = "acdegilmnoprstuw";

  private static long getHash(String s) {
    long h = HASH;
    int lLen = s.length();
    for (int i = 0; i < lLen; i++)
      h = h * FACTOR + LETTERS.indexOf(s.charAt(i));
    return h;
  }

  public static String getWord(long hash, int numberOfChar) {
    String word = "";

    while (hash > HASH) {
      word = LETTERS.charAt((int)(hash % 37)) + word;
      hash = hash/37;
    }
    if (hash != numberOfChar) {
      System.err.println("Error");
      System.exit(1);
    }
    return word;
  }

  public static void main(String[] args) {
    System.out.println(getWord(695527946727L, 7));
  }

}
