package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    return null;
  }

  @Override
  public E peek() {
    // TODO
    return null;
  }

  @Override
  public E pop() {
    // TODO
    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this
    return null;
  }
}
