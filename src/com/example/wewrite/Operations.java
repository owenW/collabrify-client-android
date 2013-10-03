package com.example.wewrite;

import android.os.Build;

import com.example.wewrite.MoveProtoData.protoData;


public class Operations
{
  Operation operation;
  public int offset;
  public String mes;
  public int moveId;
  public enum Operation
  
  {
    ADD, DELETE, CURSOR, INIT
  }  
  public Operations(Operation operationT, String mesT, int offsetT, int mid)
  {
    operation = operationT;
    mes = mesT;
    offset = offsetT;  
    moveId = mid;
  }
  
  public protoData generateMoveMes(int undo)
  {
    protoData move;
    if (this.operation == Operation.ADD)
      move = protoData.newBuilder()
            .setUserId(User.Id)
            .setMoveType(0)
            .setText(User.text_to_broadcast.toString())
            .setValid(true)
            .setCursorChange(User.cursorLoc)
            .build();
            

    else if(this.operation == Operation.DELETE)
      move = protoData.newBuilder()
      .setUserId(User.Id)
      .setMoveType(1)
      .setText(User.text_to_broadcast.toString())
      .setValid(true)
      .setCursorChange(User.cursorLoc)
      .build();
    else
      move = protoData.newBuilder()
      .setUserId(User.Id)
      .setMoveType(2)
      .setText(User.text_to_broadcast.toString())
      .setValid(true)
      .setCursorChange(User.cursorLoc)
      .build();
    return move;  
  }
 }