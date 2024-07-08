package runner;

import java.util.ArrayList;
import java.util.List;

import LinkedListCodingExercise.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode temp = node;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(3);
        ListNode result = ListNode.sortList(node);
        System.out.println(result.val);
        ListNode test = result;
        while (test.next != null) {
            System.out.println(test.next.val);
            test = test.next;
        }
    }
}