package com.saysweb.emis_app.data;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.saysweb.emis_app.data.userContract.UserEntry;
/**
 * Created by sukant on 05/09/17.
 */

public class userDBHelper extends SQLiteOpenHelper{

    /** Name of the database file. */
    private static final String DATABASE_NAME = "emis.db";

    /** DATABASE Version. Change the version in case you update the schema. */
    private static final int DATABASE_VERSION = 1;

    /** Setting up the constructor. */
    public userDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create string that contains the sql statement to create user table
        String SQL_CREATE_TEM_USER_TABLE = "CREATE TABLE " + UserEntry.TABLE_NAME + "{"
                + UserEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + UserEntry.COLUMN_NAME_TEM_USER_ID + " INTEGER NOT NULL, "
                + UserEntry.COLUMN_NAME_USER_NAME + " TEXT NOT NULL, "
                + UserEntry.COLUMN_NAME_PASSWORD + " TEXT NOT NULL, "
                + UserEntry.COLUMN_NAME_EMP_CODE + " TEXT, "
                + UserEntry.COLUMN_NAME_EMP_NAME + " TEXT, "
                + UserEntry.COLUMN_NAME_PROVINCE_CODE + " TEXT, "
                + UserEntry.COLUMN_NAME_DISTRICT_CODE + " TEXT, "
                + UserEntry.COLUMN_NAME_LLGV_CODE + " TEXT, "
                + UserEntry.COLUMN_NAME_EMAIL + " TEXT, "
                + UserEntry.COLUMN_NAME_MOBILE_NO + " TEXT, "
                + UserEntry.COLUMN_NAME_CREATED_BY + " TEXT, "
                + UserEntry.COLUMN_NAME_CREATED_DATE + " TEXT, "
                + UserEntry.COLUMN_NAME_UPDATED_BY + " TEXT, "
                + UserEntry.COLUMN_NAME_UPDATED_DATE + " TEXT, ";

        db.execSQL(SQL_CREATE_TEM_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
