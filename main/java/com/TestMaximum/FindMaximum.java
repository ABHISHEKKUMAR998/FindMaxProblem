
package com.TestMaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum  <T extends Comparable<T>> {
	T x,y,z;
	
		
		public FindMaximum(T x, T y,T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
		public T maximum() {
			return FindMaximum.maximumOfObject(x, y, z);
		}

		// Generic Method
		public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third) {
			T maximumValue = first; 
			if (second.compareTo(maximumValue) > 0)
				maximumValue = second;
			if (third.compareTo(maximumValue) > 0)
				maximumValue = third; 

			System.out.println(maximumValue);
			return maximumValue;
		}

		
} 