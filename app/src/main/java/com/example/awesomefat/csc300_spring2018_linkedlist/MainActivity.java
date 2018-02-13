package com.example.awesomefat.csc300_spring2018_linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText newNumberET;
    private EditText indexET;
    //private Button addFrontButton;
    //private Button addEndButton;
    private ViewGroup linkedListContainer;
    private LinkedList ll;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.newNumberET = (EditText)this.findViewById(R.id.newNumberET);
        this.indexET = (EditText)this.findViewById(R.id.indexET);

        //this.addFrontButton = (Button)this.findViewById(R.id.addFrontButton);
        //this.addEndButton = (Button)this.findViewById(R.id.addEndButton);
        this.linkedListContainer = (ViewGroup)this.findViewById(R.id.linkedListContainer);

        this.ll = new LinkedList(this.linkedListContainer, this);
        this.ll.display();
    }

    /*
    public void genericButtonOnClick(View v)
    {
        if(v == this.addFrontButton)
        {
            System.out.println("Add Front Button Pressed");
        }
        else
        {
            System.out.println("Add End Button Pressed");
        }
    }
    */



    public void addAtIndexButtonClicked(View v)
    {
        System.out.println(this.indexET.getText().toString());
    }

    public void removeAtIndexButtonClicked(View v)
    {
        int index = Integer.parseInt(this.indexET.getText().toString());
        try
        {
            this.ll.removeAtIndex(index);
        }
        catch(Exception e)
        {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void addFrontButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addFront(Integer.parseInt(temp));
        //this.ll.display();
    }

    public void addEndButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addEnd(Integer.parseInt(temp));
        //this.ll.display();
    }

    public void removeFrontButtonClicked(View v)
    {
        try
        {
            int value = this.ll.removeFront();
            //do stuff with that element
            this.ll.display();
        }
        catch(Exception e)
        {
            System.err.println("Empty List");
        }
    }

    public void removeEndButtonClicked(View v)
    {
        try
        {
            int value = this.ll.removeEnd();
            this.ll.display();
        }
        catch(Exception e){}

    }
}
