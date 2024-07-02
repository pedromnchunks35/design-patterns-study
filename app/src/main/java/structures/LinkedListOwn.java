package structures;


public class LinkedListOwn {
    public int value;
    public LinkedListOwn next;

    public LinkedListOwn(int value) {
        this.value = value;
    }

    public void addMember(LinkedListOwn head, int value) {
        LinkedListOwn newValue = new LinkedListOwn(value);
        LinkedListOwn currentPos = head;
        while (currentPos.next != null) {
            currentPos = currentPos.next;
        }
        currentPos.next = newValue;
    }

    public LinkedListOwn removeMember(LinkedListOwn head, int value) {
        LinkedListOwn previousValue = null;
        LinkedListOwn currentValue = head;
        while (currentValue != null) {
            if (currentValue.value == value) {
                if (previousValue == null) {
                    return head.next;
                } else {
                    previousValue.next = currentValue.next;
                    currentValue.next = null;
                }
                break;
            }
            previousValue = currentValue;
            currentValue = currentValue.next;
        }
        return head;
    }

    public void printList(LinkedListOwn head) {
        LinkedListOwn currentPos = head;
        System.out.print("[");
        while (currentPos != null) {
            if (currentPos.next != null) {
                System.out.print(currentPos.value + ",");
            } else {
                System.out.print(currentPos.value);
            }
            currentPos = currentPos.next;
        }
        System.out.print("]");
        System.out.println("");
    }
}