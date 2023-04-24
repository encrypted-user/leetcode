class Solution {
    public List < String > fizzBuzz(int n) {
        List < String > finalString = new ArrayList < String > ();
        for (int i = 1; i <= n; i++) {
            finalString.add(getFizzBuzz(i));

        }
        return finalString;

    }
    public String getFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        else if (i % 3 == 0)
            return "Fizz";
        else if (i % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(i);
    }
}