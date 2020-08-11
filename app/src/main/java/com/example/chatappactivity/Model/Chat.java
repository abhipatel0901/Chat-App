package com.example.chatappactivity.Model;

public class Chat {

    private String receiver;

    public Chat() {
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Chat(String receiver, String message, String sender,boolean isseen) {
        this.receiver = receiver;
        this.message = message;
        this.sender = sender;
        this.isseen=isseen;
    }

    private String message;
    private String sender;
    private boolean isseen;

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
