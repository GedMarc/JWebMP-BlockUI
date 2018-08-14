package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Feature;
import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.plugins.blockui.options.BlockUIOptions;

import static com.jwebmp.core.htmlbuilder.css.measurement.MeasurementTypes.*;

/**
 * A very basic growler with some default set
 *
 * @param <J>
 */
@SuppressWarnings("MissingClassJavaDoc")
public class GrowlUIFeature<J extends GrowlUIFeature<J>>
		extends Feature<BlockUIOptions, J>
{
	/**
	 * A block ui with the following settings
	 * <p>
	 * getOptions().setFadeIn(700)
	 * .setFadeOut(700)
	 * .setTimeout(2000)
	 * .setShowOverlay(false)
	 * .setCenterY(false)
	 * .getCss()
	 * .setWidth(new MeasurementCSSImpl(350, Pixels))
	 * .setTop(new MeasurementCSSImpl(10, Pixels))
	 * .setRight(new MeasurementCSSImpl(10, Pixels))
	 * .setPadding(5)
	 * .setBackgroundColor(new ColourCSSImpl("#000"))
	 * .setColor(new ColourCSSImpl("#000"));
	 */
	public GrowlUIFeature()
	{
		super("BlockUIPageFeature");
		setOptions(new BlockUIOptions());
		getOptions().setFadeIn(700)
		            .setFadeOut(700)
		            .setTimeout(2000)
		            .setShowOverlay(false)
		            .setCenterY(false)
		            .getCss()
		            .setWidth(new MeasurementCSSImpl(350, Pixels))
		            .setTop(new MeasurementCSSImpl(10, Pixels))
		            .setRight(new MeasurementCSSImpl(10, Pixels))
		            .setPadding(5)
		            .setBackgroundColor(new ColourCSSImpl("#000"))
		            .setColor(new ColourCSSImpl("#000"));
	}

	/**
	 * Any work that needs to get done pre render
	 */
	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("$.blockUI(")
		  .append(getOptions())
		  .append(");")
		  .append(getNewLine());
		addQuery(sb);
	}
}
