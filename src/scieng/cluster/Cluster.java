package scieng.cluster;

import scieng.base.Dataset;
public interface Cluster {
	/**
	 * This method will do clustering on the dataset provided as the parameter. A list of dataset 
	 * will be returned.
	 * @param dataset
	 * @return
	 */
	public Dataset[] getClusters(Dataset dataset);
}
