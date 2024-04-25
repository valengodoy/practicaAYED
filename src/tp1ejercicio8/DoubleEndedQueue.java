package tp1ejercicio8;

import java.util.*;

public class DoubleEndedQueue<T> extends Queue <T>{
	

	public void enqueueFirst(T num) {
		data.add(0,num);
	}
}
