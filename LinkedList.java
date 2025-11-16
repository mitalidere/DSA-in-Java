package dataStructures;

import java.util.Scanner;

public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node previousNode = head;
        Node currentNode = head.next;
        while (currentNode.next != null) {
            previousNode = previousNode.next;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        while (true) {
            System.out.println("\n 1. Display list \n 2. Size of list \n 3. Add node at start \n 4. Add node at end \n 5. Delete first node \n 6. Delete last node");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:
                    linkedList.displayList();
                    break;

                case 2:
                    System.out.println(linkedList.size);
                    break;

                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    linkedList.addFirst(data);
                    break;

                case 4:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    linkedList.addLast(data);
                    break;

                case 5:
                    linkedList.deleteFirst();
                    break;

                case 6:
                    linkedList.deleteLast();
                    break;
            }
        }
    }
}
