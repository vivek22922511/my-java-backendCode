package com.PixelConstructor2;

public class NotificationDriver {

	public static void main(String[] args) {
	
		NotificationService notificationService=new NotificationService();
		
		
		notificationService.sendNotification("sms");
		notificationService.sendNotification("email");
		notificationService.sendNotification("other");
		
	}

}
