package com.jwebmp.plugins.blockui.options;

import com.jwebmp.core.htmlbuilder.css.borders.BorderImpl;
import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.css.text.TextAlignments;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * The default CSS Options for the blocker
 *
 * @param <J>
 */
@SuppressWarnings({"unused", "MissingClassJavaDoc"})
public class BlockUICSSOptions<J extends BlockUICSSOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * default 0
	 */
	private Integer padding;
	/**
	 * default 0
	 */
	private Integer margin;
	/**
	 * Default 30%
	 */
	private MeasurementCSSImpl width;
	/**
	 * Default 40%
	 */
	private MeasurementCSSImpl top;
	/**
	 * Default not specified
	 */
	private MeasurementCSSImpl right;
	/**
	 * Default 35%
	 */
	private MeasurementCSSImpl left;
	/**
	 * Default center
	 */
	private TextAlignments textAlign;
	/**
	 * Default #000
	 */
	private ColourCSSImpl color;
	/**
	 * Default 3px solid #aaa
	 */
	private BorderImpl border;
	/**
	 * default #fff
	 */
	private ColourCSSImpl backgroundColor;
	/**
	 * Default wait
	 */
	private Cursors cursor;

	/**
	 * Constructs a new javascript part
	 */
	public BlockUICSSOptions()
	{
		//No config required
	}

	/**
	 * Method getPadding returns the padding of this BlockUICSSOptions object.
	 * <p>
	 * default 0
	 *
	 * @return the padding (type Integer) of this BlockUICSSOptions object.
	 */
	public Integer getPadding()
	{
		return padding;
	}

	/**
	 * Method setPadding sets the padding of this BlockUICSSOptions object.
	 * <p>
	 * default 0
	 *
	 * @param padding
	 * 		the padding of this BlockUICSSOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPadding(Integer padding)
	{
		this.padding = padding;
		return (J) this;
	}

	/**
	 * Method getMargin returns the margin of this BlockUICSSOptions object.
	 * <p>
	 * default 0
	 *
	 * @return the margin (type Integer) of this BlockUICSSOptions object.
	 */
	public Integer getMargin()
	{
		return margin;
	}

	/**
	 * Method setMargin sets the margin of this BlockUICSSOptions object.
	 * <p>
	 * default 0
	 *
	 * @param margin
	 * 		the margin of this BlockUICSSOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMargin(Integer margin)
	{
		this.margin = margin;
		return (J) this;
	}

	/**
	 * Method getWidth returns the width of this BlockUICSSOptions object.
	 * <p>
	 * Default 30%
	 *
	 * @return the width (type MeasurementCSSImpl) of this BlockUICSSOptions object.
	 */
	public MeasurementCSSImpl getWidth()
	{
		return width;
	}

	/**
	 * Method setWidth sets the width of this BlockUICSSOptions object.
	 * <p>
	 * Default 30%
	 *
	 * @param width
	 * 		the width of this BlockUICSSOptions object.
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
	 * Method getTop returns the top of this BlockUICSSOptions object.
	 * <p>
	 * Default 40%
	 *
	 * @return the top (type MeasurementCSSImpl) of this BlockUICSSOptions object.
	 */
	public MeasurementCSSImpl getTop()
	{
		return top;
	}

	/**
	 * Method setTop sets the top of this BlockUICSSOptions object.
	 * <p>
	 * Default 40%
	 *
	 * @param top
	 * 		the top of this BlockUICSSOptions object.
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

	public MeasurementCSSImpl getRight()
	{
		return right;
	}

	/**
	 * Method setRight sets the right of this BlockUICSSOptions object.
	 * <p>
	 * Default not specified
	 *
	 * @param right
	 * 		the right of this BlockUICSSOptions object.
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
	 * Method getLeft returns the left of this BlockUICSSOptions object.
	 * <p>
	 * Default 35%
	 *
	 * @return the left (type MeasurementCSSImpl) of this BlockUICSSOptions object.
	 */
	public MeasurementCSSImpl getLeft()
	{
		return left;
	}

	/**
	 * Method setLeft sets the left of this BlockUICSSOptions object.
	 * <p>
	 * Default 35%
	 *
	 * @param left
	 * 		the left of this BlockUICSSOptions object.
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
	 * Method getTextAlign returns the textAlign of this BlockUICSSOptions object.
	 * <p>
	 * Default center
	 *
	 * @return the textAlign (type TextAlignments) of this BlockUICSSOptions object.
	 */
	public TextAlignments getTextAlign()
	{
		return textAlign;
	}

	/**
	 * Method setTextAlign sets the textAlign of this BlockUICSSOptions object.
	 * <p>
	 * Default center
	 *
	 * @param textAlign
	 * 		the textAlign of this BlockUICSSOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTextAlign(TextAlignments textAlign)
	{
		this.textAlign = textAlign;
		return (J) this;
	}

	/**
	 * Method getColor returns the color of this BlockUICSSOptions object.
	 * <p>
	 * Default #000
	 *
	 * @return the color (type ColourCSSImpl) of this BlockUICSSOptions object.
	 */
	public ColourCSSImpl getColor()
	{
		return color;
	}

	/**
	 * Method setColor sets the color of this BlockUICSSOptions object.
	 * <p>
	 * Default #000
	 *
	 * @param color
	 * 		the color of this BlockUICSSOptions object.
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
	 * Method getBorder returns the border of this BlockUICSSOptions object.
	 * <p>
	 * Default 3px solid #aaa
	 *
	 * @return the border (type BorderImpl) of this BlockUICSSOptions object.
	 */
	public BorderImpl getBorder()
	{
		return border;
	}

	/**
	 * Method setBorder sets the border of this BlockUICSSOptions object.
	 * <p>
	 * Default 3px solid #aaa
	 *
	 * @param border
	 * 		the border of this BlockUICSSOptions object.
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
	 * Method getBackgroundColor returns the backgroundColor of this BlockUICSSOptions object.
	 * <p>
	 * default #fff
	 *
	 * @return the backgroundColor (type ColourCSSImpl) of this BlockUICSSOptions object.
	 */
	public ColourCSSImpl getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * Method setBackgroundColor sets the backgroundColor of this BlockUICSSOptions object.
	 * <p>
	 * default #fff
	 *
	 * @param backgroundColor
	 * 		the backgroundColor of this BlockUICSSOptions object.
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

	/**
	 * Method getCursor returns the cursor of this BlockUICSSOptions object.
	 * <p>
	 * Default wait
	 *
	 * @return the cursor (type Cursors) of this BlockUICSSOptions object.
	 */
	public Cursors getCursor()
	{
		return cursor;
	}

	/**
	 * Method setCursor sets the cursor of this BlockUICSSOptions object.
	 * <p>
	 * Default wait
	 *
	 * @param cursor
	 * 		the cursor of this BlockUICSSOptions object.
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
}
