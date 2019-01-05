//String -> Input
//Void -> Progress
//LatLng -> Output
new AsyncTask<String, Void, LatLng>() {
            @Override
            protected LatLng doInBackground(String... strings) {
                // do something
                // DO NOT UPDATE UI HERE

                // Example: return new ServiceProxy().getData(MocManagerApplication.getInstance().getAuthenticationToken());
            }

            @Override
            protected void onPostExecute(final LatLng latLng) {
                // update UI
            }.execute()
}