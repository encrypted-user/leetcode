class Solution {
  public String truncateSentence(String s, int k) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == ' ') {
        if (--k == 0)
          break;
      }
      res.append(ch);
    }
    return res.toString();
  }
}