package com.vatlythuvi.video;

import android.os.Bundle;
import android.widget.Toast;

import com.vatlythuvi.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class video5 extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener {
    private YouTubePlayerView ytpv;
    private final String API_KEY_YT = "AIzaSyDEtR2bbsE_qpwYRP-kfRLCjUwfN8O7lf4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        ytpv = findViewById(R.id.ytpv);
        ytpv.initialize(API_KEY_YT, this);
    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer ytp, boolean b) {
        if (!b) {
            ytp.cueVideo("zwFqbQpKVEY");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        if (result.isUserRecoverableError()) {
            result.getErrorDialog(this, 1).show();
        } else {
            String error = String.format("Error!!!", result.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }
}