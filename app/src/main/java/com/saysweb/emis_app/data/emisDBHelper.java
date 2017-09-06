package com.saysweb.emis_app.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.saysweb.emis_app.data.emisContract.UserEntry;
import com.saysweb.emis_app.data.emisContract.schInspEntry;
/**
 * Created by sukant on 05/09/17.
 * This class extends SQLiteOpenHelper which is used to create database.
 */
public class emisDBHelper extends SQLiteOpenHelper{

    /** Name of the database file. */
    private static final String DATABASE_NAME = "emis.db";

    /** DATABASE Version. Change the version in case you update the schema. */
    private static final int DATABASE_VERSION = 1;

    /** Setting up the constructor. */
    public emisDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create string that contains the sql statement to create user table
        String SQL_CREATE_TEM_USER_TABLE = "CREATE TABLE " + UserEntry.TABLE_NAME + " ("
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
                + UserEntry.COLUMN_NAME_UPDATED_DATE + " TEXT);";

        db.execSQL(SQL_CREATE_TEM_USER_TABLE);

        //CREATING V_SCHOOLS TABLE
        String SQL_CREATE_V_SCHOOLS_TABLE = "CREATE TABLE " + schInspEntry.TABLE_NAME + " ("
                + schInspEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + schInspEntry.COLUMN_NAME_SCHL_ID + " INTEGER NOT NULL, "
                + schInspEntry.COLUMN_NAME_SCHOOL_CODE+ " TEXT NOT NULL, "
                + schInspEntry.COLUMN_NAME_SCHOOL_NAME + " TEXT NOT NULL, "
                + schInspEntry.COLUMN_NAME_SCHOOL_LEVEL + " TEXT, "
                + schInspEntry.COLUMN_NAME_BOARDING_STATUS + " TEXT, "
                + schInspEntry.COLUMN_NAME_SCHOOL_STATUS + " TEXT, "
                + schInspEntry.COLUMN_NAME_LOCALITY + " TEXT, "
                + schInspEntry.COLUMN_NAME_ADDRESS + " TEXT, "
                + schInspEntry.COLUMN_NAME_PHONE + " TEXT, "
                + schInspEntry.COLUMN_NAME_FAX + " TEXT, "
                + schInspEntry.COLUMN_NAME_EMAIL + " TEXT, "
                + schInspEntry.COLUMN_NAME_SECTOR_CODE + " TEXT, "
                + schInspEntry.COLUMN_NAME_WARD_CODE + " TEXT, "
                + schInspEntry.COLUMN_NAME_LLGV_CODE + " TEXT);"
                + schInspEntry.COLUMN_NAME_DISTRICT_CODE + " TEXT);"
                + schInspEntry.COLUMN_NAME_PROVINCE_CODE + " TEXT);"
                + schInspEntry.COLUMN_NAME_AGENCY_CODE + " TEXT);"
                + schInspEntry.COLUMN_NAME_NOTES + " TEXT);"
                + schInspEntry.COLUMN_NAME_INSERTED_BY + " TEXT);"
                + schInspEntry.COLUMN_NAME_INSERTED_DATE + " TEXT);"
                + schInspEntry.COLUMN_NAME_LLGV_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_SECTOR_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_SECTOR_TYPE + " TEXT);"
                + schInspEntry.COLUMN_NAME_WARD_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_DISTRICT_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_PROVINCE_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_AGENCY_NAME + " TEXT);"
                + schInspEntry.COLUMN_NAME_AGENCY_CATEGORY + " TEXT);"
                + schInspEntry.COLUMN_NAME_UPDATED_BY + " TEXT);"
                + schInspEntry.COLUMN_NAME_SCHOOL_REGISTERED + " TEXT);"
                + schInspEntry.COLUMN_NAME_POSITION_NORTH_LAT + " TEXT);"
                + schInspEntry.COLUMN_NAME_POSITION_EAST_LONG + " TEXT);"
                + schInspEntry.COLUMN_NAME_NSO_LOCALITY + " TEXT);"
                + schInspEntry.COLUMN_NAME_CENSUS_YEAR + " TEXT);";

        db.execSQL(SQL_CREATE_V_SCHOOLS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
