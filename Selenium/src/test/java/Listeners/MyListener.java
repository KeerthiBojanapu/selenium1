package Listeners;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
import org.yaml.snakeyaml.constructor.Constructor;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class MyListener implements IAnnotationTransformer {
	
	int counter=3;
	

	
public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod)
	{
	if (testMethod.name().equals("ChangeInvocationCountOfMethod")) {
	System.out.println("Changing invocation for the following method: " +testMethod.name());
	testAnnotation.setInvocationCount(counter);

	}
//	

}
}
 