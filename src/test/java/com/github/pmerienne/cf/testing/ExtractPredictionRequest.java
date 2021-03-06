/**
 * Copyright 2013-2015 Pierre Merienne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pmerienne.cf.testing;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;
import backtype.storm.tuple.Values;

public class ExtractPredictionRequest extends BaseFunction {

	private static final long serialVersionUID = 7171566985006542069L;

	@Override
	public void execute(TridentTuple tuple, TridentCollector collector) {
		String[] args = tuple.getString(0).split(" ");
		long i = Long.parseLong(args[0]);
		long j = Long.parseLong(args[1]);
		collector.emit(new Values(i, j));
	}
}
