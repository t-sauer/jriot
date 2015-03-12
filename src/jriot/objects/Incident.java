package jriot.objects;

//Updated for lol-status Version 1.0
import java.util.List;

public class Incident {
	private boolean active;
	private String created_at;
	private long id;
	private List<Message> updates;
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Message> getUpdates() {
		return updates;
	}
	public void setUpdates(List<Message> updates) {
		this.updates = updates;
	}
	
	
}
