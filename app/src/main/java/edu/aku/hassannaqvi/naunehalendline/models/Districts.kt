package edu.aku.hassannaqvi.naunehalendline.models

import android.database.Cursor
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.DistrictsTable
import edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 19/04/2022.
 */
class Districts {
    var districtCode: String = _EMPTY_
    var districtName: String = _EMPTY_

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Districts {
        districtCode = jsonObject.getString(DistrictsTable.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(DistrictsTable.COLUMN_DISTRICT_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): Districts {
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictsTable.COLUMN_DISTRICT_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictsTable.COLUMN_DISTRICT_NAME))
        return this
    }
}