package com.PixelConstructor2;

public class NotificationService {

	public void sendNotification(String _type)  
	{
		
		System.out.println("NotificationService.sendNotification()");
		if(_type.equalsIgnoreCase("sms"))
		{
		 SendSMS();
		}
		else if(_type.equalsIgnoreCase("email"))
		{
			SendEmail();
		}else {
		SendWhatsApp();
		}
	}
	private void SendSMS() {
		System.out.println("NotificationService.sendNotification() start");
		//biz logic
		System.out.println("NotificationService.sendNotification() End");
	}
	
	
	private void SendEmail() {
		System.out.println("NotificationService.sendNotification() start");
		//biz logic
		System.out.println("NotificationService.sendNotification() End");
	}
	
	private void SendWhatsApp() {
		System.out.println("NotificationService.sendNotification() start");
		//biz logic
		System.out.println("NotificationService.sendNotification() End");
	}
	
}
