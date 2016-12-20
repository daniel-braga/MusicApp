package com.danielbraga.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView libraryArtist = (TextView) findViewById(R.id.library_artist);
        libraryArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryArtistIntent = new Intent(LibraryActivity.this, LibraryArtistActivity.class);
                startActivity(libraryArtistIntent);
            }
        });

        TextView libraryAlbum = (TextView) findViewById(R.id.library_album);
        libraryAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryAlbumIntent = new Intent(LibraryActivity.this, LibraryAlbumActivity.class);
                startActivity(libraryAlbumIntent);
            }
        });

        TextView libraryGenre = (TextView) findViewById(R.id.library_genre);
        libraryGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryGenreIntent = new Intent(LibraryActivity.this, LibraryGenreActivity.class);
                startActivity(libraryGenreIntent);
            }
        });

        TextView libraryAll = (TextView) findViewById(R.id.library_all);
        libraryAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryAllIntent = new Intent(LibraryActivity.this, LibraryAllActivity.class);
                startActivity(libraryAllIntent);
            }
        });
    }
}
