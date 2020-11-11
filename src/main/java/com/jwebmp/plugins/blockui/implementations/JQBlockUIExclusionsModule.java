package com.jwebmp.plugins.blockui.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQBlockUIExclusionsModule
		implements IGuiceScanModuleExclusions<JQBlockUIExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.blockui");
		return strings;
	}
}
