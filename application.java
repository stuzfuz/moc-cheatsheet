public class MocApplication extends Application {

    private static MocApplication instance;
    public static MocApplication getInstance() { return instance; }
    private static final String FIREBASE_MESSAGING_TOPIC = "moc";

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        FirebaseApp.initializeApp(this);
        FirebaseMessaging.getInstance().subscribeToTopic(
            FIREBASE_MESSAGING_TOPIC);
    }

    //AuthToken
    private String authenticationToken;
    public synchronized String getAuthenticationToken() {
        return authenticationToken;
    }
    public synchronized void setAuthenticationToken(String authenticationToken) { this.authenticationToken = authenticationToken; }
    public synchronized boolean isAuthenticated() {
        return getAuthenticationToken() != null;
    }
}