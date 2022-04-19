package edu.aku.hassannaqvi.naunehalendline.models;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;

import edu.aku.hassannaqvi.naunehalendline.BR;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;

public class MWRA extends BaseObservable implements Observable {

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
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;

    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // Field Variables
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

    public void MWRA() {


    }

    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEbCode(MainApp.selectedHousehold.getEbCode());
        setHhid(MainApp.selectedHousehold.getHhid());

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
    public String getPd01() {
        return pd01;
    }

    @Bindable
    public String getPd02() {
        return pd02;
    }

    @Bindable
    public String getPd03() {
        return pd03;
    }

    @Bindable
    public String getPd04() {
        return pd04;
    }

    @Bindable
    public String getPd05() {
        return pd05;
    }

    @Bindable
    public String getPd0596x() {
        return pd0596x;
    }

    @Bindable
    public String getPd06() {
        return pd06;
    }

    @Bindable
    public String getPd06961x() {
        return pd06961x;
    }

    @Bindable
    public String getPd06962x() {
        return pd06962x;
    }

    @Bindable
    public String getPd07() {
        return pd07;
    }

    @Bindable
    public String getPd0701x() {
        return pd0701x;
    }

    @Bindable
    public String getPd08a() {
        return pd08a;
    }

    @Bindable
    public String getPd08a01() {
        return pd08a01;
    }

    @Bindable
    public String getPd08a02() {
        return pd08a02;
    }

    @Bindable
    public String getPd08a03() {
        return pd08a03;
    }

    @Bindable
    public String getPd08a04() {
        return pd08a04;
    }

    @Bindable
    public String getPd08a05() {
        return pd08a05;
    }

    @Bindable
    public String getPd08a06() {
        return pd08a06;
    }

    @Bindable
    public String getPd08a07() {
        return pd08a07;
    }

    @Bindable
    public String getPd08a08() {
        return pd08a08;
    }

    @Bindable
    public String getPd08a09() {
        return pd08a09;
    }

    @Bindable
    public String getPd08a96() {
        return pd08a96;
    }

    @Bindable
    public String getPd08a96x() {
        return pd08a96x;
    }

    @Bindable
    public String getPd08() {
        return pd08;
    }

    @Bindable
    public String getPd08b() {
        return pd08b;
    }

    @Bindable
    public String getPd08c() {
        return pd08c;
    }

    @Bindable
    public String getPd09() {
        return pd09;
    }

    @Bindable
    public String getPd10() {
        return pd10;
    }

    @Bindable
    public String getPd1101() {
        return pd1101;
    }

    @Bindable
    public String getPd1102() {
        return pd1102;
    }

    @Bindable
    public String getPd12() {
        return pd12;
    }

    @Bindable
    public String getPd1296x() {
        return pd1296x;
    }

    @Bindable
    public String getPd13() {
        return pd13;
    }

    @Bindable
    public String getPd13961x() {
        return pd13961x;
    }

    @Bindable
    public String getPd13962x() {
        return pd13962x;
    }

    @Bindable
    public String getPd14() {
        return pd14;
    }

    @Bindable
    public String getPd1496x() {
        return pd1496x;
    }

    @Bindable
    public String getPd15() {
        return pd15;
    }

    @Bindable
    public String getPd16() {
        return pd16;
    }

    @Bindable
    public String getPd1601() {
        return pd1601;
    }

    @Bindable
    public String getPd1602() {
        return pd1602;
    }

    @Bindable
    public String getPd1603() {
        return pd1603;
    }

    @Bindable
    public String getPd1604() {
        return pd1604;
    }

    @Bindable
    public String getPd1605() {
        return pd1605;
    }

    @Bindable
    public String getPd1606() {
        return pd1606;
    }

    @Bindable
    public String getPd1607() {
        return pd1607;
    }

    @Bindable
    public String getPd1696() {
        return pd1696;
    }

    @Bindable
    public String getPd1696x() {
        return pd1696x;
    }

    @Bindable
    public String getPd17() {
        return pd17;
    }

    @Bindable
    public String getPd1701x() {
        return pd1701x;
    }

    @Bindable
    public String getPd1702x() {
        return pd1702x;
    }

    @Bindable
    public String getPd1703x() {
        return pd1703x;
    }

    @Bindable
    public String getPd18() {
        return pd18;
    }

    @Bindable
    public String getPd19() {
        return pd19;
    }

    @Bindable
    public String getPd20() {
        return pd20;
    }

    @Bindable
    public String getPd2001() {
        return pd2001;
    }

    @Bindable
    public String getPd2002() {
        return pd2002;
    }

    @Bindable
    public String getPd2003() {
        return pd2003;
    }

    @Bindable
    public String getPd2004() {
        return pd2004;
    }

    @Bindable
    public String getPd2005() {
        return pd2005;
    }

    @Bindable
    public String getPd2006() {
        return pd2006;
    }

    @Bindable
    public String getPd2007() {
        return pd2007;
    }

    @Bindable
    public String getPd2096() {
        return pd2096;
    }

    @Bindable
    public String getPd2096x() {
        return pd2096x;
    }

    @Bindable
    public String getPd21() {
        return pd21;
    }

    @Bindable
    public String getPd2101x() {
        return pd2101x;
    }

    @Bindable
    public String getPd2102x() {
        return pd2102x;
    }

    @Bindable
    public String getPd2103x() {
        return pd2103x;
    }

    @Bindable
    public String getPd22() {
        return pd22;
    }

    @Bindable
    public String getPd23() {
        return pd23;
    }

    @Bindable
    public String getPd24() {
        return pd24;
    }

    @Bindable
    public String getPd2401() {
        return pd2401;
    }

    @Bindable
    public String getPd2402() {
        return pd2402;
    }

    @Bindable
    public String getPd2403() {
        return pd2403;
    }

    @Bindable
    public String getPd2404() {
        return pd2404;
    }

    @Bindable
    public String getPd2405() {
        return pd2405;
    }

    @Bindable
    public String getPd2406() {
        return pd2406;
    }

    @Bindable
    public String getPd2496() {
        return pd2496;
    }

    @Bindable
    public String getPd2496x() {
        return pd2496x;
    }

    @Bindable
    public String getPd2498() {
        return pd2498;
    }

    @Bindable
    public String getBf01() {
        return bf01;
    }

    @Bindable
    public String getBf02() {
        return bf02;
    }

    @Bindable
    public String getBf3y() {
        return bf3y;
    }

    @Bindable
    public String getBf03m() {
        return bf03m;
    }

    @Bindable
    public String getBf3d() {
        return bf3d;
    }

    @Bindable
    public String getBf03a01() {
        return bf03a01;
    }

    @Bindable
    public String getBf03a02() {
        return bf03a02;
    }

    @Bindable
    public String getBf04() {
        return bf04;
    }

    @Bindable
    public String getBf05() {
        return bf05;
    }

    @Bindable
    public String getBf0502x() {
        return bf0502x;
    }

    @Bindable
    public String getBf0503x() {
        return bf0503x;
    }

    @Bindable
    public String getBf06() {
        return bf06;
    }

    @Bindable
    public String getBf07() {
        return bf07;
    }

    @Bindable
    public String getBf0796x() {
        return bf0796x;
    }

    @Bindable
    public String getBf08() {
        return bf08;
    }

    @Bindable
    public String getBf09() {
        return bf09;
    }

    @Bindable
    public String getBf0901() {
        return bf0901;
    }

    @Bindable
    public String getBf0902() {
        return bf0902;
    }

    @Bindable
    public String getBf0903() {
        return bf0903;
    }

    @Bindable
    public String getBf0904() {
        return bf0904;
    }

    @Bindable
    public String getBf0905() {
        return bf0905;
    }

    @Bindable
    public String getBf0906() {
        return bf0906;
    }

    @Bindable
    public String getBf0907() {
        return bf0907;
    }

    @Bindable
    public String getBf0908() {
        return bf0908;
    }

    @Bindable
    public String getBf0909() {
        return bf0909;
    }

    @Bindable
    public String getBf0910() {
        return bf0910;
    }

    @Bindable
    public String getBf0999() {
        return bf0999;
    }

    @Bindable
    public String getBf0996() {
        return bf0996;
    }

    @Bindable
    public String getBf0996x() {
        return bf0996x;
    }

    @Bindable
    public String getBf10() {
        return bf10;
    }

    @Bindable
    public String getBf11() {
        return bf11;
    }

    @Bindable
    public String getBf12() {
        return bf12;
    }

    @Bindable
    public String getBf13() {
        return bf13;
    }

    @Bindable
    public String getBf14a() {
        return bf14a;
    }

    @Bindable
    public String getBf14b() {
        return bf14b;
    }

    @Bindable
    public String getBf14b01x() {
        return bf14b01x;
    }

    @Bindable
    public String getBf14c() {
        return bf14c;
    }

    @Bindable
    public String getBf14c01x() {
        return bf14c01x;
    }

    @Bindable
    public String getBf14d() {
        return bf14d;
    }

    @Bindable
    public String getBf14e() {
        return bf14e;
    }

    @Bindable
    public String getBf14f() {
        return bf14f;
    }

    @Bindable
    public String getBf14f01x() {
        return bf14f01x;
    }

    @Bindable
    public String getBf14g() {
        return bf14g;
    }

    @Bindable
    public String getBf14h() {
        return bf14h;
    }

    @Bindable
    public String getBf14i() {
        return bf14i;
    }

    @Bindable
    public String getBf15a() {
        return bf15a;
    }

    @Bindable
    public String getBf15b() {
        return bf15b;
    }

    @Bindable
    public String getBf15c() {
        return bf15c;
    }

    @Bindable
    public String getBf15d() {
        return bf15d;
    }

    @Bindable
    public String getBf15e() {
        return bf15e;
    }

    @Bindable
    public String getBf15f() {
        return bf15f;
    }

    @Bindable
    public String getBf15g() {
        return bf15g;
    }

    @Bindable
    public String getBf15h() {
        return bf15h;
    }

    @Bindable
    public String getBf15i() {
        return bf15i;
    }

    @Bindable
    public String getBf15j() {
        return bf15j;
    }

    @Bindable
    public String getBf15k() {
        return bf15k;
    }

    @Bindable
    public String getBf15l() {
        return bf15l;
    }

    @Bindable
    public String getBf15m() {
        return bf15m;
    }

    @Bindable
    public String getBf15n() {
        return bf15n;
    }

    @Bindable
    public String getBf15o() {
        return bf15o;
    }

    @Bindable
    public String getBf15p() {
        return bf15p;
    }

    @Bindable
    public String getBf15q() {
        return bf15q;
    }

    @Bindable
    public String getBf16() {
        return bf16;
    }

    @Bindable
    public String getBf17() {
        return bf17;
    }

    @Bindable
    public String getBf1701x() {
        return bf1701x;
    }

    @Bindable
    public String getBf18() {
        return bf18;
    }

    @Bindable
    public String getBf19() {
        return bf19;
    }

    @Bindable
    public String getBf1996x() {
        return bf1996x;
    }

    @Bindable
    public String getBf20() {
        return bf20;
    }

    @Bindable
    public String getCv01a() {
        return cv01a;
    }

    @Bindable
    public String getCv01() {
        return cv01;
    }

    @Bindable
    public String getCv02() {
        return cv02;
    }

    @Bindable
    public String getCv03() {
        return cv03;
    }

    @Bindable
    public String getCv04() {
        return cv04;
    }

    @Bindable
    public String getCv05() {
        return cv05;
    }

    @Bindable
    public String getCv0501() {
        return cv0501;
    }

    @Bindable
    public String getCv0502() {
        return cv0502;
    }

    @Bindable
    public String getCv0503() {
        return cv0503;
    }

    @Bindable
    public String getCv0504() {
        return cv0504;
    }

    @Bindable
    public String getCv0505() {
        return cv0505;
    }

    @Bindable
    public String getCv0506() {
        return cv0506;
    }

    @Bindable
    public String getCv0507() {
        return cv0507;
    }

    @Bindable
    public String getCv0596() {
        return cv0596;
    }

    @Bindable
    public String getCv0596x() {
        return cv0596x;
    }

    @Bindable
    public String getCv06() {
        return cv06;
    }

    @Bindable
    public String getCv0601() {
        return cv0601;
    }

    @Bindable
    public String getCv0602() {
        return cv0602;
    }

    @Bindable
    public String getCv0603() {
        return cv0603;
    }

    @Bindable
    public String getCv0604() {
        return cv0604;
    }

    @Bindable
    public String getCv0605() {
        return cv0605;
    }

    @Bindable
    public String getCv0606() {
        return cv0606;
    }

    @Bindable
    public String getCv0607() {
        return cv0607;
    }

    @Bindable
    public String getCv0608() {
        return cv0608;
    }

    @Bindable
    public String getCv0609() {
        return cv0609;
    }

    @Bindable
    public String getCv0610() {
        return cv0610;
    }

    @Bindable
    public String getCv0611() {
        return cv0611;
    }

    @Bindable
    public String getCv0612() {
        return cv0612;
    }

    @Bindable
    public String getCv0696() {
        return cv0696;
    }

    @Bindable
    public String getCv0696x() {
        return cv0696x;
    }

    @Bindable
    public String getCv07() {
        return cv07;
    }

    @Bindable
    public String getCv08() {
        return cv08;
    }

    @Bindable
    public String getCv0801() {
        return cv0801;
    }

    @Bindable
    public String getCv0802() {
        return cv0802;
    }

    @Bindable
    public String getCv0803() {
        return cv0803;
    }

    @Bindable
    public String getCv0804() {
        return cv0804;
    }

    @Bindable
    public String getCv0805() {
        return cv0805;
    }

    @Bindable
    public String getCv0806() {
        return cv0806;
    }

    @Bindable
    public String getCv0807() {
        return cv0807;
    }

    @Bindable
    public String getCv0898() {
        return cv0898;
    }

    @Bindable
    public String getCv0896() {
        return cv0896;
    }

    @Bindable
    public String getCv0896x() {
        return cv0896x;
    }

    @Bindable
    public String getCv09() {
        return cv09;
    }

    @Bindable
    public String getCv0901() {
        return cv0901;
    }

    @Bindable
    public String getCv0902() {
        return cv0902;
    }

    @Bindable
    public String getCv0903() {
        return cv0903;
    }

    @Bindable
    public String getCv0904() {
        return cv0904;
    }

    @Bindable
    public String getCv0905() {
        return cv0905;
    }

    @Bindable
    public String getCv0906() {
        return cv0906;
    }

    @Bindable
    public String getCv0907() {
        return cv0907;
    }

    @Bindable
    public String getCv0908() {
        return cv0908;
    }

    @Bindable
    public String getCv0998() {
        return cv0998;
    }

    @Bindable
    public String getCv0996() {
        return cv0996;
    }

    @Bindable
    public String getCv0996x() {
        return cv0996x;
    }

    @Bindable
    public String getCv10() {
        return cv10;
    }

    @Bindable
    public String getCv1001() {
        return cv1001;
    }

    @Bindable
    public String getCv1002() {
        return cv1002;
    }

    @Bindable
    public String getCv1003() {
        return cv1003;
    }

    @Bindable
    public String getCv1004() {
        return cv1004;
    }

    @Bindable
    public String getCv1005() {
        return cv1005;
    }

    @Bindable
    public String getCv1006() {
        return cv1006;
    }

    @Bindable
    public String getCv1007() {
        return cv1007;
    }

    @Bindable
    public String getCv1008() {
        return cv1008;
    }

    @Bindable
    public String getCv1009() {
        return cv1009;
    }

    @Bindable
    public String getCv1098() {
        return cv1098;
    }

    @Bindable
    public String getCv1096() {
        return cv1096;
    }

    @Bindable
    public String getCv1096x() {
        return cv1096x;
    }

    @Bindable
    public String getCv11() {
        return cv11;
    }

    @Bindable
    public String getCv12() {
        return cv12;
    }

    @Bindable
    public String getCv1296x() {
        return cv1296x;
    }

    @Bindable
    public String getCv13() {
        return cv13;
    }

    @Bindable
    public String getCv14() {
        return cv14;
    }

    @Bindable
    public String getCv15() {
        return cv15;
    }

    @Bindable
    public String getCv16() {
        return cv16;
    }

    @Bindable
    public String getCv1696x() {
        return cv1696x;
    }

    @Bindable
    public String getCv17() {
        return cv17;
    }

    @Bindable
    public String getCv18() {
        return cv18;
    }

    @Bindable
    public String getCv1896x() {
        return cv1896x;
    }

    @Bindable
    public String getCv19() {
        return cv19;
    }

    @Bindable
    public String getCv1996x() {
        return cv1996x;
    }

    @Bindable
    public String getCv20() {
        return cv20;
    }

    @Bindable
    public String getCv21() {
        return cv21;
    }

    @Bindable
    public String getCv2101() {
        return cv2101;
    }

    @Bindable
    public String getCv2102() {
        return cv2102;
    }

    @Bindable
    public String getCv2103() {
        return cv2103;
    }

    @Bindable
    public String getCv2104() {
        return cv2104;
    }

    @Bindable
    public String getCv2105() {
        return cv2105;
    }

    @Bindable
    public String getCv2106() {
        return cv2106;
    }

    @Bindable
    public String getCv2107() {
        return cv2107;
    }

    @Bindable
    public String getCv2108() {
        return cv2108;
    }

    @Bindable
    public String getCv2109() {
        return cv2109;
    }

    @Bindable
    public String getCv2198() {
        return cv2198;
    }

    @Bindable
    public String getCv2196() {
        return cv2196;
    }

    @Bindable
    public String getCv2196x() {
        return cv2196x;
    }

    public void setPd01(String pd01) {
        this.pd01 = pd01;
        notifyPropertyChanged(BR.pd01);
    }

    public void setPd02(String pd02) {
        this.pd02 = pd02;
        notifyPropertyChanged(BR.pd02);
    }

    public void setPd03(String pd03) {
        this.pd03 = pd03;
        notifyPropertyChanged(BR.pd03);
    }

    public void setPd04(String pd04) {
        this.pd04 = pd04;

        setPd05(pd04.equals("1") ? this.pd05 : "");
        setPd06(pd04.equals("1") ? this.pd06 : "");
        setPd07(pd04.equals("1") ? this.pd07 : "");

        setPd08(pd04.equals("1") ? "" : this.pd08);


        notifyPropertyChanged(BR.pd04);
    }

    public void setPd05(String pd05) {
        this.pd05 = pd05;
        setPd0596x(pd05.equals("96") ? this.pd0596x : "");
        notifyPropertyChanged(BR.pd05);
    }

    public void setPd0596x(String pd0596x) {
        this.pd0596x = pd0596x;
        notifyPropertyChanged(BR.pd0596x);
    }

    public void setPd06(String pd06) {
        this.pd06 = pd06;
        notifyPropertyChanged(BR.pd06);
    }

    public void setPd06961x(String pd06961x) {
        this.pd06961x = pd06961x;
        notifyPropertyChanged(BR.pd06961x);
    }

    public void setPd06962x(String pd06962x) {
        this.pd06962x = pd06962x;
        notifyPropertyChanged(BR.pd06962x);
    }

    public void setPd07(String pd07) {
        this.pd07 = pd07;
        notifyPropertyChanged(BR.pd07);
    }

    public void setPd0701x(String pd0701x) {
        this.pd0701x = pd0701x;
        notifyPropertyChanged(BR.pd0701x);
    }

    public void setPd08a(String pd08a) {
        this.pd08a = pd08a;
        notifyPropertyChanged(BR.pd08a);
    }

    public void setPd08a01(String pd08a01) {
        if (this.pd08a01.equals(pd08a01)) return; // for all checkboxes
        this.pd08a01 = pd08a01;
        notifyPropertyChanged(BR.pd08a01);
    }

    public void setPd08a02(String pd08a02) {
        if (this.pd08a02.equals(pd08a02)) return; // for all checkboxes
        this.pd08a02 = pd08a02;
        notifyPropertyChanged(BR.pd08a02);
    }

    public void setPd08a03(String pd08a03) {
        if (this.pd08a03.equals(pd08a03)) return; // for all checkboxes
        this.pd08a03 = pd08a03;
        notifyPropertyChanged(BR.pd08a03);
    }

    public void setPd08a04(String pd08a04) {
        if (this.pd08a04.equals(pd08a04)) return; // for all checkboxes
        this.pd08a04 = pd08a04;
        notifyPropertyChanged(BR.pd08a04);
    }

    public void setPd08a05(String pd08a05) {
        if (this.pd08a05.equals(pd08a05)) return; // for all checkboxes
        this.pd08a05 = pd08a05;
        notifyPropertyChanged(BR.pd08a05);
    }

    public void setPd08a06(String pd08a06) {
        if (this.pd08a06.equals(pd08a06)) return; // for all checkboxes
        this.pd08a06 = pd08a06;
        notifyPropertyChanged(BR.pd08a06);
    }

    public void setPd08a07(String pd08a07) {
        if (this.pd08a07.equals(pd08a07)) return; // for all checkboxes
        this.pd08a07 = pd08a07;
        notifyPropertyChanged(BR.pd08a07);
    }

    public void setPd08a08(String pd08a08) {
        if (this.pd08a08.equals(pd08a08)) return; // for all checkboxes
        this.pd08a08 = pd08a08;
        notifyPropertyChanged(BR.pd08a08);
    }

    public void setPd08a09(String pd08a09) {
        if (this.pd08a09.equals(pd08a09)) return; // for all checkboxes
        this.pd08a09 = pd08a09;
        notifyPropertyChanged(BR.pd08a09);
    }

    public void setPd08a96(String pd08a96) {
        if (this.pd08a96.equals(pd08a96)) return; // for all checkboxes
        this.pd08a96 = pd08a96;
        setPd08a96x(pd08a96.equals("96") ? this.pd08a96x : "");
        notifyPropertyChanged(BR.pd08a96);
    }

    public void setPd08a96x(String pd08a96x) {
        this.pd08a96x = pd08a96x;
        notifyPropertyChanged(BR.pd08a96x);
    }

    public void setPd08(String pd08) {
        this.pd08 = pd08;
        notifyPropertyChanged(BR.pd08);
    }

    public void setPd08b(String pd08b) {
        this.pd08b = pd08b;
        notifyPropertyChanged(BR.pd08b);
    }

    public void setPd08c(String pd08c) {
        this.pd08c = pd08c;
        notifyPropertyChanged(BR.pd08c);
    }

    public void setPd09(String pd09) {
        this.pd09 = pd09;
        setPd10(pd09.equals("1") ? this.pd10 : "");
        setPd1101(pd09.equals("1") ? this.pd1101 : "");
        setPd1102(pd09.equals("1") ? this.pd1102 : "");

        notifyPropertyChanged(BR.pd09);
    }

    public void setPd10(String pd10) {
        this.pd10 = pd10;
        notifyPropertyChanged(BR.pd10);
    }

    public void setPd1101(String pd1101) {
        this.pd1101 = pd1101;
        notifyPropertyChanged(BR.pd1101);
    }

    public void setPd1102(String pd1102) {
        this.pd1102 = pd1102;
        notifyPropertyChanged(BR.pd1102);
    }

    public void setPd12(String pd12) {
        this.pd12 = pd12;
        setPd1296x(pd12.equals("96") ? this.pd1296x : "");
        notifyPropertyChanged(BR.pd12);
    }

    public void setPd1296x(String pd1296x) {
        this.pd1296x = pd1296x;
        notifyPropertyChanged(BR.pd1296x);
    }

    public void setPd13(String pd13) {
        this.pd13 = pd13;
        setPd14(pd13.equals("1") || pd13.equals("2") ? this.pd14 : "");
        setPd13961x(pd13.equals("961") ? this.pd13961x : "");
        setPd13962x(pd13.equals("962") ? this.pd13962x : "");


        notifyPropertyChanged(BR.pd13);
    }

    public void setPd13961x(String pd13961x) {
        this.pd13961x = pd13961x;
        notifyPropertyChanged(BR.pd13961x);
    }

    public void setPd13962x(String pd13962x) {
        this.pd13962x = pd13962x;
        notifyPropertyChanged(BR.pd13962x);
    }

    public void setPd14(String pd14) {
        this.pd14 = pd14;
        setPd1496x(pd14.equals("96") ? this.pd1496x : "");
        notifyPropertyChanged(BR.pd14);
    }

    public void setPd1496x(String pd1496x) {
        this.pd1496x = pd1496x;
        notifyPropertyChanged(BR.pd1496x);
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

    public void setPd16(String pd16) {
        this.pd16 = pd16;
        notifyPropertyChanged(BR.pd16);
    }

    public void setPd1601(String pd1601) {
        if (this.pd1601.equals(pd1601)) return; // for all checkboxes
        this.pd1601 = pd1601;
        notifyPropertyChanged(BR.pd1601);
    }

    public void setPd1602(String pd1602) {
        if (this.pd1602.equals(pd1602)) return; // for all checkboxes
        this.pd1602 = pd1602;
        notifyPropertyChanged(BR.pd1602);
    }

    public void setPd1603(String pd1603) {
        if (this.pd1603.equals(pd1603)) return; // for all checkboxes
        this.pd1603 = pd1603;
        notifyPropertyChanged(BR.pd1603);
    }

    public void setPd1604(String pd1604) {
        if (this.pd1604.equals(pd1604)) return; // for all checkboxes
        this.pd1604 = pd1604;
        notifyPropertyChanged(BR.pd1604);
    }

    public void setPd1605(String pd1605) {
        if (this.pd1605.equals(pd1605)) return; // for all checkboxes
        this.pd1605 = pd1605;
        notifyPropertyChanged(BR.pd1605);
    }

    public void setPd1606(String pd1606) {
        if (this.pd1606.equals(pd1606)) return; // for all checkboxes
        this.pd1606 = pd1606;
        notifyPropertyChanged(BR.pd1606);
    }

    public void setPd1607(String pd1607) {
        if (this.pd1607.equals(pd1607)) return; // for all checkboxes
        this.pd1607 = pd1607;
        notifyPropertyChanged(BR.pd1607);
    }

    public void setPd1696(String pd1696) {
        if (this.pd1696.equals(pd1696)) return; // for all checkboxes
        this.pd1696 = pd1696;
        setPd1696x(pd1696.equals("96") ? this.pd1696x : "");
        notifyPropertyChanged(BR.pd1696);
    }

    public void setPd1696x(String pd1696x) {
        this.pd1696x = pd1696x;
        notifyPropertyChanged(BR.pd1696x);
    }

    public void setPd17(String pd17) {
        this.pd17 = pd17;
        setPd1701x(pd17.equals("1") ? this.pd1701x : "");
        setPd1702x(pd17.equals("2") ? this.pd1702x : "");
        setPd1703x(pd17.equals("3") ? this.pd1703x : "");
        notifyPropertyChanged(BR.pd17);
    }

    public void setPd1701x(String pd1701x) {
        this.pd1701x = pd1701x;
        notifyPropertyChanged(BR.pd1701x);
    }

    public void setPd1702x(String pd1702x) {
        this.pd1702x = pd1702x;
        notifyPropertyChanged(BR.pd1702x);
    }

    public void setPd1703x(String pd1703x) {
        this.pd1703x = pd1703x;
        notifyPropertyChanged(BR.pd1703x);
    }

    public void setPd18(String pd18) {
        this.pd18 = pd18;
        notifyPropertyChanged(BR.pd18);
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

    public void setPd20(String pd20) {
        this.pd20 = pd20;
        notifyPropertyChanged(BR.pd20);
    }

    public void setPd2001(String pd2001) {
        if (this.pd2001.equals(pd2001)) return; // for all checkboxes
        this.pd2001 = pd2001;
        notifyPropertyChanged(BR.pd2001);
    }

    public void setPd2002(String pd2002) {
        if (this.pd2002.equals(pd2002)) return; // for all checkboxes
        this.pd2002 = pd2002;
        notifyPropertyChanged(BR.pd2002);
    }

    public void setPd2003(String pd2003) {
        if (this.pd2003.equals(pd2003)) return; // for all checkboxes
        this.pd2003 = pd2003;
        notifyPropertyChanged(BR.pd2003);
    }

    public void setPd2004(String pd2004) {
        if (this.pd2004.equals(pd2004)) return; // for all checkboxes
        this.pd2004 = pd2004;
        notifyPropertyChanged(BR.pd2004);
    }

    public void setPd2005(String pd2005) {
        if (this.pd2005.equals(pd2005)) return; // for all checkboxes
        this.pd2005 = pd2005;
        notifyPropertyChanged(BR.pd2005);
    }

    public void setPd2006(String pd2006) {
        if (this.pd2006.equals(pd2006)) return; // for all checkboxes
        this.pd2006 = pd2006;
        notifyPropertyChanged(BR.pd2006);
    }

    public void setPd2007(String pd2007) {
        if (this.pd2007.equals(pd2007)) return; // for all checkboxes
        this.pd2007 = pd2007;
        notifyPropertyChanged(BR.pd2007);
    }

    public void setPd2096(String pd2096) {
        if (this.pd2096.equals(pd2096)) return; // for all checkboxes
        this.pd2096 = pd2096;
        setPd2096x(pd2096.equals("96") ? this.pd2096x : "");
        notifyPropertyChanged(BR.pd2096);
    }

    public void setPd2096x(String pd2096x) {
        this.pd2096x = pd2096x;
        notifyPropertyChanged(BR.pd2096x);
    }

    public void setPd21(String pd21) {
        this.pd21 = pd21;
        setPd2101x(pd21.equals("1") ? this.pd2101x : "");
        setPd2102x(pd21.equals("2") ? this.pd2102x : "");
        setPd2103x(pd21.equals("3") ? this.pd2103x : "");

        notifyPropertyChanged(BR.pd21);
    }

    public void setPd2101x(String pd2101x) {
        this.pd2101x = pd2101x;
        notifyPropertyChanged(BR.pd2101x);
    }

    public void setPd2102x(String pd2102x) {
        this.pd2102x = pd2102x;
        notifyPropertyChanged(BR.pd2102x);
    }

    public void setPd2103x(String pd2103x) {
        this.pd2103x = pd2103x;
        notifyPropertyChanged(BR.pd2103x);
    }

    public void setPd22(String pd22) {
        this.pd22 = pd22;
        notifyPropertyChanged(BR.pd22);
    }

    public void setPd23(String pd23) {
        this.pd23 = pd23;
        notifyPropertyChanged(BR.pd23);
    }

    public void setPd24(String pd24) {
        this.pd24 = pd24;
        notifyPropertyChanged(BR.pd24);
    }

    public void setPd2401(String pd2401) {
        if (this.pd2401.equals(pd2401)) return; // for all checkboxes
        this.pd2401 = pd2401;
        notifyPropertyChanged(BR.pd2401);
    }

    public void setPd2402(String pd2402) {
        if (this.pd2402.equals(pd2402)) return; // for all checkboxes
        this.pd2402 = pd2402;
        notifyPropertyChanged(BR.pd2402);
    }

    public void setPd2403(String pd2403) {
        if (this.pd2403.equals(pd2403)) return; // for all checkboxes
        this.pd2403 = pd2403;
        notifyPropertyChanged(BR.pd2403);
    }

    public void setPd2404(String pd2404) {
        if (this.pd2404.equals(pd2404)) return; // for all checkboxes
        this.pd2404 = pd2404;
        notifyPropertyChanged(BR.pd2404);
    }

    public void setPd2405(String pd2405) {
        if (this.pd2405.equals(pd2405)) return; // for all checkboxes
        this.pd2405 = pd2405;
        notifyPropertyChanged(BR.pd2405);
    }

    public void setPd2406(String pd2406) {
        if (this.pd2406.equals(pd2406)) return; // for all checkboxes
        this.pd2406 = pd2406;
        notifyPropertyChanged(BR.pd2406);
    }

    public void setPd2496(String pd2496) {
        if (this.pd2496.equals(pd2496)) return; // for all checkboxes
        this.pd2496 = pd2496;
        setPd2496x(pd2496.equals("96") ? this.pd2496x : "");
        notifyPropertyChanged(BR.pd2496);
    }

    public void setPd2496x(String pd2496x) {
        this.pd2496x = pd2496x;
        notifyPropertyChanged(BR.pd2496x);
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

    public void setBf01(String bf01) {
        this.bf01 = bf01;
        notifyPropertyChanged(BR.bf01);
    }

    public void setBf02(String bf02) {
        this.bf02 = bf02;
        notifyPropertyChanged(BR.bf02);
    }

    public void setBf3y(String bf3y) {
        this.bf3y = bf3y;
        notifyPropertyChanged(BR.bf3y);
    }

    public void setBf03m(String bf03m) {
        this.bf03m = bf03m;
        notifyPropertyChanged(BR.bf03m);
    }

    public void setBf3d(String bf3d) {
        this.bf3d = bf3d;
        notifyPropertyChanged(BR.bf3d);
    }

    public void setBf03a01(String bf03a01) {
        this.bf03a01 = bf03a01;
        notifyPropertyChanged(BR.bf03a01);
    }

    public void setBf03a02(String bf03a02) {
        this.bf03a02 = bf03a02;
        notifyPropertyChanged(BR.bf03a02);
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

    public void setBf05(String bf05) {
        this.bf05 = bf05;
        setBf0502x(bf05.equals("2") ? this.bf0502x : "");
        setBf0503x(bf05.equals("3") ? this.bf0503x : "");
        notifyPropertyChanged(BR.bf05);
    }

    public void setBf0502x(String bf0502x) {
        this.bf0502x = bf0502x;
        notifyPropertyChanged(BR.bf0502x);
    }

    public void setBf0503x(String bf0503x) {
        this.bf0503x = bf0503x;
        notifyPropertyChanged(BR.bf0503x);
    }

    public void setBf06(String bf06) {
        this.bf06 = bf06;

        setBf07(bf06.equals("1") ? "" : this.bf07);
        notifyPropertyChanged(BR.bf06);
    }

    public void setBf07(String bf07) {
        this.bf07 = bf07;
        setBf0796x(bf07.equals("96") ? this.bf0796x : "");
        notifyPropertyChanged(BR.bf07);
    }

    public void setBf0796x(String bf0796x) {
        this.bf0796x = bf0796x;
        notifyPropertyChanged(BR.bf0796x);
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

    public void setBf09(String bf09) {
        this.bf09 = bf09;
        notifyPropertyChanged(BR.bf09);
    }

    public void setBf0901(String bf0901) {
        if (this.bf0901.equals(bf0901)) return; // for all checkboxes
        this.bf0901 = bf0901;
        notifyPropertyChanged(BR.bf0901);
    }

    public void setBf0902(String bf0902) {
        if (this.bf0902.equals(bf0902)) return; // for all checkboxes
        this.bf0902 = bf0902;
        notifyPropertyChanged(BR.bf0902);
    }

    public void setBf0903(String bf0903) {
        if (this.bf0903.equals(bf0903)) return; // for all checkboxes
        this.bf0903 = bf0903;
        notifyPropertyChanged(BR.bf0903);
    }

    public void setBf0904(String bf0904) {
        if (this.bf0904.equals(bf0904)) return; // for all checkboxes
        this.bf0904 = bf0904;
        notifyPropertyChanged(BR.bf0904);
    }

    public void setBf0905(String bf0905) {
        if (this.bf0905.equals(bf0905)) return; // for all checkboxes
        this.bf0905 = bf0905;
        notifyPropertyChanged(BR.bf0905);
    }

    public void setBf0906(String bf0906) {
        if (this.bf0906.equals(bf0906)) return; // for all checkboxes
        this.bf0906 = bf0906;
        notifyPropertyChanged(BR.bf0906);
    }

    public void setBf0907(String bf0907) {
        if (this.bf0907.equals(bf0907)) return; // for all checkboxes
        this.bf0907 = bf0907;
        notifyPropertyChanged(BR.bf0907);
    }

    public void setBf0908(String bf0908) {
        if (this.bf0908.equals(bf0908)) return; // for all checkboxes
        this.bf0908 = bf0908;
        notifyPropertyChanged(BR.bf0908);
    }

    public void setBf0909(String bf0909) {
        if (this.bf0909.equals(bf0909)) return; // for all checkboxes
        this.bf0909 = bf0909;
        notifyPropertyChanged(BR.bf0909);
    }

    public void setBf0910(String bf0910) {
        if (this.bf0910.equals(bf0910)) return; // for all checkboxes
        this.bf0910 = bf0910;
        notifyPropertyChanged(BR.bf0910);
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

    public void setBf0996(String bf0996) {
        if (this.bf0996.equals(bf0996)) return; // for all checkboxes
        this.bf0996 = bf0996;
        setBf0996x(bf0996.equals("96") ? this.bf0996x : "");
        notifyPropertyChanged(BR.bf0996);
    }

    public void setBf0996x(String bf0996x) {
        this.bf0996x = bf0996x;
        notifyPropertyChanged(BR.bf0996x);
    }

    public void setBf10(String bf10) {
        this.bf10 = bf10;

        setBf11(bf10.equals("1") ? "" : this.bf11);
        notifyPropertyChanged(BR.bf10);
    }

    public void setBf11(String bf11) {
        this.bf11 = bf11;
        notifyPropertyChanged(BR.bf11);
    }

    public void setBf12(String bf12) {
        this.bf12 = bf12;
        notifyPropertyChanged(BR.bf12);
    }

    public void setBf13(String bf13) {
        this.bf13 = bf13;
        notifyPropertyChanged(BR.bf13);
    }

    public void setBf14a(String bf14a) {
        this.bf14a = bf14a;
        notifyPropertyChanged(BR.bf14a);
    }

    public void setBf14b(String bf14b) {
        this.bf14b = bf14b;
        setBf14b01x(bf14b.equals("1") ? this.bf14b01x : "");
        notifyPropertyChanged(BR.bf14b);
    }

    public void setBf14b01x(String bf14b01x) {
        this.bf14b01x = bf14b01x;
        notifyPropertyChanged(BR.bf14b01x);
    }

    public void setBf14c(String bf14c) {
        this.bf14c = bf14c;
        setBf14c01x(bf14c.equals("1") ? this.bf14c01x : "");
        notifyPropertyChanged(BR.bf14c);
    }

    public void setBf14c01x(String bf14c01x) {
        this.bf14c01x = bf14c01x;
        notifyPropertyChanged(BR.bf14c01x);
    }

    public void setBf14d(String bf14d) {
        this.bf14d = bf14d;
        notifyPropertyChanged(BR.bf14d);
    }

    public void setBf14e(String bf14e) {
        this.bf14e = bf14e;
        notifyPropertyChanged(BR.bf14e);
    }

    public void setBf14f(String bf14f) {
        this.bf14f = bf14f;
        setBf14f01x(bf14f.equals("1") ? this.bf14f01x : "");
        notifyPropertyChanged(BR.bf14f);
    }

    public void setBf14f01x(String bf14f01x) {
        this.bf14f01x = bf14f01x;
        notifyPropertyChanged(BR.bf14f01x);
    }

    public void setBf14g(String bf14g) {
        this.bf14g = bf14g;
        notifyPropertyChanged(BR.bf14g);
    }

    public void setBf14h(String bf14h) {
        this.bf14h = bf14h;
        notifyPropertyChanged(BR.bf14h);
    }

    public void setBf14i(String bf14i) {
        this.bf14i = bf14i;
        notifyPropertyChanged(BR.bf14i);
    }

    public void setBf15a(String bf15a) {
        this.bf15a = bf15a;
        notifyPropertyChanged(BR.bf15a);
    }

    public void setBf15b(String bf15b) {
        this.bf15b = bf15b;
        notifyPropertyChanged(BR.bf15b);
    }

    public void setBf15c(String bf15c) {
        this.bf15c = bf15c;
        notifyPropertyChanged(BR.bf15c);
    }

    public void setBf15d(String bf15d) {
        this.bf15d = bf15d;
        notifyPropertyChanged(BR.bf15d);
    }

    public void setBf15e(String bf15e) {
        this.bf15e = bf15e;
        notifyPropertyChanged(BR.bf15e);
    }

    public void setBf15f(String bf15f) {
        this.bf15f = bf15f;
        notifyPropertyChanged(BR.bf15f);
    }

    public void setBf15g(String bf15g) {
        this.bf15g = bf15g;
        notifyPropertyChanged(BR.bf15g);
    }

    public void setBf15h(String bf15h) {
        this.bf15h = bf15h;
        notifyPropertyChanged(BR.bf15h);
    }

    public void setBf15i(String bf15i) {
        this.bf15i = bf15i;
        notifyPropertyChanged(BR.bf15i);
    }

    public void setBf15j(String bf15j) {
        this.bf15j = bf15j;
        notifyPropertyChanged(BR.bf15j);
    }

    public void setBf15k(String bf15k) {
        this.bf15k = bf15k;
        notifyPropertyChanged(BR.bf15k);
    }

    public void setBf15l(String bf15l) {
        this.bf15l = bf15l;
        notifyPropertyChanged(BR.bf15l);
    }

    public void setBf15m(String bf15m) {
        this.bf15m = bf15m;
        notifyPropertyChanged(BR.bf15m);
    }

    public void setBf15n(String bf15n) {
        this.bf15n = bf15n;
        notifyPropertyChanged(BR.bf15n);
    }

    public void setBf15o(String bf15o) {
        this.bf15o = bf15o;
        notifyPropertyChanged(BR.bf15o);
    }

    public void setBf15p(String bf15p) {
        this.bf15p = bf15p;
        notifyPropertyChanged(BR.bf15p);
    }

    public void setBf15q(String bf15q) {
        this.bf15q = bf15q;
        notifyPropertyChanged(BR.bf15q);
    }

    public void setBf16(String bf16) {
        this.bf16 = bf16;

        setBf17(bf16.equals("1") ? this.bf17 : "");

        notifyPropertyChanged(BR.bf16);
    }

    public void setBf17(String bf17) {
        this.bf17 = bf17;
        setBf1701x(bf17.equals("1") ? this.bf1701x : "");
        notifyPropertyChanged(BR.bf17);
    }

    public void setBf1701x(String bf1701x) {
        this.bf1701x = bf1701x;
        notifyPropertyChanged(BR.bf1701x);
    }

    public void setBf18(String bf18) {
        this.bf18 = bf18;

        setBf19(bf18.equals("2") ? "" : this.bf19);

        notifyPropertyChanged(BR.bf18);
    }

    public void setBf19(String bf19) {
        this.bf19 = bf19;
        setBf1996x(bf19.equals("96") ? this.bf1996x : "");
        notifyPropertyChanged(BR.bf19);
    }

    public void setBf1996x(String bf1996x) {
        this.bf1996x = bf1996x;
        notifyPropertyChanged(BR.bf1996x);
    }

    public void setBf20(String bf20) {
        this.bf20 = bf20;
        notifyPropertyChanged(BR.bf20);
    }

    public void setCv01a(String cv01a) {
        this.cv01a = cv01a;
        notifyPropertyChanged(BR.cv01a);
    }

    public void setCv01(String cv01) {
        this.cv01 = cv01;
        notifyPropertyChanged(BR.cv01);
    }

    public void setCv02(String cv02) {
        this.cv02 = cv02;
        notifyPropertyChanged(BR.cv02);
    }

    public void setCv03(String cv03) {
        this.cv03 = cv03;
        notifyPropertyChanged(BR.cv03);
    }

    public void setCv04(String cv04) {
        this.cv04 = cv04;
        notifyPropertyChanged(BR.cv04);
    }

    public void setCv05(String cv05) {
        this.cv05 = cv05;
        notifyPropertyChanged(BR.cv05);
    }

    public void setCv0501(String cv0501) {
        if (this.cv0501.equals(cv0501)) return; // for all checkboxes
        this.cv0501 = cv0501;
        notifyPropertyChanged(BR.cv0501);
    }

    public void setCv0502(String cv0502) {
        if (this.cv0502.equals(cv0502)) return; // for all checkboxes
        this.cv0502 = cv0502;
        notifyPropertyChanged(BR.cv0502);
    }

    public void setCv0503(String cv0503) {
        if (this.cv0503.equals(cv0503)) return; // for all checkboxes
        this.cv0503 = cv0503;
        notifyPropertyChanged(BR.cv0503);
    }

    public void setCv0504(String cv0504) {
        if (this.cv0504.equals(cv0504)) return; // for all checkboxes
        this.cv0504 = cv0504;
        notifyPropertyChanged(BR.cv0504);
    }

    public void setCv0505(String cv0505) {
        if (this.cv0505.equals(cv0505)) return; // for all checkboxes
        this.cv0505 = cv0505;
        notifyPropertyChanged(BR.cv0505);
    }

    public void setCv0506(String cv0506) {
        if (this.cv0506.equals(cv0506)) return; // for all checkboxes
        this.cv0506 = cv0506;
        notifyPropertyChanged(BR.cv0506);
    }

    public void setCv0507(String cv0507) {
        if (this.cv0507.equals(cv0507)) return; // for all checkboxes
        this.cv0507 = cv0507;
        notifyPropertyChanged(BR.cv0507);
    }

    public void setCv0596(String cv0596) {
        if (this.cv0596.equals(cv0596)) return; // for all checkboxes
        this.cv0596 = cv0596;
        setCv0596x(cv0596.equals("96") ? this.cv0596x : "");
        notifyPropertyChanged(BR.cv0596);
    }

    public void setCv0596x(String cv0596x) {
        this.cv0596x = cv0596x;
        notifyPropertyChanged(BR.cv0596x);
    }

    public void setCv06(String cv06) {
        this.cv06 = cv06;
        notifyPropertyChanged(BR.cv06);
    }

    public void setCv0601(String cv0601) {
        if (this.cv0601.equals(cv0601)) return; // for all checkboxes
        this.cv0601 = cv0601;
        notifyPropertyChanged(BR.cv0601);
    }

    public void setCv0602(String cv0602) {
        if (this.cv0602.equals(cv0602)) return; // for all checkboxes
        this.cv0602 = cv0602;
        notifyPropertyChanged(BR.cv0602);
    }

    public void setCv0603(String cv0603) {
        if (this.cv0603.equals(cv0603)) return; // for all checkboxes
        this.cv0603 = cv0603;
        notifyPropertyChanged(BR.cv0603);
    }

    public void setCv0604(String cv0604) {
        if (this.cv0604.equals(cv0604)) return; // for all checkboxes
        this.cv0604 = cv0604;
        notifyPropertyChanged(BR.cv0604);
    }

    public void setCv0605(String cv0605) {
        if (this.cv0605.equals(cv0605)) return; // for all checkboxes
        this.cv0605 = cv0605;
        notifyPropertyChanged(BR.cv0605);
    }

    public void setCv0606(String cv0606) {
        if (this.cv0606.equals(cv0606)) return; // for all checkboxes
        this.cv0606 = cv0606;
        notifyPropertyChanged(BR.cv0606);
    }

    public void setCv0607(String cv0607) {
        if (this.cv0607.equals(cv0607)) return; // for all checkboxes
        this.cv0607 = cv0607;
        notifyPropertyChanged(BR.cv0607);
    }

    public void setCv0608(String cv0608) {
        if (this.cv0608.equals(cv0608)) return; // for all checkboxes
        this.cv0608 = cv0608;
        notifyPropertyChanged(BR.cv0608);
    }

    public void setCv0609(String cv0609) {
        if (this.cv0609.equals(cv0609)) return; // for all checkboxes
        this.cv0609 = cv0609;
        notifyPropertyChanged(BR.cv0609);
    }

    public void setCv0610(String cv0610) {
        if (this.cv0610.equals(cv0610)) return; // for all checkboxes
        this.cv0610 = cv0610;
        notifyPropertyChanged(BR.cv0610);
    }

    public void setCv0611(String cv0611) {
        if (this.cv0611.equals(cv0611)) return; // for all checkboxes
        this.cv0611 = cv0611;
        notifyPropertyChanged(BR.cv0611);
    }

    public void setCv0612(String cv0612) {
        if (this.cv0612.equals(cv0612)) return; // for all checkboxes
        this.cv0612 = cv0612;
        notifyPropertyChanged(BR.cv0612);
    }

    public void setCv0696(String cv0696) {
        if (this.cv0696.equals(cv0696)) return; // for all checkboxes
        this.cv0696 = cv0696;
        setCv0696x(cv0696.equals("96") ? this.cv0696x : "");
        notifyPropertyChanged(BR.cv0696);
    }

    public void setCv0696x(String cv0696x) {
        this.cv0696x = cv0696x;
        notifyPropertyChanged(BR.cv0696x);
    }

    public void setCv07(String cv07) {
        this.cv07 = cv07;
        notifyPropertyChanged(BR.cv07);
    }

    public void setCv08(String cv08) {
        this.cv08 = cv08;
        notifyPropertyChanged(BR.cv08);
    }

    public void setCv0801(String cv0801) {
        if (this.cv0801.equals(cv0801)) return; // for all checkboxes
        this.cv0801 = cv0801;
        notifyPropertyChanged(BR.cv0801);
    }

    public void setCv0802(String cv0802) {
        if (this.cv0802.equals(cv0802)) return; // for all checkboxes
        this.cv0802 = cv0802;
        notifyPropertyChanged(BR.cv0802);
    }

    public void setCv0803(String cv0803) {
        if (this.cv0803.equals(cv0803)) return; // for all checkboxes
        this.cv0803 = cv0803;
        notifyPropertyChanged(BR.cv0803);
    }

    public void setCv0804(String cv0804) {
        if (this.cv0804.equals(cv0804)) return; // for all checkboxes
        this.cv0804 = cv0804;
        notifyPropertyChanged(BR.cv0804);
    }

    public void setCv0805(String cv0805) {
        if (this.cv0805.equals(cv0805)) return; // for all checkboxes
        this.cv0805 = cv0805;
        notifyPropertyChanged(BR.cv0805);
    }

    public void setCv0806(String cv0806) {
        if (this.cv0806.equals(cv0806)) return; // for all checkboxes
        this.cv0806 = cv0806;
        notifyPropertyChanged(BR.cv0806);
    }

    public void setCv0807(String cv0807) {
        if (this.cv0807.equals(cv0807)) return; // for all checkboxes
        this.cv0807 = cv0807;
        notifyPropertyChanged(BR.cv0807);
    }

    public void setCv0898(String cv0898) {
        if (this.cv0898.equals(cv0898)) return; // for all checkboxes
        this.cv0898 = cv0898;
        notifyPropertyChanged(BR.cv0898);
    }

    public void setCv0896(String cv0896) {
        if (this.cv0896.equals(cv0896)) return; // for all checkboxes
        this.cv0896 = cv0896;
        setCv0896x(cv0896.equals("96") ? this.cv0896x : "");
        notifyPropertyChanged(BR.cv0896);
    }

    public void setCv0896x(String cv0896x) {
        this.cv0896x = cv0896x;
        notifyPropertyChanged(BR.cv0896x);
    }

    public void setCv09(String cv09) {
        this.cv09 = cv09;
        notifyPropertyChanged(BR.cv09);
    }

    public void setCv0901(String cv0901) {
        if (this.cv0901.equals(cv0901)) return; // for all checkboxes
        this.cv0901 = cv0901;
        notifyPropertyChanged(BR.cv0901);
    }

    public void setCv0902(String cv0902) {
        if (this.cv0902.equals(cv0902)) return; // for all checkboxes
        this.cv0902 = cv0902;
        notifyPropertyChanged(BR.cv0902);
    }

    public void setCv0903(String cv0903) {
        if (this.cv0903.equals(cv0903)) return; // for all checkboxes
        this.cv0903 = cv0903;
        notifyPropertyChanged(BR.cv0903);
    }

    public void setCv0904(String cv0904) {
        if (this.cv0904.equals(cv0904)) return; // for all checkboxes
        this.cv0904 = cv0904;
        notifyPropertyChanged(BR.cv0904);
    }

    public void setCv0905(String cv0905) {
        if (this.cv0905.equals(cv0905)) return; // for all checkboxes
        this.cv0905 = cv0905;
        notifyPropertyChanged(BR.cv0905);
    }

    public void setCv0906(String cv0906) {
        if (this.cv0906.equals(cv0906)) return; // for all checkboxes
        this.cv0906 = cv0906;
        notifyPropertyChanged(BR.cv0906);
    }

    public void setCv0907(String cv0907) {
        if (this.cv0907.equals(cv0907)) return; // for all checkboxes
        this.cv0907 = cv0907;
        notifyPropertyChanged(BR.cv0907);
    }

    public void setCv0908(String cv0908) {
        if (this.cv0908.equals(cv0908)) return; // for all checkboxes
        this.cv0908 = cv0908;
        notifyPropertyChanged(BR.cv0908);
    }

    public void setCv0998(String cv0998) {
        if (this.cv0998.equals(cv0998)) return; // for all checkboxes
        this.cv0998 = cv0998;
        notifyPropertyChanged(BR.cv0998);
    }

    public void setCv0996(String cv0996) {
        if (this.cv0996.equals(cv0996)) return; // for all checkboxes
        this.cv0996 = cv0996;
        setCv0996x(cv0996.equals("96") ? this.cv0996x : "");
        notifyPropertyChanged(BR.cv0996);
    }

    public void setCv0996x(String cv0996x) {
        this.cv0996x = cv0996x;
        notifyPropertyChanged(BR.cv0996x);
    }

    public void setCv10(String cv10) {
        this.cv10 = cv10;
        notifyPropertyChanged(BR.cv10);
    }

    public void setCv1001(String cv1001) {
        if (this.cv1001.equals(cv1001)) return; // for all checkboxes
        this.cv1001 = cv1001;
        notifyPropertyChanged(BR.cv1001);
    }

    public void setCv1002(String cv1002) {
        if (this.cv1002.equals(cv1002)) return; // for all checkboxes
        this.cv1002 = cv1002;
        notifyPropertyChanged(BR.cv1002);
    }

    public void setCv1003(String cv1003) {
        if (this.cv1003.equals(cv1003)) return; // for all checkboxes
        this.cv1003 = cv1003;
        notifyPropertyChanged(BR.cv1003);
    }

    public void setCv1004(String cv1004) {
        if (this.cv1004.equals(cv1004)) return; // for all checkboxes
        this.cv1004 = cv1004;
        notifyPropertyChanged(BR.cv1004);
    }

    public void setCv1005(String cv1005) {
        if (this.cv1005.equals(cv1005)) return; // for all checkboxes
        this.cv1005 = cv1005;
        notifyPropertyChanged(BR.cv1005);
    }

    public void setCv1006(String cv1006) {
        if (this.cv1006.equals(cv1006)) return; // for all checkboxes
        this.cv1006 = cv1006;
        notifyPropertyChanged(BR.cv1006);
    }

    public void setCv1007(String cv1007) {
        if (this.cv1007.equals(cv1007)) return; // for all checkboxes
        this.cv1007 = cv1007;
        notifyPropertyChanged(BR.cv1007);
    }

    public void setCv1008(String cv1008) {
        if (this.cv1008.equals(cv1008)) return; // for all checkboxes
        this.cv1008 = cv1008;
        notifyPropertyChanged(BR.cv1008);
    }

    public void setCv1009(String cv1009) {
        if (this.cv1009.equals(cv1009)) return; // for all checkboxes
        this.cv1009 = cv1009;
        notifyPropertyChanged(BR.cv1009);
    }

    public void setCv1098(String cv1098) {
        if (this.cv1098.equals(cv1098)) return; // for all checkboxes
        this.cv1098 = cv1098;
        notifyPropertyChanged(BR.cv1098);
    }

    public void setCv1096(String cv1096) {
        if (this.cv1096.equals(cv1096)) return; // for all checkboxes
        this.cv1096 = cv1096;
        setCv1096x(cv1096.equals("96") ? this.cv1096x : "");
        notifyPropertyChanged(BR.cv1096);
    }

    public void setCv1096x(String cv1096x) {
        this.cv1096x = cv1096x;
        notifyPropertyChanged(BR.cv1096x);
    }

    public void setCv11(String cv11) {
        this.cv11 = cv11;
        notifyPropertyChanged(BR.cv11);
    }

    public void setCv12(String cv12) {
        this.cv12 = cv12;
        setCv1296x(cv12.equals("96") ? this.cv1296x : "");
        notifyPropertyChanged(BR.cv12);
    }

    public void setCv1296x(String cv1296x) {
        this.cv1296x = cv1296x;
        notifyPropertyChanged(BR.cv1296x);
    }

    public void setCv13(String cv13) {
        this.cv13 = cv13;
        notifyPropertyChanged(BR.cv13);
    }

    public void setCv14(String cv14) {
        this.cv14 = cv14;
        notifyPropertyChanged(BR.cv14);
    }

    public void setCv15(String cv15) {
        this.cv15 = cv15;
        notifyPropertyChanged(BR.cv15);
    }

    public void setCv16(String cv16) {
        this.cv16 = cv16;
        setCv1696x(cv16.equals("96") ? this.cv1696x : "");
        notifyPropertyChanged(BR.cv16);
    }

    public void setCv1696x(String cv1696x) {
        this.cv1696x = cv1696x;
        notifyPropertyChanged(BR.cv1696x);
    }

    public void setCv17(String cv17) {
        this.cv17 = cv17;
        notifyPropertyChanged(BR.cv17);
    }

    public void setCv18(String cv18) {
        this.cv18 = cv18;
        setCv1896x(cv18.equals("96") ? this.cv1896x : "");
        notifyPropertyChanged(BR.cv18);
    }

    public void setCv1896x(String cv1896x) {
        this.cv1896x = cv1896x;
        notifyPropertyChanged(BR.cv1896x);
    }

    public void setCv19(String cv19) {
        this.cv19 = cv19;
        setCv1996x(cv19.equals("96") ? this.cv1996x : "");
        notifyPropertyChanged(BR.cv19);
    }

    public void setCv1996x(String cv1996x) {
        this.cv1996x = cv1996x;
        notifyPropertyChanged(BR.cv1996x);
    }

    public void setCv20(String cv20) {
        this.cv20 = cv20;
        notifyPropertyChanged(BR.cv20);
    }

    public void setCv21(String cv21) {
        this.cv21 = cv21;
        notifyPropertyChanged(BR.cv21);
    }

    public void setCv2101(String cv2101) {
        if (this.cv2101.equals(cv2101)) return; // for all checkboxes
        this.cv2101 = cv2101;
        notifyPropertyChanged(BR.cv2101);
    }

    public void setCv2102(String cv2102) {
        if (this.cv2102.equals(cv2102)) return; // for all checkboxes
        this.cv2102 = cv2102;
        notifyPropertyChanged(BR.cv2102);
    }

    public void setCv2103(String cv2103) {
        if (this.cv2103.equals(cv2103)) return; // for all checkboxes
        this.cv2103 = cv2103;
        notifyPropertyChanged(BR.cv2103);
    }

    public void setCv2104(String cv2104) {
        if (this.cv2104.equals(cv2104)) return; // for all checkboxes
        this.cv2104 = cv2104;
        notifyPropertyChanged(BR.cv2104);
    }

    public void setCv2105(String cv2105) {
        if (this.cv2105.equals(cv2105)) return; // for all checkboxes
        this.cv2105 = cv2105;
        notifyPropertyChanged(BR.cv2105);
    }

    public void setCv2106(String cv2106) {
        if (this.cv2106.equals(cv2106)) return; // for all checkboxes
        this.cv2106 = cv2106;
        notifyPropertyChanged(BR.cv2106);
    }

    public void setCv2107(String cv2107) {
        if (this.cv2107.equals(cv2107)) return; // for all checkboxes
        this.cv2107 = cv2107;
        notifyPropertyChanged(BR.cv2107);
    }

    public void setCv2108(String cv2108) {
        if (this.cv2108.equals(cv2108)) return; // for all checkboxes
        this.cv2108 = cv2108;
        notifyPropertyChanged(BR.cv2108);
    }

    public void setCv2109(String cv2109) {
        if (this.cv2109.equals(cv2109)) return; // for all checkboxes
        this.cv2109 = cv2109;
        notifyPropertyChanged(BR.cv2109);
    }

    public void setCv2198(String cv2198) {
        if (this.cv2198.equals(cv2198)) return; // for all checkboxes
        this.cv2198 = cv2198;
        notifyPropertyChanged(BR.cv2198);
    }

    public void setCv2196(String cv2196) {
        if (this.cv2196.equals(cv2196)) return; // for all checkboxes
        this.cv2196 = cv2196;
        setCv2196x(cv2196.equals("96") ? this.cv2196x : "");
        notifyPropertyChanged(BR.cv2196);
    }

    public void setCv2196x(String cv2196x) {
        this.cv2196x = cv2196x;
        notifyPropertyChanged(BR.cv2196x);
    }

    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
/*
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
*/
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_EB_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SYSDATE));
        this.cstatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_CSTATUS));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SYNC_DATE));

        sPDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SPD)));
        sBFHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SBF)));
        sCVHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MWRATable.COLUMN_SCV)));
        //CaluculateAge();

        return this;
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

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MWRATable.COLUMN_ID, this.id);
        json.put(TableContracts.MWRATable.COLUMN_UID, this.uid);
        json.put(TableContracts.MWRATable.COLUMN_EB_CODE, this.ebCode);
        json.put(TableContracts.MWRATable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.MWRATable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.MWRATable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.MWRATable.COLUMN_SNO, this.sno);
        json.put(TableContracts.MWRATable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MWRATable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MWRATable.COLUMN_CSTATUS, this.cstatus);
        json.put(TableContracts.MWRATable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MWRATable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MWRATable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MWRATable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.MWRATable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.MWRATable.COLUMN_SPD, new JSONObject(sPDtoString()));
        json.put(TableContracts.MWRATable.COLUMN_SBF, new JSONObject(sBFtoString()));
        json.put(TableContracts.MWRATable.COLUMN_SCV, new JSONObject(sCVtoString()));

        return json;
    }



}