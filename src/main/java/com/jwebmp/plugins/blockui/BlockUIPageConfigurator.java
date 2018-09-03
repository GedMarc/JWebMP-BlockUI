package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class BlockUIPageConfigurator
		implements IPageConfigurator
{
	private static final JavascriptReference reference = new JavascriptReference("BlockUIReference", 2.70, "bower_components/blockui/jquery.blockUI.min.js");
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BlockUIPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BlockUIPageConfigurator.enabled = mustEnable;
	}

	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured())
		{
			page.addJavaScriptReference(BlockUIPageConfigurator.reference);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return BlockUIPageConfigurator.enabled;
	}
}
