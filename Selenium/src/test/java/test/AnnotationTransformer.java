package test;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
import org.yaml.snakeyaml.constructor.Constructor;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class AnnotationTransformer  implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testconstructor,Method testmethod)
	{
		if(isTestConfigured(annotation))
		{
			annotation.setEnabled(false);			
		}
}
	private boolean isTestConfigured(ITestAnnotation m) {
		if(m.getAlwaysRun())
		{
			return true;
		}		
		return false;
	}
}
