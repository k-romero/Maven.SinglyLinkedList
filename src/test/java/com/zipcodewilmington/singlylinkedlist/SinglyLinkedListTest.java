package com.zipcodewilmington.singlylinkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<String> list;

    @Before
    public void setUp(){
        list = new SinglyLinkedList<String>();
    }


    @Test
    public void checkFirstNodeDoesNotExistTest(){
       Assert.assertTrue(list.firstNodeDoesNotExist());
    }

    @Test
    public void addToEmptyListTest(){
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
    public void checkSizeTest(){
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
    }

    @Test
    public void checkSizeEmptyTest(){
        int expected = 0;
        int actual = list.getSize();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getElementByIndexEnd(){
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

    @Test
    public void getElementByIndexMiddle(){
        String elm1 = "First Element";
        String elm2 = "Second Element";
        String elm3 = "Third Element";
        String elm4 = "Fourth Element";
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        list.add(elm4);
        String expected = "Third Element";
        String actual = list.getElementOfNodeByIndexOfNode(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getElementByIndexFirst(){
        String elm1 = "First Element";
        String elm2 = "Second Element";
        String elm3 = "Third Element";
        String elm4 = "Fourth Element";
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        list.add(elm4);
        String expected = "Third Element";
        String actual = list.getElementOfNodeByIndexOfNode(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findIndexOfElementTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        int expected = 2;
        int actual = list.findIndexOfElement("Third Element");
        Assert.assertEquals(expected,actual);
    }



}
