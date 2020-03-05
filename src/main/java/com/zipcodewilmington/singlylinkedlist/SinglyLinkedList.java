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

    public boolean containsElement(K element) {
        Node<K> currentNode = first;
        for (int i = 0; i < size; i++) {
            if(currentNode.theElement.equals(element)){
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public void clear() {
        if(size > 1){
            Node<K> currentNode = first.next;
            for (int i = 1; i < size; i++) {
                if (currentNode.next != null){
                    currentNode.prev = null;
                    currentNode = currentNode.next;
                } else {
                    currentNode.prev = null;
                    currentNode = null;
                }
            }
        } else if(size == 1){
            first = null;
            last = null;
        }
        size = 0;
    }

    public void removeElement(int index) {
        Node<K> currentNode = first;
        for (int i = 0; i < size; i++) {
            if(index == i){
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                currentNode = null;
                size--;
                break;
            }
            else{
                currentNode = currentNode.next;
            }
        }
    }

    public SinglyLinkedList<K> copyList() {
        SinglyLinkedList<K> result = new SinglyLinkedList<K>();
        Node<K> currentNode = first;
        for (int i = 0; i < size; i++) {
            result.add(currentNode.theElement);
            currentNode = currentNode.next;
        }
        return result;
    }

    public void sort() {
        Node<K> currentNode = first;
        if(size > 1){
            if(currentNode.theElement.toString().compareTo(currentNode.next.theElement.toString()) == -1){
              //Need to fill in this method!
            }
        }
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

