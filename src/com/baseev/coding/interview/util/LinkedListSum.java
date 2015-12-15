package com.baseev.coding.interview.util;


public class LinkedListSum
{

    public static void main(final String[] args)
    {

        final Node numberOne = buildList(new int[] { 2, 4 });

        final Node numberTwo = buildList(new int[] { 1, 8, 9 });

        final Node sum = getSum(numberOne, numberTwo);

        print(numberOne);

        print(numberTwo);

        print(sum);

    }

    private static int getLength(Node node)
    {

        if (node == null) {

            return 0;

        }

        int count = 1;

        while (node.getNext() != null) {

            count++;

            node = node.getNext();

        }

        return count;

    }

    private static void print(Node node)
    {

        while (null != node) {

            System.out.print(node.getValue() + "=>");

            node = node.getNext();

        }

        System.out.println("NULL");

    }

    public static Node getSum(final Node numberOne, final Node numberTwo)
    {

        if (numberOne == null && numberTwo == null) {

            return null;

        }

        if (null == numberOne) {

            return numberTwo;

        }

        if (null == numberTwo) {

            return numberOne;

        }

        final int numberOneLength = getLength(numberOne);

        final int numberTwoLength = getLength(numberTwo);

        if (numberOneLength > numberTwoLength) {

            final Node numberTwoModified = padZeros(numberTwo, numberOneLength
                    - numberTwoLength);

            return getCompleteSum(numberOne, numberTwoModified);

        }

        if (numberTwoLength > numberOneLength) {

            final Node numberOneModified = padZeros(numberOne, numberTwoLength
                    - numberOneLength);

            return getCompleteSum(numberOneModified, numberTwo);

        }

        return getCompleteSum(numberOne, numberTwo);

    }

    private static Node padZeros(Node numberTwo, int count)
    {

        if (null == numberTwo) {

            return null;

        }

        while (count != 0) {

            final Node n = new Node(0);

            n.setNext(numberTwo);

            numberTwo = n;

            count--;

        }

        return numberTwo;

    }

    private static Node getCompleteSum(final Node numberOne,
            final Node numberTwo)
    {

        if (null != numberOne.getNext()) {

            final Node result = getSum(numberOne.getNext(), numberTwo.getNext());

            final int sum = result.getValue() / 10 + numberOne.getValue()
                    + numberTwo.getValue();

            result.setValue(result.getValue() % 10);

            final Node n = new Node(sum);

            n.setNext(result);

            return n;

        }

        final int sum = numberOne.getValue() + numberTwo.getValue();

        return new Node(sum);

    }

    public static Node buildList(final int[] input)
    {

        Node root = null;

        Node tail = null;

        for (final int anInput : input) {

            final Node node = new Node(anInput);

            if (null == root) {

                root = node;

                tail = root;

            } else {

                tail.setNext(node);

                tail = node;

            }

        }

        return root;

    }

}

class Node
{

    int value;

    Node next;

    public Node(final int value)
    {

        this.value = value;

    }

    public int getValue()
    {

        return value;

    }

    public void setValue(final int value)
    {

        this.value = value;

    }

    public Node getNext()
    {

        return next;

    }

    public void setNext(final Node next)
    {

        this.next = next;

    }

}