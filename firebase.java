@Override
public void onMessageReceived(RemoteMessage remoteMessage) {
    Map<String, String> data = remoteMessage.getData();
    if(REMOTE_MESSAGE_TYPE_VALUE.equals(data.get(REMOTE_MESSAGE_TYPE_KEY))) {
        String mocId = data.get(REMOTE_MESSAGE_MOC_ID_KEY);
        Intent intent = new Intent(MOC_CHANGED_INTENT_ACTION);
        if(mocId != null) {
            intent.putExtra(MOC_CHANGED_INTENT_MOC_ID, mocId);
        }
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}