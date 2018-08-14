package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class BlockUIPageConfigurator
		implements IPageConfigurator
{
	private static final JavascriptReference reference = new JavascriptReference("BlockUIReference", 2.70, "bower_components/blockui/jquery.blockUI.min.js");

	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured())
		{
			page.addJavaScriptReference(BlockUIPageConfigurator.reference);
		}
		return page;
	}
}
