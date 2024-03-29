package HashTable_BinarySearchTree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinarySearchTreeTest {

    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ShouldReturnSizeThirteen() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(13, size);
    }

    @Test
    public void givenNumbers_WhenAddedToBinaryTree_whenSearched_ShouldReturnTrueIfItExist() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int number=63;
        boolean result = myBinaryTree.search(number);
        String resultString = (result)?"Found":"Not found";
        System.out.println(+number+" "+resultString);
        Assert.assertTrue(result);
    }
}

