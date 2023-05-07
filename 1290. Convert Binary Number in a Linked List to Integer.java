class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        StringBuilder sbr = new StringBuilder();
        int dec = 0;
        int c = 0;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        curr = head;
        c--;
        while (curr != null) {

            dec += Math.pow(2, c) * curr.val;
            System.out.println(dec);
            c--;
            curr = curr.next;
        }
        return dec;
    }
}