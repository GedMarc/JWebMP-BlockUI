package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "JQuery BlockUI",
		pluginUniqueName = "jquery-block-ui",
		pluginDescription = "Allows to block ui entry with overlays and options",
		pluginVersion = "1.12.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jquery, ui, blockui,block-ui",
		pluginSubtitle = "Blocks user interactions with overlay displays",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-BlockUI",
		pluginSourceUrl = "https://github.com/malsup/blockui",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BlockUI/wiki",
		pluginOriginalHomepage = "https://github.com/malsup/blockui",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-block-ui",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginArtifactId = "jwebmp-jquery-ui",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginModuleName = "jwebmp-block-ui",
		pluginStatus = PluginStatus.Released
)
public class BlockUIPageConfigurator
		implements IPageConfigurator<BlockUIPageConfigurator>
{
	private static final JavascriptReference reference = new JavascriptReference("BlockUIReference", 2.70, "bower_components/blockui/jquery.blockUI.min.js").setPriority(
			RequirementsPriority.Fourth).setSortOrder(100);
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
		if (!page.isConfigured() && enabled())
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
