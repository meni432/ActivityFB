package com.menisamet.activityfb;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database.getInstance().loadAllUsers();

        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.menisamet.activityfb",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", "KeyHash:" + Base64.encodeToString(md.digest(),
                        Base64.DEFAULT));
                Toast.makeText(getApplicationContext(), Base64.encodeToString(md.digest(),
                        Base64.DEFAULT), Toast.LENGTH_LONG).show();
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }

    public void loadLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    public void testDB(View view) {
        Database database = Database.getInstance();
        database.test();
    }

    public void testIntersts(View view) {
        Intent intent = new Intent(this, InterestsActivity.class);
        startActivity(intent);
    }


    public void testMap(View view) {
        Intent intent = new Intent(this, MyLocationActivity.class);
        startActivity(intent);

    }
    public void testAddMenu(View view) {
        Intent intent = new Intent(this, addMenu.class);
        startActivity(intent);
    }
}
