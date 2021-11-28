package com.tap.ds.LinkedList;

public class LinkedList implements LinkedListInterface {

    Node head;

    @Override
    public void insertion(int val) {
        Node newNode = new Node(val);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        }
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
    }

    @Override
    public void deletion(int val) {

        Node temporaryNode = head;
        Node prev = null;

        // When head holds the actual value
        if (temporaryNode != null && temporaryNode.val == val) {
            head = temporaryNode.next;
        }

        //Interesting part: when it's somewhere else
        while (temporaryNode != null && temporaryNode.val != val) {
            // iterate through nodes till we find it
            prev = temporaryNode;
            temporaryNode = temporaryNode.next;
        }

        // if temporaryNode is null, that's not good. but it won't happen.
        if (temporaryNode != null) {
            prev.next = temporaryNode.next;
        }

        // if we don't actually find the value in the linked list
        if (temporaryNode == null) {
            System.out.println("Ooops. " + val + " does not exist in the Linked List");
        }

    }

    @Override
    public void update(int idx, int value) {

        int indexCount = 0;
        Node headNextUpdated = head;

        while( head.next != null  ) {
            if ( idx == indexCount ) {
                headNextUpdated.setVal(value);
                break;
            }
            headNextUpdated = headNextUpdated.next;
            indexCount ++;
        }
    }

    @Override
    public int getByIndex(int idx) {
        int indexCount = 0;

        Node tempHead = head;

        while(tempHead.next != null) {
            if (indexCount == idx) {
                System.out.println("Value: " + tempHead.val + " At index: " + indexCount);
                return indexCount;
            }
            indexCount ++;
            tempHead = tempHead.next;
        }

        System.err.println("Index " + idx + " is out of bounds. Try asking for idx < " + this.calculateSize());
        return 0;
    }

    private int calculateSize() {
        int size = 0;

        Node tempHead = head;

        while(tempHead.next != null) {
            size ++;
            tempHead = tempHead.next;
        }

        return size + 1;
    }

    @Override
    public int get(int value) {
        Node tempHead = head;
        int indexCount = 0;

        while(tempHead.next != null) {
            if (tempHead.getVal() == value) {
                System.out.println("Value: " + tempHead.val + " At index: " + indexCount);
                return indexCount;
            }
            indexCount ++;
            tempHead = tempHead.next;
        }

        return 0;
    }

    @Override
    public void printAllValues() {

        Node temporaryNode = head;

        while (temporaryNode != null) {
            System.out.print(temporaryNode.val + " -> ");

            temporaryNode = temporaryNode.next;
        }

        // For the last element
        System.out.print("null" + "\n");
    }
}
