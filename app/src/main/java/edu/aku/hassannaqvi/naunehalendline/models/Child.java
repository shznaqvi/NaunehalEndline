package edu.aku.hassannaqvi.naunehalendline.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.form;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehalendline.BR;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;

public class Child extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String cstatus = _EMPTY_;
    private String ebCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;

    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // Field Variables
    // CB
    public String cb01 = _EMPTY_;
    public String cb02 = _EMPTY_;
    public String cb03 = _EMPTY_;
    public String cb04dd = _EMPTY_;
    public String cb04mm = _EMPTY_;
    public String cb04yy = _EMPTY_;
    private String cb04dk = _EMPTY_;


    public String cb0501 = _EMPTY_;
    public String cb0502 = _EMPTY_;
    public String cb06 = _EMPTY_;
    public String cb15 = _EMPTY_;

    public String cb1598 = _EMPTY_;
    public String cb17 = _EMPTY_;
    public String cb16 = _EMPTY_;
    public String cb07 = _EMPTY_;
    public String cb08 = _EMPTY_;
    public String cb09 = _EMPTY_;
    public String cb10 = _EMPTY_;
    public String cb1096x = _EMPTY_;
    public String cb11 = _EMPTY_;
    public String cb12 = _EMPTY_;
    public String cb13 = _EMPTY_;
    public String cb14 = _EMPTY_;
    public String cb1496x = _EMPTY_;


    // CS
    public String cs01 = _EMPTY_;
    public String cs02 = _EMPTY_;
    public String cs02a = _EMPTY_;
    public String cs02b = _EMPTY_;
    public String cs03 = _EMPTY_;
    public String cs04 = _EMPTY_;
    public String cs05 = _EMPTY_;
    public String cs06 = _EMPTY_;
    public String cs07 = _EMPTY_;
    public String cs07961x = _EMPTY_;
    public String cs07962x = _EMPTY_;
    public String cs08 = _EMPTY_;
    public String cs0801 = _EMPTY_;
    public String cs0802 = _EMPTY_;
    public String cs0803 = _EMPTY_;
    public String cs0804 = _EMPTY_;
    public String cs0805 = _EMPTY_;
    public String cs0806 = _EMPTY_;
    public String cs0807 = _EMPTY_;
    public String cs0808 = _EMPTY_;
    public String cs0809 = _EMPTY_;
    public String cs0810 = _EMPTY_;
    public String cs0896 = _EMPTY_;
    public String cs0896x = _EMPTY_;
    public String cs08a = _EMPTY_;
    public String cs08b = _EMPTY_;
    public String cs09 = _EMPTY_;
    public String cs0996x = _EMPTY_;
    public String cs10 = _EMPTY_;
    public String cs11 = _EMPTY_;
    public String cs12 = _EMPTY_;
    public String cs13 = _EMPTY_;
    public String cs14 = _EMPTY_;
    public String cs15 = _EMPTY_;
    public String cs1596x = _EMPTY_;
    public String cs16 = _EMPTY_;
    public String cs17 = _EMPTY_;
    public String cs17961x = _EMPTY_;
    public String cs17962x = _EMPTY_;
    public String cs17a = _EMPTY_;
    public String cs17b = _EMPTY_;
    public String cs18 = _EMPTY_;
    public String cs1802 = _EMPTY_;
    public String cs1803 = _EMPTY_;
    public String cs1804 = _EMPTY_;
    public String cs1805 = _EMPTY_;
    public String cs1806 = _EMPTY_;
    public String cs1807 = _EMPTY_;
    public String cs1808 = _EMPTY_;
    public String cs1896 = _EMPTY_;
    public String cs1896x = _EMPTY_;
    public String cs19 = _EMPTY_;
    public String cs1996x = _EMPTY_;
    public String cs20 = _EMPTY_;
    public String cs21 = _EMPTY_;


    // IM
    private String im01 = _EMPTY_;
    private String im02 = _EMPTY_;
    private String im02a = _EMPTY_;
    private String im02a96x = _EMPTY_;
    private String im03 = _EMPTY_;
    private String im0396x = _EMPTY_;
    private String im04dd = _EMPTY_;
    private String im04mm = _EMPTY_;
    private String im04yy = _EMPTY_;
    private String im0497 = _EMPTY_;
    private String backfilename = _EMPTY_;
    private String frontfilename = _EMPTY_;
    private String im0501dd = _EMPTY_;
    private String im0501mm = _EMPTY_;
    private String im0501yy = _EMPTY_;
    private String im0502dd = _EMPTY_;
    private String im0502mm = _EMPTY_;
    private String im0502yy = _EMPTY_;
    private String im0503dd = _EMPTY_;
    private String im0503mm = _EMPTY_;
    private String im0503yy = _EMPTY_;
    private String im0504dd = _EMPTY_;
    private String im0504mm = _EMPTY_;
    private String im0504yy = _EMPTY_;
    private String im0505dd = _EMPTY_;
    private String im0505mm = _EMPTY_;
    private String im0505yy = _EMPTY_;
    private String im0506dd = _EMPTY_;
    private String im0506mm = _EMPTY_;
    private String im0506yy = _EMPTY_;
    private String im0507dd = _EMPTY_;
    private String im0507mm = _EMPTY_;
    private String im0507yy = _EMPTY_;
    private String im0508dd = _EMPTY_;
    private String im0508mm = _EMPTY_;
    private String im0508yy = _EMPTY_;
    private String im0509dd = _EMPTY_;
    private String im0509mm = _EMPTY_;
    private String im0509yy = _EMPTY_;
    private String im0510dd = _EMPTY_;
    private String im0510mm = _EMPTY_;
    private String im0510yy = _EMPTY_;
    private String im0510add = _EMPTY_;
    private String im0510amm = _EMPTY_;
    private String im0510ayy = _EMPTY_;
    private String im0511dd = _EMPTY_;
    private String im0511mm = _EMPTY_;
    private String im0511yy = _EMPTY_;
    private String im0512dd = _EMPTY_;
    private String im0512mm = _EMPTY_;
    private String im0512yy = _EMPTY_;
    private String im0513dd = _EMPTY_;
    private String im0513mm = _EMPTY_;
    private String im0513yy = _EMPTY_;
    private String im0514dd = _EMPTY_;
    private String im0514mm = _EMPTY_;
    private String im0514yy = _EMPTY_;
    private String im0515dd = _EMPTY_;
    private String im0515mm = _EMPTY_;
    private String im0515yy = _EMPTY_;
    private String im0515bdd = _EMPTY_;
    private String im0515bmm = _EMPTY_;
    private String im0515byy = _EMPTY_;
    private String im0516dd = _EMPTY_;
    private String im0516mm = _EMPTY_;
    private String im0516yy = _EMPTY_;
    private String im0517dd = _EMPTY_;
    private String im0517mm = _EMPTY_;
    private String im0517yy = _EMPTY_;
    //private String im07 = _EMPTY_;
    private String im08 = _EMPTY_;
    private String im09 = _EMPTY_;
    private String im10 = _EMPTY_;
    private String im10a = _EMPTY_;
    private String im11 = _EMPTY_;
    private String im12 = _EMPTY_;
    private String im12a = _EMPTY_;
    private String im12a98 = _EMPTY_;
    private String im14 = _EMPTY_;
    private String im15 = _EMPTY_;
    private String im16 = _EMPTY_;
    private String im17 = _EMPTY_;
    private String im18 = _EMPTY_;
    private String im19 = _EMPTY_;
    private String im20 = _EMPTY_;
    private String im20a = _EMPTY_;

    private String im21 = _EMPTY_;
    private String im22 = _EMPTY_;
    private String im22a = _EMPTY_;
    private String im23 = _EMPTY_;
    private String im236x = _EMPTY_;
    private String im23a = _EMPTY_;
    private String im23b_1 = _EMPTY_;
    private String im23b_2 = _EMPTY_;
    private String im24 = _EMPTY_;
    private String im2417x = _EMPTY_;
    private String im24a = _EMPTY_;
     private String im24b = _EMPTY_;
     private String im24b98 = _EMPTY_;
    private String im24c = _EMPTY_;
    // private String im24d = _EMPTY_;
    private String im25 = _EMPTY_;
    private String im29 = _EMPTY_;
    private String im30 = _EMPTY_;
    private String im30_96x = _EMPTY_;

    //private String im26 = _EMPTY_;

    private String im050198 = _EMPTY_;
    private String im050298 = _EMPTY_;
    private String im050398 = _EMPTY_;
    private String im050498 = _EMPTY_;
    private String im050598 = _EMPTY_;
    private String im050698 = _EMPTY_;
    private String im050798 = _EMPTY_;
    private String im050898 = _EMPTY_;
    private String im050998 = _EMPTY_;
    private String im051098 = _EMPTY_;
    private String im0510a98 = _EMPTY_;
    private String im051198 = _EMPTY_;
    private String im051298 = _EMPTY_;
    private String im051398 = _EMPTY_;
    private String im051498 = _EMPTY_;
    private String im051598 = _EMPTY_;
    private String im0515b98 = _EMPTY_;
    private String im051698 = _EMPTY_;
    private String im051798 = _EMPTY_;

    private String im050295 = _EMPTY_;
    private String im050495 = _EMPTY_;
    private String im050595 = _EMPTY_;
    private String im050695 = _EMPTY_;
    private String im050895 = _EMPTY_;
    private String im050995 = _EMPTY_;
    private String im051095 = _EMPTY_;
    private String im0510a95 = _EMPTY_;
    private String im051295 = _EMPTY_;
    private String im051395 = _EMPTY_;
    private String im051495 = _EMPTY_;
    private String im0515b95 = _EMPTY_;
    private String im051795 = _EMPTY_;
    // PD
    public String pd01 = _EMPTY_;
    public String pd02 = _EMPTY_;
    public String pd03 = _EMPTY_;
    public String pd04 = _EMPTY_;
    public String pd05 = _EMPTY_;
    public String pd0596x = _EMPTY_;
    public String pd06 = _EMPTY_;
    public String pd06961x = _EMPTY_;
    public String pd06962x = _EMPTY_;
    public String pd07 = _EMPTY_;
    public String pd0701x = _EMPTY_;
    public String pd08a = _EMPTY_;
    public String pd08a01 = _EMPTY_;
    public String pd08a02 = _EMPTY_;
    public String pd08a03 = _EMPTY_;
    public String pd08a04 = _EMPTY_;
    public String pd08a05 = _EMPTY_;
    public String pd08a06 = _EMPTY_;
    public String pd08a07 = _EMPTY_;
    public String pd08a08 = _EMPTY_;
    public String pd08a09 = _EMPTY_;
    public String pd08a96 = _EMPTY_;
    public String pd08a96x = _EMPTY_;
    public String pd08 = _EMPTY_;
    public String pd08b = _EMPTY_;
    public String pd08c = _EMPTY_;
    public String pd09 = _EMPTY_;
    public String pd10 = _EMPTY_;
    public String pd1101 = _EMPTY_;
    public String pd1102 = _EMPTY_;
    public String pd12 = _EMPTY_;
    public String pd1296x = _EMPTY_;
    public String pd13 = _EMPTY_;
    public String pd13961x = _EMPTY_;
    public String pd13962x = _EMPTY_;
    public String pd14 = _EMPTY_;
    public String pd1496x = _EMPTY_;
    public String pd15 = _EMPTY_;
    public String pd16 = _EMPTY_;
    public String pd1601 = _EMPTY_;
    public String pd1602 = _EMPTY_;
    public String pd1603 = _EMPTY_;
    public String pd1604 = _EMPTY_;
    public String pd1605 = _EMPTY_;
    public String pd1606 = _EMPTY_;
    public String pd1607 = _EMPTY_;
    public String pd1696 = _EMPTY_;
    public String pd1696x = _EMPTY_;
    public String pd17 = _EMPTY_;
    public String pd1701x = _EMPTY_;
    public String pd1702x = _EMPTY_;
    public String pd1703x = _EMPTY_;
    public String pd18 = _EMPTY_;
    public String pd19 = _EMPTY_;
    public String pd20 = _EMPTY_;
    public String pd2001 = _EMPTY_;
    public String pd2002 = _EMPTY_;
    public String pd2003 = _EMPTY_;
    public String pd2004 = _EMPTY_;
    public String pd2005 = _EMPTY_;
    public String pd2006 = _EMPTY_;
    public String pd2007 = _EMPTY_;
    public String pd2096 = _EMPTY_;
    public String pd2096x = _EMPTY_;
    public String pd21 = _EMPTY_;
    public String pd2101x = _EMPTY_;
    public String pd2102x = _EMPTY_;
    public String pd2103x = _EMPTY_;
    public String pd22 = _EMPTY_;
    public String pd23 = _EMPTY_;
    public String pd24 = _EMPTY_;
    public String pd2401 = _EMPTY_;
    public String pd2402 = _EMPTY_;
    public String pd2403 = _EMPTY_;
    public String pd2404 = _EMPTY_;
    public String pd2405 = _EMPTY_;
    public String pd2406 = _EMPTY_;
    public String pd2496 = _EMPTY_;
    public String pd2496x = _EMPTY_;
    public String pd2498 = _EMPTY_;


    // BF
    public String bf01 = _EMPTY_;
    public String bf02 = _EMPTY_;
    public String bf3y = _EMPTY_;
    public String bf03m = _EMPTY_;
    public String bf3d = _EMPTY_;
    public String bf03a01 = _EMPTY_;
    public String bf03a02 = _EMPTY_;
    public String bf04 = _EMPTY_;
    public String bf05 = _EMPTY_;
    public String bf0502x = _EMPTY_;
    public String bf0503x = _EMPTY_;
    public String bf06 = _EMPTY_;
    public String bf07 = _EMPTY_;
    public String bf0796x = _EMPTY_;
    public String bf08 = _EMPTY_;
    public String bf09 = _EMPTY_;
    public String bf0901 = _EMPTY_;
    public String bf0902 = _EMPTY_;
    public String bf0903 = _EMPTY_;
    public String bf0904 = _EMPTY_;
    public String bf0905 = _EMPTY_;
    public String bf0906 = _EMPTY_;
    public String bf0907 = _EMPTY_;
    public String bf0908 = _EMPTY_;
    public String bf0909 = _EMPTY_;
    public String bf0910 = _EMPTY_;
    public String bf0999 = _EMPTY_;
    public String bf0996 = _EMPTY_;
    public String bf0996x = _EMPTY_;
    public String bf10 = _EMPTY_;
    public String bf11 = _EMPTY_;
    public String bf12 = _EMPTY_;
    public String bf13 = _EMPTY_;
    public String bf14a = _EMPTY_;
    public String bf14b = _EMPTY_;
    public String bf14b01x = _EMPTY_;
    public String bf14c = _EMPTY_;
    public String bf14c01x = _EMPTY_;
    public String bf14d = _EMPTY_;
    public String bf14e = _EMPTY_;
    public String bf14f = _EMPTY_;
    public String bf14f01x = _EMPTY_;
    public String bf14g = _EMPTY_;
    public String bf14h = _EMPTY_;
    public String bf14i = _EMPTY_;
    public String bf15a = _EMPTY_;
    public String bf15b = _EMPTY_;
    public String bf15c = _EMPTY_;
    public String bf15d = _EMPTY_;
    public String bf15e = _EMPTY_;
    public String bf15f = _EMPTY_;
    public String bf15g = _EMPTY_;
    public String bf15h = _EMPTY_;
    public String bf15i = _EMPTY_;
    public String bf15j = _EMPTY_;
    public String bf15k = _EMPTY_;
    public String bf15l = _EMPTY_;
    public String bf15m = _EMPTY_;
    public String bf15n = _EMPTY_;
    public String bf15o = _EMPTY_;
    public String bf15p = _EMPTY_;
    public String bf15q = _EMPTY_;
    public String bf16 = _EMPTY_;
    public String bf17 = _EMPTY_;
    public String bf1701x = _EMPTY_;
    public String bf18 = _EMPTY_;
    public String bf19 = _EMPTY_;
    public String bf1996x = _EMPTY_;
    public String bf20 = _EMPTY_;

    // CV
    public String cv01a = _EMPTY_;
    public String cv01 = _EMPTY_;
    public String cv02 = _EMPTY_;
    public String cv03 = _EMPTY_;
    public String cv04 = _EMPTY_;
    public String cv05 = _EMPTY_;
    public String cv0501 = _EMPTY_;
    public String cv0502 = _EMPTY_;
    public String cv0503 = _EMPTY_;
    public String cv0504 = _EMPTY_;
    public String cv0505 = _EMPTY_;
    public String cv0506 = _EMPTY_;
    public String cv0507 = _EMPTY_;
    public String cv0596 = _EMPTY_;
    public String cv0596x = _EMPTY_;
    public String cv06 = _EMPTY_;
    public String cv0601 = _EMPTY_;
    public String cv0602 = _EMPTY_;
    public String cv0603 = _EMPTY_;
    public String cv0604 = _EMPTY_;
    public String cv0605 = _EMPTY_;
    public String cv0606 = _EMPTY_;
    public String cv0607 = _EMPTY_;
    public String cv0608 = _EMPTY_;
    public String cv0609 = _EMPTY_;
    public String cv0610 = _EMPTY_;
    public String cv0611 = _EMPTY_;
    public String cv0612 = _EMPTY_;
    public String cv0696 = _EMPTY_;
    public String cv0696x = _EMPTY_;
    public String cv07 = _EMPTY_;
    public String cv08 = _EMPTY_;
    public String cv0801 = _EMPTY_;
    public String cv0802 = _EMPTY_;
    public String cv0803 = _EMPTY_;
    public String cv0804 = _EMPTY_;
    public String cv0805 = _EMPTY_;
    public String cv0806 = _EMPTY_;
    public String cv0807 = _EMPTY_;
    public String cv0898 = _EMPTY_;
    public String cv0896 = _EMPTY_;
    public String cv0896x = _EMPTY_;
    public String cv09 = _EMPTY_;
    public String cv0901 = _EMPTY_;
    public String cv0902 = _EMPTY_;
    public String cv0903 = _EMPTY_;
    public String cv0904 = _EMPTY_;
    public String cv0905 = _EMPTY_;
    public String cv0906 = _EMPTY_;
    public String cv0907 = _EMPTY_;
    public String cv0908 = _EMPTY_;
    public String cv0998 = _EMPTY_;
    public String cv0996 = _EMPTY_;
    public String cv0996x = _EMPTY_;
    public String cv10 = _EMPTY_;
    public String cv1001 = _EMPTY_;
    public String cv1002 = _EMPTY_;
    public String cv1003 = _EMPTY_;
    public String cv1004 = _EMPTY_;
    public String cv1005 = _EMPTY_;
    public String cv1006 = _EMPTY_;
    public String cv1007 = _EMPTY_;
    public String cv1008 = _EMPTY_;
    public String cv1009 = _EMPTY_;
    public String cv1098 = _EMPTY_;
    public String cv1096 = _EMPTY_;
    public String cv1096x = _EMPTY_;
    public String cv11 = _EMPTY_;
    public String cv12 = _EMPTY_;
    public String cv1296x = _EMPTY_;
    public String cv13 = _EMPTY_;
    public String cv14 = _EMPTY_;
    public String cv15 = _EMPTY_;
    public String cv16 = _EMPTY_;
    public String cv1696x = _EMPTY_;
    public String cv17 = _EMPTY_;
    public String cv18 = _EMPTY_;
    public String cv1896x = _EMPTY_;
    public String cv19 = _EMPTY_;
    public String cv1996x = _EMPTY_;
    public String cv20 = _EMPTY_;
    public String cv21 = _EMPTY_;
    public String cv2101 = _EMPTY_;
    public String cv2102 = _EMPTY_;
    public String cv2103 = _EMPTY_;
    public String cv2104 = _EMPTY_;
    public String cv2105 = _EMPTY_;
    public String cv2106 = _EMPTY_;
    public String cv2107 = _EMPTY_;
    public String cv2108 = _EMPTY_;
    public String cv2109 = _EMPTY_;
    public String cv2198 = _EMPTY_;
    public String cv2196 = _EMPTY_;
    public String cv2196x = _EMPTY_;


    private long ageInMonths = -1;
    private long ageInDays = -1;
    private long trueAgeInMonths = -1;
    private boolean ageCheck;
    private String isYoungest = "0";


    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        //setClusterCode(MainApp.selectedHousehold.getClusterCode());
        //setHhid(MainApp.selectedHousehold.getHhid());

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getCStatus() {
        return cstatus;
    }

    public void setCStatus(String cStatus) {
        this.cstatus = cStatus;
    }


    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }


    @Bindable
    public String getCb01() {
        return cb01;
    }

    @Bindable
    public String getCb02() {
        return cb02;
    }

    @Bindable
    public String getCb03() {
        return cb03;
    }

    @Bindable
    public String getCb04dd() {
        return cb04dd;
    }

    @Bindable
    public String getCb04mm() {
        return cb04mm;
    }

    @Bindable
    public String getCb04yy() {
        return cb04yy;
    }

    public void setCb04dk(String cb04dk) {
        this.cb04dk = cb04dk;
   /*     setCb04dd(cb04dk.equals("98") ? "98" : this.cb04dd);
        setCb04mm(cb04dk.equals("98") ? "98" : this.cb04mm);
        setCb04yy(cb04dk.equals("98") ? "9998" : this.cb04yy);*/
        setCb0501(cb04dk.equals("98") ? "" : this.cb0501);
        setCb0502(cb04dk.equals("98") ? "" : this.cb0502);

        notifyPropertyChanged(BR.cb04dk);
    }

    @Bindable
    public String getCb0501() {
        return cb0501;
    }

    @Bindable
    public String getCb0502() {
        return cb0502;
    }

    @Bindable
    public String getCb06() {
        return cb06;
    }

    @Bindable
    public String getCb15() {
        return cb15;
    }

    @Bindable
    public String getCb1598() {
        return cb1598;
    }

    @Bindable
    public String getCb17() {
        return cb17;
    }

    @Bindable
    public String getCb16() {
        return cb16;
    }

    @Bindable
    public String getCb07() {
        return cb07;
    }

    @Bindable
    public String getCb08() {
        return cb08;
    }

    @Bindable
    public String getCb09() {
        return cb09;
    }

    @Bindable
    public String getCb10() {
        return cb10;
    }

    @Bindable
    public String getCb1096x() {
        return cb1096x;
    }

    @Bindable
    public String getCb11() {
        return cb11;
    }

    @Bindable
    public String getCb12() {
        return cb12;
    }

    @Bindable
    public String getCb13() {
        return cb13;
    }

    @Bindable
    public String getCb14() {
        return cb14;
    }

    @Bindable
    public String getCb1496x() {
        return cb1496x;
    }

    @Bindable
    public String getCs01() {
        return cs01;
    }

    @Bindable
    public String getCs02() {
        return cs02;
    }

    @Bindable
    public String getCs02a() {
        return cs02a;
    }

    @Bindable
    public String getCs02b() {
        return cs02b;
    }

    @Bindable
    public String getCs03() {
        return cs03;
    }

    @Bindable
    public String getCs04() {
        return cs04;
    }

    @Bindable
    public String getCs05() {
        return cs05;
    }

    @Bindable
    public String getCs06() {
        return cs06;
    }

    @Bindable
    public String getCs07() {
        return cs07;
    }

    @Bindable
    public String getCs07961x() {
        return cs07961x;
    }

    @Bindable
    public String getCs07962x() {
        return cs07962x;
    }

    @Bindable
    public String getCs08() {
        return cs08;
    }

    @Bindable
    public String getCs0801() {
        return cs0801;
    }

    @Bindable
    public String getCs0802() {
        return cs0802;
    }

    @Bindable
    public String getCs0803() {
        return cs0803;
    }

    @Bindable
    public String getCs0804() {
        return cs0804;
    }

    @Bindable
    public String getCs0805() {
        return cs0805;
    }

    @Bindable
    public String getCs0806() {
        return cs0806;
    }

    @Bindable
    public String getCs0807() {
        return cs0807;
    }

    @Bindable
    public String getCs0808() {
        return cs0808;
    }

    @Bindable
    public String getCs0809() {
        return cs0809;
    }

    @Bindable
    public String getCs0810() {
        return cs0810;
    }

    @Bindable
    public String getCs0896() {
        return cs0896;
    }

    @Bindable
    public String getCs0896x() {
        return cs0896x;
    }

    @Bindable
    public String getCs08a() {
        return cs08a;
    }

    @Bindable
    public String getCs08b() {
        return cs08b;
    }

    @Bindable
    public String getCs09() {
        return cs09;
    }

    @Bindable
    public String getCs0996x() {
        return cs0996x;
    }

    @Bindable
    public String getCs10() {
        return cs10;
    }

    @Bindable
    public String getCs11() {
        return cs11;
    }

    @Bindable
    public String getCs12() {
        return cs12;
    }

    @Bindable
    public String getCs13() {
        return cs13;
    }

    @Bindable
    public String getCs14() {
        return cs14;
    }

    @Bindable
    public String getCs15() {
        return cs15;
    }


    @Bindable
    public String getCs1596x() {
        return cs1596x;
    }

    @Bindable
    public String getCs16() {
        return cs16;
    }

    @Bindable
    public String getCs17() {
        return cs17;
    }

    @Bindable
    public String getCs17961x() {
        return cs17961x;
    }

    @Bindable
    public String getCs17962x() {
        return cs17962x;
    }

    @Bindable
    public String getCs17a() {
        return cs17a;
    }

    @Bindable
    public String getCs17b() {
        return cs17b;
    }

    @Bindable
    public String getCs18() {
        return cs18;
    }

    @Bindable
    public String getCs1802() {
        return cs1802;
    }

    @Bindable
    public String getCs1803() {
        return cs1803;
    }

    @Bindable
    public String getCs1804() {
        return cs1804;
    }

    @Bindable
    public String getCs1805() {
        return cs1805;
    }

    @Bindable
    public String getCs1806() {
        return cs1806;
    }

    @Bindable
    public String getCs1807() {
        return cs1807;
    }

    @Bindable
    public String getCs1808() {
        return cs1808;
    }

    @Bindable
    public String getCs1896() {
        return cs1896;
    }

    @Bindable
    public String getCs1896x() {
        return cs1896x;
    }

    @Bindable
    public String getCs19() {
        return cs19;
    }

    @Bindable
    public String getCs1996x() {
        return cs1996x;
    }

    @Bindable
    public String getCs20() {
        return cs20;
    }

    @Bindable
    public String getCs21() {
        return cs21;
    }

    public void setCb01(String cb01) {
        this.cb01 = cb01;
        setSno(cb01);
        notifyPropertyChanged(BR.cb01);
    }

    public void setCb02(String cb02) {
        this.cb02 = cb02;
        notifyPropertyChanged(BR.cb02);
    }

    public void setCb03(String cb03) {
        this.cb03 = cb03;
        notifyPropertyChanged(BR.cb03);
    }

    public void setCb04dd(String cb04dd) {
        this.cb04dd = cb04dd;
        CaluculateAge(this.cb04dd, this.cb04mm, this.cb04yy, false);
        notifyPropertyChanged(BR.cb04dd);
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        CaluculateAge(this.cb04dd, this.cb04mm, this.cb04yy, false);
        notifyPropertyChanged(BR.cb04mm);
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        CaluculateAge(this.cb04dd, this.cb04mm, this.cb04yy, false);
        notifyPropertyChanged(BR.cb04yy);
    }


    @Bindable
    public String getCb04dk() {
        return cb04dk;
    }


    public void setCb0501(String cb0501) {
        this.cb0501 = cb0501;
        if (!cb0501.equals("") && !this.cb0502.equals(""))
            setAgeInMonths((Integer.parseInt(cb0501) * 12L) + Integer.parseInt(this.cb0502));
        notifyPropertyChanged(BR.cb0501);
    }

    public void setCb0502(String cb0502) {
        this.cb0502 = cb0502;
        if (!cb0501.equals("") && !this.cb0502.equals(""))
            setAgeInMonths((Integer.parseInt(cb0501) * 12L) + Integer.parseInt(this.cb0502));
        notifyPropertyChanged(BR.cb0502);
    }

    public void setCb06(String cb06) {
        this.cb06 = cb06;
        setCb11(cb06.equals("1") ? "1" : cb11);

        // Mother info
        setCb07(cb06.equals("1") ? "" : this.cb07);
        setCb08(cb06.equals("1") ? "" : this.cb08);
        setCb09(cb06.equals("1") ? "" : this.cb09);
        setCb10(cb06.equals("1") ? "" : this.cb10);
        setCb11(cb06.equals("1") ? "" : this.cb11);

        // Father Info
        setCb12(cb06.equals("2") ? "" : this.cb12);
        setCb13(cb06.equals("2") ? "" : this.cb13);
        setCb14(cb06.equals("2") ? "" : this.cb14);
        notifyPropertyChanged(BR.cb06);
    }

    public void setCb15(String cb15) {
        this.cb15 = cb15;
        notifyPropertyChanged(BR.cb15);
    }

    public void setCb1598(String cb1598) {
        if (this.cb1598.equals(cb1598)) return; // for all checkboxes
        setCb15(cb1598.equals("98") ? "" : this.cb15);

        setCb17(cb1598.equals("98") ? this.cb17 : "");
        this.cb1598 = cb1598;
        notifyPropertyChanged(BR.cb1598);
    }

    public void setCb17(String cb17) {
        this.cb17 = cb17;
        notifyPropertyChanged(BR.cb17);
    }

    public void setCb16(String cb16) {
        this.cb16 = cb16;
        notifyPropertyChanged(BR.cb16);
    }

    public void setCb07(String cb07) {
        this.cb07 = cb07;
        notifyPropertyChanged(BR.cb07);
    }

    public void setCb08(String cb08) {
        this.cb08 = cb08;
        notifyPropertyChanged(BR.cb08);
    }

    public void setCb09(String cb09) {
        this.cb09 = cb09;
        notifyPropertyChanged(BR.cb09);
    }

    public void setCb10(String cb10) {
        this.cb10 = cb10;
        setCb1096x(cb10.equals("96") ? this.cb1096x : "");
        notifyPropertyChanged(BR.cb10);
    }

    public void setCb1096x(String cb1096x) {
        this.cb1096x = cb1096x;
        notifyPropertyChanged(BR.cb1096x);
    }

    public void setCb11(String cb11) {
        this.cb11 = cb11;
        notifyPropertyChanged(BR.cb11);
    }

    public void setCb12(String cb12) {
        this.cb12 = cb12;
        notifyPropertyChanged(BR.cb12);
    }

    public void setCb13(String cb13) {
        this.cb13 = cb13;
        notifyPropertyChanged(BR.cb13);
    }

    public void setCb14(String cb14) {
        this.cb14 = cb14;
        setCb1496x(cb14.equals("96") ? this.cb1496x : "");
        notifyPropertyChanged(BR.cb14);
    }

    public void setCb1496x(String cb1496x) {
        this.cb1496x = cb1496x;
        notifyPropertyChanged(BR.cb1496x);
    }

    public void setCs01(String cs01) {
        this.cs01 = cs01;
        notifyPropertyChanged(BR.cs01);
    }

    public void setCs02(String cs02) {
        this.cs02 = cs02;
        notifyPropertyChanged(BR.cs02);
    }

    public void setCs02a(String cs02a) {
        this.cs02a = cs02a;

        setCs02b(cs02a.equals("4") ? "" : this.cs02b);
        setCs03(cs02a.equals("4") ? "" : this.cs03);
        setCs04(cs02a.equals("4") ? "" : this.cs04);
        setCs05(cs02a.equals("4") ? "" : this.cs05);
        setCs06(cs02a.equals("4") ? "" : this.cs06);
        setCs07(cs02a.equals("4") ? "" : this.cs07);
        setCs0801(cs02a.equals("4") ? "" : this.cs0801);
        setCs0802(cs02a.equals("4") ? "" : this.cs0802);
        setCs0803(cs02a.equals("4") ? "" : this.cs0803);
        setCs0804(cs02a.equals("4") ? "" : this.cs0804);
        setCs0805(cs02a.equals("4") ? "" : this.cs0805);
        setCs0806(cs02a.equals("4") ? "" : this.cs0806);
        setCs0807(cs02a.equals("4") ? "" : this.cs0807);
        setCs0808(cs02a.equals("4") ? "" : this.cs0808);
        setCs0809(cs02a.equals("4") ? "" : this.cs0809);
        setCs0810(cs02a.equals("4") ? "" : this.cs0810);
        setCs0896(cs02a.equals("4") ? "" : this.cs0896);
        setCs08a(cs02a.equals("4") ? "" : this.cs08a);
        setCs08b(cs02a.equals("4") ? "" : this.cs08b);
        setCs09(cs02a.equals("4") ? "" : this.cs09);
        setCs10(cs02a.equals("4") ? "" : this.cs10);
        setCs11(cs02a.equals("4") ? "" : this.cs11);
        setCs12(cs02a.equals("4") ? "" : this.cs12);
        setCs13(cs02a.equals("4") ? "" : this.cs13);
        setCs14(cs02a.equals("4") ? "" : this.cs14);
        setCs15(cs02a.equals("4") ? "" : this.cs15);
        setCs16(cs02a.equals("4") ? "" : this.cs16);
        setCs17(cs02a.equals("4") ? "" : this.cs17);
        setCs17a(cs02a.equals("4") ? "" : this.cs17a);
        setCs17b(cs02a.equals("4") ? "" : this.cs17b);
        setCs1802(cs02a.equals("4") ? "" : this.cs1802);
        setCs1803(cs02a.equals("4") ? "" : this.cs1803);
        setCs1804(cs02a.equals("4") ? "" : this.cs1804);
        setCs1805(cs02a.equals("4") ? "" : this.cs1805);
        setCs1806(cs02a.equals("4") ? "" : this.cs1806);
        setCs1807(cs02a.equals("4") ? "" : this.cs1807);
        setCs1808(cs02a.equals("4") ? "" : this.cs1808);
        setCs1896(cs02a.equals("4") ? "" : this.cs1896);
        setCs19(cs02a.equals("4") ? "" : this.cs19);
        setCs20(cs02a.equals("4") ? "" : this.cs20);
        setCs21(cs02a.equals("4") ? "" : this.cs21);

        notifyPropertyChanged(BR.cs02a);
    }

    public void setCs02b(String cs02b) {
        this.cs02b = cs02b;
        notifyPropertyChanged(BR.cs02b);
    }

    public void setCs03(String cs03) {
        this.cs03 = cs03;

        setCs04(cs03.equals("2") ? "" : this.cs04);
        setCs05(cs03.equals("2") ? "" : this.cs05);
        setCs06(cs03.equals("2") ? "" : this.cs06);
        setCs07(cs03.equals("2") ? "" : this.cs07);
        setCs0801(cs03.equals("2") ? "" : this.cs0801);
        setCs0802(cs03.equals("2") ? "" : this.cs0802);
        setCs0803(cs03.equals("2") ? "" : this.cs0803);
        setCs0804(cs03.equals("2") ? "" : this.cs0804);
        setCs0805(cs03.equals("2") ? "" : this.cs0805);
        setCs0806(cs03.equals("2") ? "" : this.cs0806);
        setCs0807(cs03.equals("2") ? "" : this.cs0807);
        setCs0808(cs03.equals("2") ? "" : this.cs0808);
        setCs0809(cs03.equals("2") ? "" : this.cs0809);
        setCs0810(cs03.equals("2") ? "" : this.cs0810);
        setCs0896(cs03.equals("2") ? "" : this.cs0896);
        setCs08a(cs03.equals("2") ? "" : this.cs08a);
        setCs08b(cs03.equals("2") ? "" : this.cs08b);
        setCs09(cs03.equals("2") ? "" : this.cs09);
        setCs10(cs03.equals("2") ? "" : this.cs10);

        notifyPropertyChanged(BR.cs03);
    }

    public void setCs04(String cs04) {
        this.cs04 = cs04;
        notifyPropertyChanged(BR.cs04);
    }

    public void setCs05(String cs05) {
        this.cs05 = cs05;
        notifyPropertyChanged(BR.cs05);
    }

    public void setCs06(String cs06) {
        this.cs06 = cs06;

        setCs07(cs06.equals("2") ? "" : this.cs07);
        setCs0801(cs06.equals("2") ? "" : this.cs0801);
        setCs0802(cs06.equals("2") ? "" : this.cs0802);
        setCs0803(cs06.equals("2") ? "" : this.cs0803);
        setCs0804(cs06.equals("2") ? "" : this.cs0804);
        setCs0805(cs06.equals("2") ? "" : this.cs0805);
        setCs0806(cs06.equals("2") ? "" : this.cs0806);
        setCs0807(cs06.equals("2") ? "" : this.cs0807);
        setCs0808(cs06.equals("2") ? "" : this.cs0808);
        setCs0809(cs06.equals("2") ? "" : this.cs0809);
        setCs0810(cs06.equals("2") ? "" : this.cs0810);
        setCs0896(cs06.equals("2") ? "" : this.cs0896);
        setCs08a(cs06.equals("2") ? "" : this.cs08a);
        setCs08b(cs06.equals("2") ? "" : this.cs08b);

        setCs10(cs06.equals("1") ? "" : this.cs10);
        setCs11(cs06.equals("1") ? "" : this.cs11);


        notifyPropertyChanged(BR.cs06);
    }

    public void setCs07(String cs07) {
        this.cs07 = cs07;
        setCs07961x(cs07.equals("961") ? this.cs07961x : "");
        setCs07962x(cs07.equals("962") ? this.cs07962x : "");
        notifyPropertyChanged(BR.cs07);
    }

    public void setCs07961x(String cs07961x) {
        this.cs07961x = cs07961x;
        notifyPropertyChanged(BR.cs07961x);
    }

    public void setCs07962x(String cs07962x) {
        this.cs07962x = cs07962x;
        notifyPropertyChanged(BR.cs07962x);
    }

    public void setCs08(String cs08) {
        this.cs08 = cs08;
        notifyPropertyChanged(BR.cs08);
    }

    public void setCs0801(String cs0801) {
        if (this.cs0801.equals(cs0801)) return; // for all checkboxes
        this.cs0801 = cs0801;
        notifyPropertyChanged(BR.cs0801);
    }

    public void setCs0802(String cs0802) {
        if (this.cs0802.equals(cs0802)) return; // for all checkboxes
        this.cs0802 = cs0802;
        notifyPropertyChanged(BR.cs0802);
    }

    public void setCs0803(String cs0803) {
        if (this.cs0803.equals(cs0803)) return; // for all checkboxes
        this.cs0803 = cs0803;
        notifyPropertyChanged(BR.cs0803);
    }

    public void setCs0804(String cs0804) {
        if (this.cs0804.equals(cs0804)) return; // for all checkboxes
        this.cs0804 = cs0804;
        notifyPropertyChanged(BR.cs0804);
    }

    public void setCs0805(String cs0805) {
        if (this.cs0805.equals(cs0805)) return; // for all checkboxes
        this.cs0805 = cs0805;
        notifyPropertyChanged(BR.cs0805);
    }

    public void setCs0806(String cs0806) {
        if (this.cs0806.equals(cs0806)) return; // for all checkboxes
        this.cs0806 = cs0806;
        notifyPropertyChanged(BR.cs0806);
    }

    public void setCs0807(String cs0807) {
        if (this.cs0807.equals(cs0807)) return; // for all checkboxes
        this.cs0807 = cs0807;
        notifyPropertyChanged(BR.cs0807);
    }

    public void setCs0808(String cs0808) {
        if (this.cs0808.equals(cs0808)) return; // for all checkboxes
        this.cs0808 = cs0808;
        notifyPropertyChanged(BR.cs0808);
    }

    public void setCs0809(String cs0809) {
        if (this.cs0809.equals(cs0809)) return; // for all checkboxes
        this.cs0809 = cs0809;
        notifyPropertyChanged(BR.cs0809);
    }

    public void setCs0810(String cs0810) {
        if (this.cs0810.equals(cs0810)) return; // for all checkboxes
        this.cs0810 = cs0810;
        notifyPropertyChanged(BR.cs0810);
    }

    public void setCs0896(String cs0896) {
        if (this.cs0896.equals(cs0896)) return; // for all checkboxes
        this.cs0896 = cs0896;
        setCs0896x(cs0896.equals("96") ? this.cs0896x : "");
        notifyPropertyChanged(BR.cs0896);
    }

    public void setCs0896x(String cs0896x) {
        this.cs0896x = cs0896x;
        notifyPropertyChanged(BR.cs0896x);
    }

    public void setCs08a(String cs08a) {
        this.cs08a = cs08a;
        setCs08b(cs08a.equals("1") ? this.cs08b : "");
        notifyPropertyChanged(BR.cs08a);
    }

    public void setCs08b(String cs08b) {
        this.cs08b = cs08b;
        notifyPropertyChanged(BR.cs08b);
    }

    public void setCs09(String cs09) {
        this.cs09 = cs09;
        setCs0996x(cs09.equals("96") ? this.cs0996x : "");
        notifyPropertyChanged(BR.cs09);
    }

    public void setCs0996x(String cs0996x) {
        this.cs0996x = cs0996x;
        notifyPropertyChanged(BR.cs0996x);
    }

    public void setCs10(String cs10) {
        this.cs10 = cs10;
        notifyPropertyChanged(BR.cs10);
    }

    public void setCs11(String cs11) {
        this.cs11 = cs11;
        notifyPropertyChanged(BR.cs11);
    }

    public void setCs12(String cs12) {
        this.cs12 = cs12;

        notifyPropertyChanged(BR.cs12);
    }

    public void setCs13(String cs13) {
        this.cs13 = cs13;
        notifyPropertyChanged(BR.cs13);
    }

    public void setCs14(String cs14) {
        this.cs14 = cs14;
        setCs15(cs14.equals("1") ? this.cs15 : "");
        setCs15(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs15);
        setCs16(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs16);
        setCs17(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs17);
        setCs17a(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs17a);
        setCs17b(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs17b);
        setCs1802(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1802);
        setCs1803(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1803);
        setCs1804(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1804);
        setCs1805(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1805);
        setCs1806(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1806);
        setCs1807(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1807);
        setCs1896(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs1896);
        setCs19(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs19);
        setCs20(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs20);
        setCs21(cs12.equals("2") && cs13.equals("2") && cs14.equals("2") ? "" : this.cs21);


        notifyPropertyChanged(BR.cs14);
    }

    public void setCs15(String cs15) {
        this.cs15 = cs15;
        setCs1596x(cs15.equals("96") ? this.cs1596x : "");
        notifyPropertyChanged(BR.cs15);
    }

    public void setCs1596x(String cs1596x) {
        this.cs1596x = cs1596x;
        notifyPropertyChanged(BR.cs1596x);
    }

    public void setCs16(String cs16) {
        this.cs16 = cs16;
        setCs17(cs16.equals("1") ? this.cs17 : "");
        setCs17a(cs16.equals("1") ? this.cs17a : "");
        setCs1802(cs16.equals("1") ? this.cs1802 : "");
        setCs1803(cs16.equals("1") ? this.cs1803 : "");
        setCs1804(cs16.equals("1") ? this.cs1804 : "");
        setCs1805(cs16.equals("1") ? this.cs1805 : "");
        setCs1806(cs16.equals("1") ? this.cs1806 : "");
        setCs1807(cs16.equals("1") ? this.cs1807 : "");
        setCs1808(cs16.equals("1") ? this.cs1808 : "");
        setCs1896(cs16.equals("1") ? this.cs1896 : "");

        notifyPropertyChanged(BR.cs16);
    }

    public void setCs17(String cs17) {
        this.cs17 = cs17;
        setCs17961x(cs17.equals("961") ? this.cs17961x : "");
        setCs17962x(cs17.equals("962") ? this.cs17962x : "");
        notifyPropertyChanged(BR.cs17);
    }

    public void setCs17961x(String cs17961x) {
        this.cs17961x = cs17961x;
        notifyPropertyChanged(BR.cs17961x);
    }

    public void setCs17962x(String cs17962x) {
        this.cs17962x = cs17962x;
        notifyPropertyChanged(BR.cs17962x);
    }

    public void setCs17a(String cs17a) {
        this.cs17a = cs17a;
        setCs17b(cs17a.equals("1") ? this.cs17b : "");
        notifyPropertyChanged(BR.cs17a);
    }

    public void setCs17b(String cs17b) {
        this.cs17b = cs17b;
        notifyPropertyChanged(BR.cs17b);
    }

    public void setCs18(String cs18) {
        this.cs18 = cs18;
        notifyPropertyChanged(BR.cs18);
    }

    public void setCs1802(String cs1802) {
        if (this.cs1802.equals(cs1802)) return; // for all checkboxes
        this.cs1802 = cs1802;
        notifyPropertyChanged(BR.cs1802);
    }

    public void setCs1803(String cs1803) {
        if (this.cs1803.equals(cs1803)) return; // for all checkboxes
        this.cs1803 = cs1803;
        notifyPropertyChanged(BR.cs1803);
    }

    public void setCs1804(String cs1804) {
        if (this.cs1804.equals(cs1804)) return; // for all checkboxes
        this.cs1804 = cs1804;
        notifyPropertyChanged(BR.cs1804);
    }

    public void setCs1805(String cs1805) {
        if (this.cs1805.equals(cs1805)) return; // for all checkboxes
        this.cs1805 = cs1805;
        notifyPropertyChanged(BR.cs1805);
    }

    public void setCs1806(String cs1806) {
        if (this.cs1806.equals(cs1806)) return; // for all checkboxes
        this.cs1806 = cs1806;
        notifyPropertyChanged(BR.cs1806);
    }

    public void setCs1807(String cs1807) {
        if (this.cs1807.equals(cs1807)) return; // for all checkboxes
        this.cs1807 = cs1807;
        notifyPropertyChanged(BR.cs1807);
    }

    public void setCs1808(String cs1808) {
        if (this.cs1808.equals(cs1808)) return; // for all checkboxes
        this.cs1808 = cs1808;
        notifyPropertyChanged(BR.cs1808);
    }

    public void setCs1896(String cs1896) {
        if (this.cs1896.equals(cs1896)) return; // for all checkboxes
        this.cs1896 = cs1896;
        setCs1896x(cs1896.equals("96") ? this.cs1896x : "");
        notifyPropertyChanged(BR.cs1896);
    }

    public void setCs1896x(String cs1896x) {
        this.cs1896x = cs1896x;
        notifyPropertyChanged(BR.cs1896x);
    }

    public void setCs19(String cs19) {
        this.cs19 = cs19;
        setCs1996x(cs19.equals("96") ? this.cs1996x : "");
        notifyPropertyChanged(BR.cs19);
    }

    public void setCs1996x(String cs1996x) {
        this.cs1996x = cs1996x;
        notifyPropertyChanged(BR.cs1996x);
    }

    public void setCs20(String cs20) {
        this.cs20 = cs20;
        notifyPropertyChanged(BR.cs20);
    }

    public void setCs21(String cs21) {
        this.cs21 = cs21;
        notifyPropertyChanged(BR.cs21);
    }

    @Bindable
    public long getAgeInMonths() {
        return ageInMonths;
    }


    public void setAgeInMonths(long ageInMonths) {
        this.ageInMonths = ageInMonths;
        setAgeCheck(ageInMonths < 59);
        notifyPropertyChanged(BR.ageInMonths);

    }

    @Bindable
    public long getAgeInDays() {
        return ageInDays;
    }


    public void setAgeInDays(long ageInDays) {
        this.ageInDays = ageInDays;
        notifyPropertyChanged(BR.ageInDays);

    }

    @Bindable
    public long getTrueAgeInMonths() {
        return trueAgeInMonths;
    }


    public void setTrueAgeInMonths(long trueAgeInMonths) {
        this.trueAgeInMonths = trueAgeInMonths;
        setAgeCheck(trueAgeInMonths < 59);
        notifyPropertyChanged(BR.trueAgeInMonths);
    }

    @Bindable
    public boolean getAgeCheck() {
        return ageCheck;
    }

    public void setAgeCheck(boolean ageCheck) {
        this.ageCheck = ageCheck;
        notifyPropertyChanged(BR.ageCheck);

    }

    @Bindable
    public String getIsYoungest() {
        return isYoungest;
    }

    public void setIsYoungest(String isYoungest) {
        this.isYoungest = isYoungest;
        notifyPropertyChanged(BR.isYoungest);

    }


    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        setIm02(im01.equals("1") ? this.im02 : "");
        setIm03(im01.equals("2") ? this.im03 : "");
        setIm08(im01.equals("2") ? this.im08 : "");

        setIm04dd(im01.equals("1") ? this.im04dd : "");
        setIm04mm(im01.equals("1") ? this.im04mm : "");
        setIm04yy(im01.equals("1") ? this.im04yy : "");


        // At birth
        setIm0501dd(im01.equals("1") ? this.im0501dd : "");
        setIm0501mm(im01.equals("1") ? this.im0501mm : "");
        setIm0501yy(im01.equals("1") ? this.im0501yy : "");
        setIm050198(im01.equals("1") ? this.im050198 : "");
        setIm050295(im01.equals("1") ? this.im050295 : "");


        setIm0502dd(im01.equals("1") ? this.im0502dd : "");
        setIm0502mm(im01.equals("1") ? this.im0502mm : "");
        setIm0502yy(im01.equals("1") ? this.im0502yy : "");
        setIm050298(im01.equals("1") ? this.im050298 : "");
        setIm0510a95(im01.equals("1") ? this.im0510a95 : "");

        setIm0510add(im01.equals("1") ? this.im0510add : "");
        setIm0510amm(im01.equals("1") ? this.im0510amm : "");
        setIm0510ayy(im01.equals("1") ? this.im0510ayy : "");
        setIm0510a98(im01.equals("1") ?  this.im0510a98 : "");


        // At six weeks
        setIm0503dd(im01.equals("1") ? this.im0503dd : "");
        setIm0503mm(im01.equals("1") ? this.im0503mm : "");
        setIm0503yy(im01.equals("1") ? this.im0503yy : "");
        setIm050398(im01.equals("1") ?  this.im050398 : "");
        setIm050495(im01.equals("1") ? this.im050495 : "");

        setIm0504dd(im01.equals("1") ? this.im0504dd : "");
        setIm0504mm(im01.equals("1") ? this.im0504mm : "");
        setIm0504yy(im01.equals("1") ? this.im0504yy : "");
        setIm050498(im01.equals("1") ?  this.im050498 : "");
        setIm050595(im01.equals("1") ? this.im050595 : "");

        setIm0505dd(im01.equals("1") ? this.im0505dd : "");
        setIm0505mm(im01.equals("1") ? this.im0505mm : "");
        setIm0505yy(im01.equals("1") ? this.im0505yy : "");
        setIm050598(im01.equals("1") ?  this.im050598 : "");
        setIm050695(im01.equals("1") ? this.im050695 : "");

        setIm0506dd(im01.equals("1") ? this.im0506dd : "");
        setIm0506mm(im01.equals("1") ? this.im0506mm : "");
        setIm0506yy(im01.equals("1") ? this.im0506yy : "");
        setIm050698(im01.equals("1") ?  this.im050698 : "");


        // at 10 weeks
        setIm0507dd(im01.equals("1") ? this.im0507dd : "");
        setIm0507mm(im01.equals("1") ? this.im0507mm : "");
        setIm0507yy(im01.equals("1") ? this.im0507yy : "");
        setIm050798(im01.equals("1") ?  this.im050798 : "");
        setIm050895(im01.equals("1") ? this.im050895 : "");

        setIm0508dd(im01.equals("1") ? this.im0508dd : "");
        setIm0508mm(im01.equals("1") ? this.im0508mm : "");
        setIm0508yy(im01.equals("1") ? this.im0508yy : "");
        setIm050898(im01.equals("1") ?  this.im050898 : "");
        setIm050995(im01.equals("1") ? this.im050995 : "");

        setIm0509dd(im01.equals("1") ? this.im0509dd : "");
        setIm0509mm(im01.equals("1") ? this.im0509mm : "");
        setIm0509yy(im01.equals("1") ? this.im0509yy : "");
        setIm050998(im01.equals("1") ?  this.im050998 : "");
        setIm051095(im01.equals("1") ? this.im051095 : "");

        setIm0510dd(im01.equals("1") ? this.im0510dd : "");
        setIm0510mm(im01.equals("1") ? this.im0510mm : "");
        setIm0510yy(im01.equals("1") ? this.im0510yy : "");
        setIm051098(im01.equals("1") ?  this.im051098 : "");



        // at 14 weeks
        setIm0511dd(im01.equals("1") ? this.im0511dd : "");
        setIm0511mm(im01.equals("1") ? this.im0511mm : "");
        setIm0511yy(im01.equals("1") ? this.im0511yy : "");
        setIm051198(im01.equals("1") ?  this.im051198 : "");
        setIm051295(im01.equals("1") ? this.im051295 : "");

        setIm0512dd(im01.equals("1") ? this.im0512dd : "");
        setIm0512mm(im01.equals("1") ? this.im0512mm : "");
        setIm0512yy(im01.equals("1") ? this.im0512yy : "");
        setIm051298(im01.equals("1") ?  this.im051298 : "");
        setIm051395(im01.equals("1") ? this.im051395 : "");

        setIm0513dd(im01.equals("1") ? this.im0513dd : "");
        setIm0513mm(im01.equals("1") ? this.im0513mm : "");
        setIm0513yy(im01.equals("1") ? this.im0513yy : "");
        setIm051398(im01.equals("1") ?  this.im051398 : "");
        setIm051495(im01.equals("1") ? this.im051495 : "");

        setIm0514dd(im01.equals("1") ? this.im0514dd : "");
        setIm0514mm(im01.equals("1") ? this.im0514mm : "");
        setIm0514yy(im01.equals("1") ? this.im0514yy : "");
        setIm051498(im01.equals("1") ?  this.im051498 : "");


        // at 9 months
        setIm0515dd(im01.equals("1") ? this.im0515dd : "");
        setIm0515mm(im01.equals("1") ? this.im0515mm : "");
        setIm0515yy(im01.equals("1") ? this.im0515yy : "");
        setIm051598(im01.equals("1") ?  this.im051598 : "");
        setIm051795(im01.equals("1") ? this.im051795 : "");

        setIm0516dd(im01.equals("1") ? this.im0516dd : "");
        setIm0516mm(im01.equals("1") ? this.im0516mm : "");
        setIm0516yy(im01.equals("1") ? this.im0516yy : "");
        setIm051698(im01.equals("1") ?  this.im051698 : "");


        // at 15 months
        setIm0517dd(im01.equals("1") ? this.im0517dd : "");
        setIm0517mm(im01.equals("1") ? this.im0517mm : "");
        setIm0517yy(im01.equals("1") ? this.im0517yy : "");
        setIm051798(im01.equals("1") ?  this.im051798 : "");


        //setIm07(im01.equals("1") ? this.im07 : "");


        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;

        setTrueAgeInMonths(this.ageInMonths);

        // SEEN
        setIm04dd(im02.equals("1") ? this.im04dd : "");
        setIm04mm(im02.equals("1") ? this.im04mm : "");
        setIm04yy(im02.equals("1") ? this.im04yy : "");

        // NOT SEEN
        setIm02a(im02.equals("3") ? this.im02a : "");
        setIm08(im02.equals("3") ? this.im08 : "");



        // at birth
        setIm0501dd(im02.equals("1") ? this.im0501dd : "");
        setIm0501mm(im02.equals("1") ? this.im0501mm : "");
        setIm0501yy(im02.equals("1") ? this.im0501yy : "");
        setIm050198(im02.equals("1") ? this.im050198 : "");
        setIm050295(im02.equals("1") ? this.im050295 : "");

        setIm0502dd(im02.equals("1") ? this.im0502dd : "");
        setIm0502mm(im02.equals("1") ? this.im0502mm : "");
        setIm0502yy(im02.equals("1") ? this.im0502yy : "");
        setIm050298(im02.equals("1") ? this.im050298 : "");
        setIm0510a95(im02.equals("1") ? this.im0510a95 : "");

        setIm0510add(im02.equals("1") ? this.im0510add : "");
        setIm0510amm(im02.equals("1") ? this.im0510amm : "");
        setIm0510ayy(im02.equals("1") ? this.im0510ayy : "");
        setIm0510a98(im02.equals("1") ?  this.im0510a98 : "");


        // at 6 weeks
        setIm0503dd(im02.equals("1") ? this.im0503dd : "");
        setIm0503mm(im02.equals("1") ? this.im0503mm : "");
        setIm0503yy(im02.equals("1") ? this.im0503yy : "");
        setIm050398(im02.equals("1") ?  this.im050398 : "");
        setIm050495(im02.equals("1") ? this.im050495 : "");

        setIm0504dd(im02.equals("1") ? this.im0504dd : "");
        setIm0504mm(im02.equals("1") ? this.im0504mm : "");
        setIm0504yy(im02.equals("1") ? this.im0504yy : "");
        setIm050498(im02.equals("1") ?  this.im050498 : "");
        setIm050595(im02.equals("1") ? this.im050595 : "");

        setIm0505dd(im02.equals("1") ? this.im0505dd : "");
        setIm0505mm(im02.equals("1") ? this.im0505mm : "");
        setIm0505yy(im02.equals("1") ? this.im0505yy : "");
        setIm050598(im02.equals("1") ?  this.im050598 : "");
        setIm050695(im02.equals("1") ? this.im050695 : "");

        setIm0506dd(im02.equals("1") ? this.im0506dd : "");
        setIm0506mm(im02.equals("1") ? this.im0506mm : "");
        setIm0506yy(im02.equals("1") ? this.im0506yy : "");
        setIm050698(im02.equals("1") ?  this.im050698 : "");


        // at 10 weeks
        setIm0507dd(im02.equals("1") ? this.im0507dd : "");
        setIm0507mm(im02.equals("1") ? this.im0507mm : "");
        setIm0507yy(im02.equals("1") ? this.im0507yy : "");
        setIm050798(im02.equals("1") ?  this.im050798 : "");
        setIm050895(im02.equals("1") ? this.im050895 : "");

        setIm0508dd(im02.equals("1") ? this.im0508dd : "");
        setIm0508mm(im02.equals("1") ? this.im0508mm : "");
        setIm0508yy(im02.equals("1") ? this.im0508yy : "");
        setIm050898(im02.equals("1") ?  this.im050898 : "");
        setIm050995(im02.equals("1") ? this.im050995 : "");

        setIm0509dd(im02.equals("1") ? this.im0509dd : "");
        setIm0509mm(im02.equals("1") ? this.im0509mm : "");
        setIm0509yy(im02.equals("1") ? this.im0509yy : "");
        setIm050998(im02.equals("1") ?  this.im050998 : "");
        setIm051095(im02.equals("1") ? this.im051095 : "");

        setIm0510dd(im02.equals("1") ? this.im0510dd : "");
        setIm0510mm(im02.equals("1") ? this.im0510mm : "");
        setIm0510yy(im02.equals("1") ? this.im0510yy : "");
        setIm051098(im02.equals("1") ?  this.im051098 : "");



        // at 14 weeks
        setIm0511dd(im02.equals("1") ? this.im0511dd : "");
        setIm0511mm(im02.equals("1") ? this.im0511mm : "");
        setIm0511yy(im02.equals("1") ? this.im0511yy : "");
        setIm051198(im02.equals("1") ?  this.im051198 : "");
        setIm051295(im02.equals("1") ? this.im051295 : "");

        setIm0512dd(im02.equals("1") ? this.im0512dd : "");
        setIm0512mm(im02.equals("1") ? this.im0512mm : "");
        setIm0512yy(im02.equals("1") ? this.im0512yy : "");
        setIm051298(im02.equals("1") ?  this.im051298 : "");
        setIm051395(im02.equals("1") ? this.im051395 : "");

        setIm0513dd(im02.equals("1") ? this.im0513dd : "");
        setIm0513mm(im02.equals("1") ? this.im0513mm : "");
        setIm0513yy(im02.equals("1") ? this.im0513yy : "");
        setIm051398(im02.equals("1") ?  this.im051398 : "");
        setIm051495(im02.equals("1") ? this.im051495 : "");

        setIm0514dd(im02.equals("1") ? this.im0514dd : "");
        setIm0514mm(im02.equals("1") ? this.im0514mm : "");
        setIm0514yy(im02.equals("1") ? this.im0514yy : "");
        setIm051498(im02.equals("1") ?  this.im051498 : "");


        // at 9 months
        setIm0515dd(im02.equals("1") ? this.im0515dd : "");
        setIm0515mm(im02.equals("1") ? this.im0515mm : "");
        setIm0515yy(im02.equals("1") ? this.im0515yy : "");
        setIm051598(im02.equals("1") ?  this.im051598 : "");
        setIm051795(im02.equals("1") ? this.im051795 : "");

        setIm0516dd(im02.equals("1") ? this.im0516dd : "");
        setIm0516mm(im02.equals("1") ? this.im0516mm : "");
        setIm0516yy(im02.equals("1") ? this.im0516yy : "");
        setIm051698(im02.equals("1") ?  this.im051698 : "");

        // at 15 months
        setIm0517dd(im02.equals("1") ? this.im0517dd : "");
        setIm0517mm(im02.equals("1") ? this.im0517mm : "");
        setIm0517yy(im02.equals("1") ? this.im0517yy : "");
        setIm051798(im02.equals("1") ?  this.im051798 : "");

        setIm08(im02.equals("1") ? "" : this.im08);
        setIm09(im02.equals("1") ? "" : this.im09);
        setIm10(im02.equals("1") ? "" : this.im10);
        setIm10a(im02.equals("1") ? "" : this.im10a);
        setIm11(im02.equals("1") ? "" : this.im11);
        setIm12(im02.equals("1") ? "" : this.im12);
        setIm12a(im02.equals("1") ? "" : this.im12a);
        setIm14(im02.equals("1") ? "" : this.im14);
        setIm15(im02.equals("1") ? "" : this.im15);
        setIm16(im02.equals("1") ? "" : this.im16);
        setIm17(im02.equals("1") ? "" : this.im17);
        setIm18(im02.equals("1") ? "" : this.im18);
        setIm19(im02.equals("1") ? "" : this.im19);
        setIm20(im02.equals("1") ? "" : this.im20);
        //setIm20a(im02.equals("1") ? "" : this.im20a);

        setIm21(im02.equals("1") ? "" : this.im21);
        //setIm22(im02.equals("1") ? "" : this.im22);
        setIm22a(im02.equals("1") ? "" : this.im22a);
        setIm23(im02.equals("1") || this.im08.equals("1") ? this.im23 : "");
        setIm23a(im02.equals("1") || this.im08.equals("1") ? this.im23a : "");
        setIm24(im02.equals("1") ? "" : this.im24);


        //setIm07(im02.equals("1") ? this.im07 : "");

        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm02a() {
        return im02a;
    }

    public void setIm02a(String im02a) {
        this.im02a = im02a;
        setIm02a96x(im02a.equals("96") ? this.im02a96x : "");
        /*final boolean b = im02a.equals("1") || im02a.equals("2") || im02a.equals("3") || im02a.equals("96");

        setIm03(b ? "" : this.im03);
        setIm04dd(b ? "" : this.im04dd);
        setIm04mm(b ? "" : this.im04mm);
        setIm04yy(b ? "" : this.im04yy);
        setIm07(b ? "" : this.im07);
*/
        notifyPropertyChanged(BR.im02a);
    }

    @Bindable
    public String getIm02a96x() {
        return im02a96x;
    }

    public void setIm02a96x(String im02a96x) {
        this.im02a96x = im02a96x;
        notifyPropertyChanged(BR.im02a96x);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        setIm0396x(im03.equals("96") ? this.im0396x : "");
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
        notifyPropertyChanged(BR.im0396x);
    }

    @Bindable
    public String getIm04dd() {
        return im04dd;
    }

    public void setIm04dd(String im04dd) {
        this.im04dd = im04dd;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04dd);
    }

    @Bindable
    public String getIm04mm() {
        return im04mm;
    }

    public void setIm04mm(String im04mm) {
        this.im04mm = im04mm;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04mm);
    }

    @Bindable
    public String getIm04yy() {
        return im04yy;
    }

    public void setIm04yy(String im04yy) {
        this.im04yy = im04yy;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04yy);
    }

    @Bindable
    public String getIm0497() {
        return im0497;
    }

    public void setIm0497(String im0497) {
        if (this.im0497.equals(im0497)) return;
        this.im0497 = im0497;
        setTrueAgeInMonths(im0497.equals("97") ? this.ageInMonths : -1);
        setIm04dd(im0497.equals("97") ? "" : this.im04dd);
        setIm04mm(im0497.equals("97") ? "" : this.im04mm);
        setIm04yy(im0497.equals("97") ? "" : this.im04yy);
        notifyPropertyChanged(BR.im0497);
    }

    @Bindable
    public String getBackfilename() {
        return backfilename;
    }

    public void setBackfilename(String backfilename) {
        if (this.backfilename.equals(backfilename)) return;
        this.backfilename = backfilename;

        notifyPropertyChanged(BR.backfilename);
    }

    @Bindable
    public String getFrontfilename() {
        return frontfilename;
    }

    public void setFrontfilename(String frontfilename) {
        if (this.frontfilename.equals(frontfilename)) return;
        this.frontfilename = frontfilename;

        notifyPropertyChanged(BR.frontfilename);
    }

    @Bindable
    public String getIm0501dd() {
        return im0501dd;
    }

    public void setIm0501dd(String im0501dd) {
        this.im0501dd = im0501dd;
        boolean b = im0501dd.length() > 0 && Integer.parseInt(im0501dd) > 31;
        setIm0501mm(b ? "" : this.im0501mm);
        setIm0501yy(b ? "" : this.im0501yy);
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501dd);
    }

    @Bindable
    public String getIm0501mm() {
        return im0501mm;
    }

    public void setIm0501mm(String im0501mm) {
        this.im0501mm = im0501mm;
        boolean b = im0501mm.length() > 0 && Integer.parseInt(im0501mm) > 12;
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501mm);
    }

    @Bindable
    public String getIm0501yy() {
        return im0501yy;
    }

    public void setIm0501yy(String im0501yy) {
        this.im0501yy = im0501yy;
        boolean b = im0501yy.length() > 0;
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501yy);
    }

    @Bindable
    public String getIm0502dd() {
        return im0502dd;
    }

    public void setIm0502dd(String im0502dd) {
        this.im0502dd = im0502dd;
        boolean b = im0502dd.length() > 0 && Integer.parseInt(im0502dd) > 31;
        setIm0502mm(b ? "" : this.im0502mm);
        setIm0502yy(b ? "" : this.im0502yy);
        notifyPropertyChanged(BR.im0502dd);
    }

    @Bindable
    public String getIm0502mm() {
        return im0502mm;
    }

    public void setIm0502mm(String im0502mm) {
        this.im0502mm = im0502mm;
        notifyPropertyChanged(BR.im0502mm);
    }

    @Bindable
    public String getIm0502yy() {
        return im0502yy;
    }

    public void setIm0502yy(String im0502yy) {
        this.im0502yy = im0502yy;
        notifyPropertyChanged(BR.im0502yy);
    }

    @Bindable
    public String getIm0503dd() {
        return im0503dd;
    }

    public void setIm0503dd(String im0503dd) {
        this.im0503dd = im0503dd;
        boolean b = im0503dd.length() > 0 && Integer.parseInt(im0503dd) > 31;
        setIm0503mm(b ? "" : this.im0503mm);
        setIm0503yy(b ? "" : this.im0503yy);
        setIm050495(b ? "" : this.im050495);
        notifyPropertyChanged(BR.im0503dd);
    }

    @Bindable
    public String getIm0503mm() {
        return im0503mm;
    }

    public void setIm0503mm(String im0503mm) {
        this.im0503mm = im0503mm;
        notifyPropertyChanged(BR.im0503mm);
    }

    @Bindable
    public String getIm0503yy() {
        return im0503yy;
    }

    public void setIm0503yy(String im0503yy) {
        this.im0503yy = im0503yy;
        notifyPropertyChanged(BR.im0503yy);
    }

    @Bindable
    public String getIm0504dd() {
        return im0504dd;
    }

    public void setIm0504dd(String im0504dd) {
        this.im0504dd = im0504dd;
        boolean b = im0504dd.length() > 0 && Integer.parseInt(im0504dd) > 31;
        setIm0504mm(b ? "" : this.im0504mm);
        setIm0504yy(b ? "" : this.im0504yy);
        notifyPropertyChanged(BR.im0504dd);
    }

    @Bindable
    public String getIm0504mm() {
        return im0504mm;
    }

    public void setIm0504mm(String im0504mm) {
        this.im0504mm = im0504mm;
        notifyPropertyChanged(BR.im0504mm);
    }

    @Bindable
    public String getIm0504yy() {
        return im0504yy;
    }

    public void setIm0504yy(String im0504yy) {
        this.im0504yy = im0504yy;
        notifyPropertyChanged(BR.im0504yy);
    }

    @Bindable
    public String getIm0505dd() {
        return im0505dd;
    }

    public void setIm0505dd(String im0505dd) {
        this.im0505dd = im0505dd;
        boolean b = im0505dd.length() > 0 && Integer.parseInt(im0505dd) > 31;
        setIm0505mm(b ? "" : this.im0505mm);
        setIm0505yy(b ? "" : this.im0505yy);
        notifyPropertyChanged(BR.im0505dd);
    }

    @Bindable
    public String getIm0505mm() {
        return im0505mm;
    }

    public void setIm0505mm(String im0505mm) {
        this.im0505mm = im0505mm;
        notifyPropertyChanged(BR.im0505mm);
    }

    @Bindable
    public String getIm0505yy() {
        return im0505yy;
    }

    public void setIm0505yy(String im0505yy) {
        this.im0505yy = im0505yy;
        notifyPropertyChanged(BR.im0505yy);
    }

    @Bindable
    public String getIm0506dd() {
        return im0506dd;
    }

    public void setIm0506dd(String im0506dd) {
        this.im0506dd = im0506dd;
        boolean b = im0506dd.length() > 0 && Integer.parseInt(im0506dd) > 31;
        setIm0506mm(b ? "" : this.im0506mm);
        setIm0506yy(b ? "" : this.im0506yy);
        notifyPropertyChanged(BR.im0506dd);
    }

    @Bindable
    public String getIm0506mm() {
        return im0506mm;
    }

    public void setIm0506mm(String im0506mm) {
        this.im0506mm = im0506mm;
        notifyPropertyChanged(BR.im0506mm);
    }

    @Bindable
    public String getIm0506yy() {
        return im0506yy;
    }

    public void setIm0506yy(String im0506yy) {
        this.im0506yy = im0506yy;
        notifyPropertyChanged(BR.im0506yy);
    }

    @Bindable
    public String getIm0507dd() {
        return im0507dd;
    }

    public void setIm0507dd(String im0507dd) {
        this.im0507dd = im0507dd;
        boolean b = im0507dd.length() > 0 && Integer.parseInt(im0507dd) > 31;
        setIm0507mm(b ? "" : this.im0507mm);
        setIm0507yy(b ? "" : this.im0507yy);
        notifyPropertyChanged(BR.im0507dd);
    }

    @Bindable
    public String getIm0507mm() {
        return im0507mm;
    }

    public void setIm0507mm(String im0507mm) {
        this.im0507mm = im0507mm;
        notifyPropertyChanged(BR.im0507mm);
    }

    @Bindable
    public String getIm0507yy() {
        return im0507yy;
    }

    public void setIm0507yy(String im0507yy) {
        this.im0507yy = im0507yy;
        notifyPropertyChanged(BR.im0507yy);
    }

    @Bindable
    public String getIm0508dd() {
        return im0508dd;
    }

    public void setIm0508dd(String im0508dd) {
        this.im0508dd = im0508dd;
        boolean b = im0508dd.length() > 0 && Integer.parseInt(im0508dd) > 31;
        setIm0508mm(b ? "" : this.im0508mm);
        setIm0508yy(b ? "" : this.im0508yy);
        notifyPropertyChanged(BR.im0508dd);
    }

    @Bindable
    public String getIm0508mm() {
        return im0508mm;
    }

    public void setIm0508mm(String im0508mm) {
        this.im0508mm = im0508mm;
        notifyPropertyChanged(BR.im0508mm);
    }

    @Bindable
    public String getIm0508yy() {
        return im0508yy;
    }

    public void setIm0508yy(String im0508yy) {
        this.im0508yy = im0508yy;
        notifyPropertyChanged(BR.im0508yy);
    }

    @Bindable
    public String getIm0509dd() {
        return im0509dd;
    }

    public void setIm0509dd(String im0509dd) {
        this.im0509dd = im0509dd;
        boolean b = im0509dd.length() > 0 && Integer.parseInt(im0509dd) > 31;
        setIm0509mm(b ? "" : this.im0509mm);
        setIm0509yy(b ? "" : this.im0509yy);
        notifyPropertyChanged(BR.im0509dd);
    }

    @Bindable
    public String getIm0509mm() {
        return im0509mm;
    }

    public void setIm0509mm(String im0509mm) {
        this.im0509mm = im0509mm;
        notifyPropertyChanged(BR.im0509mm);
    }

    @Bindable
    public String getIm0509yy() {
        return im0509yy;
    }

    public void setIm0509yy(String im0509yy) {
        this.im0509yy = im0509yy;
        notifyPropertyChanged(BR.im0509yy);
    }

    @Bindable
    public String getIm0510dd() {
        return im0510dd;
    }

    public void setIm0510dd(String im0510dd) {
        this.im0510dd = im0510dd;
        boolean b = im0510dd.length() > 0 && Integer.parseInt(im0510dd) > 31;
        setIm0510mm(b ? "" : this.im0510mm);
        setIm0510yy(b ? "" : this.im0510yy);
        notifyPropertyChanged(BR.im0510dd);
    }

    @Bindable
    public String getIm0510mm() {
        return im0510mm;
    }

    public void setIm0510mm(String im0510mm) {
        this.im0510mm = im0510mm;
        notifyPropertyChanged(BR.im0510mm);
    }

    @Bindable
    public String getIm0510yy() {
        return im0510yy;
    }

    public void setIm0510yy(String im0510yy) {
        this.im0510yy = im0510yy;
        notifyPropertyChanged(BR.im0510yy);
    }

    @Bindable
    public String getIm0510add() {
        return im0510add;
    }

    public void setIm0510add(String im0510add) {
        this.im0510add = im0510add;
        boolean b = im0510add.length() > 0 && Integer.parseInt(im0510add) > 31;
        setIm0510amm(b ? "" : this.im0510amm);
        setIm0510ayy(b ? "" : this.im0510ayy);
        notifyPropertyChanged(BR.im0510add);
    }

    @Bindable
    public String getIm0510amm() {
        return im0510amm;
    }

    public void setIm0510amm(String im0510amm) {
        this.im0510amm = im0510amm;
        notifyPropertyChanged(BR.im0510amm);
    }

    @Bindable
    public String getIm0510ayy() {
        return im0510ayy;
    }

    public void setIm0510ayy(String im0510ayy) {
        this.im0510ayy = im0510ayy;
        notifyPropertyChanged(BR.im0510ayy);
    }

    @Bindable
    public String getIm0511dd() {
        return im0511dd;
    }

    public void setIm0511dd(String im0511dd) {
        this.im0511dd = im0511dd;
        boolean b = im0511dd.length() > 0 && Integer.parseInt(im0511dd) > 31;
        setIm0511mm(b ? "" : this.im0511mm);
        setIm0511yy(b ? "" : this.im0511yy);
        notifyPropertyChanged(BR.im0511dd);
    }

    @Bindable
    public String getIm0511mm() {
        return im0511mm;
    }

    public void setIm0511mm(String im0511mm) {
        this.im0511mm = im0511mm;
        notifyPropertyChanged(BR.im0511mm);
    }

    @Bindable
    public String getIm0511yy() {
        return im0511yy;
    }

    public void setIm0511yy(String im0511yy) {
        this.im0511yy = im0511yy;
        notifyPropertyChanged(BR.im0511yy);
    }

    @Bindable
    public String getIm0512dd() {
        return im0512dd;
    }

    public void setIm0512dd(String im0512dd) {
        this.im0512dd = im0512dd;
        boolean b = im0512dd.length() > 0 && Integer.parseInt(im0512dd) > 31;
        setIm0512mm(b ? "" : this.im0512mm);
        setIm0512yy(b ? "" : this.im0512yy);
        notifyPropertyChanged(BR.im0512dd);
    }

    @Bindable
    public String getIm0512mm() {
        return im0512mm;
    }

    public void setIm0512mm(String im0512mm) {
        this.im0512mm = im0512mm;
        notifyPropertyChanged(BR.im0512mm);
    }

    @Bindable
    public String getIm0512yy() {
        return im0512yy;
    }

    public void setIm0512yy(String im0512yy) {
        this.im0512yy = im0512yy;
        notifyPropertyChanged(BR.im0512yy);
    }

    @Bindable
    public String getIm0513dd() {
        return im0513dd;
    }

    public void setIm0513dd(String im0513dd) {
        this.im0513dd = im0513dd;
        boolean b = im0513dd.length() > 0 && Integer.parseInt(im0513dd) > 31;
        setIm0513mm(b ? "" : this.im0513mm);
        setIm0513yy(b ? "" : this.im0513yy);
        notifyPropertyChanged(BR.im0513dd);
    }

    @Bindable
    public String getIm0513mm() {
        return im0513mm;
    }

    public void setIm0513mm(String im0513mm) {
        this.im0513mm = im0513mm;
        notifyPropertyChanged(BR.im0513mm);
    }

    @Bindable
    public String getIm0513yy() {
        return im0513yy;
    }

    public void setIm0513yy(String im0513yy) {
        this.im0513yy = im0513yy;
        notifyPropertyChanged(BR.im0513yy);
    }

    @Bindable
    public String getIm0514dd() {
        return im0514dd;
    }

    public void setIm0514dd(String im0514dd) {
        this.im0514dd = im0514dd;
        boolean b = im0514dd.length() > 0 && Integer.parseInt(im0514dd) > 31;
        setIm0514mm(b ? "" : this.im0514mm);
        setIm0514yy(b ? "" : this.im0514yy);
        notifyPropertyChanged(BR.im0514dd);
    }

    @Bindable
    public String getIm0514mm() {
        return im0514mm;
    }

    public void setIm0514mm(String im0514mm) {
        this.im0514mm = im0514mm;
        notifyPropertyChanged(BR.im0514mm);
    }

    @Bindable
    public String getIm0514yy() {
        return im0514yy;
    }

    public void setIm0514yy(String im0514yy) {
        this.im0514yy = im0514yy;
        notifyPropertyChanged(BR.im0514yy);
    }

    @Bindable
    public String getIm0515dd() {
        return im0515dd;
    }

    public void setIm0515dd(String im0515dd) {
        this.im0515dd = im0515dd;
        boolean b = im0515dd.length() > 0 && Integer.parseInt(im0515dd) > 31;
        setIm0515mm(b ? "" : this.im0515mm);
        setIm0515yy(b ? "" : this.im0515yy);
        notifyPropertyChanged(BR.im0515dd);
    }

    @Bindable
    public String getIm0515mm() {
        return im0515mm;
    }

    public void setIm0515mm(String im0515mm) {
        this.im0515mm = im0515mm;
        notifyPropertyChanged(BR.im0515mm);
    }

    @Bindable
    public String getIm0515yy() {
        return im0515yy;
    }

    public void setIm0515yy(String im0515yy) {
        this.im0515yy = im0515yy;
        notifyPropertyChanged(BR.im0515yy);
    }

    @Bindable
    public String getIm0515bdd() {
        return im0515bdd;
    }

    public void setIm0515bdd(String im0515bdd) {
        this.im0515bdd = im0515bdd;
        boolean b = im0515bdd.length() > 0 && Integer.parseInt(im0515bdd) > 31;
        setIm0515bmm(b ? "" : this.im0515bmm);
        setIm0515byy(b ? "" : this.im0515byy);
        notifyPropertyChanged(BR.im0515bdd);
    }

    @Bindable
    public String getIm0515bmm() {
        return im0515bmm;
    }

    public void setIm0515bmm(String im0515bmm) {
        this.im0515bmm = im0515bmm;
        notifyPropertyChanged(BR.im0515bmm);
    }

    @Bindable
    public String getIm0515byy() {
        return im0515byy;
    }

    public void setIm0515byy(String im0515byy) {
        this.im0515byy = im0515byy;
        notifyPropertyChanged(BR.im0515byy);
    }

    @Bindable
    public String getIm0516dd() {
        return im0516dd;
    }

    public void setIm0516dd(String im0516dd) {
        this.im0516dd = im0516dd;
        boolean b = im0516dd.length() > 0 && Integer.parseInt(im0516dd) > 31;
        setIm0516mm(b ? "" : this.im0516mm);
        setIm0516yy(b ? "" : this.im0516yy);
        notifyPropertyChanged(BR.im0516dd);
    }

    @Bindable
    public String getIm0516mm() {
        return im0516mm;
    }

    public void setIm0516mm(String im0516mm) {
        this.im0516mm = im0516mm;
        notifyPropertyChanged(BR.im0516mm);
    }

    @Bindable
    public String getIm0516yy() {
        return im0516yy;
    }

    public void setIm0516yy(String im0516yy) {
        this.im0516yy = im0516yy;
        notifyPropertyChanged(BR.im0516yy);
    }

    @Bindable
    public String getIm0517dd() {
        return im0517dd;
    }

    public void setIm0517dd(String im0517dd) {
        this.im0517dd = im0517dd;
        boolean b = im0517dd.length() > 0 && Integer.parseInt(im0517dd) > 31;
        setIm0517mm(b ? "" : this.im0517mm);
        setIm0517yy(b ? "" : this.im0517yy);
        notifyPropertyChanged(BR.im0517dd);
    }

    @Bindable
    public String getIm0517mm() {
        return im0517mm;
    }

    public void setIm0517mm(String im0517mm) {
        this.im0517mm = im0517mm;
        notifyPropertyChanged(BR.im0517mm);
    }

    @Bindable
    public String getIm0517yy() {
        return im0517yy;
    }

    public void setIm0517yy(String im0517yy) {
        this.im0517yy = im0517yy;
        notifyPropertyChanged(BR.im0517yy);
    }

    /*@Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }*/

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;

        setIm09(im08.equals("1") ? this.im09 : "");
        setIm10(im08.equals("1") ? this.im10 : "");
        setIm24(im08.equals("2") || im08.equals("98") ? this.im24 : "");
        setIm24a(im08.equals("2") || im08.equals("98") ? this.im24a : "");




      /*  setIm10a(im08.equals("1") ? this.im10a : "");
        setIm11(im08.equals("1") ? this.im11 : "");
        setIm12(im08.equals("1") ? this.im12 : "");
        setIm12a(im08.equals("1") ? this.im12a : "");
        setIm14(im08.equals("1") ? this.im14 : "");
        setIm15(im08.equals("1") ? this.im15 : "");
        setIm16(im08.equals("1") ? this.im16 : "");
        setIm17(im08.equals("1") ? this.im17 : "");
        setIm18(im08.equals("1") ? this.im18 : "");
        setIm19(im08.equals("1") ? this.im19 : "");
        setIm20(im08.equals("1") ? this.im20 : "");
        //setIm20a(im08.equals("1") ? this.im20a : "");

        setIm21(im08.equals("1") ? this.im21 : "");
        setIm22(im08.equals("1") ? this.im22 : "");
        setIm22a(im08.equals("1") ? this.im22a : "");
        setIm23(im08.equals("1") || this.im02.equals("1") ? this.im23 : "");
        setIm23a(im08.equals("1") || this.im02.equals("1") ? this.im23a : "");*/

        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        setIm11(im10.equals("1") ? this.im11 : "");
        setIm12(im10.equals("1") ? this.im12 : "");
        setIm10a(im10.equals("2") ? this.im10a : "");
        setIm14(im10.equals("1") ? this.im14 : "");
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm10a() {
        return im10a;
    }

    public void setIm10a(String im10a) {
        this.im10a = im10a;
        notifyPropertyChanged(BR.im10a);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        setIm12(im11.equals("1") ? this.im12 : "");
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm12a() {
        return im12a;
    }

    public void setIm12a(String im12a) {
        this.im12a = im12a;
        notifyPropertyChanged(BR.im12a);
    }

    @Bindable
    public String getIm12a98() {
        return im12a98;
    }

    public void setIm12a98(String im12a98) {
        if (this.im12a98.equals(im12a98)) return;
        this.im12a98 = im12a98;
        setIm12a(im12a98.equals("98") ? "" : this.im12a);
        notifyPropertyChanged(BR.im12a98);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        setIm15(im14.equals("1") ? this.im15 : "");
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        setIm17(im16.equals("1") ? this.im17 : "");
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        setIm19(im18.equals("1") ? this.im19 : "");
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        setIm20a(im20.equals("1") ? this.im20a : "");
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm20a() {
        return im20a;
    }

    public void setIm20a(String im20a) {
        this.im20a = im20a;
        notifyPropertyChanged(BR.im20a);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        setIm22(im21.equals("1") ? this.im22 : "");

        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm22a() {
        return im22a;
    }

    public void setIm22a(String im22a) {
        this.im22a = im22a;
        notifyPropertyChanged(BR.im22a);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm236x() {
        return im236x;
    }

    public void setIm236x(String im236x) {
        this.im236x = im236x;
        notifyPropertyChanged(BR.im236x);
    }

    @Bindable
    public String getIm23a() {
        return im23a;
    }

    public void setIm23a(String im23a) {
        this.im23a = im23a;
        notifyPropertyChanged(BR.im23a);
    }

    @Bindable
    public String getIm23b_1() {
        return im23b_1;
    }

    public void setIm23b_1(String im23b_1) {
        this.im23b_1 = im23b_1;
        notifyPropertyChanged(BR.im23b_1);
    }

    @Bindable
    public String getIm23b_2() {
        return im23b_2;
    }

    public void setIm23b_2(String im23b_2) {
        this.im23b_2 = im23b_2;
        notifyPropertyChanged(BR.im23b_2);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2417x() {
        return im2417x;
    }

    public void setIm2417x(String im2417x) {
        this.im2417x = im2417x;
        notifyPropertyChanged(BR.im2417x);
    }

    @Bindable
    public String getIm24a() {
        return im24a;
    }

    public void setIm24a(String im24a) {
        this.im24a = im24a;
      /*  setIm24b(im24a.equals("1") ? this.im24b : "");
        setIm24b98(im24b.equals("1") ? this.im24b98 : "");*/
        setIm24c(im24a.equals("1") ? this.im24c : "");
        setIm25(im24a.equals("2") ? this.im25 : "");
        //setIm26(im24a.equals("2") ? this.im26 : "");
        /* setIm24d(im24a.equals("1") ? this.im24d : "");*/
        notifyPropertyChanged(BR.im24a);
    }

     @Bindable
     public String getIm24b() {
         return im24b;
     }

     public void setIm24b(String im24b) {
         this.im24b = im24b;
         notifyPropertyChanged(BR.im24b);
     }

     @Bindable
     public String getIm24b98() {
         return im24b98;
     }

     public void setIm24b98(String im24b98) {
         if (this.im24b98.equals(im24b98)) return;
         this.im24b98 = im24b98;
         setIm24b(im24b98.equals("98") ? "" : this.im24b);
         notifyPropertyChanged(BR.im24b98);
     }

    @Bindable
    public String getIm24c() {
        return im24c;
    }

    public void setIm24c(String im24c) {
        this.im24c = im24c;
        notifyPropertyChanged(BR.im24c);
    }

    /* @Bindable
     public String getIm24d() {
         return im24d;
     }

     public void setIm24d(String im24d) {
         this.im24d = im24d;
         notifyPropertyChanged(BR.im24d);
     }
 */
    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm29() {
        return im29;
    }

    public void setIm29(String im29) {
        this.im29 = im29;
        notifyPropertyChanged(BR.im29);
    }

    @Bindable
    public String getIm30() {
        return im30;
    }

    public void setIm30(String im30) {
        this.im30 = im30;
        notifyPropertyChanged(BR.im30);
    }

    @Bindable
    public String getIm30_96x() {
        return im30_96x;
    }

    public void setIm30_96x(String im30_96x) {
        this.im30_96x = im30_96x;
        notifyPropertyChanged(BR.im30_96x);
    }

    /* @Bindable
            public String getIm26() {
                return im26;
            }

            public void setIm26(String im26) {
                this.im26 = im26;
                notifyPropertyChanged(BR.im26);
            }
        */
    @Bindable
    public String getIm050198() {
        return im050198;
    }

    public void setIm050198(String im050198) {
        this.im050198 = im050198;
        /*setIm0501dd(im050198.equals("98") ? "" : this.im0501dd);
        setIm0501mm(im050198.equals("98") ? "" : this.im0501mm);
        setIm0501yy(im050198.equals("98") ? "" : this.im0501yy);*/
        notifyPropertyChanged(BR.im050198);
    }

    @Bindable
    public String getIm050298() {
        return im050298;
    }

    public void setIm050298(String im050298) {
        this.im050298 = im050298;
        /*setIm0502dd(im050298.equals("98") ? "" : this.im0502dd);
        setIm0502mm(im050298.equals("98") ? "" : this.im0502mm);
        setIm0502yy(im050298.equals("98") ? "" : this.im0502yy);*/
        notifyPropertyChanged(BR.im050298);
    }

    @Bindable
    public String getIm050398() {
        return im050398;
    }

    public void setIm050398(String im050398) {
        this.im050398 = im050398;
        /*setIm0503dd(im050398.equals("98") ? "" : this.im0503dd);
        setIm0503mm(im050398.equals("98") ? "" : this.im0503mm);
        setIm0503yy(im050398.equals("98") ? "" : this.im0503yy);*/
        notifyPropertyChanged(BR.im050398);
    }

    @Bindable
    public String getIm050498() {
        return im050498;
    }

    public void setIm050498(String im050498) {
        this.im050498 = im050498;
        /*setIm0504dd(im050498.equals("98") ? "" : this.im0504dd);
        setIm0504mm(im050498.equals("98") ? "" : this.im0504mm);
        setIm0504yy(im050498.equals("98") ? "" : this.im0504yy);*/
        notifyPropertyChanged(BR.im050498);
    }

    @Bindable
    public String getIm050598() {
        return im050598;
    }

    public void setIm050598(String im050598) {
        this.im050598 = im050598;
        /*setIm0505dd(im050598.equals("98") ? "" : this.im0505dd);
        setIm0505mm(im050598.equals("98") ? "" : this.im0505mm);
        setIm0505yy(im050598.equals("98") ? "" : this.im0505yy);*/
        notifyPropertyChanged(BR.im050598);
    }

    @Bindable
    public String getIm050698() {
        return im050698;
    }

    public void setIm050698(String im050698) {
        this.im050698 = im050698;
        /*setIm0506dd(im050698.equals("98") ? "" : this.im0506dd);
        setIm0506mm(im050698.equals("98") ? "" : this.im0506mm);
        setIm0506yy(im050698.equals("98") ? "" : this.im0506yy);*/
        notifyPropertyChanged(BR.im050698);
    }

    @Bindable
    public String getIm050798() {
        return im050798;
    }

    public void setIm050798(String im050798) {
        this.im050798 = im050798;
        /*setIm0507dd(im050798.equals("98") ? "" : this.im0507dd);
        setIm0507mm(im050798.equals("98") ? "" : this.im0507mm);
        setIm0507yy(im050798.equals("98") ? "" : this.im0507yy);*/
        notifyPropertyChanged(BR.im050798);
    }

    @Bindable
    public String getIm050898() {
        return im050898;
    }

    public void setIm050898(String im050898) {
        this.im050898 = im050898;
        /*setIm0508dd(im050898.equals("98") ? "" : this.im0508dd);
        setIm0508mm(im050898.equals("98") ? "" : this.im0508mm);
        setIm0508yy(im050898.equals("98") ? "" : this.im0508yy);*/
        notifyPropertyChanged(BR.im050898);
    }

    @Bindable
    public String getIm050998() {
        return im050998;
    }

    public void setIm050998(String im050998) {
        this.im050998 = im050998;
        /*setIm0509dd(im050998.equals("98") ? "" : this.im0509dd);
        setIm0509mm(im050998.equals("98") ? "" : this.im0509mm);
        setIm0509yy(im050998.equals("98") ? "" : this.im0509yy);*/
        notifyPropertyChanged(BR.im050998);
    }

    @Bindable
    public String getIm051098() {
        return im051098;
    }

    public void setIm051098(String im051098) {
        this.im051098 = im051098;
        /*setIm0510dd(im051098.equals("98") ? "" : this.im0510dd);
        setIm0510mm(im051098.equals("98") ? "" : this.im0510mm);
        setIm0510yy(im051098.equals("98") ? "" : this.im0510yy);*/
        notifyPropertyChanged(BR.im051098);
    }

    @Bindable
    public String getIm0510a98() {
        return im0510a98;
    }

    public void setIm0510a98(String im0510a98) {
        this.im0510a98 = im0510a98;
        /*setIm0510add(im0510a98.equals("98") ? "" : this.im0510add);
        setIm0510amm(im0510a98.equals("98") ? "" : this.im0510amm);
        setIm0510ayy(im0510a98.equals("98") ? "" : this.im0510ayy);*/
        notifyPropertyChanged(BR.im0510a98);
    }

    @Bindable
    public String getIm051198() {
        return im051198;
    }

    public void setIm051198(String im051198) {
        this.im051198 = im051198;
        /*setIm0511dd(im051198.equals("98") ? "" : this.im0511dd);
        setIm0511mm(im051198.equals("98") ? "" : this.im0511mm);
        setIm0511yy(im051198.equals("98") ? "" : this.im0511yy);*/
        notifyPropertyChanged(BR.im051198);
    }

    @Bindable
    public String getIm051298() {
        return im051298;
    }

    public void setIm051298(String im051298) {
        this.im051298 = im051298;
        /*setIm0512dd(im051298.equals("98") ? "" : this.im0512dd);
        setIm0512mm(im051298.equals("98") ? "" : this.im0512mm);
        setIm0512yy(im051298.equals("98") ? "" : this.im0512yy);*/
        notifyPropertyChanged(BR.im051298);
    }

    @Bindable
    public String getIm051398() {
        return im051398;
    }

    public void setIm051398(String im051398) {
        this.im051398 = im051398;
        /*setIm0513dd(im051398.equals("98") ? "" : this.im0513dd);
        setIm0513mm(im051398.equals("98") ? "" : this.im0513mm);
        setIm0513yy(im051398.equals("98") ? "" : this.im0513yy);*/
        notifyPropertyChanged(BR.im051398);
    }

    @Bindable
    public String getIm051498() {
        return im051498;
    }

    public void setIm051498(String im051498) {
        this.im051498 = im051498;
        /*setIm0514dd(im051498.equals("98") ? "" : this.im0514dd);
        setIm0514mm(im051498.equals("98") ? "" : this.im0514mm);
        setIm0514yy(im051498.equals("98") ? "" : this.im0514yy);*/
        notifyPropertyChanged(BR.im051498);
    }

    @Bindable
    public String getIm051598() {
        return im051598;
    }

    public void setIm051598(String im051598) {
        this.im051598 = im051598;
        /*setIm0515dd(im051598.equals("98") ? "" : this.im0515dd);
        setIm0515mm(im051598.equals("98") ? "" : this.im0515mm);
        setIm0515yy(im051598.equals("98") ? "" : this.im0515yy);*/
        notifyPropertyChanged(BR.im051598);
    }

    @Bindable
    public String getIm0515b98() {
        return im0515b98;
    }

    public void setIm0515b98(String im0515b98) {
        this.im0515b98 = im0515b98;
        /*setIm0515bdd(im0515b98.equals("98") ? "" : this.im0515bdd);
        setIm0515bmm(im0515b98.equals("98") ? "" : this.im0515bmm);
        setIm0515byy(im0515b98.equals("98") ? "" : this.im0515byy);*/
        notifyPropertyChanged(BR.im0515b98);
    }

    @Bindable
    public String getIm051698() {
        return im051698;
    }

    public void setIm051698(String im051698) {
        this.im051698 = im051698;
        /*setIm0516dd(im051698.equals("98") ? "" : this.im0516dd);
        setIm0516mm(im051698.equals("98") ? "" : this.im0516mm);
        setIm0516yy(im051698.equals("98") ? "" : this.im0516yy);*/
        notifyPropertyChanged(BR.im051698);
    }

    @Bindable
    public String getIm051798() {
        return im051798;
    }

    public void setIm051798(String im051798) {
        this.im051798 = im051798;
        /*setIm0517dd(im051798.equals("98") ? "" : this.im0517dd);
        setIm0517mm(im051798.equals("98") ? "" : this.im0517mm);
        setIm0517yy(im051798.equals("98") ? "" : this.im0517yy);*/
        notifyPropertyChanged(BR.im051798);
    }


    @Bindable
    public String getIm050295() {
        return im050295;
    }

    public void setIm050295(String im050295) {
        if (this.im050295.equals(im050295)) return; // for all checkboxes
        this.im050295 = im050295;
        setIm0502dd(im050295.equals("95") ? this.im0501dd : "");
        setIm0502mm(im050295.equals("95") ? this.im0501mm : "");
        setIm0502yy(im050295.equals("95") ? this.im0501yy : "");
        notifyPropertyChanged(BR.im050295);
    }

    @Bindable
    public String getIm050495() {
        return im050495;
    }

    public void setIm050495(String im050495) {
        if (this.im050495.equals(im050495)) return; // for all checkboxes
        this.im050495 = im050495;
        setIm0504dd(im050495.equals("95") ? this.im0503dd : "");
        setIm0504mm(im050495.equals("95") ? this.im0503mm : "");
        setIm0504yy(im050495.equals("95") ? this.im0503yy : "");

        setIm050595(im050495.equals("95") ? this.im050595 : "");
        notifyPropertyChanged(BR.im050495);
    }

    @Bindable
    public String getIm050595() {
        return im050595;
    }

    public void setIm050595(String im050595) {
        if (this.im050595.equals(im050595)) return; // for all checkboxes
        this.im050595 = im050595;
        setIm0505dd(im050595.equals("95") ? this.im0504dd : "");
        setIm0505mm(im050595.equals("95") ? this.im0504mm : "");
        setIm0505yy(im050595.equals("95") ? this.im0504yy : "");

        setIm050695(im050595.equals("95") ? this.im050695 : "");
        notifyPropertyChanged(BR.im050595);
    }

    @Bindable
    public String getIm050695() {
        return im050695;
    }

    public void setIm050695(String im050695) {
        if (this.im050695.equals(im050695)) return; // for all checkboxes
        this.im050695 = im050695;
        setIm0506dd(im050695.equals("95") ? this.im0505dd : "");
        setIm0506mm(im050695.equals("95") ? this.im0505mm : "");
        setIm0506yy(im050695.equals("95") ? this.im0505yy : "");
        notifyPropertyChanged(BR.im050695);
    }

    @Bindable
    public String getIm050895() {
        return im050895;
    }

    public void setIm050895(String im050895) {
        if (this.im050895.equals(im050895)) return; // for all checkboxes
        this.im050895 = im050895;
        setIm0508dd(im050895.equals("95") ? this.im0507dd : "");
        setIm0508mm(im050895.equals("95") ? this.im0507mm : "");
        setIm0508yy(im050895.equals("95") ? this.im0507yy : "");

        setIm050995(im050895.equals("95") ? this.im050995 : "");
        notifyPropertyChanged(BR.im050895);
    }

    @Bindable
    public String getIm050995() {
        return im050995;
    }

    public void setIm050995(String im050995) {
        if (this.im050995.equals(im050995)) return; // for all checkboxes
        this.im050995 = im050995;
        setIm0509dd(im050995.equals("95") ? this.im0508dd : "");
        setIm0509mm(im050995.equals("95") ? this.im0508mm : "");
        setIm0509yy(im050995.equals("95") ? this.im0508yy : "");

        setIm051095(im050995.equals("95") ? this.im051095 : "");
        notifyPropertyChanged(BR.im050995);
    }

    @Bindable
    public String getIm051095() {
        return im051095;
    }

    public void setIm051095(String im051095) {
        if (this.im051095.equals(im051095)) return; // for all checkboxes
        this.im051095 = im051095;
        setIm0510dd(im051095.equals("95") ? this.im0509dd : "");
        setIm0510mm(im051095.equals("95") ? this.im0509mm : "");
        setIm0510yy(im051095.equals("95") ? this.im0509yy : "");

        setIm0510a95(im051095.equals("95") ? this.im0510a95 : "");
        notifyPropertyChanged(BR.im051095);
    }

    @Bindable
    public String getIm0510a95() {
        return im0510a95;
    }

    public void setIm0510a95(String im0510a95) {
        if (this.im0510a95.equals(im0510a95)) return; // for all checkboxes
        this.im0510a95 = im0510a95;
        setIm0510add(im0510a95.equals("95") ? this.im0502dd : "");
        setIm0510amm(im0510a95.equals("95") ? this.im0502mm : "");
        setIm0510ayy(im0510a95.equals("95") ? this.im0502yy : "");
        notifyPropertyChanged(BR.im0510a95);
    }

    @Bindable
    public String getIm051295() {
        return im051295;
    }

    public void setIm051295(String im051295) {
        if (this.im051295.equals(im051295)) return; // for all checkboxes
        this.im051295 = im051295;
        setIm0512dd(im051295.equals("95") ? this.im0511dd : "");
        setIm0512mm(im051295.equals("95") ? this.im0511mm : "");
        setIm0512yy(im051295.equals("95") ? this.im0511yy : "");

        setIm051395(im051295.equals("95") ? this.im051395 : "");
        notifyPropertyChanged(BR.im051295);
    }

    @Bindable
    public String getIm051395() {
        return im051395;
    }

    public void setIm051395(String im051395) {
        if (this.im051395.equals(im051395)) return; // for all checkboxes
        this.im051395 = im051395;
        setIm0513dd(im051395.equals("95") ? this.im0512dd : "");
        setIm0513mm(im051395.equals("95") ? this.im0512mm : "");
        setIm0513yy(im051395.equals("95") ? this.im0512yy : "");

        setIm051495(im051395.equals("95") ? this.im051495 : "");
        notifyPropertyChanged(BR.im051395);
    }

    @Bindable
    public String getIm051495() {
        return im051495;
    }

    public void setIm051495(String im051495) {
        if (this.im051495.equals(im051495)) return; // for all checkboxes
        this.im051495 = im051495;
        setIm0514dd(im051495.equals("95") ? this.im0513dd : "");
        setIm0514mm(im051495.equals("95") ? this.im0513mm : "");
        setIm0514yy(im051495.equals("95") ? this.im0513yy : "");
        notifyPropertyChanged(BR.im051495);
    }

    @Bindable
    public String getIm0515b95() {
        return im0515b95;
    }

    public void setIm0515b95(String im0515b95) {
        if (this.im0515b95.equals(im0515b95)) return; // for all checkboxes
        this.im0515b95 = im0515b95;
        setIm0515bdd(im0515b95.equals("95") ? this.im0515dd : "");
        setIm0515bmm(im0515b95.equals("95") ? this.im0515mm : "");
        setIm0515byy(im0515b95.equals("95") ? this.im0515yy : "");
        notifyPropertyChanged(BR.im0515b95);
    }

    @Bindable
    public String getIm051795() {
        return im051795;
    }

    public void setIm051795(String im051795) {
        if (this.im051795.equals(im051795)) return; // for all checkboxes
        this.im051795 = im051795;
        setIm0517dd(im051795.equals("95") ? this.im0515bdd : "");
        setIm0517mm(im051795.equals("95") ? this.im0515bmm : "");
        setIm0517yy(im051795.equals("95") ? this.im0515byy : "");
        notifyPropertyChanged(BR.im051795);
    }


    @Bindable
    public String getPd01() {
        return pd01;
    }

    public void setPd01(String pd01) {
        this.pd01 = pd01;
        notifyPropertyChanged(BR.pd01);
    }

    @Bindable
    public String getPd02() {
        return pd02;
    }

    public void setPd02(String pd02) {
        this.pd02 = pd02;
        notifyPropertyChanged(BR.pd02);
    }

    @Bindable
    public String getPd03() {
        return pd03;
    }

    public void setPd03(String pd03) {
        this.pd03 = pd03;
        notifyPropertyChanged(BR.pd03);
    }

    @Bindable
    public String getPd04() {
        return pd04;
    }

    public void setPd04(String pd04) {
        this.pd04 = pd04;

        setPd05(pd04.equals("1") ? this.pd05 : "");
        setPd06(pd04.equals("1") ? this.pd06 : "");
        setPd07(pd04.equals("1") ? this.pd07 : "");

        setPd08(pd04.equals("1") ? "" : this.pd08);


        notifyPropertyChanged(BR.pd04);
    }

    @Bindable
    public String getPd05() {
        return pd05;
    }

    public void setPd05(String pd05) {
        this.pd05 = pd05;
        setPd0596x(pd05.equals("96") ? this.pd0596x : "");
        notifyPropertyChanged(BR.pd05);
    }

    @Bindable
    public String getPd0596x() {
        return pd0596x;
    }

    public void setPd0596x(String pd0596x) {
        this.pd0596x = pd0596x;
        notifyPropertyChanged(BR.pd0596x);
    }

    @Bindable
    public String getPd06() {
        return pd06;
    }

    public void setPd06(String pd06) {
        this.pd06 = pd06;
        notifyPropertyChanged(BR.pd06);
    }

    @Bindable
    public String getPd06961x() {
        return pd06961x;
    }

    public void setPd06961x(String pd06961x) {
        this.pd06961x = pd06961x;
        notifyPropertyChanged(BR.pd06961x);
    }

    @Bindable
    public String getPd06962x() {
        return pd06962x;
    }

    public void setPd06962x(String pd06962x) {
        this.pd06962x = pd06962x;
        notifyPropertyChanged(BR.pd06962x);
    }

    @Bindable
    public String getPd07() {
        return pd07;
    }

    public void setPd07(String pd07) {
        this.pd07 = pd07;
        notifyPropertyChanged(BR.pd07);
    }

    @Bindable
    public String getPd0701x() {
        return pd0701x;
    }

    public void setPd0701x(String pd0701x) {
        this.pd0701x = pd0701x;
        notifyPropertyChanged(BR.pd0701x);
    }

    @Bindable
    public String getPd08a() {
        return pd08a;
    }

    public void setPd08a(String pd08a) {
        this.pd08a = pd08a;
        notifyPropertyChanged(BR.pd08a);
    }

    @Bindable
    public String getPd08a01() {
        return pd08a01;
    }

    public void setPd08a01(String pd08a01) {
        if (this.pd08a01.equals(pd08a01)) return; // for all checkboxes
        this.pd08a01 = pd08a01;
        notifyPropertyChanged(BR.pd08a01);
    }

    @Bindable
    public String getPd08a02() {
        return pd08a02;
    }

    public void setPd08a02(String pd08a02) {
        if (this.pd08a02.equals(pd08a02)) return; // for all checkboxes
        this.pd08a02 = pd08a02;
        notifyPropertyChanged(BR.pd08a02);
    }

    @Bindable
    public String getPd08a03() {
        return pd08a03;
    }

    public void setPd08a03(String pd08a03) {
        if (this.pd08a03.equals(pd08a03)) return; // for all checkboxes
        this.pd08a03 = pd08a03;
        notifyPropertyChanged(BR.pd08a03);
    }

    @Bindable
    public String getPd08a04() {
        return pd08a04;
    }

    public void setPd08a04(String pd08a04) {
        if (this.pd08a04.equals(pd08a04)) return; // for all checkboxes
        this.pd08a04 = pd08a04;
        notifyPropertyChanged(BR.pd08a04);
    }

    @Bindable
    public String getPd08a05() {
        return pd08a05;
    }

    public void setPd08a05(String pd08a05) {
        if (this.pd08a05.equals(pd08a05)) return; // for all checkboxes
        this.pd08a05 = pd08a05;
        notifyPropertyChanged(BR.pd08a05);
    }

    @Bindable
    public String getPd08a06() {
        return pd08a06;
    }

    public void setPd08a06(String pd08a06) {
        if (this.pd08a06.equals(pd08a06)) return; // for all checkboxes
        this.pd08a06 = pd08a06;
        notifyPropertyChanged(BR.pd08a06);
    }

    @Bindable
    public String getPd08a07() {
        return pd08a07;
    }

    public void setPd08a07(String pd08a07) {
        if (this.pd08a07.equals(pd08a07)) return; // for all checkboxes
        this.pd08a07 = pd08a07;
        notifyPropertyChanged(BR.pd08a07);
    }

    @Bindable
    public String getPd08a08() {
        return pd08a08;
    }

    public void setPd08a08(String pd08a08) {
        if (this.pd08a08.equals(pd08a08)) return; // for all checkboxes
        this.pd08a08 = pd08a08;
        notifyPropertyChanged(BR.pd08a08);
    }

    @Bindable
    public String getPd08a09() {
        return pd08a09;
    }

    public void setPd08a09(String pd08a09) {
        if (this.pd08a09.equals(pd08a09)) return; // for all checkboxes
        this.pd08a09 = pd08a09;
        notifyPropertyChanged(BR.pd08a09);
    }

    @Bindable
    public String getPd08a96() {
        return pd08a96;
    }

    public void setPd08a96(String pd08a96) {
        if (this.pd08a96.equals(pd08a96)) return; // for all checkboxes
        this.pd08a96 = pd08a96;
        setPd08a96x(pd08a96.equals("96") ? this.pd08a96x : "");
        notifyPropertyChanged(BR.pd08a96);
    }

    @Bindable
    public String getPd08a96x() {
        return pd08a96x;
    }

    public void setPd08a96x(String pd08a96x) {
        this.pd08a96x = pd08a96x;
        notifyPropertyChanged(BR.pd08a96x);
    }

    @Bindable
    public String getPd08() {
        return pd08;
    }

    public void setPd08(String pd08) {
        this.pd08 = pd08;
        notifyPropertyChanged(BR.pd08);
    }

    @Bindable
    public String getPd08b() {
        return pd08b;
    }

    public void setPd08b(String pd08b) {
        this.pd08b = pd08b;
        notifyPropertyChanged(BR.pd08b);
    }

    @Bindable
    public String getPd08c() {
        return pd08c;
    }

    public void setPd08c(String pd08c) {
        this.pd08c = pd08c;
        notifyPropertyChanged(BR.pd08c);
    }

    @Bindable
    public String getPd09() {
        return pd09;
    }

    public void setPd09(String pd09) {
        this.pd09 = pd09;
        setPd10(pd09.equals("1") ? this.pd10 : "");
        setPd1101(pd09.equals("1") ? this.pd1101 : "");
        setPd1102(pd09.equals("1") ? this.pd1102 : "");

        notifyPropertyChanged(BR.pd09);
    }

    @Bindable
    public String getPd10() {
        return pd10;
    }

    public void setPd10(String pd10) {
        this.pd10 = pd10;
        notifyPropertyChanged(BR.pd10);
    }

    @Bindable
    public String getPd1101() {
        return pd1101;
    }

    public void setPd1101(String pd1101) {
        this.pd1101 = pd1101;
        notifyPropertyChanged(BR.pd1101);
    }

    @Bindable
    public String getPd1102() {
        return pd1102;
    }

    public void setPd1102(String pd1102) {
        this.pd1102 = pd1102;
        notifyPropertyChanged(BR.pd1102);
    }

    @Bindable
    public String getPd12() {
        return pd12;
    }

    public void setPd12(String pd12) {
        this.pd12 = pd12;
        setPd1296x(pd12.equals("96") ? this.pd1296x : "");
        notifyPropertyChanged(BR.pd12);
    }

    @Bindable
    public String getPd1296x() {
        return pd1296x;
    }

    public void setPd1296x(String pd1296x) {
        this.pd1296x = pd1296x;
        notifyPropertyChanged(BR.pd1296x);
    }

    @Bindable
    public String getPd13() {
        return pd13;
    }

    public void setPd13(String pd13) {
        this.pd13 = pd13;
        setPd14(pd13.equals("1") || pd13.equals("2") ? this.pd14 : "");
        setPd13961x(pd13.equals("961") ? this.pd13961x : "");
        setPd13962x(pd13.equals("962") ? this.pd13962x : "");


        notifyPropertyChanged(BR.pd13);
    }

    @Bindable
    public String getPd13961x() {
        return pd13961x;
    }

    public void setPd13961x(String pd13961x) {
        this.pd13961x = pd13961x;
        notifyPropertyChanged(BR.pd13961x);
    }

    @Bindable
    public String getPd13962x() {
        return pd13962x;
    }

    public void setPd13962x(String pd13962x) {
        this.pd13962x = pd13962x;
        notifyPropertyChanged(BR.pd13962x);
    }

    @Bindable
    public String getPd14() {
        return pd14;
    }

    public void setPd14(String pd14) {
        this.pd14 = pd14;
        setPd1496x(pd14.equals("96") ? this.pd1496x : "");
        notifyPropertyChanged(BR.pd14);
    }

    @Bindable
    public String getPd1496x() {
        return pd1496x;
    }

    public void setPd1496x(String pd1496x) {
        this.pd1496x = pd1496x;
        notifyPropertyChanged(BR.pd1496x);
    }

    @Bindable
    public String getPd15() {
        return pd15;
    }

    public void setPd15(String pd15) {
        this.pd15 = pd15;

        setPd1601(pd15.equals("1") ? this.pd1601 : "");
        setPd1602(pd15.equals("1") ? this.pd1602 : "");
        setPd1603(pd15.equals("1") ? this.pd1603 : "");
        setPd1604(pd15.equals("1") ? this.pd1604 : "");
        setPd1605(pd15.equals("1") ? this.pd1605 : "");
        setPd1606(pd15.equals("1") ? this.pd1606 : "");
        setPd1607(pd15.equals("1") ? this.pd1607 : "");
        setPd1696(pd15.equals("1") ? this.pd1696 : "");
        setPd17(pd15.equals("1") ? this.pd17 : "");
        setPd18(pd15.equals("1") ? this.pd18 : "");

        notifyPropertyChanged(BR.pd15);
    }

    @Bindable
    public String getPd16() {
        return pd16;
    }

    public void setPd16(String pd16) {
        this.pd16 = pd16;
        notifyPropertyChanged(BR.pd16);
    }

    @Bindable
    public String getPd1601() {
        return pd1601;
    }

    public void setPd1601(String pd1601) {
        if (this.pd1601.equals(pd1601)) return; // for all checkboxes
        this.pd1601 = pd1601;
        notifyPropertyChanged(BR.pd1601);
    }

    @Bindable
    public String getPd1602() {
        return pd1602;
    }

    public void setPd1602(String pd1602) {
        if (this.pd1602.equals(pd1602)) return; // for all checkboxes
        this.pd1602 = pd1602;
        notifyPropertyChanged(BR.pd1602);
    }

    @Bindable
    public String getPd1603() {
        return pd1603;
    }

    public void setPd1603(String pd1603) {
        if (this.pd1603.equals(pd1603)) return; // for all checkboxes
        this.pd1603 = pd1603;
        notifyPropertyChanged(BR.pd1603);
    }

    @Bindable
    public String getPd1604() {
        return pd1604;
    }

    public void setPd1604(String pd1604) {
        if (this.pd1604.equals(pd1604)) return; // for all checkboxes
        this.pd1604 = pd1604;
        notifyPropertyChanged(BR.pd1604);
    }

    @Bindable
    public String getPd1605() {
        return pd1605;
    }

    public void setPd1605(String pd1605) {
        if (this.pd1605.equals(pd1605)) return; // for all checkboxes
        this.pd1605 = pd1605;
        notifyPropertyChanged(BR.pd1605);
    }

    @Bindable
    public String getPd1606() {
        return pd1606;
    }

    public void setPd1606(String pd1606) {
        if (this.pd1606.equals(pd1606)) return; // for all checkboxes
        this.pd1606 = pd1606;
        notifyPropertyChanged(BR.pd1606);
    }

    @Bindable
    public String getPd1607() {
        return pd1607;
    }

    public void setPd1607(String pd1607) {
        if (this.pd1607.equals(pd1607)) return; // for all checkboxes
        this.pd1607 = pd1607;
        notifyPropertyChanged(BR.pd1607);
    }

    @Bindable
    public String getPd1696() {
        return pd1696;
    }

    public void setPd1696(String pd1696) {
        if (this.pd1696.equals(pd1696)) return; // for all checkboxes
        this.pd1696 = pd1696;
        setPd1696x(pd1696.equals("96") ? this.pd1696x : "");
        notifyPropertyChanged(BR.pd1696);
    }

    @Bindable
    public String getPd1696x() {
        return pd1696x;
    }

    public void setPd1696x(String pd1696x) {
        this.pd1696x = pd1696x;
        notifyPropertyChanged(BR.pd1696x);
    }

    @Bindable
    public String getPd17() {
        return pd17;
    }

    public void setPd17(String pd17) {
        this.pd17 = pd17;
        setPd1701x(pd17.equals("1") ? this.pd1701x : "");
        setPd1702x(pd17.equals("2") ? this.pd1702x : "");
        setPd1703x(pd17.equals("3") ? this.pd1703x : "");
        notifyPropertyChanged(BR.pd17);
    }

    @Bindable
    public String getPd1701x() {
        return pd1701x;
    }

    public void setPd1701x(String pd1701x) {
        this.pd1701x = pd1701x;
        notifyPropertyChanged(BR.pd1701x);
    }

    @Bindable
    public String getPd1702x() {
        return pd1702x;
    }

    public void setPd1702x(String pd1702x) {
        this.pd1702x = pd1702x;
        notifyPropertyChanged(BR.pd1702x);
    }

    @Bindable
    public String getPd1703x() {
        return pd1703x;
    }

    public void setPd1703x(String pd1703x) {
        this.pd1703x = pd1703x;
        notifyPropertyChanged(BR.pd1703x);
    }

    @Bindable
    public String getPd18() {
        return pd18;
    }

    public void setPd18(String pd18) {
        this.pd18 = pd18;
        notifyPropertyChanged(BR.pd18);
    }

    @Bindable
    public String getPd19() {
        return pd19;
    }

    public void setPd19(String pd19) {
        this.pd19 = pd19;
        setPd2001(pd19.equals("1") ? this.pd2001 : "");
        setPd2002(pd19.equals("1") ? this.pd2002 : "");
        setPd2003(pd19.equals("1") ? this.pd2003 : "");
        setPd2004(pd19.equals("1") ? this.pd2004 : "");
        setPd2005(pd19.equals("1") ? this.pd2005 : "");
        setPd2006(pd19.equals("1") ? this.pd2006 : "");
        setPd2007(pd19.equals("1") ? this.pd2007 : "");
        setPd2096(pd19.equals("1") ? this.pd2096 : "");
        setPd21(pd19.equals("1") ? this.pd21 : "");
        setPd22(pd19.equals("1") ? this.pd22 : "");
        setPd23(pd19.equals("1") ? this.pd23 : "");
        setPd2401(pd19.equals("1") ? this.pd2401 : "");
        setPd2402(pd19.equals("1") ? this.pd2402 : "");
        setPd2403(pd19.equals("1") ? this.pd2403 : "");
        setPd2404(pd19.equals("1") ? this.pd2404 : "");
        setPd2405(pd19.equals("1") ? this.pd2405 : "");
        setPd2406(pd19.equals("1") ? this.pd2406 : "");
        setPd2496(pd19.equals("1") ? this.pd2496 : "");
        setPd2498(pd19.equals("1") ? this.pd2498 : "");
        notifyPropertyChanged(BR.pd19);
    }

    @Bindable
    public String getPd20() {
        return pd20;
    }

    public void setPd20(String pd20) {
        this.pd20 = pd20;
        notifyPropertyChanged(BR.pd20);
    }

    @Bindable
    public String getPd2001() {
        return pd2001;
    }

    public void setPd2001(String pd2001) {
        if (this.pd2001.equals(pd2001)) return; // for all checkboxes
        this.pd2001 = pd2001;
        notifyPropertyChanged(BR.pd2001);
    }

    @Bindable
    public String getPd2002() {
        return pd2002;
    }

    public void setPd2002(String pd2002) {
        if (this.pd2002.equals(pd2002)) return; // for all checkboxes
        this.pd2002 = pd2002;
        notifyPropertyChanged(BR.pd2002);
    }

    @Bindable
    public String getPd2003() {
        return pd2003;
    }

    public void setPd2003(String pd2003) {
        if (this.pd2003.equals(pd2003)) return; // for all checkboxes
        this.pd2003 = pd2003;
        notifyPropertyChanged(BR.pd2003);
    }

    @Bindable
    public String getPd2004() {
        return pd2004;
    }

    public void setPd2004(String pd2004) {
        if (this.pd2004.equals(pd2004)) return; // for all checkboxes
        this.pd2004 = pd2004;
        notifyPropertyChanged(BR.pd2004);
    }

    @Bindable
    public String getPd2005() {
        return pd2005;
    }

    public void setPd2005(String pd2005) {
        if (this.pd2005.equals(pd2005)) return; // for all checkboxes
        this.pd2005 = pd2005;
        notifyPropertyChanged(BR.pd2005);
    }

    @Bindable
    public String getPd2006() {
        return pd2006;
    }

    public void setPd2006(String pd2006) {
        if (this.pd2006.equals(pd2006)) return; // for all checkboxes
        this.pd2006 = pd2006;
        notifyPropertyChanged(BR.pd2006);
    }

    @Bindable
    public String getPd2007() {
        return pd2007;
    }

    public void setPd2007(String pd2007) {
        if (this.pd2007.equals(pd2007)) return; // for all checkboxes
        this.pd2007 = pd2007;
        notifyPropertyChanged(BR.pd2007);
    }

    @Bindable
    public String getPd2096() {
        return pd2096;
    }

    public void setPd2096(String pd2096) {
        if (this.pd2096.equals(pd2096)) return; // for all checkboxes
        this.pd2096 = pd2096;
        setPd2096x(pd2096.equals("96") ? this.pd2096x : "");
        notifyPropertyChanged(BR.pd2096);
    }

    @Bindable
    public String getPd2096x() {
        return pd2096x;
    }

    public void setPd2096x(String pd2096x) {
        this.pd2096x = pd2096x;
        notifyPropertyChanged(BR.pd2096x);
    }

    @Bindable
    public String getPd21() {
        return pd21;
    }

    public void setPd21(String pd21) {
        this.pd21 = pd21;
        setPd2101x(pd21.equals("1") ? this.pd2101x : "");
        setPd2102x(pd21.equals("2") ? this.pd2102x : "");
        setPd2103x(pd21.equals("3") ? this.pd2103x : "");

        notifyPropertyChanged(BR.pd21);
    }

    @Bindable
    public String getPd2101x() {
        return pd2101x;
    }

    public void setPd2101x(String pd2101x) {
        this.pd2101x = pd2101x;
        notifyPropertyChanged(BR.pd2101x);
    }

    @Bindable
    public String getPd2102x() {
        return pd2102x;
    }

    public void setPd2102x(String pd2102x) {
        this.pd2102x = pd2102x;
        notifyPropertyChanged(BR.pd2102x);
    }

    @Bindable
    public String getPd2103x() {
        return pd2103x;
    }

    public void setPd2103x(String pd2103x) {
        this.pd2103x = pd2103x;
        notifyPropertyChanged(BR.pd2103x);
    }

    @Bindable
    public String getPd22() {
        return pd22;
    }

    public void setPd22(String pd22) {
        this.pd22 = pd22;
        notifyPropertyChanged(BR.pd22);
    }

    @Bindable
    public String getPd23() {
        return pd23;
    }

    public void setPd23(String pd23) {
        this.pd23 = pd23;
        setPd2401(pd23.equals("1") ? this.pd2401 : "");
        setPd2402(pd23.equals("1") ? this.pd2402 : "");
        setPd2403(pd23.equals("1") ? this.pd2403 : "");
        setPd2404(pd23.equals("1") ? this.pd2404 : "");
        setPd2405(pd23.equals("1") ? this.pd2405 : "");
        setPd2406(pd23.equals("1") ? this.pd2406 : "");
        setPd2496(pd23.equals("1") ? this.pd2496 : "");


        notifyPropertyChanged(BR.pd23);
    }

    @Bindable
    public String getPd24() {
        return pd24;
    }

    public void setPd24(String pd24) {
        this.pd24 = pd24;
        notifyPropertyChanged(BR.pd24);
    }

    @Bindable
    public String getPd2401() {
        return pd2401;
    }

    public void setPd2401(String pd2401) {
        if (this.pd2401.equals(pd2401)) return; // for all checkboxes
        this.pd2401 = pd2401;
        notifyPropertyChanged(BR.pd2401);
    }

    @Bindable
    public String getPd2402() {
        return pd2402;
    }

    public void setPd2402(String pd2402) {
        if (this.pd2402.equals(pd2402)) return; // for all checkboxes
        this.pd2402 = pd2402;
        notifyPropertyChanged(BR.pd2402);
    }

    @Bindable
    public String getPd2403() {
        return pd2403;
    }

    public void setPd2403(String pd2403) {
        if (this.pd2403.equals(pd2403)) return; // for all checkboxes
        this.pd2403 = pd2403;
        notifyPropertyChanged(BR.pd2403);
    }

    @Bindable
    public String getPd2404() {
        return pd2404;
    }

    public void setPd2404(String pd2404) {
        if (this.pd2404.equals(pd2404)) return; // for all checkboxes
        this.pd2404 = pd2404;
        notifyPropertyChanged(BR.pd2404);
    }

    @Bindable
    public String getPd2405() {
        return pd2405;
    }

    public void setPd2405(String pd2405) {
        if (this.pd2405.equals(pd2405)) return; // for all checkboxes
        this.pd2405 = pd2405;
        notifyPropertyChanged(BR.pd2405);
    }

    @Bindable
    public String getPd2406() {
        return pd2406;
    }

    public void setPd2406(String pd2406) {
        if (this.pd2406.equals(pd2406)) return; // for all checkboxes
        this.pd2406 = pd2406;
        notifyPropertyChanged(BR.pd2406);
    }

    @Bindable
    public String getPd2496() {
        return pd2496;
    }

    public void setPd2496(String pd2496) {
        if (this.pd2496.equals(pd2496)) return; // for all checkboxes
        this.pd2496 = pd2496;
        setPd2496x(pd2496.equals("96") ? this.pd2496x : "");
        notifyPropertyChanged(BR.pd2496);
    }

    @Bindable
    public String getPd2496x() {
        return pd2496x;
    }

    public void setPd2496x(String pd2496x) {
        this.pd2496x = pd2496x;
        notifyPropertyChanged(BR.pd2496x);
    }

    @Bindable
    public String getPd2498() {
        return pd2498;
    }

    public void setPd2498(String pd2498) {
        if (this.pd2498.equals(pd2498)) return; // for all checkboxes
        this.pd2498 = pd2498;
        setPd2401(pd2498.equals("98") ? "" : this.pd2401);
        setPd2402(pd2498.equals("98") ? "" : this.pd2402);
        setPd2403(pd2498.equals("98") ? "" : this.pd2403);
        setPd2404(pd2498.equals("98") ? "" : this.pd2404);
        setPd2405(pd2498.equals("98") ? "" : this.pd2405);
        setPd2406(pd2498.equals("98") ? "" : this.pd2406);
        setPd2496(pd2498.equals("98") ? "" : this.pd2496);
        notifyPropertyChanged(BR.pd2498);
    }

    @Bindable
    public String getBf01() {
        return bf01;
    }

    public void setBf01(String bf01) {
        this.bf01 = bf01;
        notifyPropertyChanged(BR.bf01);
    }

    @Bindable
    public String getBf02() {
        return bf02;
    }

    public void setBf02(String bf02) {
        this.bf02 = bf02;
        notifyPropertyChanged(BR.bf02);
    }

    @Bindable
    public String getBf3y() {
        return bf3y;
    }

    public void setBf3y(String bf3y) {
        this.bf3y = bf3y;
        notifyPropertyChanged(BR.bf3y);
    }

    @Bindable
    public String getBf03m() {
        return bf03m;
    }

    public void setBf03m(String bf03m) {
        this.bf03m = bf03m;
        notifyPropertyChanged(BR.bf03m);
    }

    @Bindable
    public String getBf3d() {
        return bf3d;
    }

    public void setBf3d(String bf3d) {
        this.bf3d = bf3d;
        notifyPropertyChanged(BR.bf3d);
    }

    @Bindable
    public String getBf03a01() {
        return bf03a01;
    }

    public void setBf03a01(String bf03a01) {
        this.bf03a01 = bf03a01;
        notifyPropertyChanged(BR.bf03a01);
    }

    @Bindable
    public String getBf03a02() {
        return bf03a02;
    }

    public void setBf03a02(String bf03a02) {
        this.bf03a02 = bf03a02;
        notifyPropertyChanged(BR.bf03a02);
    }

    @Bindable
    public String getBf04() {
        return bf04;
    }

    public void setBf04(String bf04) {
        this.bf04 = bf04;

        setBf05(bf04.equals("1") ? this.bf05 : "");
        setBf06(bf04.equals("1") ? this.bf06 : "");
        setBf07(bf04.equals("1") ? this.bf07 : "");
        setBf08(bf04.equals("1") ? this.bf08 : "");
        setBf0901(bf04.equals("1") ? this.bf0901 : "");
        setBf0902(bf04.equals("1") ? this.bf0902 : "");
        setBf0903(bf04.equals("1") ? this.bf0903 : "");
        setBf0904(bf04.equals("1") ? this.bf0904 : "");
        setBf0905(bf04.equals("1") ? this.bf0905 : "");
        setBf0906(bf04.equals("1") ? this.bf0906 : "");
        setBf0907(bf04.equals("1") ? this.bf0907 : "");
        setBf0908(bf04.equals("1") ? this.bf0908 : "");
        setBf0909(bf04.equals("1") ? this.bf0909 : "");
        setBf0910(bf04.equals("1") ? this.bf0910 : "");
        setBf0999(bf04.equals("1") ? this.bf0999 : "");
        setBf0996(bf04.equals("1") ? this.bf0996 : "");
        setBf10(bf04.equals("1") ? this.bf10 : "");


        notifyPropertyChanged(BR.bf04);
    }

    @Bindable
    public String getBf05() {
        return bf05;
    }

    public void setBf05(String bf05) {
        this.bf05 = bf05;
        setBf0502x(bf05.equals("2") ? this.bf0502x : "");
        setBf0503x(bf05.equals("3") ? this.bf0503x : "");
        notifyPropertyChanged(BR.bf05);
    }

    @Bindable
    public String getBf0502x() {
        return bf0502x;
    }

    public void setBf0502x(String bf0502x) {
        this.bf0502x = bf0502x;
        notifyPropertyChanged(BR.bf0502x);
    }

    @Bindable
    public String getBf0503x() {
        return bf0503x;
    }

    public void setBf0503x(String bf0503x) {
        this.bf0503x = bf0503x;
        notifyPropertyChanged(BR.bf0503x);
    }

    @Bindable
    public String getBf06() {
        return bf06;
    }

    public void setBf06(String bf06) {
        this.bf06 = bf06;

        setBf07(bf06.equals("1") ? "" : this.bf07);
        notifyPropertyChanged(BR.bf06);
    }

    @Bindable
    public String getBf07() {
        return bf07;
    }

    public void setBf07(String bf07) {
        this.bf07 = bf07;
        setBf0796x(bf07.equals("96") ? this.bf0796x : "");
        notifyPropertyChanged(BR.bf07);
    }

    @Bindable
    public String getBf0796x() {
        return bf0796x;
    }

    public void setBf0796x(String bf0796x) {
        this.bf0796x = bf0796x;
        notifyPropertyChanged(BR.bf0796x);
    }

    @Bindable
    public String getBf08() {
        return bf08;
    }

    public void setBf08(String bf08) {
        this.bf08 = bf08;
        setBf0901(bf08.equals("1") ? this.bf0901 : "");
        setBf0902(bf08.equals("1") ? this.bf0902 : "");
        setBf0903(bf08.equals("1") ? this.bf0903 : "");
        setBf0904(bf08.equals("1") ? this.bf0904 : "");
        setBf0905(bf08.equals("1") ? this.bf0905 : "");
        setBf0906(bf08.equals("1") ? this.bf0906 : "");
        setBf0907(bf08.equals("1") ? this.bf0907 : "");
        setBf0908(bf08.equals("1") ? this.bf0908 : "");
        setBf0909(bf08.equals("1") ? this.bf0909 : "");
        setBf0910(bf08.equals("1") ? this.bf0910 : "");
        setBf0999(bf08.equals("1") ? this.bf0999 : "");
        setBf0996(bf08.equals("1") ? this.bf0996 : "");

        notifyPropertyChanged(BR.bf08);
    }

    @Bindable
    public String getBf09() {
        return bf09;
    }

    public void setBf09(String bf09) {
        this.bf09 = bf09;
        notifyPropertyChanged(BR.bf09);
    }

    @Bindable
    public String getBf0901() {
        return bf0901;
    }

    public void setBf0901(String bf0901) {
        if (this.bf0901.equals(bf0901)) return; // for all checkboxes
        this.bf0901 = bf0901;
        notifyPropertyChanged(BR.bf0901);
    }

    @Bindable
    public String getBf0902() {
        return bf0902;
    }

    public void setBf0902(String bf0902) {
        if (this.bf0902.equals(bf0902)) return; // for all checkboxes
        this.bf0902 = bf0902;
        notifyPropertyChanged(BR.bf0902);
    }

    @Bindable
    public String getBf0903() {
        return bf0903;
    }

    public void setBf0903(String bf0903) {
        if (this.bf0903.equals(bf0903)) return; // for all checkboxes
        this.bf0903 = bf0903;
        notifyPropertyChanged(BR.bf0903);
    }

    @Bindable
    public String getBf0904() {
        return bf0904;
    }

    public void setBf0904(String bf0904) {
        if (this.bf0904.equals(bf0904)) return; // for all checkboxes
        this.bf0904 = bf0904;
        notifyPropertyChanged(BR.bf0904);
    }

    @Bindable
    public String getBf0905() {
        return bf0905;
    }

    public void setBf0905(String bf0905) {
        if (this.bf0905.equals(bf0905)) return; // for all checkboxes
        this.bf0905 = bf0905;
        notifyPropertyChanged(BR.bf0905);
    }

    @Bindable
    public String getBf0906() {
        return bf0906;
    }

    public void setBf0906(String bf0906) {
        if (this.bf0906.equals(bf0906)) return; // for all checkboxes
        this.bf0906 = bf0906;
        notifyPropertyChanged(BR.bf0906);
    }

    @Bindable
    public String getBf0907() {
        return bf0907;
    }

    public void setBf0907(String bf0907) {
        if (this.bf0907.equals(bf0907)) return; // for all checkboxes
        this.bf0907 = bf0907;
        notifyPropertyChanged(BR.bf0907);
    }

    @Bindable
    public String getBf0908() {
        return bf0908;
    }

    public void setBf0908(String bf0908) {
        if (this.bf0908.equals(bf0908)) return; // for all checkboxes
        this.bf0908 = bf0908;
        notifyPropertyChanged(BR.bf0908);
    }

    @Bindable
    public String getBf0909() {
        return bf0909;
    }

    public void setBf0909(String bf0909) {
        if (this.bf0909.equals(bf0909)) return; // for all checkboxes
        this.bf0909 = bf0909;
        notifyPropertyChanged(BR.bf0909);
    }

    @Bindable
    public String getBf0910() {
        return bf0910;
    }

    public void setBf0910(String bf0910) {
        if (this.bf0910.equals(bf0910)) return; // for all checkboxes
        this.bf0910 = bf0910;
        notifyPropertyChanged(BR.bf0910);
    }

    @Bindable
    public String getBf0999() {
        return bf0999;
    }

    public void setBf0999(String bf0999) {
        if (this.bf0999.equals(bf0999)) return; // for all checkboxes
        this.bf0999 = bf0999;
        setBf0901(bf0999.equals("99") ? "" : this.bf0901);
        setBf0902(bf0999.equals("99") ? "" : this.bf0902);
        setBf0903(bf0999.equals("99") ? "" : this.bf0903);
        setBf0904(bf0999.equals("99") ? "" : this.bf0904);
        setBf0905(bf0999.equals("99") ? "" : this.bf0905);
        setBf0906(bf0999.equals("99") ? "" : this.bf0906);
        setBf0907(bf0999.equals("99") ? "" : this.bf0907);
        setBf0908(bf0999.equals("99") ? "" : this.bf0908);
        setBf0909(bf0999.equals("99") ? "" : this.bf0909);
        setBf0910(bf0999.equals("99") ? "" : this.bf0910);
        setBf0996(bf0999.equals("99") ? "" : this.bf0996);
        notifyPropertyChanged(BR.bf0999);
    }

    @Bindable
    public String getBf0996() {
        return bf0996;
    }

    public void setBf0996(String bf0996) {
        if (this.bf0996.equals(bf0996)) return; // for all checkboxes
        this.bf0996 = bf0996;
        setBf0996x(bf0996.equals("96") ? this.bf0996x : "");
        notifyPropertyChanged(BR.bf0996);
    }

    @Bindable
    public String getBf0996x() {
        return bf0996x;
    }

    public void setBf0996x(String bf0996x) {
        this.bf0996x = bf0996x;
        notifyPropertyChanged(BR.bf0996x);
    }

    @Bindable
    public String getBf10() {
        return bf10;
    }

    public void setBf10(String bf10) {
        this.bf10 = bf10;

        setBf11(bf10.equals("1") ? "" : this.bf11);
        notifyPropertyChanged(BR.bf10);
    }

    @Bindable
    public String getBf11() {
        return bf11;
    }

    public void setBf11(String bf11) {
        this.bf11 = bf11;
        notifyPropertyChanged(BR.bf11);
    }

    @Bindable
    public String getBf12() {
        return bf12;
    }

    public void setBf12(String bf12) {
        this.bf12 = bf12;
        notifyPropertyChanged(BR.bf12);
    }

    @Bindable
    public String getBf13() {
        return bf13;
    }

    public void setBf13(String bf13) {
        this.bf13 = bf13;
        notifyPropertyChanged(BR.bf13);
    }

    @Bindable
    public String getBf14a() {
        return bf14a;
    }

    public void setBf14a(String bf14a) {
        this.bf14a = bf14a;
        notifyPropertyChanged(BR.bf14a);
    }

    @Bindable
    public String getBf14b() {
        return bf14b;
    }

    public void setBf14b(String bf14b) {
        this.bf14b = bf14b;
        setBf14b01x(bf14b.equals("1") ? this.bf14b01x : "");
        notifyPropertyChanged(BR.bf14b);
    }

    @Bindable
    public String getBf14b01x() {
        return bf14b01x;
    }

    public void setBf14b01x(String bf14b01x) {
        this.bf14b01x = bf14b01x;
        notifyPropertyChanged(BR.bf14b01x);
    }

    @Bindable
    public String getBf14c() {
        return bf14c;
    }

    public void setBf14c(String bf14c) {
        this.bf14c = bf14c;
        setBf14c01x(bf14c.equals("1") ? this.bf14c01x : "");
        notifyPropertyChanged(BR.bf14c);
    }

    @Bindable
    public String getBf14c01x() {
        return bf14c01x;
    }

    public void setBf14c01x(String bf14c01x) {
        this.bf14c01x = bf14c01x;
        notifyPropertyChanged(BR.bf14c01x);
    }

    @Bindable
    public String getBf14d() {
        return bf14d;
    }

    public void setBf14d(String bf14d) {
        this.bf14d = bf14d;
        notifyPropertyChanged(BR.bf14d);
    }

    @Bindable
    public String getBf14e() {
        return bf14e;
    }

    public void setBf14e(String bf14e) {
        this.bf14e = bf14e;
        notifyPropertyChanged(BR.bf14e);
    }

    @Bindable
    public String getBf14f() {
        return bf14f;
    }

    public void setBf14f(String bf14f) {
        this.bf14f = bf14f;
        setBf14f01x(bf14f.equals("1") ? this.bf14f01x : "");
        notifyPropertyChanged(BR.bf14f);
    }

    @Bindable
    public String getBf14f01x() {
        return bf14f01x;
    }

    public void setBf14f01x(String bf14f01x) {
        this.bf14f01x = bf14f01x;
        notifyPropertyChanged(BR.bf14f01x);
    }

    @Bindable
    public String getBf14g() {
        return bf14g;
    }

    public void setBf14g(String bf14g) {
        this.bf14g = bf14g;
        notifyPropertyChanged(BR.bf14g);
    }

    @Bindable
    public String getBf14h() {
        return bf14h;
    }

    public void setBf14h(String bf14h) {
        this.bf14h = bf14h;
        notifyPropertyChanged(BR.bf14h);
    }

    @Bindable
    public String getBf14i() {
        return bf14i;
    }

    public void setBf14i(String bf14i) {
        this.bf14i = bf14i;
        notifyPropertyChanged(BR.bf14i);
    }

    @Bindable
    public String getBf15a() {
        return bf15a;
    }

    public void setBf15a(String bf15a) {
        this.bf15a = bf15a;
        notifyPropertyChanged(BR.bf15a);
    }

    @Bindable
    public String getBf15b() {
        return bf15b;
    }

    public void setBf15b(String bf15b) {
        this.bf15b = bf15b;
        notifyPropertyChanged(BR.bf15b);
    }

    @Bindable
    public String getBf15c() {
        return bf15c;
    }

    public void setBf15c(String bf15c) {
        this.bf15c = bf15c;
        notifyPropertyChanged(BR.bf15c);
    }

    @Bindable
    public String getBf15d() {
        return bf15d;
    }

    public void setBf15d(String bf15d) {
        this.bf15d = bf15d;
        notifyPropertyChanged(BR.bf15d);
    }

    @Bindable
    public String getBf15e() {
        return bf15e;
    }

    public void setBf15e(String bf15e) {
        this.bf15e = bf15e;
        notifyPropertyChanged(BR.bf15e);
    }

    @Bindable
    public String getBf15f() {
        return bf15f;
    }

    public void setBf15f(String bf15f) {
        this.bf15f = bf15f;
        notifyPropertyChanged(BR.bf15f);
    }

    @Bindable
    public String getBf15g() {
        return bf15g;
    }

    public void setBf15g(String bf15g) {
        this.bf15g = bf15g;
        notifyPropertyChanged(BR.bf15g);
    }

    @Bindable
    public String getBf15h() {
        return bf15h;
    }

    public void setBf15h(String bf15h) {
        this.bf15h = bf15h;
        notifyPropertyChanged(BR.bf15h);
    }

    @Bindable
    public String getBf15i() {
        return bf15i;
    }

    public void setBf15i(String bf15i) {
        this.bf15i = bf15i;
        notifyPropertyChanged(BR.bf15i);
    }

    @Bindable
    public String getBf15j() {
        return bf15j;
    }

    public void setBf15j(String bf15j) {
        this.bf15j = bf15j;
        notifyPropertyChanged(BR.bf15j);
    }

    @Bindable
    public String getBf15k() {
        return bf15k;
    }

    public void setBf15k(String bf15k) {
        this.bf15k = bf15k;
        notifyPropertyChanged(BR.bf15k);
    }

    @Bindable
    public String getBf15l() {
        return bf15l;
    }

    public void setBf15l(String bf15l) {
        this.bf15l = bf15l;
        notifyPropertyChanged(BR.bf15l);
    }

    @Bindable
    public String getBf15m() {
        return bf15m;
    }

    public void setBf15m(String bf15m) {
        this.bf15m = bf15m;
        notifyPropertyChanged(BR.bf15m);
    }

    @Bindable
    public String getBf15n() {
        return bf15n;
    }

    public void setBf15n(String bf15n) {
        this.bf15n = bf15n;
        notifyPropertyChanged(BR.bf15n);
    }

    @Bindable
    public String getBf15o() {
        return bf15o;
    }

    public void setBf15o(String bf15o) {
        this.bf15o = bf15o;
        notifyPropertyChanged(BR.bf15o);
    }

    @Bindable
    public String getBf15p() {
        return bf15p;
    }

    public void setBf15p(String bf15p) {
        this.bf15p = bf15p;
        notifyPropertyChanged(BR.bf15p);
    }

    @Bindable
    public String getBf15q() {
        return bf15q;
    }

    public void setBf15q(String bf15q) {
        this.bf15q = bf15q;
        notifyPropertyChanged(BR.bf15q);
    }

    @Bindable
    public String getBf16() {
        return bf16;
    }

    public void setBf16(String bf16) {
        this.bf16 = bf16;

        setBf17(bf16.equals("1") ? this.bf17 : "");

        notifyPropertyChanged(BR.bf16);
    }

    @Bindable
    public String getBf17() {
        return bf17;
    }

    public void setBf17(String bf17) {
        this.bf17 = bf17;
        setBf1701x(bf17.equals("1") ? this.bf1701x : "");
        notifyPropertyChanged(BR.bf17);
    }

    @Bindable
    public String getBf1701x() {
        return bf1701x;
    }

    public void setBf1701x(String bf1701x) {
        this.bf1701x = bf1701x;
        notifyPropertyChanged(BR.bf1701x);
    }

    @Bindable
    public String getBf18() {
        return bf18;
    }

    public void setBf18(String bf18) {
        this.bf18 = bf18;

        setBf19(bf18.equals("2") ? "" : this.bf19);

        notifyPropertyChanged(BR.bf18);
    }

    @Bindable
    public String getBf19() {
        return bf19;
    }

    public void setBf19(String bf19) {
        this.bf19 = bf19;
        setBf1996x(bf19.equals("96") ? this.bf1996x : "");
        notifyPropertyChanged(BR.bf19);
    }

    @Bindable
    public String getBf1996x() {
        return bf1996x;
    }

    public void setBf1996x(String bf1996x) {
        this.bf1996x = bf1996x;
        notifyPropertyChanged(BR.bf1996x);
    }

    @Bindable
    public String getBf20() {
        return bf20;
    }

    public void setBf20(String bf20) {
        this.bf20 = bf20;
        notifyPropertyChanged(BR.bf20);
    }

    @Bindable
    public String getCv01a() {
        return cv01a;
    }

    public void setCv01a(String cv01a) {
        this.cv01a = cv01a;
        notifyPropertyChanged(BR.cv01a);
    }

    @Bindable
    public String getCv01() {
        return cv01;
    }

    public void setCv01(String cv01) {
        this.cv01 = cv01;
        notifyPropertyChanged(BR.cv01);
    }

    @Bindable
    public String getCv02() {
        return cv02;
    }

    public void setCv02(String cv02) {
        this.cv02 = cv02;
        notifyPropertyChanged(BR.cv02);
    }

    @Bindable
    public String getCv03() {
        return cv03;
    }

    public void setCv03(String cv03) {
        this.cv03 = cv03;
        notifyPropertyChanged(BR.cv03);
    }

    @Bindable
    public String getCv04() {
        return cv04;
    }

    public void setCv04(String cv04) {
        this.cv04 = cv04;
        notifyPropertyChanged(BR.cv04);
    }

    @Bindable
    public String getCv05() {
        return cv05;
    }

    public void setCv05(String cv05) {
        this.cv05 = cv05;
        notifyPropertyChanged(BR.cv05);
    }

    @Bindable
    public String getCv0501() {
        return cv0501;
    }

    public void setCv0501(String cv0501) {
        if (this.cv0501.equals(cv0501)) return; // for all checkboxes
        this.cv0501 = cv0501;
        notifyPropertyChanged(BR.cv0501);
    }

    @Bindable
    public String getCv0502() {
        return cv0502;
    }

    public void setCv0502(String cv0502) {
        if (this.cv0502.equals(cv0502)) return; // for all checkboxes
        this.cv0502 = cv0502;
        notifyPropertyChanged(BR.cv0502);
    }

    @Bindable
    public String getCv0503() {
        return cv0503;
    }

    public void setCv0503(String cv0503) {
        if (this.cv0503.equals(cv0503)) return; // for all checkboxes
        this.cv0503 = cv0503;
        notifyPropertyChanged(BR.cv0503);
    }

    @Bindable
    public String getCv0504() {
        return cv0504;
    }

    public void setCv0504(String cv0504) {
        if (this.cv0504.equals(cv0504)) return; // for all checkboxes
        this.cv0504 = cv0504;
        notifyPropertyChanged(BR.cv0504);
    }

    @Bindable
    public String getCv0505() {
        return cv0505;
    }

    public void setCv0505(String cv0505) {
        if (this.cv0505.equals(cv0505)) return; // for all checkboxes
        this.cv0505 = cv0505;
        notifyPropertyChanged(BR.cv0505);
    }

    @Bindable
    public String getCv0506() {
        return cv0506;
    }

    public void setCv0506(String cv0506) {
        if (this.cv0506.equals(cv0506)) return; // for all checkboxes
        this.cv0506 = cv0506;
        notifyPropertyChanged(BR.cv0506);
    }

    @Bindable
    public String getCv0507() {
        return cv0507;
    }

    public void setCv0507(String cv0507) {
        if (this.cv0507.equals(cv0507)) return; // for all checkboxes
        this.cv0507 = cv0507;
        notifyPropertyChanged(BR.cv0507);
    }

    @Bindable
    public String getCv0596() {
        return cv0596;
    }

    public void setCv0596(String cv0596) {
        if (this.cv0596.equals(cv0596)) return; // for all checkboxes
        this.cv0596 = cv0596;
        setCv0596x(cv0596.equals("96") ? this.cv0596x : "");
        notifyPropertyChanged(BR.cv0596);
    }

    @Bindable
    public String getCv0596x() {
        return cv0596x;
    }

    public void setCv0596x(String cv0596x) {
        this.cv0596x = cv0596x;
        notifyPropertyChanged(BR.cv0596x);
    }

    @Bindable
    public String getCv06() {
        return cv06;
    }

    public void setCv06(String cv06) {
        this.cv06 = cv06;
        notifyPropertyChanged(BR.cv06);
    }

    @Bindable
    public String getCv0601() {
        return cv0601;
    }

    public void setCv0601(String cv0601) {
        if (this.cv0601.equals(cv0601)) return; // for all checkboxes
        this.cv0601 = cv0601;
        notifyPropertyChanged(BR.cv0601);
    }

    @Bindable
    public String getCv0602() {
        return cv0602;
    }

    public void setCv0602(String cv0602) {
        if (this.cv0602.equals(cv0602)) return; // for all checkboxes
        this.cv0602 = cv0602;
        notifyPropertyChanged(BR.cv0602);
    }

    @Bindable
    public String getCv0603() {
        return cv0603;
    }

    public void setCv0603(String cv0603) {
        if (this.cv0603.equals(cv0603)) return; // for all checkboxes
        this.cv0603 = cv0603;
        notifyPropertyChanged(BR.cv0603);
    }

    @Bindable
    public String getCv0604() {
        return cv0604;
    }

    public void setCv0604(String cv0604) {
        if (this.cv0604.equals(cv0604)) return; // for all checkboxes
        this.cv0604 = cv0604;
        notifyPropertyChanged(BR.cv0604);
    }

    @Bindable
    public String getCv0605() {
        return cv0605;
    }

    public void setCv0605(String cv0605) {
        if (this.cv0605.equals(cv0605)) return; // for all checkboxes
        this.cv0605 = cv0605;
        notifyPropertyChanged(BR.cv0605);
    }

    @Bindable
    public String getCv0606() {
        return cv0606;
    }

    public void setCv0606(String cv0606) {
        if (this.cv0606.equals(cv0606)) return; // for all checkboxes
        this.cv0606 = cv0606;
        notifyPropertyChanged(BR.cv0606);
    }

    @Bindable
    public String getCv0607() {
        return cv0607;
    }

    public void setCv0607(String cv0607) {
        if (this.cv0607.equals(cv0607)) return; // for all checkboxes
        this.cv0607 = cv0607;
        notifyPropertyChanged(BR.cv0607);
    }

    @Bindable
    public String getCv0608() {
        return cv0608;
    }

    public void setCv0608(String cv0608) {
        if (this.cv0608.equals(cv0608)) return; // for all checkboxes
        this.cv0608 = cv0608;
        notifyPropertyChanged(BR.cv0608);
    }

    @Bindable
    public String getCv0609() {
        return cv0609;
    }

    public void setCv0609(String cv0609) {
        if (this.cv0609.equals(cv0609)) return; // for all checkboxes
        this.cv0609 = cv0609;
        notifyPropertyChanged(BR.cv0609);
    }

    @Bindable
    public String getCv0610() {
        return cv0610;
    }

    public void setCv0610(String cv0610) {
        if (this.cv0610.equals(cv0610)) return; // for all checkboxes
        this.cv0610 = cv0610;
        notifyPropertyChanged(BR.cv0610);
    }

    @Bindable
    public String getCv0611() {
        return cv0611;
    }

    public void setCv0611(String cv0611) {
        if (this.cv0611.equals(cv0611)) return; // for all checkboxes
        this.cv0611 = cv0611;
        notifyPropertyChanged(BR.cv0611);
    }

    @Bindable
    public String getCv0612() {
        return cv0612;
    }

    public void setCv0612(String cv0612) {
        if (this.cv0612.equals(cv0612)) return; // for all checkboxes
        this.cv0612 = cv0612;
        notifyPropertyChanged(BR.cv0612);
    }

    @Bindable
    public String getCv0696() {
        return cv0696;
    }

    public void setCv0696(String cv0696) {
        if (this.cv0696.equals(cv0696)) return; // for all checkboxes
        this.cv0696 = cv0696;
        setCv0696x(cv0696.equals("96") ? this.cv0696x : "");
        notifyPropertyChanged(BR.cv0696);
    }

    @Bindable
    public String getCv0696x() {
        return cv0696x;
    }

    public void setCv0696x(String cv0696x) {
        this.cv0696x = cv0696x;
        notifyPropertyChanged(BR.cv0696x);
    }

    @Bindable
    public String getCv07() {
        return cv07;
    }

    public void setCv07(String cv07) {
        this.cv07 = cv07;
        notifyPropertyChanged(BR.cv07);
    }

    @Bindable
    public String getCv08() {
        return cv08;
    }

    public void setCv08(String cv08) {
        this.cv08 = cv08;
        notifyPropertyChanged(BR.cv08);
    }

    @Bindable
    public String getCv0801() {
        return cv0801;
    }

    public void setCv0801(String cv0801) {
        if (this.cv0801.equals(cv0801)) return; // for all checkboxes
        this.cv0801 = cv0801;
        notifyPropertyChanged(BR.cv0801);
    }

    @Bindable
    public String getCv0802() {
        return cv0802;
    }

    public void setCv0802(String cv0802) {
        if (this.cv0802.equals(cv0802)) return; // for all checkboxes
        this.cv0802 = cv0802;
        notifyPropertyChanged(BR.cv0802);
    }

    @Bindable
    public String getCv0803() {
        return cv0803;
    }

    public void setCv0803(String cv0803) {
        if (this.cv0803.equals(cv0803)) return; // for all checkboxes
        this.cv0803 = cv0803;
        notifyPropertyChanged(BR.cv0803);
    }

    @Bindable
    public String getCv0804() {
        return cv0804;
    }

    public void setCv0804(String cv0804) {
        if (this.cv0804.equals(cv0804)) return; // for all checkboxes
        this.cv0804 = cv0804;
        notifyPropertyChanged(BR.cv0804);
    }

    @Bindable
    public String getCv0805() {
        return cv0805;
    }

    public void setCv0805(String cv0805) {
        if (this.cv0805.equals(cv0805)) return; // for all checkboxes
        this.cv0805 = cv0805;
        notifyPropertyChanged(BR.cv0805);
    }

    @Bindable
    public String getCv0806() {
        return cv0806;
    }

    public void setCv0806(String cv0806) {
        if (this.cv0806.equals(cv0806)) return; // for all checkboxes
        this.cv0806 = cv0806;
        notifyPropertyChanged(BR.cv0806);
    }

    @Bindable
    public String getCv0807() {
        return cv0807;
    }

    public void setCv0807(String cv0807) {
        if (this.cv0807.equals(cv0807)) return; // for all checkboxes
        this.cv0807 = cv0807;
        notifyPropertyChanged(BR.cv0807);
    }

    @Bindable
    public String getCv0898() {
        return cv0898;
    }

    public void setCv0898(String cv0898) {
        if (this.cv0898.equals(cv0898)) return; // for all checkboxes
        this.cv0898 = cv0898;
        setCv0801("");
        setCv0802("");
        setCv0803("");
        setCv0804("");
        setCv0805("");
        setCv0806("");
        setCv0807("");
        setCv0896("");
        notifyPropertyChanged(BR.cv0898);
    }

    @Bindable
    public String getCv0896() {
        return cv0896;
    }

    public void setCv0896(String cv0896) {
        if (this.cv0896.equals(cv0896)) return; // for all checkboxes
        this.cv0896 = cv0896;
        setCv0896x(cv0896.equals("96") ? this.cv0896x : "");
        notifyPropertyChanged(BR.cv0896);
    }

    @Bindable
    public String getCv0896x() {
        return cv0896x;
    }

    public void setCv0896x(String cv0896x) {
        this.cv0896x = cv0896x;
        notifyPropertyChanged(BR.cv0896x);
    }

    @Bindable
    public String getCv09() {
        return cv09;
    }

    public void setCv09(String cv09) {
        this.cv09 = cv09;
        notifyPropertyChanged(BR.cv09);
    }

    @Bindable
    public String getCv0901() {
        return cv0901;
    }

    public void setCv0901(String cv0901) {
        if (this.cv0901.equals(cv0901)) return; // for all checkboxes
        this.cv0901 = cv0901;
        notifyPropertyChanged(BR.cv0901);
    }

    @Bindable
    public String getCv0902() {
        return cv0902;
    }

    public void setCv0902(String cv0902) {
        if (this.cv0902.equals(cv0902)) return; // for all checkboxes
        this.cv0902 = cv0902;
        notifyPropertyChanged(BR.cv0902);
    }

    @Bindable
    public String getCv0903() {
        return cv0903;
    }

    public void setCv0903(String cv0903) {
        if (this.cv0903.equals(cv0903)) return; // for all checkboxes
        this.cv0903 = cv0903;
        notifyPropertyChanged(BR.cv0903);
    }

    @Bindable
    public String getCv0904() {
        return cv0904;
    }

    public void setCv0904(String cv0904) {
        if (this.cv0904.equals(cv0904)) return; // for all checkboxes
        this.cv0904 = cv0904;
        notifyPropertyChanged(BR.cv0904);
    }

    @Bindable
    public String getCv0905() {
        return cv0905;
    }

    public void setCv0905(String cv0905) {
        if (this.cv0905.equals(cv0905)) return; // for all checkboxes
        this.cv0905 = cv0905;
        notifyPropertyChanged(BR.cv0905);
    }

    @Bindable
    public String getCv0906() {
        return cv0906;
    }

    public void setCv0906(String cv0906) {
        if (this.cv0906.equals(cv0906)) return; // for all checkboxes
        this.cv0906 = cv0906;
        notifyPropertyChanged(BR.cv0906);
    }

    @Bindable
    public String getCv0907() {
        return cv0907;
    }

    public void setCv0907(String cv0907) {
        if (this.cv0907.equals(cv0907)) return; // for all checkboxes
        this.cv0907 = cv0907;
        notifyPropertyChanged(BR.cv0907);
    }

    @Bindable
    public String getCv0908() {
        return cv0908;
    }

    public void setCv0908(String cv0908) {
        if (this.cv0908.equals(cv0908)) return; // for all checkboxes
        this.cv0908 = cv0908;
        notifyPropertyChanged(BR.cv0908);
    }

    @Bindable
    public String getCv0998() {
        return cv0998;
    }

    public void setCv0998(String cv0998) {
        if (this.cv0998.equals(cv0998)) return; // for all checkboxes
        this.cv0998 = cv0998;

        setCv0901(cv0998.equals("98") ? "" : this.cv0901);
        setCv0902(cv0998.equals("98") ? "" : this.cv0902);
        setCv0903(cv0998.equals("98") ? "" : this.cv0903);
        setCv0904(cv0998.equals("98") ? "" : this.cv0904);
        setCv0905(cv0998.equals("98") ? "" : this.cv0905);
        setCv0906(cv0998.equals("98") ? "" : this.cv0906);
        setCv0907(cv0998.equals("98") ? "" : this.cv0907);
        setCv0908(cv0998.equals("98") ? "" : this.cv0908);
        setCv0996(cv0998.equals("98") ? "" : this.cv0996);
        setCv0996x(cv0998.equals("98") ? "" : this.cv0996x);

        notifyPropertyChanged(BR.cv0998);
    }

    @Bindable
    public String getCv0996() {
        return cv0996;
    }

    public void setCv0996(String cv0996) {
        if (this.cv0996.equals(cv0996)) return; // for all checkboxes
        this.cv0996 = cv0996;
        setCv0996x(cv0996.equals("96") ? this.cv0996x : "");
        notifyPropertyChanged(BR.cv0996);
    }

    @Bindable
    public String getCv0996x() {
        return cv0996x;
    }

    public void setCv0996x(String cv0996x) {
        this.cv0996x = cv0996x;
        notifyPropertyChanged(BR.cv0996x);
    }

    @Bindable
    public String getCv10() {
        return cv10;
    }

    public void setCv10(String cv10) {
        this.cv10 = cv10;
        notifyPropertyChanged(BR.cv10);
    }

    @Bindable
    public String getCv1001() {
        return cv1001;
    }

    public void setCv1001(String cv1001) {
        if (this.cv1001.equals(cv1001)) return; // for all checkboxes
        this.cv1001 = cv1001;
        notifyPropertyChanged(BR.cv1001);
    }

    @Bindable
    public String getCv1002() {
        return cv1002;
    }

    public void setCv1002(String cv1002) {
        if (this.cv1002.equals(cv1002)) return; // for all checkboxes
        this.cv1002 = cv1002;
        notifyPropertyChanged(BR.cv1002);
    }

    @Bindable
    public String getCv1003() {
        return cv1003;
    }

    public void setCv1003(String cv1003) {
        if (this.cv1003.equals(cv1003)) return; // for all checkboxes
        this.cv1003 = cv1003;
        notifyPropertyChanged(BR.cv1003);
    }

    @Bindable
    public String getCv1004() {
        return cv1004;
    }

    public void setCv1004(String cv1004) {
        if (this.cv1004.equals(cv1004)) return; // for all checkboxes
        this.cv1004 = cv1004;
        notifyPropertyChanged(BR.cv1004);
    }

    @Bindable
    public String getCv1005() {
        return cv1005;
    }

    public void setCv1005(String cv1005) {
        if (this.cv1005.equals(cv1005)) return; // for all checkboxes
        this.cv1005 = cv1005;
        notifyPropertyChanged(BR.cv1005);
    }

    @Bindable
    public String getCv1006() {
        return cv1006;
    }

    public void setCv1006(String cv1006) {
        if (this.cv1006.equals(cv1006)) return; // for all checkboxes
        this.cv1006 = cv1006;
        notifyPropertyChanged(BR.cv1006);
    }

    @Bindable
    public String getCv1007() {
        return cv1007;
    }

    public void setCv1007(String cv1007) {
        if (this.cv1007.equals(cv1007)) return; // for all checkboxes
        this.cv1007 = cv1007;
        notifyPropertyChanged(BR.cv1007);
    }

    @Bindable
    public String getCv1008() {
        return cv1008;
    }

    public void setCv1008(String cv1008) {
        if (this.cv1008.equals(cv1008)) return; // for all checkboxes
        this.cv1008 = cv1008;
        notifyPropertyChanged(BR.cv1008);
    }

    @Bindable
    public String getCv1009() {
        return cv1009;
    }

    public void setCv1009(String cv1009) {
        if (this.cv1009.equals(cv1009)) return; // for all checkboxes
        this.cv1009 = cv1009;
        notifyPropertyChanged(BR.cv1009);
    }

    @Bindable
    public String getCv1098() {
        return cv1098;
    }

    public void setCv1098(String cv1098) {
        if (this.cv1098.equals(cv1098)) return; // for all checkboxes
        this.cv1098 = cv1098;

        setCv1001(cv1098.equals("98") ? "" : this.cv1001);
        setCv1002(cv1098.equals("98") ? "" : this.cv1002);
        setCv1003(cv1098.equals("98") ? "" : this.cv1003);
        setCv1004(cv1098.equals("98") ? "" : this.cv1004);
        setCv1005(cv1098.equals("98") ? "" : this.cv1005);
        setCv1006(cv1098.equals("98") ? "" : this.cv1006);
        setCv1007(cv1098.equals("98") ? "" : this.cv1007);
        setCv1008(cv1098.equals("98") ? "" : this.cv1008);
        setCv1009(cv1098.equals("98") ? "" : this.cv1009);
        setCv1096(cv1098.equals("98") ? "" : this.cv1096);
        setCv1096x(cv1098.equals("98") ? "" : this.cv1096x);

        notifyPropertyChanged(BR.cv1098);
    }

    @Bindable
    public String getCv1096() {
        return cv1096;
    }

    public void setCv1096(String cv1096) {
        if (this.cv1096.equals(cv1096)) return; // for all checkboxes
        this.cv1096 = cv1096;
        setCv1096x(cv1096.equals("96") ? this.cv1096x : "");
        notifyPropertyChanged(BR.cv1096);
    }

    @Bindable
    public String getCv1096x() {
        return cv1096x;
    }

    public void setCv1096x(String cv1096x) {
        this.cv1096x = cv1096x;
        notifyPropertyChanged(BR.cv1096x);
    }

    @Bindable
    public String getCv11() {
        return cv11;
    }

    public void setCv11(String cv11) {
        this.cv11 = cv11;
        notifyPropertyChanged(BR.cv11);
    }

    @Bindable
    public String getCv12() {
        return cv12;
    }

    public void setCv12(String cv12) {
        this.cv12 = cv12;
        setCv1296x(cv12.equals("96") ? this.cv1296x : "");
        notifyPropertyChanged(BR.cv12);
    }

    @Bindable
    public String getCv1296x() {
        return cv1296x;
    }

    public void setCv1296x(String cv1296x) {
        this.cv1296x = cv1296x;
        notifyPropertyChanged(BR.cv1296x);
    }

    @Bindable
    public String getCv13() {
        return cv13;
    }

    public void setCv13(String cv13) {
        this.cv13 = cv13;
        notifyPropertyChanged(BR.cv13);
    }

    @Bindable
    public String getCv14() {
        return cv14;
    }

    public void setCv14(String cv14) {
        this.cv14 = cv14;
        notifyPropertyChanged(BR.cv14);
    }

    @Bindable
    public String getCv15() {
        return cv15;
    }

    public void setCv15(String cv15) {
        this.cv15 = cv15;
        notifyPropertyChanged(BR.cv15);
    }

    @Bindable
    public String getCv16() {
        return cv16;
    }

    public void setCv16(String cv16) {
        this.cv16 = cv16;
        setCv1696x(cv16.equals("96") ? this.cv1696x : "");
        notifyPropertyChanged(BR.cv16);
    }

    @Bindable
    public String getCv1696x() {
        return cv1696x;
    }

    public void setCv1696x(String cv1696x) {
        this.cv1696x = cv1696x;
        notifyPropertyChanged(BR.cv1696x);
    }

    @Bindable
    public String getCv17() {
        return cv17;
    }

    public void setCv17(String cv17) {
        this.cv17 = cv17;
        notifyPropertyChanged(BR.cv17);
    }

    @Bindable
    public String getCv18() {
        return cv18;
    }

    public void setCv18(String cv18) {
        this.cv18 = cv18;
        setCv1896x(cv18.equals("96") ? this.cv1896x : "");
        notifyPropertyChanged(BR.cv18);
    }

    @Bindable
    public String getCv1896x() {
        return cv1896x;
    }

    public void setCv1896x(String cv1896x) {
        this.cv1896x = cv1896x;
        notifyPropertyChanged(BR.cv1896x);
    }

    @Bindable
    public String getCv19() {
        return cv19;
    }

    public void setCv19(String cv19) {
        this.cv19 = cv19;
        setCv1996x(cv19.equals("96") ? this.cv1996x : "");
        notifyPropertyChanged(BR.cv19);
    }

    @Bindable
    public String getCv1996x() {
        return cv1996x;
    }

    public void setCv1996x(String cv1996x) {
        this.cv1996x = cv1996x;
        notifyPropertyChanged(BR.cv1996x);
    }

    @Bindable
    public String getCv20() {
        return cv20;
    }

    public void setCv20(String cv20) {
        this.cv20 = cv20;
        notifyPropertyChanged(BR.cv20);
    }

    @Bindable
    public String getCv21() {
        return cv21;
    }

    public void setCv21(String cv21) {
        this.cv21 = cv21;
        notifyPropertyChanged(BR.cv21);
    }

    @Bindable
    public String getCv2101() {
        return cv2101;
    }

    public void setCv2101(String cv2101) {
        if (this.cv2101.equals(cv2101)) return; // for all checkboxes
        this.cv2101 = cv2101;
        notifyPropertyChanged(BR.cv2101);
    }

    @Bindable
    public String getCv2102() {
        return cv2102;
    }

    public void setCv2102(String cv2102) {
        if (this.cv2102.equals(cv2102)) return; // for all checkboxes
        this.cv2102 = cv2102;
        notifyPropertyChanged(BR.cv2102);
    }

    @Bindable
    public String getCv2103() {
        return cv2103;
    }

    public void setCv2103(String cv2103) {
        if (this.cv2103.equals(cv2103)) return; // for all checkboxes
        this.cv2103 = cv2103;
        notifyPropertyChanged(BR.cv2103);
    }

    @Bindable
    public String getCv2104() {
        return cv2104;
    }

    public void setCv2104(String cv2104) {
        if (this.cv2104.equals(cv2104)) return; // for all checkboxes
        this.cv2104 = cv2104;
        notifyPropertyChanged(BR.cv2104);
    }

    @Bindable
    public String getCv2105() {
        return cv2105;
    }

    public void setCv2105(String cv2105) {
        if (this.cv2105.equals(cv2105)) return; // for all checkboxes
        this.cv2105 = cv2105;
        notifyPropertyChanged(BR.cv2105);
    }

    @Bindable
    public String getCv2106() {
        return cv2106;
    }

    public void setCv2106(String cv2106) {
        if (this.cv2106.equals(cv2106)) return; // for all checkboxes
        this.cv2106 = cv2106;
        notifyPropertyChanged(BR.cv2106);
    }

    @Bindable
    public String getCv2107() {
        return cv2107;
    }

    public void setCv2107(String cv2107) {
        if (this.cv2107.equals(cv2107)) return; // for all checkboxes
        this.cv2107 = cv2107;
        notifyPropertyChanged(BR.cv2107);
    }

    @Bindable
    public String getCv2108() {
        return cv2108;
    }

    public void setCv2108(String cv2108) {
        if (this.cv2108.equals(cv2108)) return; // for all checkboxes
        this.cv2108 = cv2108;
        notifyPropertyChanged(BR.cv2108);
    }

    @Bindable
    public String getCv2109() {
        return cv2109;
    }

    public void setCv2109(String cv2109) {
        if (this.cv2109.equals(cv2109)) return; // for all checkboxes
        this.cv2109 = cv2109;
        notifyPropertyChanged(BR.cv2109);
    }

    @Bindable
    public String getCv2198() {
        return cv2198;
    }

    public void setCv2198(String cv2198) {
        if (this.cv2198.equals(cv2198)) return; // for all checkboxes
        this.cv2198 = cv2198;

        setCv2101(cv2198.equals("98") ? "" : this.cv2101);
        setCv2102(cv2198.equals("98") ? "" : this.cv2102);
        setCv2103(cv2198.equals("98") ? "" : this.cv2103);
        setCv2104(cv2198.equals("98") ? "" : this.cv2104);
        setCv2105(cv2198.equals("98") ? "" : this.cv2105);
        setCv2106(cv2198.equals("98") ? "" : this.cv2106);
        setCv2107(cv2198.equals("98") ? "" : this.cv2107);
        setCv2108(cv2198.equals("98") ? "" : this.cv2108);
        setCv2109(cv2198.equals("98") ? "" : this.cv2109);
        setCv2196(cv2198.equals("98") ? "" : this.cv2196);
        setCv2196x(cv2198.equals("98") ? "" : this.cv2196x);

        notifyPropertyChanged(BR.cv2198);
    }

    @Bindable
    public String getCv2196() {
        return cv2196;
    }

    public void setCv2196(String cv2196) {
        if (this.cv2196.equals(cv2196)) return; // for all checkboxes
        this.cv2196 = cv2196;
        setCv2196x(cv2196.equals("96") ? this.cv2196x : "");
        notifyPropertyChanged(BR.cv2196);
    }

    @Bindable
    public String getCv2196x() {
        return cv2196x;
    }

    public void setCv2196x(String cv2196x) {
        this.cv2196x = cv2196x;
        notifyPropertyChanged(BR.cv2196x);
    }


    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));

        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_CLUSTER_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_INDEXED));
        this.ageInDays = cursor.getLong(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_AGE_DAYS));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.cstatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_CSTATUS));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNC_DATE));

        sCBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCB)));
        sCSHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCS)));
        sIMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SIM)));
        sPDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SPD)));
        sBFHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SBF)));
        sCVHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCV)));
        //CaluculateAge();

        return this;
    }


    public void sCBHydrate(String string) throws JSONException {
        Log.d(TAG, "sCBHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.cb01 = json.getString("cb01");
            this.cb02 = json.getString("cb02");
            this.cb03 = json.getString("cb03");
            this.cb04dd = json.getString("cb04dd");
            this.cb04mm = json.getString("cb04mm");
            this.cb04yy = json.getString("cb04yy");
            this.cb04dk = json.getString("cb04dk");

            this.cb0501 = json.getString("cb0501");
            this.cb0502 = json.getString("cb0502");
            this.cb06 = json.getString("cb06");
            this.cb15 = json.getString("cb15");
            this.cb17 = json.getString("cb17");
            this.cb16 = json.getString("cb16");
            this.cb07 = json.getString("cb07");
            this.cb08 = json.getString("cb08");
            this.cb09 = json.getString("cb09");
            this.cb10 = json.getString("cb10");
            this.cb1096x = json.getString("cb1096x");
            this.cb11 = json.getString("cb11");
            this.cb12 = json.getString("cb12");
            this.cb13 = json.getString("cb13");
            this.cb14 = json.getString("cb14");
            this.cb1496x = json.getString("cb1496x");

            this.ageInMonths = json.getLong("ageInMonths");
            this.isYoungest = json.getString("isYoungest");

        }

    }

    public void sCSHydrate(String string) throws JSONException {
        Log.d(TAG, "sCSHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.cs01 = json.getString("cs01");
            this.cs02 = json.getString("cs02");
            this.cs02a = json.getString("cs02a");
            this.cs02b = json.getString("cs02b");
            this.cs03 = json.getString("cs03");
            this.cs04 = json.getString("cs04");
            this.cs05 = json.getString("cs05");
            this.cs06 = json.getString("cs06");
            this.cs07 = json.getString("cs07");
            this.cs07961x = json.getString("cs07961x");
            this.cs07962x = json.getString("cs07962x");
            this.cs0801 = json.getString("cs0801");
            this.cs0802 = json.getString("cs0802");
            this.cs0803 = json.getString("cs0803");
            this.cs0804 = json.getString("cs0804");
            this.cs0805 = json.getString("cs0805");
            this.cs0806 = json.getString("cs0806");
            this.cs0807 = json.getString("cs0807");
            this.cs0808 = json.getString("cs0808");
            this.cs0809 = json.getString("cs0809");
            this.cs0810 = json.getString("cs0810");
            this.cs0896 = json.getString("cs0896");
            this.cs0896x = json.getString("cs0896x");
            this.cs08a = json.getString("cs08a");
            this.cs08b = json.getString("cs08b");
            this.cs09 = json.getString("cs09");
            this.cs0996x = json.getString("cs0996x");
            this.cs10 = json.getString("cs10");
            this.cs11 = json.getString("cs11");
            this.cs12 = json.getString("cs12");
            this.cs13 = json.getString("cs13");
            this.cs14 = json.getString("cs14");
            this.cs15 = json.getString("cs15");
            this.cs1596x = json.getString("cs1596x");
            this.cs16 = json.getString("cs16");
            this.cs17 = json.getString("cs17");
            this.cs17961x = json.getString("cs17961x");
            this.cs17962x = json.getString("cs17962x");
            this.cs17a = json.getString("cs17a");
            this.cs17b = json.getString("cs17b");
            this.cs1802 = json.getString("cs1802");
            this.cs1803 = json.getString("cs1803");
            this.cs1804 = json.getString("cs1804");
            this.cs1805 = json.getString("cs1805");
            this.cs1806 = json.getString("cs1806");
            this.cs1807 = json.getString("cs1807");
            this.cs1808 = json.getString("cs1808");
            this.cs1896 = json.getString("cs1896");
            this.cs1896x = json.getString("cs1896x");
            this.cs19 = json.getString("cs19");
            this.cs1996x = json.getString("cs1996x");
            this.cs20 = json.getString("cs20");
            this.cs21 = json.getString("cs21");

        }
    }

    public void sIMHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im02a = json.getString("im02a");
            this.im02a96x = json.getString("im02a96x");
            this.im03 = json.getString("im03");
            this.im0396x = json.getString("im0396x");
            this.im04dd = json.getString("im04dd");
            this.trueAgeInMonths = json.has("trueAgeInMonths") ? Long.parseLong(json.getString("trueAgeInMonths")) : 0;
            this.im04mm = json.getString("im04mm");
            this.im04yy = json.getString("im04yy");
            this.im0497 = json.getString("im0497");
            this.backfilename = json.getString("backfilename");
            this.frontfilename = json.getString("frontfilename");
            this.im0501dd = json.getString("im0501dd");
            this.im0501mm = json.getString("im0501mm");
            this.im0501yy = json.getString("im0501yy");
            this.im0502dd = json.getString("im0502dd");
            this.im0502mm = json.getString("im0502mm");
            this.im0502yy = json.getString("im0502yy");
            this.im0503dd = json.getString("im0503dd");
            this.im0503mm = json.getString("im0503mm");
            this.im0503yy = json.getString("im0503yy");
            this.im0504dd = json.getString("im0504dd");
            this.im0504mm = json.getString("im0504mm");
            this.im0504yy = json.getString("im0504yy");
            this.im0505dd = json.getString("im0505dd");
            this.im0505mm = json.getString("im0505mm");
            this.im0505yy = json.getString("im0505yy");
            this.im0506dd = json.getString("im0506dd");
            this.im0506mm = json.getString("im0506mm");
            this.im0506yy = json.getString("im0506yy");
            this.im0507dd = json.getString("im0507dd");
            this.im0507mm = json.getString("im0507mm");
            this.im0507yy = json.getString("im0507yy");
            this.im0508dd = json.getString("im0508dd");
            this.im0508mm = json.getString("im0508mm");
            this.im0508yy = json.getString("im0508yy");
            this.im0509dd = json.getString("im0509dd");
            this.im0509mm = json.getString("im0509mm");
            this.im0509yy = json.getString("im0509yy");
            this.im0510dd = json.getString("im0510dd");
            this.im0510mm = json.getString("im0510mm");
            this.im0510yy = json.getString("im0510yy");
            this.im0510add = json.getString("im0510add");
            this.im0510amm = json.getString("im0510amm");
            this.im0510ayy = json.getString("im0510ayy");
            this.im0511dd = json.getString("im0511dd");
            this.im0511mm = json.getString("im0511mm");
            this.im0511yy = json.getString("im0511yy");
            this.im0512dd = json.getString("im0512dd");
            this.im0512mm = json.getString("im0512mm");
            this.im0512yy = json.getString("im0512yy");
            this.im0513dd = json.getString("im0513dd");
            this.im0513mm = json.getString("im0513mm");
            this.im0513yy = json.getString("im0513yy");
            this.im0514dd = json.getString("im0514dd");
            this.im0514mm = json.getString("im0514mm");
            this.im0514yy = json.getString("im0514yy");
            this.im0515dd = json.getString("im0515dd");
            this.im0515mm = json.getString("im0515mm");
            this.im0515yy = json.getString("im0515yy");
            this.im0515bdd = json.getString("im0515bdd");
            this.im0515bmm = json.getString("im0515bmm");
            this.im0515byy = json.getString("im0515byy");
            this.im0516dd = json.getString("im0516dd");
            this.im0516mm = json.getString("im0516mm");
            this.im0516yy = json.getString("im0516yy");
            this.im0517dd = json.getString("im0517dd");
            this.im0517mm = json.getString("im0517mm");
            this.im0517yy = json.getString("im0517yy");
            //this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im10a = json.getString("im10a");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im12a = json.getString("im12a");
            this.im12a98 = json.getString("im12a98");
            this.im14 = json.getString("im14");
            this.im15 = json.getString("im15");
            this.im16 = json.getString("im16");
            this.im17 = json.getString("im17");
            this.im18 = json.getString("im18");
            this.im19 = json.getString("im19");
            this.im20 = json.getString("im20");
            this.im20a = json.getString("im20a");
            this.im21 = json.getString("im21");
            this.im22 = json.getString("im22");
            this.im22a = json.getString("im22a");
            this.im23 = json.getString("im23");
            this.im236x = json.getString("im236x");
            this.im23a = json.getString("im23a");
            this.im24 = json.getString("im24");
            this.im2417x = json.getString("im2417x");
            this.im24a = json.getString("im24a");
            this.im24b = json.getString("im24b");
            this.im24b98 = json.getString("im24b98");
            this.im24c = json.getString("im24c");
            /*    this.im24d = json.getString("im24d");*/
            this.im25 = json.getString("im25");
            this.im29 = json.getString("im29");
            this.im30 = json.getString("im30");
            this.im30_96x = json.getString("im30_96x");
            //this.im26 = json.getString("im26");
            this.im050198 = json.getString("im050198");
            this.im050298 = json.getString("im050298");
            this.im050398 = json.getString("im050398");
            this.im050498 = json.getString("im050498");
            this.im050598 = json.getString("im050598");
            this.im050698 = json.getString("im050698");
            this.im050798 = json.getString("im050798");
            this.im050898 = json.getString("im050898");
            this.im050998 = json.getString("im050998");
            this.im051098 = json.getString("im051098");
            this.im0510a98 = json.getString("im0510a98");
            this.im051198 = json.getString("im051198");
            this.im051298 = json.getString("im051298");
            this.im051398 = json.getString("im051398");
            this.im051498 = json.getString("im051498");
            this.im051598 = json.getString("im051598");
            this.im0515b98 = json.getString("im0515b98");
            this.im051698 = json.getString("im051698");
            this.im051798 = json.getString("im051798");
            this.im050295 = json.getString("im050295");
            this.im050495 = json.getString("im050495");
            this.im050595 = json.getString("im050595");
            this.im050695 = json.getString("im050695");
            this.im050895 = json.getString("im050895");
            this.im050995 = json.getString("im050995");
            this.im051095 = json.getString("im051095");
            this.im0510a95 = json.getString("im0510a95");
            this.im051295 = json.getString("im051295");
            this.im051395 = json.getString("im051395");
            this.im051495 = json.getString("im051495");
            this.im0515b95 = json.getString("im0515b95");
            this.im051795 = json.getString("im051795");
        }
    }

    public void sPDHydrate(String string) throws JSONException {
        Log.d(TAG, "sPDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.pd01 = json.getString("pd01");
            this.pd02 = json.getString("pd02");
            this.pd03 = json.getString("pd03");
            this.pd04 = json.getString("pd04");
            this.pd05 = json.getString("pd05");
            this.pd0596x = json.getString("pd0596x");
            this.pd06 = json.getString("pd06");
            this.pd06961x = json.getString("pd06961x");
            this.pd06962x = json.getString("pd06962x");
            this.pd07 = json.getString("pd07");
            this.pd0701x = json.getString("pd0701x");
            this.pd08a01 = json.getString("pd08a01");
            this.pd08a02 = json.getString("pd08a02");
            this.pd08a03 = json.getString("pd08a03");
            this.pd08a04 = json.getString("pd08a04");
            this.pd08a05 = json.getString("pd08a05");
            this.pd08a06 = json.getString("pd08a06");
            this.pd08a07 = json.getString("pd08a07");
            this.pd08a08 = json.getString("pd08a08");
            this.pd08a09 = json.getString("pd08a09");
            this.pd08a96 = json.getString("pd08a96");
            this.pd08a96x = json.getString("pd08a96x");
            this.pd08 = json.getString("pd08");
            this.pd08b = json.getString("pd08b");
            this.pd08c = json.getString("pd08c");
            this.pd09 = json.getString("pd09");
            this.pd10 = json.getString("pd10");
            this.pd1101 = json.getString("pd1101");
            this.pd1102 = json.getString("pd1102");
            this.pd12 = json.getString("pd12");
            this.pd1296x = json.getString("pd1296x");
            this.pd13 = json.getString("pd13");
            this.pd13961x = json.getString("pd13961x");
            this.pd13962x = json.getString("pd13962x");
            this.pd14 = json.getString("pd14");
            this.pd1496x = json.getString("pd1496x");
            this.pd15 = json.getString("pd15");
            this.pd1601 = json.getString("pd1601");
            this.pd1602 = json.getString("pd1602");
            this.pd1603 = json.getString("pd1603");
            this.pd1604 = json.getString("pd1604");
            this.pd1605 = json.getString("pd1605");
            this.pd1606 = json.getString("pd1606");
            this.pd1607 = json.getString("pd1607");
            this.pd1696 = json.getString("pd1696");
            this.pd1696x = json.getString("pd1696x");
            this.pd17 = json.getString("pd17");
            this.pd1701x = json.getString("pd1701x");
            this.pd1702x = json.getString("pd1702x");
            this.pd1703x = json.getString("pd1703x");
            this.pd18 = json.getString("pd18");
            this.pd19 = json.getString("pd19");
            this.pd2001 = json.getString("pd2001");
            this.pd2002 = json.getString("pd2002");
            this.pd2003 = json.getString("pd2003");
            this.pd2004 = json.getString("pd2004");
            this.pd2005 = json.getString("pd2005");
            this.pd2006 = json.getString("pd2006");
            this.pd2007 = json.getString("pd2007");
            this.pd2096 = json.getString("pd2096");
            this.pd2096x = json.getString("pd2096x");
            this.pd21 = json.getString("pd21");
            this.pd2101x = json.getString("pd2101x");
            this.pd2102x = json.getString("pd2102x");
            this.pd2103x = json.getString("pd2103x");
            this.pd22 = json.getString("pd22");
            this.pd23 = json.getString("pd23");
            this.pd2401 = json.getString("pd2401");
            this.pd2402 = json.getString("pd2402");
            this.pd2403 = json.getString("pd2403");
            this.pd2404 = json.getString("pd2404");
            this.pd2405 = json.getString("pd2405");
            this.pd2406 = json.getString("pd2406");
            this.pd2496 = json.getString("pd2496");
            this.pd2496x = json.getString("pd2496x");
            this.pd2498 = json.getString("pd2498");

        }

    }

    public void sBFHydrate(String string) throws JSONException {
        Log.d(TAG, "sBFHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.bf01 = json.getString("bf01");
            this.bf02 = json.getString("bf02");
            this.bf3y = json.getString("bf3y");
            this.bf03m = json.getString("bf03m");
            this.bf3d = json.getString("bf3d");
            this.bf03a01 = json.getString("bf03a01");
            this.bf03a02 = json.getString("bf03a02");
            this.bf04 = json.getString("bf04");
            this.bf05 = json.getString("bf05");
            this.bf0502x = json.getString("bf0502x");
            this.bf0503x = json.getString("bf0503x");
            this.bf06 = json.getString("bf06");
            this.bf07 = json.getString("bf07");
            this.bf0796x = json.getString("bf0796x");
            this.bf08 = json.getString("bf08");
            this.bf0901 = json.getString("bf0901");
            this.bf0902 = json.getString("bf0902");
            this.bf0903 = json.getString("bf0903");
            this.bf0904 = json.getString("bf0904");
            this.bf0905 = json.getString("bf0905");
            this.bf0906 = json.getString("bf0906");
            this.bf0907 = json.getString("bf0907");
            this.bf0908 = json.getString("bf0908");
            this.bf0909 = json.getString("bf0909");
            this.bf0910 = json.getString("bf0910");
            this.bf0999 = json.getString("bf0999");
            this.bf0996 = json.getString("bf0996");
            this.bf0996x = json.getString("bf0996x");
            this.bf10 = json.getString("bf10");
            this.bf11 = json.getString("bf11");
            this.bf12 = json.getString("bf12");
            this.bf13 = json.getString("bf13");
            this.bf14a = json.getString("bf14a");
            this.bf14b = json.getString("bf14b");
            this.bf14b01x = json.getString("bf14b01x");
            this.bf14c = json.getString("bf14c");
            this.bf14c01x = json.getString("bf14c01x");
            this.bf14d = json.getString("bf14d");
            this.bf14e = json.getString("bf14e");
            this.bf14f = json.getString("bf14f");
            this.bf14f01x = json.getString("bf14f01x");
            this.bf14g = json.getString("bf14g");
            this.bf14h = json.getString("bf14h");
            this.bf14i = json.getString("bf14i");
            this.bf15a = json.getString("bf15a");
            this.bf15b = json.getString("bf15b");
            this.bf15c = json.getString("bf15c");
            this.bf15d = json.getString("bf15d");
            this.bf15e = json.getString("bf15e");
            this.bf15f = json.getString("bf15f");
            this.bf15g = json.getString("bf15g");
            this.bf15h = json.getString("bf15h");
            this.bf15i = json.getString("bf15i");
            this.bf15j = json.getString("bf15j");
            this.bf15k = json.getString("bf15k");
            this.bf15l = json.getString("bf15l");
            this.bf15m = json.getString("bf15m");
            this.bf15n = json.getString("bf15n");
            this.bf15o = json.getString("bf15o");
            this.bf15p = json.getString("bf15p");
            this.bf15q = json.getString("bf15q");
            this.bf16 = json.getString("bf16");
            this.bf17 = json.getString("bf17");
            this.bf1701x = json.getString("bf1701x");
            this.bf18 = json.getString("bf18");
            this.bf19 = json.getString("bf19");
            this.bf1996x = json.getString("bf1996x");
            this.bf20 = json.getString("bf20");

        }

    }

    public void sCVHydrate(String string) throws JSONException {
        Log.d(TAG, "sCVHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.cv01a = json.getString("cv01a");
            this.cv01 = json.getString("cv01");
            this.cv02 = json.getString("cv02");
            this.cv03 = json.getString("cv03");
            this.cv04 = json.getString("cv04");
            this.cv0501 = json.getString("cv0501");
            this.cv0502 = json.getString("cv0502");
            this.cv0503 = json.getString("cv0503");
            this.cv0504 = json.getString("cv0504");
            this.cv0505 = json.getString("cv0505");
            this.cv0506 = json.getString("cv0506");
            this.cv0507 = json.getString("cv0507");
            this.cv0596 = json.getString("cv0596");
            this.cv0596x = json.getString("cv0596x");
            this.cv0601 = json.getString("cv0601");
            this.cv0602 = json.getString("cv0602");
            this.cv0603 = json.getString("cv0603");
            this.cv0604 = json.getString("cv0604");
            this.cv0605 = json.getString("cv0605");
            this.cv0606 = json.getString("cv0606");
            this.cv0607 = json.getString("cv0607");
            this.cv0608 = json.getString("cv0608");
            this.cv0609 = json.getString("cv0609");
            this.cv0610 = json.getString("cv0610");
            this.cv0611 = json.getString("cv0611");
            this.cv0612 = json.getString("cv0612");
            this.cv0696 = json.getString("cv0696");
            this.cv0696x = json.getString("cv0696x");
            this.cv07 = json.getString("cv07");
            this.cv0801 = json.getString("cv0801");
            this.cv0802 = json.getString("cv0802");
            this.cv0803 = json.getString("cv0803");
            this.cv0804 = json.getString("cv0804");
            this.cv0805 = json.getString("cv0805");
            this.cv0806 = json.getString("cv0806");
            this.cv0807 = json.getString("cv0807");
            this.cv0898 = json.getString("cv0898");
            this.cv0896 = json.getString("cv0896");
            this.cv0896x = json.getString("cv0896x");
            this.cv0901 = json.getString("cv0901");
            this.cv0902 = json.getString("cv0902");
            this.cv0903 = json.getString("cv0903");
            this.cv0904 = json.getString("cv0904");
            this.cv0905 = json.getString("cv0905");
            this.cv0906 = json.getString("cv0906");
            this.cv0907 = json.getString("cv0907");
            this.cv0908 = json.getString("cv0908");
            this.cv0998 = json.getString("cv0998");
            this.cv0996 = json.getString("cv0996");
            this.cv0996x = json.getString("cv0996x");
            this.cv1001 = json.getString("cv1001");
            this.cv1002 = json.getString("cv1002");
            this.cv1003 = json.getString("cv1003");
            this.cv1004 = json.getString("cv1004");
            this.cv1005 = json.getString("cv1005");
            this.cv1006 = json.getString("cv1006");
            this.cv1007 = json.getString("cv1007");
            this.cv1008 = json.getString("cv1008");
            this.cv1009 = json.getString("cv1009");
            this.cv1098 = json.getString("cv1098");
            this.cv1096 = json.getString("cv1096");
            this.cv1096x = json.getString("cv1096x");
            this.cv11 = json.getString("cv11");
            this.cv12 = json.getString("cv12");
            this.cv1296x = json.getString("cv1296x");
            this.cv13 = json.getString("cv13");
            this.cv14 = json.getString("cv14");
            this.cv15 = json.getString("cv15");
            this.cv16 = json.getString("cv16");
            this.cv1696x = json.getString("cv1696x");
            this.cv17 = json.getString("cv17");
            this.cv18 = json.getString("cv18");
            this.cv1896x = json.getString("cv1896x");
            this.cv19 = json.getString("cv19");
            this.cv1996x = json.getString("cv1996x");
            this.cv20 = json.getString("cv20");
            this.cv2101 = json.getString("cv2101");
            this.cv2102 = json.getString("cv2102");
            this.cv2103 = json.getString("cv2103");
            this.cv2104 = json.getString("cv2104");
            this.cv2105 = json.getString("cv2105");
            this.cv2106 = json.getString("cv2106");
            this.cv2107 = json.getString("cv2107");
            this.cv2108 = json.getString("cv2108");
            this.cv2109 = json.getString("cv2109");
            this.cv2198 = json.getString("cv2198");
            this.cv2196 = json.getString("cv2196");
            this.cv2196x = json.getString("cv2196x");


        }

    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_CLUSTER_CODE, this.ebCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.ChildTable.COLUMN_AGE_DAYS, this.ageInDays);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_CSTATUS, this.cstatus);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SCB, new JSONObject(sCBtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SCS, new JSONObject(sCStoString()));
        json.put(TableContracts.ChildTable.COLUMN_SIM, new JSONObject(sIMtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SPD, new JSONObject(sPDtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SBF, new JSONObject(sBFtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SCV, new JSONObject(sCVtoString()));
        return json;
    }


    public String sCBtoString() throws JSONException {
        Log.d(TAG, "sCBtoString: ");
        JSONObject json = new JSONObject();

        json.put("cb01", cb01)
                .put("cb02", cb02)
                .put("cb03", cb03)
                .put("cb04dd", cb04dd)
                .put("cb04mm", cb04mm)
                .put("cb04yy", cb04yy)
                .put("cb04dk", cb04dk)
                .put("cb0501", cb0501)
                .put("cb0502", cb0502)
                .put("cb06", cb06)
                .put("cb15", cb15)
                .put("cb17", cb17)
                .put("cb16", cb16)
                .put("cb07", cb07)
                .put("cb08", cb08)
                .put("cb09", cb09)
                .put("cb10", cb10)
                .put("cb1096x", cb1096x)
                .put("cb11", cb11)
                .put("cb12", cb12)
                .put("cb13", cb13)
                .put("cb14", cb14)
                .put("cb1496x", cb1496x)
                .put("ageInMonths", ageInMonths)
                .put("isYoungest", isYoungest);


        return json.toString();


    }

    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("im01", im01)
                .put("im02", im02)
                .put("im02a", im02a)
                .put("im02a96x", im02a96x)
                .put("im03", im03)
                .put("im0396x", im0396x)
                .put("im04dd", im04dd)
                .put("trueAgeInMonths", trueAgeInMonths)
                .put("im04mm", im04mm)
                .put("im04yy", im04yy)
                .put("im0497", im0497)
                .put("backfilename", backfilename)
                .put("frontfilename", frontfilename)
                .put("im0501dd", im0501dd)
                .put("im0501mm", im0501mm)
                .put("im0501yy", im0501yy)
                .put("im0502dd", im0502dd)
                .put("im0502mm", im0502mm)
                .put("im0502yy", im0502yy)
                .put("im0503dd", im0503dd)
                .put("im0503mm", im0503mm)
                .put("im0503yy", im0503yy)
                .put("im0504dd", im0504dd)
                .put("im0504mm", im0504mm)
                .put("im0504yy", im0504yy)
                .put("im0505dd", im0505dd)
                .put("im0505mm", im0505mm)
                .put("im0505yy", im0505yy)
                .put("im0506dd", im0506dd)
                .put("im0506mm", im0506mm)
                .put("im0506yy", im0506yy)
                .put("im0507dd", im0507dd)
                .put("im0507mm", im0507mm)
                .put("im0507yy", im0507yy)
                .put("im0508dd", im0508dd)
                .put("im0508mm", im0508mm)
                .put("im0508yy", im0508yy)
                .put("im0509dd", im0509dd)
                .put("im0509mm", im0509mm)
                .put("im0509yy", im0509yy)
                .put("im0510dd", im0510dd)
                .put("im0510mm", im0510mm)
                .put("im0510yy", im0510yy)
                .put("im0510add", im0510add)
                .put("im0510amm", im0510amm)
                .put("im0510ayy", im0510ayy)
                .put("im0511dd", im0511dd)
                .put("im0511mm", im0511mm)
                .put("im0511yy", im0511yy)
                .put("im0512dd", im0512dd)
                .put("im0512mm", im0512mm)
                .put("im0512yy", im0512yy)
                .put("im0513dd", im0513dd)
                .put("im0513mm", im0513mm)
                .put("im0513yy", im0513yy)
                .put("im0514dd", im0514dd)
                .put("im0514mm", im0514mm)
                .put("im0514yy", im0514yy)
                .put("im0515dd", im0515dd)
                .put("im0515mm", im0515mm)
                .put("im0515yy", im0515yy)
                .put("im0515bdd", im0515bdd)
                .put("im0515bmm", im0515bmm)
                .put("im0515byy", im0515byy)
                .put("im0516dd", im0516dd)
                .put("im0516mm", im0516mm)
                .put("im0516yy", im0516yy)
                .put("im0517dd", im0517dd)
                .put("im0517mm", im0517mm)
                .put("im0517yy", im0517yy)
                //.put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im10a", im10a)
                .put("im11", im11)
                .put("im12", im12)
                .put("im12a", im12a)
                .put("im12a98", im12a98)
                .put("im14", im14)
                .put("im15", im15)
                .put("im16", im16)
                .put("im17", im17)
                .put("im18", im18)
                .put("im19", im19)
                .put("im20", im20)
                .put("im20a", im20a)
                .put("im21", im21)
                .put("im22", im22)
                .put("im22a", im22a)
                .put("im23", im23)
                .put("im236x", im236x)
                .put("im23a", im23a)
                .put("im24", im24)
                .put("im2417x", im2417x)
                .put("im24a", im24a)
                .put("im24b", im24b)
                .put("im24b98", im24b98)
                .put("im24c", im24c)
                /*     .put("im24d", im24d)*/
                .put("im25", im25)
                .put("im29", im29)
                .put("im30", im30)
                .put("im30_96x", im30_96x)
                //.put("im26", im26)
                .put("im050198", im050198)
                .put("im050298", im050298)
                .put("im050398", im050398)
                .put("im050498", im050498)
                .put("im050598", im050598)
                .put("im050698", im050698)
                .put("im050798", im050798)
                .put("im050898", im050898)
                .put("im050998", im050998)
                .put("im051098", im051098)
                .put("im0510a98", im0510a98)
                .put("im051198", im051198)
                .put("im051298", im051298)
                .put("im051398", im051398)
                .put("im051498", im051498)
                .put("im051598", im051598)
                .put("im0515b98", im0515b98)
                .put("im051698", im051698)
                .put("im051798", im051798)
                .put("im050295", im050295)
                .put("im050495", im050495)
                .put("im050595", im050595)
                .put("im050695", im050695)
                .put("im050895", im050895)
                .put("im050995", im050995)
                .put("im051095", im051095)
                .put("im0510a95", im0510a95)
                .put("im051295", im051295)
                .put("im051395", im051395)
                .put("im051495", im051495)
                .put("im0515b95", im0515b95)
                .put("im051795", im051795);

        return json.toString();
    }

    public String sCStoString() throws JSONException {
        Log.d(TAG, "sCStoString: ");
        JSONObject json = new JSONObject();

        json.put("cs01", cs01)
                .put("cs02", cs02)
                .put("cs02a", cs02a)
                .put("cs02b", cs02b)
                .put("cs03", cs03)
                .put("cs04", cs04)
                .put("cs05", cs05)
                .put("cs06", cs06)
                .put("cs07", cs07)
                .put("cs07961x", cs07961x)
                .put("cs07962x", cs07962x)
                .put("cs0801", cs0801)
                .put("cs0802", cs0802)
                .put("cs0803", cs0803)
                .put("cs0804", cs0804)
                .put("cs0805", cs0805)
                .put("cs0806", cs0806)
                .put("cs0807", cs0807)
                .put("cs0808", cs0808)
                .put("cs0809", cs0809)
                .put("cs0810", cs0810)
                .put("cs0896", cs0896)
                .put("cs0896x", cs0896x)
                .put("cs08a", cs08a)
                .put("cs08b", cs08b)
                .put("cs09", cs09)
                .put("cs0996x", cs0996x)
                .put("cs10", cs10)
                .put("cs11", cs11)
                .put("cs12", cs12)
                .put("cs13", cs13)
                .put("cs14", cs14)
                .put("cs15", cs15)
                .put("cs1596x", cs1596x)
                .put("cs16", cs16)
                .put("cs17", cs17)
                .put("cs17961x", cs17961x)
                .put("cs17962x", cs17962x)
                .put("cs17a", cs17a)
                .put("cs17b", cs17b)
                .put("cs1802", cs1802)
                .put("cs1803", cs1803)
                .put("cs1804", cs1804)
                .put("cs1805", cs1805)
                .put("cs1806", cs1806)
                .put("cs1807", cs1807)
                .put("cs1808", cs1808)
                .put("cs1896", cs1896)
                .put("cs1896x", cs1896x)
                .put("cs19", cs19)
                .put("cs1996x", cs1996x)
                .put("cs20", cs20)
                .put("cs21", cs21);

        return json.toString();
    }

    public String sPDtoString() throws JSONException {
        Log.d(TAG, "sPDtoString: ");
        JSONObject json = new JSONObject();

        json.put("pd01", pd01)
                .put("pd02", pd02)
                .put("pd03", pd03)
                .put("pd04", pd04)
                .put("pd05", pd05)
                .put("pd0596x", pd0596x)
                .put("pd06", pd06)
                .put("pd06961x", pd06961x)
                .put("pd06962x", pd06962x)
                .put("pd07", pd07)
                .put("pd0701x", pd0701x)
                .put("pd08a01", pd08a01)
                .put("pd08a02", pd08a02)
                .put("pd08a03", pd08a03)
                .put("pd08a04", pd08a04)
                .put("pd08a05", pd08a05)
                .put("pd08a06", pd08a06)
                .put("pd08a07", pd08a07)
                .put("pd08a08", pd08a08)
                .put("pd08a09", pd08a09)
                .put("pd08a96", pd08a96)
                .put("pd08a96x", pd08a96x)
                .put("pd08", pd08)
                .put("pd08b", pd08b)
                .put("pd08c", pd08c)
                .put("pd09", pd09)
                .put("pd10", pd10)
                .put("pd1101", pd1101)
                .put("pd1102", pd1102)
                .put("pd12", pd12)
                .put("pd1296x", pd1296x)
                .put("pd13", pd13)
                .put("pd13961x", pd13961x)
                .put("pd13962x", pd13962x)
                .put("pd14", pd14)
                .put("pd1496x", pd1496x)
                .put("pd15", pd15)
                .put("pd1601", pd1601)
                .put("pd1602", pd1602)
                .put("pd1603", pd1603)
                .put("pd1604", pd1604)
                .put("pd1605", pd1605)
                .put("pd1606", pd1606)
                .put("pd1607", pd1607)
                .put("pd1696", pd1696)
                .put("pd1696x", pd1696x)
                .put("pd17", pd17)
                .put("pd1701x", pd1701x)
                .put("pd1702x", pd1702x)
                .put("pd1703x", pd1703x)
                .put("pd18", pd18)
                .put("pd19", pd19)
                .put("pd2001", pd2001)
                .put("pd2002", pd2002)
                .put("pd2003", pd2003)
                .put("pd2004", pd2004)
                .put("pd2005", pd2005)
                .put("pd2006", pd2006)
                .put("pd2007", pd2007)
                .put("pd2096", pd2096)
                .put("pd2096x", pd2096x)
                .put("pd21", pd21)
                .put("pd2101x", pd2101x)
                .put("pd2102x", pd2102x)
                .put("pd2103x", pd2103x)
                .put("pd22", pd22)
                .put("pd23", pd23)
                .put("pd2401", pd2401)
                .put("pd2402", pd2402)
                .put("pd2403", pd2403)
                .put("pd2404", pd2404)
                .put("pd2405", pd2405)
                .put("pd2406", pd2406)
                .put("pd2496", pd2496)
                .put("pd2496x", pd2496x)
                .put("pd2498", pd2498);
        return json.toString();


    }

    public String sBFtoString() throws JSONException {
        Log.d(TAG, "sBFtoString: ");
        JSONObject json = new JSONObject();

        json.put("bf01", bf01)
                .put("bf02", bf02)
                .put("bf3y", bf3y)
                .put("bf03m", bf03m)
                .put("bf3d", bf3d)
                .put("bf03a01", bf03a01)
                .put("bf03a02", bf03a02)
                .put("bf04", bf04)
                .put("bf05", bf05)
                .put("bf0502x", bf0502x)
                .put("bf0503x", bf0503x)
                .put("bf06", bf06)
                .put("bf07", bf07)
                .put("bf0796x", bf0796x)
                .put("bf08", bf08)
                .put("bf0901", bf0901)
                .put("bf0902", bf0902)
                .put("bf0903", bf0903)
                .put("bf0904", bf0904)
                .put("bf0905", bf0905)
                .put("bf0906", bf0906)
                .put("bf0907", bf0907)
                .put("bf0908", bf0908)
                .put("bf0909", bf0909)
                .put("bf0910", bf0910)
                .put("bf0999", bf0999)
                .put("bf0996", bf0996)
                .put("bf0996x", bf0996x)
                .put("bf10", bf10)
                .put("bf11", bf11)
                .put("bf12", bf12)
                .put("bf13", bf13)
                .put("bf14a", bf14a)
                .put("bf14b", bf14b)
                .put("bf14b01x", bf14b01x)
                .put("bf14c", bf14c)
                .put("bf14c01x", bf14c01x)
                .put("bf14d", bf14d)
                .put("bf14e", bf14e)
                .put("bf14f", bf14f)
                .put("bf14f01x", bf14f01x)
                .put("bf14g", bf14g)
                .put("bf14h", bf14h)
                .put("bf14i", bf14i)
                .put("bf15a", bf15a)
                .put("bf15b", bf15b)
                .put("bf15c", bf15c)
                .put("bf15d", bf15d)
                .put("bf15e", bf15e)
                .put("bf15f", bf15f)
                .put("bf15g", bf15g)
                .put("bf15h", bf15h)
                .put("bf15i", bf15i)
                .put("bf15j", bf15j)
                .put("bf15k", bf15k)
                .put("bf15l", bf15l)
                .put("bf15m", bf15m)
                .put("bf15n", bf15n)
                .put("bf15o", bf15o)
                .put("bf15p", bf15p)
                .put("bf15q", bf15q)
                .put("bf16", bf16)
                .put("bf17", bf17)
                .put("bf1701x", bf1701x)
                .put("bf18", bf18)
                .put("bf19", bf19)
                .put("bf1996x", bf1996x)
                .put("bf20", bf20);


        return json.toString();


    }

    public String sCVtoString() throws JSONException {
        Log.d(TAG, "sCVtoString: ");
        JSONObject json = new JSONObject();

        json.put("cv01a", cv01a)
                .put("cv01", cv01)
                .put("cv02", cv02)
                .put("cv03", cv03)
                .put("cv04", cv04)
                .put("cv0501", cv0501)
                .put("cv0502", cv0502)
                .put("cv0503", cv0503)
                .put("cv0504", cv0504)
                .put("cv0505", cv0505)
                .put("cv0506", cv0506)
                .put("cv0507", cv0507)
                .put("cv0596", cv0596)
                .put("cv0596x", cv0596x)
                .put("cv0601", cv0601)
                .put("cv0602", cv0602)
                .put("cv0603", cv0603)
                .put("cv0604", cv0604)
                .put("cv0605", cv0605)
                .put("cv0606", cv0606)
                .put("cv0607", cv0607)
                .put("cv0608", cv0608)
                .put("cv0609", cv0609)
                .put("cv0610", cv0610)
                .put("cv0611", cv0611)
                .put("cv0612", cv0612)
                .put("cv0696", cv0696)
                .put("cv0696x", cv0696x)
                .put("cv07", cv07)
                .put("cv0801", cv0801)
                .put("cv0802", cv0802)
                .put("cv0803", cv0803)
                .put("cv0804", cv0804)
                .put("cv0805", cv0805)
                .put("cv0806", cv0806)
                .put("cv0807", cv0807)
                .put("cv0898", cv0898)
                .put("cv0896", cv0896)
                .put("cv0896x", cv0896x)
                .put("cv0901", cv0901)
                .put("cv0902", cv0902)
                .put("cv0903", cv0903)
                .put("cv0904", cv0904)
                .put("cv0905", cv0905)
                .put("cv0906", cv0906)
                .put("cv0907", cv0907)
                .put("cv0908", cv0908)
                .put("cv0998", cv0998)
                .put("cv0996", cv0996)
                .put("cv0996x", cv0996x)
                .put("cv1001", cv1001)
                .put("cv1002", cv1002)
                .put("cv1003", cv1003)
                .put("cv1004", cv1004)
                .put("cv1005", cv1005)
                .put("cv1006", cv1006)
                .put("cv1007", cv1007)
                .put("cv1008", cv1008)
                .put("cv1009", cv1009)
                .put("cv1098", cv1098)
                .put("cv1096", cv1096)
                .put("cv1096x", cv1096x)
                .put("cv11", cv11)
                .put("cv12", cv12)
                .put("cv1296x", cv1296x)
                .put("cv13", cv13)
                .put("cv14", cv14)
                .put("cv15", cv15)
                .put("cv16", cv16)
                .put("cv1696x", cv1696x)
                .put("cv17", cv17)
                .put("cv18", cv18)
                .put("cv1896x", cv1896x)
                .put("cv19", cv19)
                .put("cv1996x", cv1996x)
                .put("cv20", cv20)
                .put("cv2101", cv2101)
                .put("cv2102", cv2102)
                .put("cv2103", cv2103)
                .put("cv2104", cv2104)
                .put("cv2105", cv2105)
                .put("cv2106", cv2106)
                .put("cv2107", cv2107)
                .put("cv2108", cv2108)
                .put("cv2109", cv2109)
                .put("cv2198", cv2198)
                .put("cv2196", cv2196)
                .put("cv2196x", cv2196x);


        return json.toString();


    }


    private void CaluculateAge(String dd, String mm, String yy, boolean trueAge) {
        setAgeCheck(false);
        Log.d(TAG, "CaluculateAge: " + yy + "-" + mm + "-" + dd);

        if (!trueAge) {
            setCb0502("");
            setCb0501("");
        } else {
            setTrueAgeInMonths(-1);
        }
        if (!yy.equals("") && !yy.equals("9998") && !mm.equals("") && !dd.equals("")) {

            if ((Integer.parseInt(mm) > 12 && !mm.equals("98"))
                    || (Integer.parseInt(dd) > 31 && !dd.equals("98"))
                    || Integer.parseInt(yy) < 1920) {
                if (!trueAge) {
                    setCb0501("");
                    setCb0502("");
                    this.ageInMonths = 0;
                    this.ageInDays = 0;
                } else {
                    setTrueAgeInMonths(0);


                }
                return;
            }
            try {
                SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

                // set current Date
                Calendar cur = Calendar.getInstance();
                cur.setTime(sdf.parse(form.getHh01()));// all done


                // set Date of birth
                int day = !dd.equals("98") ? Integer.parseInt(dd) : 15;
                int month = !mm.equals("98") ? Integer.parseInt(mm) : 6;
                int year = Integer.parseInt(yy);
                Calendar cal = Calendar.getInstance();
                cal.setTime(df.parse(year + " " + month + " " + day));


//             String todayDate = df.format(Calendar.getInstance().getTime());




/*                System.out.println(df.format("Current: " + cur.getTime()));
                System.out.println(df.format("DOB: " + cal.getTime()));*/


                //long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                long millis = cur.getTimeInMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                //this.ageInMonths = MILLISECONDS.toDays(millis) / 30;
                // OLD METHOD
              /*  long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));
                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);*/

                Calendar c = Calendar.getInstance();

                c.setTimeInMillis(millis);
                int tYear = c.get(Calendar.YEAR) - 1970;
                int tMonth = c.get(Calendar.MONTH);
                int tDay = c.get(Calendar.DAY_OF_MONTH);
                ageInDays = MILLISECONDS.toDays(millis);

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/


                if (!trueAge) {

                    setCb0501(String.valueOf(tYear));
                    setCb0502(String.valueOf(tMonth));
                    if (tYear < 0) {
                        setCb0501("");
                    }
                } else {
                    setTrueAgeInMonths((Integer.parseInt(String.valueOf(tYear)) * 12L) + Integer.parseInt(String.valueOf(tMonth)));

                }
                //setAgeInMonths(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        }
    }

}
