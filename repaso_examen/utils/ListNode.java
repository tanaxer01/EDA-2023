package repaso_examen.utils;

import java.util.Random;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode () {}
    public ListNode (int val) { this.val = val; }
    public ListNode (int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode random(int N) {
        Random rand = new Random();

        ListNode prev, head = new ListNode(rand.nextInt((int) 10e5));
        for (int i = 0; i < N; i++) {
            int new_val = rand.nextInt((int) 10e2);
            prev = new ListNode(new_val, head);
            head = prev;
        }

        return head;
    }

    public void print() {
        ListNode temp = this;
        for(;temp.next != null;temp = temp.next)
            System.out.printf("%d ", temp.val);
        System.out.print("\n");
    } 

}


