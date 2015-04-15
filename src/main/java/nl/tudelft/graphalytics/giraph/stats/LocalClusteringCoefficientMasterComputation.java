/**
 * Copyright 2015 Delft University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.tudelft.graphalytics.giraph.stats;

import org.apache.giraph.master.DefaultMasterCompute;

/**
 * Master computation for the local clustering coefficient algorithm, which
 * registers the DoubleAverage aggregator to yield a graph-wide average LCC.
 *
 * @author Tim Hegeman
 */
public class LocalClusteringCoefficientMasterComputation extends DefaultMasterCompute {

	public static final String LCC_AGGREGATOR_NAME = "Average LCC";
	
	@Override
	public void compute() {
	}

	@Override
	public void initialize() throws InstantiationException,
			IllegalAccessException {
		registerPersistentAggregator(LCC_AGGREGATOR_NAME, DoubleAverageAggregator.class);
	}

}
