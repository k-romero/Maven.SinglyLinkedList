package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void checkFirstNodeDoesNotExistTest(){
       SinglyLinkedList<String> list = new SinglyLinkedList<String>();
       Assert.assertTrue(list.firstNodeDoesNotExist());
    }

    @Test
    public void addToEmptyListTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String elm1 = "First Element";
        list.add(elm1);
        int expected = 1;
        int actual = list.getSize();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(elm1, list.getFirst());
        Assert.assertEquals(elm1, list.getLast());
    }

    @Test
    public void addToListWithOneElementAlreadyPresentTest(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String elm1 = "First Element";
        list.add(elm1);
        String elm2 = "Second Element";
        list.add(elm2);
        int expected = 2;
        int actual = list.getSize();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(elm1, list.getFirst());
        Assert.assertEquals(elm2, list.getLast());
    }

    @Test
    public void addToListWithManyElements(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String elm1 = "First Element";
        String elm2 = "Second Element";
        String elm3 = "Third Element";
        String elm4 = "Fourth Element";
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        list.add(elm4);
        int expected = 4;
        int actual = list.getSize();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(elm1, list.getFirst());
        Assert.assertEquals(elm4, list.getLast());
    }

    @Test
    public void checkIndexOfFirstElement(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String elm1 = "First Element";
        list.add(elm1);
        int expected = 0;
        int actual = list.getNodeIndex(list.getFirstNode());
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getElementByIndex(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String elm1 = "First Element";
        String elm2 = "Second Element";
        String elm3 = "Third Element";
        String elm4 = "Fourth Element";
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        list.add(elm4);
        String expected = "Fourth Element";
        String actual = list.getElementOfNodeByIndexOfNode(3);
        Assert.assertEquals(expected,actual);
    }



}
