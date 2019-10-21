package com.nisovin.shopkeepers.commands.lib.arguments;

import com.nisovin.shopkeepers.commands.lib.CommandArgument;
import com.nisovin.shopkeepers.util.Validate;

/**
 * A {@link FallbackArgument} that accepts any String as fallback.
 * 
 * @see StringArgument
 */
public class AnyStringFallback extends FallbackArgument<String> {

	public AnyStringFallback(CommandArgument<String> argument) {
		this(argument, false);
	}

	public AnyStringFallback(CommandArgument<String> argument, boolean joinRemainingArgs) {
		super(argument, new StringArgument(Validate.notNull(argument).getName(), joinRemainingArgs));
	}
}