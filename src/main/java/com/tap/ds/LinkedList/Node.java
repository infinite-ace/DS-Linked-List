package com.tap.ds.LinkedList;

public class Node {

    int val;
    Node next;
    int idx;

    Node(int d) {
        val = d;
        next = null;
    }

    public void setVal(int value) {
        this.val = value;
    }

    public int getVal() {
        return val;
    }
}