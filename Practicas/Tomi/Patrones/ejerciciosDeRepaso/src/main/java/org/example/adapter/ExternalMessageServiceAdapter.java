package org.example.adapter;

public class ExternalMessageServiceAdapter extends NotificationSender {
    private ExternalMessageService externalMessageService;

    public ExternalMessageServiceAdapter(ExternalMessageService externalMessageService) {
        this.externalMessageService = externalMessageService;
    }

    @Override
    public void sendNotification(String userId, String message) {
        String destinationPhone = userId; // some operations to get the user id from the destination phone
        this.externalMessageService.push(destinationPhone, message);
    }
}
