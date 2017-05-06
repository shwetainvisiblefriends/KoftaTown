package com.theKoftaTown.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.theKoftaTown.Enum.ResponseKeyName;;

public abstract class BaseRestController {


	  /**
	   * Creates the success response.
	   *
	   * @param payloadName
	   *          the payload name
	   * @param object
	   *          the object
	   * @return the hash map
	   */
	  
	  protected HashMap<ResponseKeyName, Object> createSuccessResponse(ResponseKeyName payloadName, Object object) {

	    HashMap<ResponseKeyName, Object> responseMap = new LinkedHashMap<ResponseKeyName, Object>();
	    responseMap.put(payloadName, object);
	    return responseMap;

	  }



}
