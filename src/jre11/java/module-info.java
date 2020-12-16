import com.jwebmp.plugins.blockui.implementations.JQBlockUIInclusionModule;

module com.jwebmp.plugins.blockui {
	exports com.jwebmp.plugins.blockui;
	exports com.jwebmp.plugins.blockui.options;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.blockui.BlockUIPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.blockui.implementations.JQBlockUIExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQBlockUIInclusionModule;
	
	opens com.jwebmp.plugins.blockui.options to com.jwebmp.core, com.google.inject, com.fasterxml.jackson.core;
}
