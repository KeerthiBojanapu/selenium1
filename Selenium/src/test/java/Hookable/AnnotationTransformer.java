package Hookable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class AnnotationTransformer implements IAnnotationTransformer {
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(iTtestConfigured(annotation))
		{
			annotation.setEnabled(false);
		

}
}

	private boolean iTtestConfigured(ITestAnnotation m) {
		if(m.getAlwaysRun())
		{
			return true;
		}
	
		
		return false;
	}
}
		
