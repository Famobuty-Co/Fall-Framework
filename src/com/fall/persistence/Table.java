package com.fall.persistence;

import java.util.Set;
import java.util.UUID;

public interface Table<E> extends Iterable<E>{
	public void add(E object);
	public void remove(E object);
	public int size();
	public Set<E> find(E entity);
	public E get(UUID uuid);
}
