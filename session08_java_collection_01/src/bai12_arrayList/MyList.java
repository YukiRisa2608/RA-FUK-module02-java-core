package bai12_arrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {

    }
    public E remove(int index) {
    //Removes the element at the specified position in this list.
    // Shifts any subsequent elements to the left (subtracts one from their indices
        return null;
    }
    public int size() {
    //Returns the number of elements in this list.
        return size;
    }
    public E clone() {
    //Returns a shallow copy of this ArrayList instance. (The elements themselves are not copied.
        return null;
    }
    public boolean contains (E o) {
    //Returns true if this list contains the specified element.
    // More formally, returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
        return false;
    }
    public int indexOf(E o) {
    //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    // More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))), or -1 if there is no such index.
        return -1;
    }
    public boolean add (E o) {
    //Appends the specified element to the end of this list.
        return true;
    }
    public void ensureCapacity(int minCapacity) {
    //Increases the capacity of this ArrayList instance,
    // if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.

    }
    public E get (int i) {
    //Returns the element at the specified position in this list.
        return null;
    }
    public void clear () {
//Removes all of the elements from this list. The list will be empty after this call returns
    }

}
