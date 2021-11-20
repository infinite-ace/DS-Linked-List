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

        Node temporaryNode = head, prev = null;

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

    }

    @Override
    public int getByIndex(int idx) {
        return 0;
    }

    @Override
    public int get(int value) {
        return 0;
    }

    @Override
    public void printAllValues() {

        Node temporaryNode = head;

        while (temporaryNode != null) {
            System.out.println(temporaryNode.val);

            temporaryNode = temporaryNode.next;
        }
    }
}
