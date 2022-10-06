/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.utils;

public interface WeightedObject<T> extends Comparable<WeightedObject<T>> {

	/**
	 * Gets the object's weight.
	 * 
	 * @return The weight.
	 */
	public double getWeight();

	/**
	 * Gets the representation of the weighted chance.
	 * 
	 * @return The representation.
	 */
	public T get();

	/**
	 * The toString method.
	 * 
	 * @return The class variables represented in a string.
	 */
	@Override
	public String toString();
}
