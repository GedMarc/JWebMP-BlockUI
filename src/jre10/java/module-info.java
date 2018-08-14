import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.blockui.BlockUIPageConfigurator;

module com.jwebmp.plugins.blockui {
	exports com.jwebmp.plugins.blockui;
	exports com.jwebmp.plugins.blockui.options;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with BlockUIPageConfigurator;

	opens com.jwebmp.plugins.blockui.options to com.jwebmp.core, com.google.inject, com.fasterxml.jackson.core;
}
