LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, MyFirebaseMessagingService.mocChangedIntentFilter());

LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);