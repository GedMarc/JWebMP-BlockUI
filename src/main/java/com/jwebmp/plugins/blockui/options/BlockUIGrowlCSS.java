package com.jwebmp.plugins.blockui.options;

import com.jwebmp.core.htmlbuilder.css.borders.BorderImpl;
import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.css.padding.PaddingImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * The CSS Options for the Growler
 *
 * @param <J>
 * 		Always this class
 */
@SuppressWarnings({"unused", "MissingClassJavaDoc"})
public class BlockUIGrowlCSS<J extends BlockUIGrowlCSS<J>>
		extends JavaScriptPart<J>
{
	/**
	 * default 350px,
	 */
	private MeasurementCSSImpl width;
	/**
	 * Default 10px
	 */
	private MeasurementCSSImpl top;
	/**
	 * Default ''
	 */
	private MeasurementCSSImpl left;
	/**
	 * Default 10px;
	 */
	private MeasurementCSSImpl right;
	/**
	 * Default None
	 */
	private BorderImpl border;
	/**
	 * Default 5px
	 */
	private PaddingImpl padding;
	/**
	 * Default 0.6
	 */
	private Double opacity;
	/**
	 * Default null
	 */
	private Cursors cursor;
	/**
	 * Default #fff
	 */
	private ColourCSSImpl color;
	/**
	 * Default #000
	 */
	private ColourCSSImpl backgroundColor;

	/**
	 * Constructs a new javascript part
	 */
	public BlockUIGrowlCSS()
	{
		//No config required
	}

	/**
	 * Method getWidth returns the width of this BlockUIGrowlCSS object.
	 * <p>
	 * default 350px,
	 *
	 * @return the width (type MeasurementCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public MeasurementCSSImpl getWidth()
	{
		return width;
	}

	/**
	 * Method setWidth sets the width of this BlockUIGrowlCSS object.
	 * <p>
	 * default 350px,
	 *
	 * @param width
	 * 		the width of this BlockUIGrowlCSS object.
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
	 * Method getTop returns the top of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 10px
	 *
	 * @return the top (type MeasurementCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public MeasurementCSSImpl getTop()
	{
		return top;
	}

	/**
	 * Method setTop sets the top of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 10px
	 *
	 * @param top
	 * 		the top of this BlockUIGrowlCSS object.
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
	 * Method getLeft returns the left of this BlockUIGrowlCSS object.
	 * <p>
	 * Default ''
	 *
	 * @return the left (type MeasurementCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public MeasurementCSSImpl getLeft()
	{
		return left;
	}

	/**
	 * Method setLeft sets the left of this BlockUIGrowlCSS object.
	 * <p>
	 * Default ''
	 *
	 * @param left
	 * 		the left of this BlockUIGrowlCSS object.
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

	/**
	 * Method getRight returns the right of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 10px;
	 *
	 * @return the right (type MeasurementCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public MeasurementCSSImpl getRight()
	{
		return right;
	}

	/**
	 * Method setRight sets the right of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 10px;
	 *
	 * @param right
	 * 		the right of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRight(MeasurementCSSImpl right)
	{
		this.right = right;
		return (J) this;
	}

	/**
	 * Method getBorder returns the border of this BlockUIGrowlCSS object.
	 * <p>
	 * Default None
	 *
	 * @return the border (type BorderImpl) of this BlockUIGrowlCSS object.
	 */
	public BorderImpl getBorder()
	{
		return border;
	}

	/**
	 * Method setBorder sets the border of this BlockUIGrowlCSS object.
	 * <p>
	 * Default None
	 *
	 * @param border
	 * 		the border of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBorder(BorderImpl border)
	{
		this.border = border;
		return (J) this;
	}

	/**
	 * Method getPadding returns the padding of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 5px
	 *
	 * @return the padding (type PaddingImpl) of this BlockUIGrowlCSS object.
	 */
	public PaddingImpl getPadding()
	{
		return padding;
	}

	/**
	 * Method setPadding sets the padding of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 5px
	 *
	 * @param padding
	 * 		the padding of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPadding(PaddingImpl padding)
	{
		this.padding = padding;
		return (J) this;
	}

	/**
	 * Method getOpacity returns the opacity of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 0.6
	 *
	 * @return the opacity (type Double) of this BlockUIGrowlCSS object.
	 */
	public Double getOpacity()
	{
		return opacity;
	}

	/**
	 * Method setOpacity sets the opacity of this BlockUIGrowlCSS object.
	 * <p>
	 * Default 0.6
	 *
	 * @param opacity
	 * 		the opacity of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * Method getCursor returns the cursor of this BlockUIGrowlCSS object.
	 * <p>
	 * Default null
	 *
	 * @return the cursor (type Cursors) of this BlockUIGrowlCSS object.
	 */
	public Cursors getCursor()
	{
		return cursor;
	}

	/**
	 * Method setCursor sets the cursor of this BlockUIGrowlCSS object.
	 * <p>
	 * Default null
	 *
	 * @param cursor
	 * 		the cursor of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCursor(Cursors cursor)
	{
		this.cursor = cursor;
		return (J) this;
	}

	/**
	 * Method getColor returns the color of this BlockUIGrowlCSS object.
	 * <p>
	 * Default #fff
	 *
	 * @return the color (type ColourCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public ColourCSSImpl getColor()
	{
		return color;
	}

	/**
	 * Method setColor sets the color of this BlockUIGrowlCSS object.
	 * <p>
	 * Default #fff
	 *
	 * @param color
	 * 		the color of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setColor(ColourCSSImpl color)
	{
		this.color = color;
		return (J) this;
	}

	/**
	 * Method getBackgroundColor returns the backgroundColor of this BlockUIGrowlCSS object.
	 * <p>
	 * Default #000
	 *
	 * @return the backgroundColor (type ColourCSSImpl) of this BlockUIGrowlCSS object.
	 */
	public ColourCSSImpl getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * Method setBackgroundColor sets the backgroundColor of this BlockUIGrowlCSS object.
	 * <p>
	 * Default #000
	 *
	 * @param backgroundColor
	 * 		the backgroundColor of this BlockUIGrowlCSS object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackgroundColor(ColourCSSImpl backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return (J) this;
	}
}
