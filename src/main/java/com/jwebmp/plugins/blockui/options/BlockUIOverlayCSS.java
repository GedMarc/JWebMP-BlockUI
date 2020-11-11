package com.jwebmp.plugins.blockui.options;

import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * The Overlay CSS Options
 *
 * @param <J>
 * 		Always this object
 */
public class BlockUIOverlayCSS<J extends BlockUIOverlayCSS<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The background colour to be applied default #000
	 */
	private ColourCSSImpl backgroundColor;
	/**
	 * The opacity of the background overlay default 0.6
	 */
	private Double opacity;
	/**
	 * The cursor to show on the background usually wait
	 */
	private Cursors cursor;

	/**
	 * Constructs a new javascript part
	 */
	public BlockUIOverlayCSS()
	{
		//No config required
	}

	/**
	 * Method getBackgroundColor returns the backgroundColor of this BlockUIOverlayCSS object.
	 * <p>
	 * The background colour to be applied default #000
	 *
	 * @return the backgroundColor (type ColourCSSImpl) of this BlockUIOverlayCSS object.
	 */
	public ColourCSSImpl getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * Method setBackgroundColor sets the backgroundColor of this BlockUIOverlayCSS object.
	 * <p>
	 * The background colour to be applied default #000
	 *
	 * @param backgroundColor
	 * 		the backgroundColor of this BlockUIOverlayCSS object.
	 *
	 * @return J
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setBackgroundColor(ColourCSSImpl backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return (J) this;
	}

	/**
	 * Method getOpacity returns the opacity of this BlockUIOverlayCSS object.
	 * <p>
	 * The opacity of the background overlay default 0.6
	 *
	 * @return the opacity (type Double) of this BlockUIOverlayCSS object.
	 */
	public Double getOpacity()
	{
		return opacity;
	}

	/**
	 * Method setOpacity sets the opacity of this BlockUIOverlayCSS object.
	 * <p>
	 * The opacity of the background overlay default 0.6
	 *
	 * @param opacity
	 * 		the opacity of this BlockUIOverlayCSS object.
	 *
	 * @return J
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * Method getCursor returns the cursor of this BlockUIOverlayCSS object.
	 * <p>
	 * The cursor to show on the background usually wait
	 *
	 * @return the cursor (type Cursors) of this BlockUIOverlayCSS object.
	 */
	public Cursors getCursor()
	{
		return cursor;
	}

	/**
	 * Method setCursor sets the cursor of this BlockUIOverlayCSS object.
	 * <p>
	 * The cursor to show on the background usually wait
	 *
	 * @param cursor
	 * 		the cursor of this BlockUIOverlayCSS object.
	 *
	 * @return J
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCursor(Cursors cursor)
	{
		this.cursor = cursor;
		return (J) this;
	}
}
