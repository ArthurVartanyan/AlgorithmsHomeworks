package realisation;

import realisation.structure.MyLinkedList;

public class Main {
    public static void main(String[] args) {

//        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.add(1);
//        dynamicArray.add(2);
//        dynamicArray.add(5);
//        dynamicArray.add(-1);
//        dynamicArray.add(0);
//
//        System.out.println(dynamicArray);
//
//        System.out.println(dynamicArray.get(3));
//
//        dynamicArray.remove(4);
//        System.out.println(dynamicArray);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(50);
        myLinkedList.add(50);
        myLinkedList.add(111);
        myLinkedList.add(0);
        myLinkedList.add(-50);
        myLinkedList.add(533330);

        System.out.println(myLinkedList);

        myLinkedList.remove(111);
        System.out.println(myLinkedList);
    }
}
