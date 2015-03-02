/**
 * 
 */
package scieng.cluster;

import scieng.base.*;
import src.net.sf.javaml.clustering.EuclideanDistance;

/**
 * 
 * @author Jinyong Fu(eric.fu.cs@gmail.com)
 *
 */
public class KMeans implements Cluster {
	private int numOfCluster = 0;
	private int numOfIteration = 100;
	private Item[] centroids;
	public KMeans(){
		this(2);
	}
	
	public KMeans(int k){
		this(k,100);
	}
	
	public KMeans(int k,int nIter){
		this(k,nIter,new EuclideanDistance());
	}
	public Dataset[] getClusters(Dataset dataset){
		
	}
}
