/**
 * 
 */
package scieng.base;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
/**
 * The interface for Dataset containing all items
 * 
 * @author matteo
 *
 */
public interface Dataset extends List<Item>{
	/**
	 * Return the set view of classes inside the data set. If there is no class, null will be returned.
	 * 
	 * @return
	 */
	public SortedSet<Object> classes();
	/**
	 * add an item to this data set.
	 * 
	 * @return
	 */
	public boolean add(Item item);
	/**
	 * get the Item at certain position
	 * 
	 * @param index
	 * @return the item at index
	 */
	public Item getItem(int index);
	/**
	 * a deep copy of data set
	 * 
	 * @return
	 */
	public Dataset copy();
}
