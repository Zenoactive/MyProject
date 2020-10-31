package com.app.vocaby;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

public class LoadDatabaseAsync extends AsyncTask<Void,Void,Boolean> {
    private Context context;
    private AlertDialog alertDialog;
    private DatabaseHelper myDbHelper;


    public LoadDatabaseAsync(Context context) {
        this.context = context;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        return null;
    }
}
