package miniproject.service.converter;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassUtils {
protected ClassUtils() { }
	
	public static  <T> void setIfNotNull(Supplier<T> getter, Consumer<T> setter) {

	       T t = getter.get();

	       if (null != t) {
	           setter.accept(t);
	       }
	   }
}
