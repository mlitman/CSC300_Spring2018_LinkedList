package com.example.awesomefat.csc300_spring2018_linkedlist;

/**
 * Created by awesomefat on 1/30/18.
 */

public class Node
{
    private int payload;
    private Node nextNode;

    public Node(int payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public void addEnd(int payload)
    {
        if(this.nextNode == null)
        {
            this.nextNode = new Node(payload);
        }
        else
        {
            this.nextNode.addEnd(payload);
        }
    }
    public void display()
    {
        System.out.print(this.payload + " -> ");
        if(this.nextNode != null)
        {
            this.nextNode.display();
        }
    }

    public int getPayload()
    {
        return this.payload;
    }

    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setNextNode(Node n)
    {
        this.nextNode = n;
    }
}
