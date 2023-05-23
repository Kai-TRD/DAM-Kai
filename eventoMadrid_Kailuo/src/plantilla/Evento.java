package plantilla;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Evento {

	// Atributos
	@JsonProperty("@id")
	private String urlId;
	@JsonProperty("@type")
	private String utlType;
	private String id;
	private String title;
	private String description;
	private String free;
	private String price;
	private String dtstart;
	private String dtend;
	private String time;
	@JsonProperty("excluded-days")
	private String excluded_days;

	private Recurrence recurrence;
	private String audience;

	private String uid;
	private String link;
	@JsonProperty("event-location")
	private String event_location;
	private References references;
	private Relation relation;
	private Address address;
	private Location location;
	private Organization organization;

	// Constructor
	public Evento() {

	}

	// Getter and setter
	public String getUrlId() {
		return urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public String getUtlType() {
		return utlType;
	}

	public void setUtlType(String utlType) {
		this.utlType = utlType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFree() {
		return free;
	}

	public void setFree(String free) {
		this.free = free;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDtstart() {
		return dtstart;
	}

	public void setDtstart(String dtstart) {
		this.dtstart = dtstart;
	}

	public String getDtend() {
		return dtend;
	}

	public void setDtend(String dtend) {
		this.dtend = dtend;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getExcluded_days() {
		return excluded_days;
	}

	public void setExcluded_days(String excluded_days) {
		this.excluded_days = excluded_days;
	}

	public Recurrence getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(Recurrence recurrence) {
		this.recurrence = recurrence;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getEvent_location() {
		return event_location;
	}

	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}

	public References getReferences() {
		return references;
	}

	public void setReferences(References references) {
		this.references = references;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return this.id + " - " + this.title;
	}


	
}
