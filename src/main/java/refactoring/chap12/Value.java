package refactoring.chap12;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private int value;
	private final List<ValueListener> listeners;

	
	public Value(int value, List<ValueListener> listeners) {
		this.value = value;
		this.listeners = listeners;
	}
	public Value(int value) {
		this.value = value;
		this.listeners = new ArrayList<>();
		
	}	
	private void notifyToListeners() {
		for(ValueListener listener : listeners) {
			listener.valueChanger(new ValueChangeEvent(this));
		}
		
	}
	public void addValueListener(ValueListener listener) {
		this.listeners.add(listener);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListeners();
	}
	

}