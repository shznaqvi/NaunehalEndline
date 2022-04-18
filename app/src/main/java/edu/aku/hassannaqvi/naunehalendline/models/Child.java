package edu.aku.hassannaqvi.naunehalendline.models;

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
    public String cb0501 = _EMPTY_;
    public String cb0502 = _EMPTY_;
    public String cb06 = _EMPTY_;
    public String cb15 = _EMPTY_;
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
    private String im24 = _EMPTY_;
    private String im2417x = _EMPTY_;
    private String im24a = _EMPTY_;
    /* private String im24b = _EMPTY_;
     private String im24b98 = _EMPTY_;*/
    private String im24c = _EMPTY_;
    // private String im24d = _EMPTY_;
    private String im25 = _EMPTY_;
    private String im26 = _EMPTY_;

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


    private long ageInMonths = -1;
    private long trueAgeInMonths = -1;
    private boolean ageCheck;


    public void Child() {


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
        notifyPropertyChanged(BR.cb04dd);
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        notifyPropertyChanged(BR.cb04mm);
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        notifyPropertyChanged(BR.cb04yy);
    }

    public void setCb0501(String cb0501) {
        this.cb0501 = cb0501;
        notifyPropertyChanged(BR.cb0501);
    }

    public void setCb0502(String cb0502) {
        this.cb0502 = cb0502;
        notifyPropertyChanged(BR.cb0502);
    }

    public void setCb06(String cb06) {
        this.cb06 = cb06;
        notifyPropertyChanged(BR.cb06);
    }

    public void setCb15(String cb15) {
        this.cb15 = cb15;
        notifyPropertyChanged(BR.cb15);
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
        notifyPropertyChanged(BR.cs02a);
    }

    public void setCs02b(String cs02b) {
        this.cs02b = cs02b;
        notifyPropertyChanged(BR.cs02b);
    }

    public void setCs03(String cs03) {
        this.cs03 = cs03;
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
        notifyPropertyChanged(BR.cs06);
    }

    public void setCs07(String cs07) {
        this.cs07 = cs07;
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
        notifyPropertyChanged(BR.cs0896);
    }

    public void setCs0896x(String cs0896x) {
        this.cs0896x = cs0896x;
        notifyPropertyChanged(BR.cs0896x);
    }

    public void setCs08a(String cs08a) {
        this.cs08a = cs08a;
        notifyPropertyChanged(BR.cs08a);
    }

    public void setCs08b(String cs08b) {
        this.cs08b = cs08b;
        notifyPropertyChanged(BR.cs08b);
    }

    public void setCs09(String cs09) {
        this.cs09 = cs09;
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
        notifyPropertyChanged(BR.cs14);
    }

    public void setCs15(String cs15) {
        this.cs15 = cs15;
        notifyPropertyChanged(BR.cs15);
    }

    public void setCs1596x(String cs1596x) {
        this.cs1596x = cs1596x;
        notifyPropertyChanged(BR.cs1596x);
    }

    public void setCs16(String cs16) {
        this.cs16 = cs16;
        notifyPropertyChanged(BR.cs16);
    }

    public void setCs17(String cs17) {
        this.cs17 = cs17;
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
        notifyPropertyChanged(BR.cs1896);
    }

    public void setCs1896x(String cs1896x) {
        this.cs1896x = cs1896x;
        notifyPropertyChanged(BR.cs1896x);
    }

    public void setCs19(String cs19) {
        this.cs19 = cs19;
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
        setAgeCheck(ageInMonths > 6 && ageInMonths < 23);
        notifyPropertyChanged(BR.ageInMonths);

    }

    @Bindable
    public long getTrueAgeInMonths() {
        return trueAgeInMonths;
    }


    public void setTrueAgeInMonths(long trueAgeInMonths) {
        this.trueAgeInMonths = trueAgeInMonths;
        setAgeCheck(trueAgeInMonths > 6 && trueAgeInMonths < 23);
        notifyPropertyChanged(BR.trueAgeInMonths);
    }

    @Bindable
    public boolean getAgeCheck() {
        return ageCheck;
    }

    private void setAgeCheck(boolean ageCheck) {
        this.ageCheck = ageCheck;
        notifyPropertyChanged(BR.ageCheck);

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

       /* setIm04dd(im01.equals("1") ? this.im04dd : "");
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
*/

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



/*
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
        setIm22(im02.equals("1") ? "" : this.im22);
        setIm22a(im02.equals("1") ? "" : this.im22a);
        setIm23(im02.equals("1") || this.im08.equals("1") ? this.im23 : "");
        setIm23a(im02.equals("1") || this.im08.equals("1") ? this.im23a : "");
        setIm24(im02.equals("1") ? "" : this.im24);*/


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
        setIm26(im24a.equals("2") ? this.im26 : "");
        /* setIm24d(im24a.equals("1") ? this.im24d : "");*/
        notifyPropertyChanged(BR.im24a);
    }

    /* @Bindable
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
 */
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
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }

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


    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
/*
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
*/
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_EB_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
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
          /*  this.im24b = json.getString("im24b");
            this.im24b98 = json.getString("im24b98");*/
            this.im24c = json.getString("im24c");
            /*    this.im24d = json.getString("im24d");*/
            this.im25 = json.getString("im25");
            this.im26 = json.getString("im26");
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


    public String sCBtoString() throws JSONException {
        Log.d(TAG, "sCBtoString: ");
        JSONObject json = new JSONObject();

        json.put("cb01", cb01)
                .put("cb02", cb02)
                .put("cb03", cb03)
                .put("cb04dd", cb04dd)
                .put("cb04mm", cb04mm)
                .put("cb04yy", cb04yy)
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
                .put("cb1496x", cb1496x);

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
                /*  .put("im24b", im24b)
                  .put("im24b98", im24b98)*/
                .put("im24c", im24c)
                /*     .put("im24d", im24d)*/
                .put("im25", im25)
                .put("im26", im26)
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


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_EB_CODE, this.ebCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
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

        return json;
    }


    private void CaluculateAge(String dd, String mm, String yy, boolean trueAge) {
        setAgeCheck(false);
        Log.d(TAG, "CaluculateAge: " + yy + "-" + mm + "-" + dd);

        if (!trueAge) {
            setCb04mm("");
            setCb04yy("");
        } else {
            setTrueAgeInMonths(-1);
        }
        if (!yy.equals("") && !yy.equals("9998") && !mm.equals("") && !dd.equals("")) {

            if ((Integer.parseInt(mm) > 12 && !mm.equals("98"))
                    || (Integer.parseInt(dd) > 31 && !dd.equals("98"))
                    || Integer.parseInt(yy) < 1920) {
                if (!trueAge) {
                    setCb04yy("");
                    setCb04mm("");
                    this.ageInMonths = 0;
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


                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/


                if (!trueAge) {

                    setCb04yy(String.valueOf(tYear));
                    setCb04mm(String.valueOf(tMonth));
                    if (tYear < 0) {
                        setCb04yy("");
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
