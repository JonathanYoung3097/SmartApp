package event;

import java.util.*;
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement; 

@XmlRootElement
public class Database {
	
	private List<Event> event = new ArrayList<Event>();
	
	public Database(){}
	
	public boolean addEvent(Event e){
		return event.add(e);
	}
	
	public void setEvent(ArrayList<Event> e){
		event = e;
	}
	
	@XmlElement
	public List<Event> getEvent(){
		return event;
	}
}
