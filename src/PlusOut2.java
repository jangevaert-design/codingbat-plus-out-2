public class PlusOut2 {
  public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder();

    for(int i = 0; i < str.length();) {
      if (str.substring(i).startsWith(word)) {
        result.append(word);
        i = i + word.length();
      } else {
        result.append("+");
        i++;
      }
    }
    return result.toString();
  }

// instead of using a for loop with i++ in it, split up the i increment
// regarding whether you find a word or not.
}
