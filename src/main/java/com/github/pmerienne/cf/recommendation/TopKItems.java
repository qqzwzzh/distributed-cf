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
package com.github.pmerienne.cf.recommendation;

import java.util.Collections;
import java.util.TreeSet;

public class TopKItems extends TreeSet<Recommendation> {

	private static final long serialVersionUID = 436860297140046468L;

	private final int k;

	public TopKItems(int k) {
		super(Collections.reverseOrder());
		this.k = k;
	}

	public void ensureSize() {
		while (this.size() > this.k) {
			this.remove(this.last());
		}
	}

}