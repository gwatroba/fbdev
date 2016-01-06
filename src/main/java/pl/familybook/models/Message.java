package pl.familybook.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long message_id;
	@NotNull
	private String message;
	@NotNull
	private Date created;
	@ManyToOne(fetch=FetchType.LAZY) // to test
    @JoinColumn(name = "profile_id")
	//@JsonIgnore
    private Profile profile;
	
	public Message(){
	}

	public Message(String message) {
		this.message = message;
		this.created = new Date();
	}

	public long getId() {
		return message_id;
	}

	public void setId(long id) {
		this.message_id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = new Date();
	}
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
