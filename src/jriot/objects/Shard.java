package jriot.objects;

import java.util.List;

//updated for lolStatus Version 1.0
public class Shard {
	private String hostname;
	private String name;
	private String region_tag;
	private String slug;
	private List<String> locales;
	private List<Service> services;
	
	
	
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion_tag() {
		return region_tag;
	}
	public void setRegion_tag(String region_tag) {
		this.region_tag = region_tag;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public List<String> getLocales() {
		return locales;
	}
	public void setLocales(List<String> locales) {
		this.locales = locales;
	}
	
	
}
