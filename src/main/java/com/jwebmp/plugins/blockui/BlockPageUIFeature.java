package com.jwebmp.plugins.blockui;

import com.jwebmp.core.Feature;
import com.jwebmp.plugins.blockui.options.BlockUIOptions;

public class BlockPageUIFeature<J extends BlockPageUIFeature<J>>
		extends Feature<BlockUIOptions, J>
{
	public BlockPageUIFeature()
	{
		super("BlockUIPageFeature");
	}

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
