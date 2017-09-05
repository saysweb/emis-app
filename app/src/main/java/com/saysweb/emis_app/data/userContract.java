package com.saysweb.emis_app.data;

import android.provider.BaseColumns;

/**
 * Created by sukant on 05/09/17.
 */

public final class userContract {
    /* Inner class that defines the table contents */
    public static abstract class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "TEM_USER";
        public static final String COLUMN_NAME_TEM_USER_ID = "TEM_USER_ID";
        public static final String COLUMN_NAME_USER_NAME = "USER_NAME";
        public static final String COLUMN_NAME_PASSWORD = "PASSWORD";
        public static final String COLUMN_NAME_EMP_CODE = "EMP_CODE";
        public static final String COLUMN_NAME_EMP_NAME = "EMP_NAME";
        public static final String COLUMN_NAME_PROVINCE_CODE = "PROVINCE_CODE";
        public static final String COLUMN_NAME_DISTRICT_CODE= "DISTRICT_CODE";
        public static final String COLUMN_NAME_LLGV_CODE = "LLGV_CODE";
        public static final String COLUMN_NAME_EMAIL = "EMAIL";
        public static final String COLUMN_NAME_MOBILE_NO = "MOBILE_NO";
        public static final String COLUMN_NAME_CREATED_BY = "CREATED_BY";
        public static final String COLUMN_NAME_CREATED_DATE = "CREATED_DATE";
        public static final String COLUMN_NAME_UPDATED_BY = "UPDATED_BY";
        public static final String COLUMN_NAME_UPDATED_DATE = "UPDATED_DATE";
    }
}
