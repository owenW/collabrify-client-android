package com.example.wewrite;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

import org.w3c.dom.UserDataHandler;



import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import edu.umich.imlc.collabrify.client.CollabrifyAdapter;
import edu.umich.imlc.collabrify.client.CollabrifyClient;
import edu.umich.imlc.collabrify.client.CollabrifyListener;
import edu.umich.imlc.collabrify.client.CollabrifySession;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyException;
public class MainActivity extends Activity
{
  private EditText text_to_broadcast;
  private Stack<Operations> undo_stack;
  private Stack<Operations> redo_stack;
  public int userID;
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    userID = Integer.parseInt(new Random().toString());
    //get buttons
    Button redo_button = (Button) findViewById(R.id.redo_button);
    Button undo_button = (Button) findViewById(R.id.undo_button);
    
    //get text
    text_to_broadcast = (EditText) findViewById(R.id.text_to_broadcast);
    
    
    text_to_broadcast.setSingleLine(false);   
    text_to_broadcast.setHorizontallyScrolling(false); 
    text_to_broadcast.setLongClickable(false);
        
  }
  
  View.OnClickListener redo_handler = new View.OnClickListener()
  {
    @Override
    public void onClick(View v)
    {
      // TODO Auto-generated method stub
      
    }
  };


  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
