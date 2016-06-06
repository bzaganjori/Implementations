package test;

import source.*;

public class Tests {

    public static void main(String[] args) throws EmptyQueueException {
        AArrayListTest();
//        LArrayListTest();
//        AQueueTest();
//        LQueueTest();
//        AStackTest();
//        LStackTest();
    }

    public static void AArrayListTest() {
        AArrayList<Integer> list = new AArrayList<Integer>();
        System.out.println(list.isEmpty());
        list.add(0, 0);
        System.out.println(list.toString() + "||" + list.size());
        list.add(1, 1);
        System.out.println(list.toString() + "||" + list.size());
        list.add(2, 2);
        System.out.println(list.toString() + "||" + list.size());
        list.add(3, 3);
        System.out.println(list.toString() + "||" + list.size());
        list.add(4, 4);
        System.out.println(list.toString() + "||" + list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.toString() + "||" + list.size());
        list.set(1, 3);
        System.out.println(list.toString() + "||" + list.size());
    }

    public static void LArrayListTest() {
        LArrayList<Integer> list = new LArrayList<Integer>();
        System.out.println(list.isEmpty());
        list.add(0, 0);
        System.out.println(list.toString() + "||" + list.size());
        list.add(1, 1);
        System.out.println(list.toString() + "||" + list.size());
        list.add(2, 2);
        System.out.println(list.toString() + "||" + list.size());
        list.add(3, 3);
        System.out.println(list.toString() + "||" + list.size());
        list.add(4, 4);
        System.out.println(list.toString() + "||" + list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.toString() + "||" + list.size());
        list.set(1, 3);
        System.out.println(list.toString() + "||" + list.size());
    }

    public static void AQueueTest() throws EmptyQueueException {
        AQueue<Integer> list = new AQueue<Integer>();
        System.out.println(list.isEmpty());
        list.enqueue(0);
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        list.enqueue(1);
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        list.enqueue(2);
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        list.enqueue(3);
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        list.enqueue(4);
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        System.out.println(list.isEmpty());
        list.dequeue();
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
        list.dequeue();
        System.out.println(list.toString() + "||" + list.size()
                + " |F" + list.front + " |R" + list.rear);
    }

    public static void LQueueTest() throws EmptyQueueException {
        LQueue<Integer> list = new LQueue<Integer>();
        System.out.println(list.isEmpty());
        list.enqueue(0);
        System.out.println(list.toString() + "||" + list.size());
        list.enqueue(1);
        System.out.println(list.toString() + "||" + list.size());
        list.enqueue(2);
        System.out.println(list.toString() + "||" + list.size());
        list.enqueue(3);
        System.out.println(list.toString() + "||" + list.size());
        list.enqueue(4);
        System.out.println(list.toString() + "||" + list.size());
        System.out.println(list.isEmpty());
        list.dequeue();
        System.out.println(list.toString() + "||" + list.size());
        list.dequeue();
        list.enqueue(6);
        System.out.println(list.toString() + "||" + list.size());
    }

    public static void AStackTest() {
        AStack<Integer> list = new AStack<Integer>();
        System.out.println(list.isEmpty());
        list.push(0);
        System.out.println(list.toString() + "||" + list.size());
        list.push(1);
        System.out.println(list.toString() + "||" + list.size());
        list.push(2);
        System.out.println(list.toString() + "||" + list.size());
        list.push(3);
        System.out.println(list.toString() + "||" + list.size());
        list.push(4);
        System.out.println(list.toString() + "||" + list.size());
        System.out.println(list.isEmpty());
        list.pop();
        System.out.println(list.toString() + "||" + list.size());
        list.pop();
        list.push(6);
        System.out.println(list.toString() + "||" + list.size());
    }

    public static void LStackTest() {
        LStack<Integer> list = new LStack<Integer>();
        System.out.println(list.isEmpty());
        list.push(0);
        System.out.println(list.toString() + "||" + list.size());
        list.push(1);
        System.out.println(list.toString() + "||" + list.size());
        list.push(2);
        System.out.println(list.toString() + "||" + list.size());
        list.push(3);
        System.out.println(list.toString() + "||" + list.size());
        list.push(4);
        System.out.println(list.toString() + "||" + list.size());
        System.out.println(list.isEmpty());
        list.pop();
        System.out.println(list.toString() + "||" + list.size());
        list.pop();
        list.push(6);
        System.out.println(list.toString() + "||" + list.size());
    }
}
