package uk.co.bbc.spring.issue;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class TestMap<K, V> extends AbstractMap<K, V> implements Map<K, V> {

	private boolean init = false;

	public void init() {
		init = true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return Collections.EMPTY_SET;
	}

	@Override
	public int size() {
		if(!init) {
			throw new IllegalStateException("map not initialised");
		}
		return super.size();
	}

}
