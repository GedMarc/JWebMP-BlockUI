package com.jwebmp.plugins.blockui.options;

import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * Defaults for when jquery ui themes are enabled
 *
 * @param <J>
 * 		Always this class
 */
public class BlockUIThemedCSS<J extends BlockUIThemedCSS<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Width for themes are used default 30%
	 */
	private MeasurementCSSImpl width;
	/**
	 * Top for themes are used default 40%
	 */
	private MeasurementCSSImpl top;
	/**
	 * Left when themes are used default 35%
	 */
	private MeasurementCSSImpl left;

	/**
	 * Constructs a new javascript part
	 */
	public BlockUIThemedCSS()
	{
		//No config required
	}

	/**
	 * Method getWidth returns the width of this BlockUIThemedCSS object.
	 * <p>
	 * Width for themes are used default 30%
	 *
	 * @return the width (type MeasurementCSSImpl) of this BlockUIThemedCSS object.
	 */
	public MeasurementCSSImpl getWidth()
	{
		return width;
	}

	/**
	 * Method setWidth sets the width of this BlockUIThemedCSS object.
	 * <p>
	 * Width for themes are used default 30%
	 *
	 * @param width
	 * 		the width of this BlockUIThemedCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWidth(MeasurementCSSImpl width)
	{
		this.width = width;
		return (J) this;
	}

	/**
	 * Method getTop returns the top of this BlockUIThemedCSS object.
	 * <p>
	 * Top for themes are used default 40%
	 *
	 * @return the top (type MeasurementCSSImpl) of this BlockUIThemedCSS object.
	 */
	public MeasurementCSSImpl getTop()
	{
		return top;
	}

	/**
	 * Method setTop sets the top of this BlockUIThemedCSS object.
	 * <p>
	 * Top for themes are used default 40%
	 *
	 * @param top
	 * 		the top of this BlockUIThemedCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTop(MeasurementCSSImpl top)
	{
		this.top = top;
		return (J) this;
	}

	/**
	 * Method getLeft returns the left of this BlockUIThemedCSS object.
	 * <p>
	 * Left when themes are used default 35%
	 *
	 * @return the left (type MeasurementCSSImpl) of this BlockUIThemedCSS object.
	 */
	public MeasurementCSSImpl getLeft()
	{
		return left;
	}

	/**
	 * Method setLeft sets the left of this BlockUIThemedCSS object.
	 * <p>
	 * Left when themes are used default 35%
	 *
	 * @param left
	 * 		the left of this BlockUIThemedCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLeft(MeasurementCSSImpl left)
	{
		this.left = left;
		return (J) this;
	}
}
