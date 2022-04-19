package edu.aku.hassannaqvi.naunehalendline.models

import android.database.Cursor
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.ClusterTable
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.ClusterTable.*
import edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 * @update hussain.siddiqui
 */
class Clusters {
    var ID: Long = 0
    var clusterCode: String = _EMPTY_
    var clustername: String = _EMPTY_
    var distCode: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        clusterCode = jsonObject.getString(COLUMN_CLUSTER_CODE)
        clustername = jsonObject.getString(COLUMN_CLUSTER_NAME)
        distCode = jsonObject.getString(COLUMN_DIST_CODE)


        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_ID))

        clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_CLUSTER_CODE))
        clustername = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_CLUSTER_NAME))
        distCode = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_DIST_CODE))


        return this
    }


}