package com.tap.ds.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertion(1);
        linkedList.insertion(2);
        linkedList.insertion(3);
        linkedList.insertion(4487);
        linkedList.printAllValues();

        // Not found case
        linkedList.deletion(332321);
        // end Not found case

        System.out.println("===== Get By Index Result =====");
        System.out.println(linkedList.getByIndex(2));
        System.out.println(linkedList.getByIndex(0));
        System.out.println(linkedList.getByIndex(4));
        System.out.println(linkedList.getByIndex(80));

        System.out.println("===== Update Result =====");
        System.out.println("Before: ");
        linkedList.printAllValues();
        linkedList.update(2, 662);
        System.out.println("After: ");
        linkedList.printAllValues();








    }

}

