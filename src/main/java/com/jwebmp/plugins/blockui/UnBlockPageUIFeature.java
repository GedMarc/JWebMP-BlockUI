package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Feature;

/**
 * Adds the unblock ui script
 */
public class UnBlockPageUIFeature
		extends Feature
{
	private static final String queryText = "$.unblockUI();";

	public UnBlockPageUIFeature()
	{
		super("BlockUIPageFeature");
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(UnBlockPageUIFeature.queryText + getNewLine());
	}
}
