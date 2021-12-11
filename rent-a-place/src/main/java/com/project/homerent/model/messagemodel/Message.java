package com.project.homerent.model.messagemodel;

import com.project.homerent.model.usermodel.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="messages")
public class Message {

    @Id
    @Column(name = "message_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;

    @Column(name = "messageText")
    private String messageText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="user_id", nullable = false)
    private User sender;

    @Column(name = "recipient_id")
    private long recipientId;

    @Column(name = "recipient_username")
    private String recipientUsername;

    @Column(name = "is_read")
    private boolean read;

    @Column(name = "created_timestamp")
    @CreationTimestamp
    private Date creationTimestamp;

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public long getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(long recipientId) {
		this.recipientId = recipientId;
	}

	public String getRecipientUsername() {
		return recipientUsername;
	}

	public void setRecipientUsername(String recipientUsername) {
		this.recipientUsername = recipientUsername;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
}