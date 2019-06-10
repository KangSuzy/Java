class Apple{
	Apple item;
	
	void store(Apple item) {
		this.item = item;
	}
	
	Apple get() {
		Apple retItem = item;
		item = null;
		
		return retItem;
	}
}

class Orange{
	Orange item;
	
	void store(Orange item) {
		this.item  = item;
	}
	Orange get() {
		Orange retItem = item;
		item = null;
	
	return retItem;
	}
}
public class GenericEx<T> {
	T item;
	
	void store(T item) {
		this.item = item;
	}
	T get() {
		T retItem = item;
		item = null;
		
		return retItem;
	}
}
