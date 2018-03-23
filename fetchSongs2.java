package logicsquare.logicsquare;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by CHAYAN_PC on 23-03-2018.
 */

public class fetchSongs2 extends AsyncTask<Void, Void, Void> {
    String data = "";

    String singleParsed2 = "";

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("\n" +
                    "https://api.myjson.com/bins/165phr");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            JSONArray JA = new JSONArray(data);

            JSONObject JO = (JSONObject) JA.get(1);
            singleParsed2 = "Kishore & Asha: " + JO.get("kishore_&_asha");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        KishoreActivity.fetchedData2.setText(this.singleParsed2);
    }
}