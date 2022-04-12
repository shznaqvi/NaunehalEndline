package edu.aku.hassannaqvi.naunehalendline.models

import android.database.Cursor
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.ClusterTable
import edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Clusters {
    var ID: Long = 0
    var geoarea: String = _EMPTY_
    var distId: String = _EMPTY_
    var ebcode: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        geoarea = jsonObject.getString(ClusterTable.COLUMN_GEOAREA)
        distId = jsonObject.getString(ClusterTable.COLUMN_DIST_ID)
        ebcode = jsonObject.getString(ClusterTable.COLUMN_EB_CODE)


        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_ID))

        geoarea = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_GEOAREA))
        distId = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_DIST_ID))
        ebcode = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_EB_CODE))


        return this
    }


}