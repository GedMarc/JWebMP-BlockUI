module com.jwebmp.plugins.blockui {
	exports com.jwebmp.plugins.blockui;
	exports com.jwebmp.plugins.blockui.options;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.blockui.BlockUIPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.blockui.implementations.JQBlockUIExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.blockui.implementations.JQBlockUIExclusionsModule;

	opens com.jwebmp.plugins.blockui.options to com.jwebmp.core, com.google.inject, com.fasterxml.jackson.core;
}
