package uk.co.bbc.spring.issue;

public class TestMapFactory<K, V> {

	TestMap<K, V> createTestMap() {
		TestMap<K, V> map = new TestMap<K, V>();
		map.init();
		return map;
	}

}
