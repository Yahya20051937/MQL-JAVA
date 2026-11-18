package org.mql.java.generics;

public interface List<T> extends Iterable<T> {
	public void add(T element);
	public T get(int index);
	public T remove(int index);
	public void set(int index, T element);
	public int size();
}
