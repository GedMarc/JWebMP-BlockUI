package com.jwebmp.plugins.blockui.options;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * The default options set for Block UI
 *
 * @param <J>
 */
@SuppressWarnings("unused")
public class BlockUIOptions<J extends BlockUIOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * message displayed when blocking (use null for no message)
	 */
	private String message;
	/**
	 * title string; only used when theme == true
	 */
	private String title;
	/**
	 * only used when theme == true (requires jquery-ui.js to be loaded)
	 */
	private Boolean draggable;
	/**
	 * set to true to use with jQuery UI themes
	 */
	private Boolean theme;
	/**
	 * styles for the message when blocking; if you wish to disable
	 * these and use an external stylesheet then do this in your code:
	 * $.blockUI.defaults.css = {};
	 */
	private BlockUICSSOptions<?> css;
	/**
	 * styles applied when using $.growlUI
	 */
	private BlockUIGrowlCSS<?> growlCSS;
	/**
	 * styles for the overlay
	 */
	private BlockUIOverlayCSS<?> overlayCSS;
	/**
	 * minimal style set used when themes are used
	 */
	private BlockUIThemedCSS<?> themedCSS;
	/**
	 * style to replace wait cursor before unblocking to correct issue
	 * of lingering wait cursor
	 */
	private Cursors cursorReset;
	/**
	 * force usage of iframe in non-IE browsers (handy for blocking applets)
	 */
	private Boolean forceIframe;
	/**
	 * z-index for the blocking overlay
	 */
	private Integer baseZ;
	/**
	 * set these to true to have the message automatically centered
	 * centerX: true, only effects element blocking (page block controlled via css above)
	 */
	private Boolean centerX;
	/**
	 * set these to true to have the message automatically centered
	 * centerY: true
	 */
	private Boolean centerY;
	/**
	 * allow body element to be stetched in ie6; this makes blocking look better
	 * on "short" pages.  disable if you wish to prevent changes to the body height
	 */
	private Boolean allowBodyStretch;
	/**
	 * enable if you want key and mouse events to be disabled for content that is blocked
	 */
	private Boolean bindEvents;
	/**
	 * be default blockUI will supress tab navigation from leaving blocking content
	 * (if bindEvents is true)
	 */
	private Boolean constrainTabKey;
	/**
	 * fadeIn time in millis; set to 0 to disable fadeIn on block
	 */
	private Integer fadeIn;
	/**
	 * fadeOut time in millis; set to 0 to disable fadeOut on unblock
	 */
	private Integer fadeOut;
	/**
	 * time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock
	 */
	private Integer timeout;
	/**
	 * disable if you don't want to show the overlay
	 */
	private Boolean showOverlay;
	/**
	 * if true, focus will be placed in the first available input field when
	 * page blocking
	 */
	private Boolean focusInput;

	/**
	 * Constructs a new javascript part
	 */
	public BlockUIOptions()
	{
		//No config required
	}

	/**
	 * Method getMessage returns the message of this BlockUIOptions object.
	 * <p>
	 * message displayed when blocking (use null for no message)
	 *
	 * @return the message (type String) of this BlockUIOptions object.
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Method setMessage sets the message of this BlockUIOptions object.
	 * <p>
	 * message displayed when blocking (use null for no message)
	 *
	 * @param message
	 * 		the message of this BlockUIOptions object. Remember to add the component somewhere in the dom
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMessage(IComponentHierarchyBase<?,?> message)
	{
		if (message != null)
		{
			message.setTiny(true);
			message.preConfigure();
			message.asAttributeBase().addStyle("display:none");
			this.message = message.toString(0);
		}
		else
		{
			this.message = null;
		}
		return (J) this;
	}

	/**
	 * Method setMessage sets the message of this BlockUIOptions object.
	 * <p>
	 * message displayed when blocking (use null for no message)
	 *
	 * @param message
	 * 		the message of this BlockUIOptions object.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMessage(String message)
	{
		this.message = message;
		return (J) this;
	}

	/**
	 * Method getTitle returns the title of this BlockUIOptions object.
	 * <p>
	 * title string; only used when theme == true
	 *
	 * @return the title (type String) of this BlockUIOptions object.
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Method setTitle sets the title of this BlockUIOptions object.
	 * <p>
	 * title string; only used when theme == true
	 *
	 * @param title
	 * 		the title of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTitle(String title)
	{
		this.title = title;
		return (J) this;
	}

	/**
	 * Method getDraggable returns the draggable of this BlockUIOptions object.
	 * <p>
	 * only used when theme == true (requires jquery-ui.js to be loaded)
	 *
	 * @return the draggable (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getDraggable()
	{
		return draggable;
	}

	/**
	 * Method setDraggable sets the draggable of this BlockUIOptions object.
	 * <p>
	 * only used when theme == true (requires jquery-ui.js to be loaded)
	 *
	 * @param draggable
	 * 		the draggable of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDraggable(Boolean draggable)
	{
		this.draggable = draggable;
		return (J) this;
	}

	/**
	 * Method getTheme returns the theme of this BlockUIOptions object.
	 * <p>
	 * set to true to use with jQuery UI themes
	 *
	 * @return the theme (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getTheme()
	{
		return theme;
	}

	/**
	 * Method setTheme sets the theme of this BlockUIOptions object.
	 * <p>
	 * set to true to use with jQuery UI themes
	 *
	 * @param theme
	 * 		the theme of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTheme(Boolean theme)
	{
		this.theme = theme;
		return (J) this;
	}

	/**
	 * Method getCss returns the css of this BlockUIOptions object.
	 * <p>
	 * styles for the message when blocking; if you wish to disable
	 *
	 * @return the css (type BlockUICSSOptions ?) of this BlockUIOptions object.
	 */
	@NotNull
	public BlockUICSSOptions<?> getCss()
	{
		if (css == null)
		{
			css = new BlockUICSSOptions<>();
		}
		return css;
	}

	/**
	 * Method setCss sets the css of this BlockUIOptions object.
	 * <p>
	 * styles for the message when blocking; if you wish to disable
	 *
	 * @param css
	 * 		the css of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCss(BlockUICSSOptions<?> css)
	{
		this.css = css;
		return (J) this;
	}

	/**
	 * Method getGrowlCSS returns the growlCSS of this BlockUIOptions object.
	 * <p>
	 * styles applied when using $.growlUI
	 *
	 * @return the growlCSS (type BlockUIGrowlCSS ?) of this BlockUIOptions object.
	 */
	@NotNull
	public BlockUIGrowlCSS<?> getGrowlCSS()
	{
		if (growlCSS == null)
		{
			growlCSS = new BlockUIGrowlCSS<>();
		}
		return growlCSS;
	}

	/**
	 * Method setGrowlCSS sets the growlCSS of this BlockUIOptions object.
	 * <p>
	 * styles applied when using $.growlUI
	 *
	 * @param growlCSS
	 * 		the growlCSS of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGrowlCSS(BlockUIGrowlCSS<?> growlCSS)
	{
		this.growlCSS = growlCSS;
		return (J) this;
	}

	/**
	 * Method getOverlayCSS returns the overlayCSS of this BlockUIOptions object.
	 * <p>
	 * styles for the overlay
	 *
	 * @return the overlayCSS (type BlockUIOverlayCSS) of this BlockUIOptions object.
	 */
	@NotNull
	public BlockUIOverlayCSS<?> getOverlayCSS()
	{
		if (overlayCSS == null)
		{
			overlayCSS = new BlockUIOverlayCSS<>();
		}
		return overlayCSS;
	}

	/**
	 * Method setOverlayCSS sets the overlayCSS of this BlockUIOptions object.
	 * <p>
	 * styles for the overlay
	 *
	 * @param overlayCSS
	 * 		the overlayCSS of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOverlayCSS(BlockUIOverlayCSS<?> overlayCSS)
	{
		this.overlayCSS = overlayCSS;
		return (J) this;
	}

	/**
	 * Method getThemedCSS returns the themedCSS of this BlockUIOptions object.
	 * <p>
	 * minimal style set used when themes are used
	 *
	 * @return the themedCSS (type BlockUIThemedCSS) of this BlockUIOptions object.
	 */
	@NotNull
	public BlockUIThemedCSS<?> getThemedCSS()
	{
		if (themedCSS == null)
		{
			themedCSS = new BlockUIThemedCSS<>();
		}
		return themedCSS;
	}

	/**
	 * Method setThemedCSS sets the themedCSS of this BlockUIOptions object.
	 * <p>
	 * minimal style set used when themes are used
	 *
	 * @param themedCSS
	 * 		the themedCSS of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setThemedCSS(BlockUIThemedCSS<?> themedCSS)
	{
		this.themedCSS = themedCSS;
		return (J) this;
	}

	/**
	 * Method getCursorReset returns the cursorReset of this BlockUIOptions object.
	 * <p>
	 * style to replace wait cursor before unblocking to correct issue
	 *
	 * @return the cursorReset (type Cursors) of this BlockUIOptions object.
	 */
	public Cursors getCursorReset()
	{
		return cursorReset;
	}

	/**
	 * Method setCursorReset sets the cursorReset of this BlockUIOptions object.
	 * <p>
	 * style to replace wait cursor before unblocking to correct issue
	 *
	 * @param cursorReset
	 * 		the cursorReset of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCursorReset(Cursors cursorReset)
	{
		this.cursorReset = cursorReset;
		return (J) this;
	}

	/**
	 * Method getForceIframe returns the forceIframe of this BlockUIOptions object.
	 * <p>
	 * force usage of iframe in non-IE browsers (handy for blocking applets)
	 *
	 * @return the forceIframe (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getForceIframe()
	{
		return forceIframe;
	}

	/**
	 * Method setForceIframe sets the forceIframe of this BlockUIOptions object.
	 * <p>
	 * force usage of iframe in non-IE browsers (handy for blocking applets)
	 *
	 * @param forceIframe
	 * 		the forceIframe of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setForceIframe(Boolean forceIframe)
	{
		this.forceIframe = forceIframe;
		return (J) this;
	}

	/**
	 * Method getBaseZ returns the baseZ of this BlockUIOptions object.
	 * <p>
	 * z-index for the blocking overlay
	 *
	 * @return the baseZ (type Integer) of this BlockUIOptions object.
	 */
	public Integer getBaseZ()
	{
		return baseZ;
	}

	/**
	 * Method setBaseZ sets the baseZ of this BlockUIOptions object.
	 * <p>
	 * z-index for the blocking overlay
	 *
	 * @param baseZ
	 * 		the baseZ of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBaseZ(Integer baseZ)
	{
		this.baseZ = baseZ;
		return (J) this;
	}

	/**
	 * Method getCenterX returns the centerX of this BlockUIOptions object.
	 * <p>
	 * set these to true to have the message automatically centered
	 *
	 * @return the centerX (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getCenterX()
	{
		return centerX;
	}

	/**
	 * Method setCenterX sets the centerX of this BlockUIOptions object.
	 * <p>
	 * set these to true to have the message automatically centered
	 *
	 * @param centerX
	 * 		the centerX of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCenterX(Boolean centerX)
	{
		this.centerX = centerX;
		return (J) this;
	}

	/**
	 * Method getCenterY returns the centerY of this BlockUIOptions object.
	 * <p>
	 * set these to true to have the message automatically centered
	 *
	 * @return the centerY (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getCenterY()
	{
		return centerY;
	}

	/**
	 * Method setCenterY sets the centerY of this BlockUIOptions object.
	 * <p>
	 * set these to true to have the message automatically centered
	 *
	 * @param centerY
	 * 		the centerY of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCenterY(Boolean centerY)
	{
		this.centerY = centerY;
		return (J) this;
	}

	/**
	 * Method getAllowBodyStretch returns the allowBodyStretch of this BlockUIOptions object.
	 * <p>
	 * allow body element to be stetched in ie6; this makes blocking look better
	 *
	 * @return the allowBodyStretch (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getAllowBodyStretch()
	{
		return allowBodyStretch;
	}

	/**
	 * Method setAllowBodyStretch sets the allowBodyStretch of this BlockUIOptions object.
	 * <p>
	 * allow body element to be stetched in ie6; this makes blocking look better
	 *
	 * @param allowBodyStretch
	 * 		the allowBodyStretch of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAllowBodyStretch(Boolean allowBodyStretch)
	{
		this.allowBodyStretch = allowBodyStretch;
		return (J) this;
	}

	/**
	 * Method getBindEvents returns the bindEvents of this BlockUIOptions object.
	 * <p>
	 * enable if you want key and mouse events to be disabled for content that is blocked
	 *
	 * @return the bindEvents (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getBindEvents()
	{
		return bindEvents;
	}

	/**
	 * Method setBindEvents sets the bindEvents of this BlockUIOptions object.
	 * <p>
	 * enable if you want key and mouse events to be disabled for content that is blocked
	 *
	 * @param bindEvents
	 * 		the bindEvents of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBindEvents(Boolean bindEvents)
	{
		this.bindEvents = bindEvents;
		return (J) this;
	}

	/**
	 * Method getConstrainTabKey returns the constrainTabKey of this BlockUIOptions object.
	 * <p>
	 * be default blockUI will supress tab navigation from leaving blocking content
	 *
	 * @return the constrainTabKey (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getConstrainTabKey()
	{
		return constrainTabKey;
	}

	/**
	 * Method setConstrainTabKey sets the constrainTabKey of this BlockUIOptions object.
	 * <p>
	 * be default blockUI will supress tab navigation from leaving blocking content
	 *
	 * @param constrainTabKey
	 * 		the constrainTabKey of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setConstrainTabKey(Boolean constrainTabKey)
	{
		this.constrainTabKey = constrainTabKey;
		return (J) this;
	}

	/**
	 * Method getFadeIn returns the fadeIn of this BlockUIOptions object.
	 * <p>
	 * fadeIn time in millis; set to 0 to disable fadeIn on block
	 *
	 * @return the fadeIn (type Integer) of this BlockUIOptions object.
	 */
	public Integer getFadeIn()
	{
		return fadeIn;
	}

	/**
	 * Method setFadeIn sets the fadeIn of this BlockUIOptions object.
	 * <p>
	 * fadeIn time in millis; set to 0 to disable fadeIn on block
	 *
	 * @param fadeIn
	 * 		the fadeIn of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFadeIn(Integer fadeIn)
	{
		this.fadeIn = fadeIn;
		return (J) this;
	}

	/**
	 * Method getFadeOut returns the fadeOut of this BlockUIOptions object.
	 * <p>
	 * fadeOut time in millis; set to 0 to disable fadeOut on unblock
	 *
	 * @return the fadeOut (type Integer) of this BlockUIOptions object.
	 */
	public Integer getFadeOut()
	{
		return fadeOut;
	}

	/**
	 * Method setFadeOut sets the fadeOut of this BlockUIOptions object.
	 * <p>
	 * fadeOut time in millis; set to 0 to disable fadeOut on unblock
	 *
	 * @param fadeOut
	 * 		the fadeOut of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFadeOut(Integer fadeOut)
	{
		this.fadeOut = fadeOut;
		return (J) this;
	}

	/**
	 * Method getTimeout returns the timeout of this BlockUIOptions object.
	 * <p>
	 * time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock
	 *
	 * @return the timeout (type Integer) of this BlockUIOptions object.
	 */
	public Integer getTimeout()
	{
		return timeout;
	}

	/**
	 * Method setTimeout sets the timeout of this BlockUIOptions object.
	 * <p>
	 * time in millis to wait before auto-unblocking; set to 0 to disable auto-unblock
	 *
	 * @param timeout
	 * 		the timeout of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTimeout(Integer timeout)
	{
		this.timeout = timeout;
		return (J) this;
	}

	/**
	 * Method getShowOverlay returns the showOverlay of this BlockUIOptions object.
	 * <p>
	 * disable if you don't want to show the overlay
	 *
	 * @return the showOverlay (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getShowOverlay()
	{
		return showOverlay;
	}

	/**
	 * Method setShowOverlay sets the showOverlay of this BlockUIOptions object.
	 * <p>
	 * disable if you don't want to show the overlay
	 *
	 * @param showOverlay
	 * 		the showOverlay of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowOverlay(Boolean showOverlay)
	{
		this.showOverlay = showOverlay;
		return (J) this;
	}

	/**
	 * Method getFocusInput returns the focusInput of this BlockUIOptions object.
	 * <p>
	 * if true, focus will be placed in the first available input field when
	 *
	 * @return the focusInput (type Boolean) of this BlockUIOptions object.
	 */
	public Boolean getFocusInput()
	{
		return focusInput;
	}

	/**
	 * Method setFocusInput sets the focusInput of this BlockUIOptions object.
	 * <p>
	 * if true, focus will be placed in the first available input field when
	 *
	 * @param focusInput
	 * 		the focusInput of this BlockUIOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFocusInput(Boolean focusInput)
	{
		this.focusInput = focusInput;
		return (J) this;
	}
}
