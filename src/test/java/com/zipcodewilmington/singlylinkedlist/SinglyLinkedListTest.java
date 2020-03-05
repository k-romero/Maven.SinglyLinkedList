package com.zipcodewilmington.singlylinkedlist;
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

    @Test
    public void findIndexOfElementLastTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        int expected = 3;
        int actual = list.findIndexOfElement("Fourth Element");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findIndexOfElementFirstTest(){
        String elm0 = "First Element";
        list.add(elm0);
        int expected = 0;
        int actual = list.findIndexOfElement("First Element");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findIndexOfElementBeyondTest(){
        String elm0 = "First Element";
        list.add(elm0);
        int expected = -1;
        int actual = list.findIndexOfElement("Second Element");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void listContainsElementTest(){
        String elm0 = "First Element";
        list.add(elm0);
        Assert.assertTrue(list.containsElement(elm0));
    }

    @Test
    public void listWithManyElementsContainsElementTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        Assert.assertTrue(list.containsElement("Fourth Element"));
    }

    @Test
    public void listWithManyElementsDoesNotContainElementTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        Assert.assertFalse(list.containsElement("Fifth Element"));
    }

    @Test
    public void removeElementFromListTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        int expected = 1;
        list.removeElement(1);
        int actual = list.findIndexOfElement(elm2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTwoElementsFromListTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        list.removeElement(1);
        list.removeElement(1);
        int expected = 2;
        int actual = list.getSize();
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(list.getElementOfNodeByIndexOfNode(1).equals("Fourth Element"));
    }

    @Test
    public void copyListTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        SinglyLinkedList<String> copiedList = list.copyList();
        Assert.assertTrue(copiedList.containsElement("First Element"));
        Assert.assertTrue(copiedList.containsElement("Second Element"));
        Assert.assertTrue(copiedList.containsElement("Third Element"));
        Assert.assertTrue(copiedList.containsElement("Fourth Element"));
    }

    @Test
    public void listClearTest(){
        String elm0 = "First Element";
        list.add(elm0);
        list.clear();
        Assert.assertTrue(list.getSize() == 0);
    }

    @Test
    public void listClearALLTest(){
        String elm0 = "First Element";
        String elm1 = "Second Element";
        String elm2 = "Third Element";
        String elm3 = "Fourth Element";
        list.add(elm0);
        list.add(elm1);
        list.add(elm2);
        list.add(elm3);
        int expected = 4;
        int actual = list.getSize();
        list.clear();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(0,list.getSize());
        Assert.assertFalse(list.containsElement(elm0));
        Assert.assertFalse(list.containsElement(elm1));
        Assert.assertFalse(list.containsElement(elm2));
        Assert.assertFalse(list.containsElement(elm3));
    }


}
