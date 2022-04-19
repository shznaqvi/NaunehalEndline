package edu.aku.hassannaqvi.naunehalendline.database


import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.*


object CreateTable {


    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_EB_CODE + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
/*
            + FormsTable.COLUMN_ENTRY_TYPE + " TEXT,"
*/
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNC_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SHH + " TEXT,"
            + FormsTable.COLUMN_SSE + " TEXT"
            + " );"
            )
    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_EB_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CHILD = ("CREATE TABLE "
            + ChildTable.TABLE_NAME + "("
            + ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ChildTable.COLUMN_PROJECT_NAME + " TEXT, "
            + ChildTable.COLUMN_UID + " TEXT, "
            + ChildTable.COLUMN_UUID + " TEXT, "
/*
            + ChildTable.COLUMN_MUID + " TEXT, "
*/
            + ChildTable.COLUMN_EB_CODE + " TEXT, "
            + ChildTable.COLUMN_HHID + " TEXT, "
            + ChildTable.COLUMN_SNO + " TEXT, "
            + ChildTable.COLUMN_USERNAME + " TEXT, "
            + ChildTable.COLUMN_SYSDATE + " TEXT, "
            + ChildTable.COLUMN_CSTATUS + " TEXT, "
            + ChildTable.COLUMN_DEVICEID + " TEXT, "
            + ChildTable.COLUMN_DEVICETAGID + " TEXT, "
            + ChildTable.COLUMN_SYNCED + " TEXT, "
            + ChildTable.COLUMN_SYNC_DATE + " TEXT, "
            + ChildTable.COLUMN_APPVERSION + " TEXT, "
            + ChildTable.COLUMN_SCB + " TEXT, "
            + ChildTable.COLUMN_SCS + " TEXT, "
            + ChildTable.COLUMN_SIM + " TEXT "
            + " );"
            )


    const val SQL_CREATE_MWRA = ("CREATE TABLE "
            + MWRATable.TABLE_NAME + "("
            + MWRATable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MWRATable.COLUMN_PROJECT_NAME + " TEXT, "
            + MWRATable.COLUMN_UID + " TEXT, "
            + MWRATable.COLUMN_UUID + " TEXT, "
/*
            + ChildTable.COLUMN_MUID + " TEXT, "
*/
            + MWRATable.COLUMN_EB_CODE + " TEXT, "
            + MWRATable.COLUMN_HHID + " TEXT, "
            + MWRATable.COLUMN_SNO + " TEXT, "
            + MWRATable.COLUMN_USERNAME + " TEXT, "
            + MWRATable.COLUMN_SYSDATE + " TEXT, "
            + MWRATable.COLUMN_CSTATUS + " TEXT, "
            + MWRATable.COLUMN_DEVICEID + " TEXT, "
            + MWRATable.COLUMN_DEVICETAGID + " TEXT, "
            + MWRATable.COLUMN_SYNCED + " TEXT, "
            + MWRATable.COLUMN_SYNC_DATE + " TEXT, "
            + MWRATable.COLUMN_APPVERSION + " TEXT, "
            + MWRATable.COLUMN_SPD + " TEXT, "
            + MWRATable.COLUMN_SBF + " TEXT, "
            + MWRATable.COLUMN_SCV + " TEXT "
            + " );"
            )

    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClusterTable.TABLE_NAME + "("
            + ClusterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClusterTable.COLUMN_DIST_CODE + " TEXT,"
            + ClusterTable.COLUMN_CLUSTER_NAME + " TEXT,"
            + ClusterTable.COLUMN_CLUSTER_CODE + " TEXT"
            + " );"
            )

    const val SQL_CREATE_RANDOM_HH = ("CREATE TABLE " + RandomHHTable.TABLE_NAME + "("
            + RandomHHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + RandomHHTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + RandomHHTable.COLUMN_DIST_CODE + " TEXT,"
            + RandomHHTable.COLUMN_LUID + " TEXT,"
            + RandomHHTable.COLUMN_HH_NO + " TEXT,"
            + RandomHHTable.COLUMN_STRUCTURE_NO + " TEXT,"
            + RandomHHTable.COLUMN_FAMILY_EXT_CODE + " TEXT,"
            + RandomHHTable.COLUMN_HH_HEAD + " TEXT,"
            + RandomHHTable.COLUMN_CONTACT + " TEXT,"
            + RandomHHTable.COLUMN_UPDATEDT + " TEXT,"
            + RandomHHTable.COLUMN_RANDOMDT + " TEXT,"
            + RandomHHTable.COLUMN_SNO_HH + " TEXT );"
            )

    const val SQL_CREATE_DISTRICTS = ("CREATE TABLE " + DistrictsTable.TABLE_NAME + "("
            + DistrictsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DistrictsTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + DistrictsTable.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )


}