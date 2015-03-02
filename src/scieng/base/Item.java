/**
 * The interface for items in a data set.
 */
package scieng.base;

import java.util.Map;
import java.util.SortedSet;
import java.lang.Integer;
import java.lang.Double;
import java.io.Serializable;
/**
 * 
 * @author Jinyong Fu(eric.fu.cs@gmail.com)
 *
 */
public interface Item extends Map<Integer, Double>, Iterable<Double>, Serializable {
	/**
	 * Return the number of features in an item
	 * @return number of features 
	 */
	public int noFeatures();
	/**
	 * Calculate one item to this item 
	 * 
	 * @return the sum of two items
	 */
	public Item add(Item it);
	/**
	 * Add a scalar value to this item
	 * @return the changed item
	 */
	public Item add(Double value);
	/**
	 * Get the value in this item at the position of index
	 * @return value at index position in this item
	 */
	public double getValue(int index);
	@Override
	public SortedSet<Integer> keySet();
	/**
	 * Create a deep copy of Item
	 * @return a deep copy of Item
	 */
	public Item copy();

}
