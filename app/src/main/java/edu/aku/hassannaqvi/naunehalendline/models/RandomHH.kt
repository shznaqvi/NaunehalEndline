package edu.aku.hassannaqvi.naunehalendline.models

import android.database.Cursor
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.RandomHHTable
import edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class RandomHH {
    var ID: Long = 0
    var sno: String = _EMPTY_
    var ebCode: String = _EMPTY_
    var hhid: String = _EMPTY_
    var LUID: String? = _EMPTY_
    var structure: String? = _EMPTY_
    var extension: String? = _EMPTY_
    var hhhead: String? = _EMPTY_
    var randomDT: String? = _EMPTY_
    var contact: String? = _EMPTY_
    var selStructure: String? = _EMPTY_
    var tabno: String? = _EMPTY_

    var rndType: String? = _EMPTY_
    var assignHH: String? = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): RandomHH {
        this.LUID = jsonObject.getString(RandomHHTable.COLUMN_LUID)
        this.ebCode = jsonObject.getString(RandomHHTable.COLUMN_EB_CODE)
        this.structure = jsonObject.getString(RandomHHTable.COLUMN_STRUCTURE_NO)
        this.structure = String.format("%04d", Integer.valueOf(this.structure))

        this.extension = jsonObject.getString(RandomHHTable.COLUMN_FAMILY_EXT_CODE)
        this.extension = String.format("%03d", Integer.valueOf(this.extension))

        this.tabno = jsonObject.getString(RandomHHTable.COLUMN_TAB_NO)

        this.hhid = "$tabno-$structure-$extension"
        this.randomDT = jsonObject.getString(RandomHHTable.COLUMN_RANDOMDT)
        this.hhhead = jsonObject.getString(RandomHHTable.COLUMN_HH_HEAD)
        this.contact = jsonObject.getString(RandomHHTable.COLUMN_CONTACT)
        this.selStructure = jsonObject.getString(RandomHHTable.COLUMN_HH_SELECTED_STRUCT)
        this.sno = jsonObject.getString(RandomHHTable.COLUMN_SNO)

        return this
    }

    fun hydrate(cursor: Cursor): RandomHH {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_ID))
        LUID = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_LUID))
        ebCode = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_EB_CODE))
        structure =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_STRUCTURE_NO))
        extension =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_FAMILY_EXT_CODE))
        hhid = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_NO))
        randomDT = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_RANDOMDT))
        hhhead = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_HEAD))
        contact = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_CONTACT))
        selStructure =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_SELECTED_STRUCT))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_SNO))
        return this
    }


}