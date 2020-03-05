package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 * Lab completed by Kevin Romero
 */
public class SinglyLinkedList<K> {
    private int size = 0;
    private Node<K> first;
    private Node<K> last;

    public SinglyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    public boolean firstNodeDoesNotExist(){
        return first == null;
    }

    public void add(K elementToAdd){
        if(firstNodeDoesNotExist()){
            Node<K> newNode = new Node(null, elementToAdd,null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            Node<K> lastNode = last;
            Node<K> newNode = new Node<K>(lastNode, elementToAdd, null);
            lastNode.next = newNode;
            last = newNode;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public K getFirst() {
        return first.theElement;
    }

    public K getLast() {
        return last.theElement;
    }

    public K getElementOfNodeByIndexOfNode(int index){
        K result = null;
        if(index < size && index >= 0){
            Node<K> currentNode = first;
            for (int i = 0; i < size; i++) {
                if(i == index){
                    result = currentNode.theElement;
                } else {
                    currentNode = currentNode.next;
                }
            }
        } else throw new NullPointerException();
        return result;
    }

    public int findIndexOfElement(K element) {
        int result = -1;
        Node<K> currentNode = first;
        for (int i = 0; i < size; i++) {
            if(currentNode.theElement.equals(element)){
                result = i;
                break;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return result;
    }


    private static class Node<K> {
        K theElement;
        Node<K> next;
        Node<K> prev;

        Node(Node<K> prev, K element, Node<K> next) {
            theElement = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

