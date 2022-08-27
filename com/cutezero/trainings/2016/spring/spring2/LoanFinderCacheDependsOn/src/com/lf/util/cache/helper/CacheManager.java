package com.lf.util.cache.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.lf.util.Cache;

public class CacheManager {
	Cache cache = null;
	Properties properties = null;
	Map<String, Object> accessorsResult = null;
	List<IAccessor> accessors=null;
	String keyOfAccessorResult=null;
	Object valueOfAccessorResult=null;
	
	public CacheManager() throws IOException {
		cache = Cache.getInstance();
		accessorsResult=new HashMap<>();
		load();
	}

	public void load() throws IOException {
//		properties = new Properties();

		/**
		 * The following lines of code might work only for classpath location
		 */
		// properties.load(this.getClass().getClassLoader().getResourceAsStream("WEB-INF/place-interest.properties"));
		// properties.load(this.getClass().getResourceAsStream("WEB-INF/place-interest.properties"));
		/**
		 * The logic I have written in this load method which is not recommended
		 * at all So I am putting comment on this Accessor classes method
		 * However this logic will be mentioned in
		 */
		/*
		 * properties.load(new FileInputStream(new File(
		 * "G:\\SRIMAN_SpringWorkspace\\LoanFinder\\WebContent\\WEB-INF\\place-interest.properties"
		 * ))); cache.put(IAppConstants.KEY_PLACE_RI, properties);
		 */
		/**
		 * Now the different collections and data comming from different
		 * Accessors will be wrapped into a map and then we will load in to the
		 * cache at once by using putAll() of cache putAll() improving the
		 * performance by avoiding of repeatative locking mechanism which occurs
		 * while calling put()
		 */
		accessors=new ArrayList<>();
		accessors.add(new PlaceInterestPropertyAccessor());
		accessors.add(new CitiesDbAccessor());

		for (IAccessor accessor : accessors) {
			keyOfAccessorResult = accessor.getKey();
			valueOfAccessorResult = accessor.getObject();
			accessorsResult.put(keyOfAccessorResult, valueOfAccessorResult);
			System.out.println(keyOfAccessorResult);
		}
		cache.putAll(accessorsResult);
	}

	public Object getObject() {
		return accessorsResult;
	}
}
