package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsSiteAccessCountHour;



public class CmsSiteAccessCountHour extends BaseCmsSiteAccessCountHour {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSiteAccessCountHour () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSiteAccessCountHour (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSiteAccessCountHour (
		Integer id,
		com.jeecms.core.entity.CmsSite site,
		Long hourPv,
		Long hourIp,
		Long hourUv,
		java.util.Date accessDate,
		Integer accessHour) {

		super (
			id,
			site,
			hourPv,
			hourIp,
			hourUv,
			accessDate,
			accessHour);
	}

/*[CONSTRUCTOR MARKER END]*/


}