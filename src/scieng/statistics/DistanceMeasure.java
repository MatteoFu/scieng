/**
 * 
 */
package scieng.statistics;

import scieng.base.Item;
import java.io.Serializable;
/**
 * @author matteo
 *
 */
public interface DistanceMeasure extends Serializable {
	/**
	 * Compute the distance of two items
	 * 
	 * @return the distance of two items
	 */
	public double pairDistance(Item it1,Item it2);
	/**
	 * compare two value(distance,similarity or correlation)
	 * @param x
	 * @param y
	 * @return true if the first value is bigger, otherwise fales.
	 */
	public boolean compare(double x,double y);
}
