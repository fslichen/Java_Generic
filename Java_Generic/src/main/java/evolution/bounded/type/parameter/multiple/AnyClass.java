package evolution.bounded.type.parameter.multiple;

import evolution.bounded.type.parameter.multiple.abstractClass.AlphaClass;
import evolution.bounded.type.parameter.multiple.interfaces.AlphaInterface;
import evolution.bounded.type.parameter.multiple.interfaces.BetaInterface;

// T has to extends AlphaClass and implement both AlphaInterface and BetaInterface.
public class AnyClass<T extends AlphaClass & AlphaInterface & BetaInterface> {
	
}
