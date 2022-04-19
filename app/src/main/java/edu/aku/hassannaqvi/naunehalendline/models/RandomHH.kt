package edu.aku.hassannaqvi.naunehalendline.models

import android.database.Cursor
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.RandomHHTable
import edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject
import java.util.*

/**
 * Created by hassan.naqvi on 11/30/2016.
 * @update hussain.siddiqui
 */
class RandomHH {
    var id: String = _EMPTY_
    var lUID: String = _EMPTY_
    var distCode: String = _EMPTY_
    var clusterCode: String = _EMPTY_
    var structure: String = _EMPTY_
    var extension: String = _EMPTY_
    var hh: String = _EMPTY_
    var hhhead: String = _EMPTY_
    var randomDT: String = _EMPTY_
    var contact: String = _EMPTY_
    var updateDT: String = _EMPTY_
    var sno: String = _EMPTY_
    var tabno: String = _EMPTY_

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): RandomHH {
        lUID = jsonObject.getString(RandomHHTable.COLUMN_LUID)
        clusterCode = jsonObject.getString(RandomHHTable.COLUMN_CLUSTER_CODE)
        distCode = jsonObject.getString(RandomHHTable.COLUMN_DIST_CODE)
        structure = jsonObject.getString(RandomHHTable.COLUMN_STRUCTURE_NO)
        structure = String.format("%04d", Integer.parseInt(structure), Locale.ENGLISH)
        extension = jsonObject.getString(RandomHHTable.COLUMN_FAMILY_EXT_CODE)
        extension = String.format("%03d", Integer.parseInt(extension), Locale.ENGLISH)
        tabno = jsonObject.getString(RandomHHTable.COLUMN_TAB_NO)
        hh = "$tabno-$structure-$extension"
        randomDT = jsonObject.getString(RandomHHTable.COLUMN_RANDOMDT)
        hhhead = jsonObject.getString(RandomHHTable.COLUMN_HH_HEAD)
        contact = jsonObject.getString(RandomHHTable.COLUMN_CONTACT)
        updateDT = jsonObject.getString(RandomHHTable.COLUMN_UPDATEDT)
        sno = jsonObject.getString(RandomHHTable.COLUMN_SNO_HH)
        return this
    }

    fun hydrate(cursor: Cursor): RandomHH {
        id = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_ID))
        lUID = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_LUID))
        clusterCode =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_CLUSTER_CODE))
        distCode = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_DIST_CODE))
        structure =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_STRUCTURE_NO))
        extension =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_FAMILY_EXT_CODE))
        hh = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_NO))
        randomDT = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_RANDOMDT))
        hhhead = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_HEAD))
        contact = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_CONTACT))
        updateDT = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_UPDATEDT))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_SNO_HH))
        return this
    }

/*    object TableRandom : BaseColumns {
        const val TABLE_NAME = "bl_randomised"
        const val COLUMN_ID = "_id"
        const val COLUMN_RANDOMDT = "randDT"
        const val COLUMN_LUID = "UID"
        const val COLUMN_SNO_HH = "sno"
        const val COLUMN_CLUSTER_CODE = "hh02"
        const val COLUMN_STRUCTURE_NO = "hh03"
        const val COLUMN_FAMILY_EXT_CODE = "hh07"
        const val COLUMN_HH_NO = "hh"
        const val COLUMN_HH_HEAD = "hh08"
        const val COLUMN_CONTACT = "hh09"
        const val COLUMN_DIST_CODE = "dist_id"
        const val COLUMN_UPDATEDT = "updDt"
        const val COLUMN_TAB_NO = "tabNo"
    }*/

}