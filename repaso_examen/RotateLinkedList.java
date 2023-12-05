package repaso_examen;

import repaso_examen.utils.ListNode;

class RotateLinkedList {
    static ListNode rotateRight(ListNode head, int k) {

    }

    public static void main(String[] args) {
        ListNode input = ListNode.random(10);
        input = rotateRight(input, 3);
        input.print();
    }

}

