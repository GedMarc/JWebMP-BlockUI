import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.blockui.BlockUIPageConfigurator;
import com.jwebmp.plugins.blockui.implementations.JQBlockUIExclusionsModule;

module com.jwebmp.plugins.blockui {
	exports com.jwebmp.plugins.blockui;
	exports com.jwebmp.plugins.blockui.options;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BlockUIPageConfigurator;

	provides IGuiceScanModuleExclusions with JQBlockUIExclusionsModule;
	provides IGuiceScanJarExclusions with JQBlockUIExclusionsModule;

	opens com.jwebmp.plugins.blockui.options to com.jwebmp.core, com.google.inject, com.fasterxml.jackson.core;
}
