package methods.properties;

import ro.lrg.xcore.metametamodel.IPropertyComputer;
import ro.lrg.xcore.metametamodel.PropertyComputer;
import unimev.metamodel.entity.MMethod;

@PropertyComputer
public class ToString implements IPropertyComputer<String, MMethod>{

	@Override
	public String compute(MMethod arg0) {
		return arg0.getUnderlyingObject().getElementName();
	}

}