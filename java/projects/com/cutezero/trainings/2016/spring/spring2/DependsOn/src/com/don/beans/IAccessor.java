package com.don.beans;

import java.io.IOException;

public interface IAccessor {
	//Here I am making the keys as fixed String so that they can be consistently used by anywhere in my application
	String KEY_PLACE_IR="placeInterest";
	String KEY_CITY_LIST="cities";
	String getKey();
	Object getData() throws IOException;
}
