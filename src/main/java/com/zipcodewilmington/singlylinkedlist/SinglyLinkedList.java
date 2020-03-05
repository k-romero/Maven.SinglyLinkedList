package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<K> {
    public static int size = 0;
    public Node<K> first;
    public Node<K> last;

    public SinglyLinkedList() {
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

    public Node<K> getFirstNode() {
        return first;
    }

    public K getElementOfNodeByIndexOfNode(int index){
        K result = null;
        if(index == 0){
            result = getFirst();
        } else {
            Node<K> currentNode = first.next;
            for (int i = 0; i < size; i++) {
                if(currentNode.index == index){
                    result = currentNode.theElement;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
        return result;
    }

    public int getNodeIndex(Node<K> nodeToGetIndexFrom) {
        return nodeToGetIndexFrom.index;
    }



    private static class Node<K> {
        K theElement;
        Node<K> next;
        Node<K> prev;
        int index;

        Node(Node<K> prev, K element, Node<K> next) {
            theElement = element;
            this.next = next;
            this.prev = prev;
            if(size == 0){
                index = 0;
            }
            else{
                index = prev.index + 1;
            }
        }
    }
}

