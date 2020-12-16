package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Adds the unblock ui script
 */
public class UnBlockPageUIFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,UnBlockPageUIFeature>
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
