package LinkedListCodingExercise;
import java.util.*;
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void SumArrays(int[] left, int[] right, int[] normalList, int mid, int rest) {
        int i = 0, j = 0, z = 0;
        while (i < mid && j < rest) {
            if (left[i] < right[j]) {
                normalList[z++] = left[i++];
            } else {
                normalList[z++] = right[j++];
            }
        }
        while (i < mid) {
            normalList[z++] = left[i++];
        }
        while (j < rest) {
            normalList[z++] = right[j++];
        }
    }

    public static void MergeSort(int[] normalList) {
        if (normalList.length < 2) {
            return;
        }
        int mid = normalList.length / 2;
        int left[] = new int[mid];
        int right[] = new int[normalList.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = normalList[i];
        }
        for (int i = 0; i < normalList.length - mid; i++) {
            right[i] = normalList[mid + i];
        }
        MergeSort(left);
        MergeSort(right);
        SumArrays(left, right, normalList, mid, normalList.length - mid);
    }

    public static void transverse(ListNode node, List<Integer> normalList) {
        if (node == null) {
            return;
        }
        normalList.add(node.val);
        transverse(node.next, normalList);
    }

    public static ListNode sortList(ListNode head) {
        List<Integer> normalList = new ArrayList<>();
        transverse(head, normalList);
        int[] newArr = new int[normalList.size()];
        for (int i = 0; i < normalList.size(); i++) {
            newArr[i] = normalList.get(i);
        }
        MergeSort(newArr);
        ListNode newHead = new ListNode(newArr[0]);
        ListNode temp = newHead;
        for (int i = 1; i < newArr.length; i++) {
            temp.next = new ListNode(newArr[i]);
            temp = temp.next;
        }
        return newHead;
    }
}
