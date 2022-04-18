package edu.aku.hassannaqvi.naunehalendline.models;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedCluster;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedHousehold;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.naunehalendline.BR;
import edu.aku.hassannaqvi.naunehalendline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // FORM SECTIONS
    private final String sHH = _EMPTY_;
    private final String sSE = _EMPTY_;

    public String getsHH() {
        return sHH;
    }

    public String getsSE() {
        return sSE;
    }



    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String ebCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String entryType = _EMPTY_;


    // FIELD VARIABLES
    public String hh01 = _EMPTY_;
    public String hh0201 = _EMPTY_;
    public String hh0202 = _EMPTY_;
    public String hh03 = _EMPTY_;
    public String hh04 = _EMPTY_;
    public String hh05 = _EMPTY_;
    public String hh06 = _EMPTY_;
    public String hh07 = _EMPTY_;
    public String hh08 = _EMPTY_;
    public String hh09 = _EMPTY_;
    public String hh10 = _EMPTY_;
    public String hh11 = _EMPTY_;
    public String hh13 = _EMPTY_;
    public String hh12 = _EMPTY_;
    public String hh14 = _EMPTY_;
    public String hh15 = _EMPTY_;
    public String hh16 = _EMPTY_;
    public String hh17 = _EMPTY_;
    public String hh1796x = _EMPTY_;
    public String hh18 = _EMPTY_;
    public String hh19 = _EMPTY_;
    public String hh20 = _EMPTY_;
    public String hh2096x = _EMPTY_;
    public String hh21 = _EMPTY_;
    public String hh22 = _EMPTY_;
    public String hh23 = _EMPTY_;
    public String hh24 = _EMPTY_;
    public String hh25 = _EMPTY_;
    public String hh26 = _EMPTY_;
    public String hh2696x = _EMPTY_;
    public String se01 = _EMPTY_;
    public String se0196x = _EMPTY_;
    public String se02 = _EMPTY_;
    public String se0296x = _EMPTY_;
    public String se03 = _EMPTY_;
    public String se0396x = _EMPTY_;
    public String se04 = _EMPTY_;
    public String se0496x = _EMPTY_;
    public String se05 = _EMPTY_;
    public String se0596x = _EMPTY_;
    public String se06a = _EMPTY_;
    public String se07a = _EMPTY_;
    public String se08 = _EMPTY_;
    public String se0896x = _EMPTY_;
    public String se09 = _EMPTY_;
    public String se10 = _EMPTY_;
    public String se1099x = _EMPTY_;
    public String se11 = _EMPTY_;
    public String se1196x = _EMPTY_;
    public String se12 = _EMPTY_;
    public String se1296x = _EMPTY_;
    public String se13 = _EMPTY_;
    public String se14 = _EMPTY_;
    public String se15 = _EMPTY_;
    public String se16 = _EMPTY_;
    public String se17 = _EMPTY_;
    public String se1701 = _EMPTY_;
    public String se1702 = _EMPTY_;
    public String se1703 = _EMPTY_;
    public String se1704 = _EMPTY_;
    public String se1705 = _EMPTY_;
    public String se1801 = _EMPTY_;
    public String se1802 = _EMPTY_;
    public String se1803 = _EMPTY_;
    public String se1804 = _EMPTY_;
    public String se1805 = _EMPTY_;
    public String se1896 = _EMPTY_;
    public String se189601x = _EMPTY_;
    public String se19 = _EMPTY_;
    public String se1996x = _EMPTY_;
    public String se20 = _EMPTY_;
    public String se2001 = _EMPTY_;
    public String se2002 = _EMPTY_;
    public String se2003 = _EMPTY_;
    public String se2004 = _EMPTY_;
    public String se2005 = _EMPTY_;
    public String se2006 = _EMPTY_;
    public String se2096 = _EMPTY_;
    public String se2096x = _EMPTY_;
    public String se21 = _EMPTY_;
    public String se2101 = _EMPTY_;
    public String se2102 = _EMPTY_;
    public String se2103 = _EMPTY_;
    public String se2104 = _EMPTY_;
    public String se2105 = _EMPTY_;
    public String se2196 = _EMPTY_;
    public String se2196x = _EMPTY_;
    public String se2201 = _EMPTY_;
    public String se2202 = _EMPTY_;
    public String se2203 = _EMPTY_;
    public String se2204 = _EMPTY_;
    public String se2205 = _EMPTY_;
    public String se2206 = _EMPTY_;
    public String se2207 = _EMPTY_;
    public String se2208 = _EMPTY_;
    public String se2209 = _EMPTY_;
    public String se2210 = _EMPTY_;
    public String se2211 = _EMPTY_;
    public String se2212 = _EMPTY_;
    public String se2213 = _EMPTY_;
    public String se2214 = _EMPTY_;
    public String se2215 = _EMPTY_;
    public String se2216 = _EMPTY_;
    public String se2217 = _EMPTY_;
    public String se2218 = _EMPTY_;
    public String se31 = _EMPTY_;
    public String se3196x = _EMPTY_;
    public String se32 = _EMPTY_;
    public String se3301 = _EMPTY_;
    public String se3302 = _EMPTY_;
    public String se51 = _EMPTY_;
    public String se41 = _EMPTY_;
    public String se42 = _EMPTY_;
    public String se4296x = _EMPTY_;
    public String se43 = _EMPTY_;
    public String se4301 = _EMPTY_;
    public String se4302 = _EMPTY_;
    public String se4303 = _EMPTY_;
    public String se4304 = _EMPTY_;
    public String se4305 = _EMPTY_;
    public String se4306 = _EMPTY_;
    public String se4307 = _EMPTY_;
    public String se4308 = _EMPTY_;
    public String se4309 = _EMPTY_;
    public String se4310 = _EMPTY_;
    public String se4311 = _EMPTY_;
    public String se4396 = _EMPTY_;
    public String se4396x = _EMPTY_;
    public String se44 = _EMPTY_;
    public String se4401 = _EMPTY_;
    public String se4402 = _EMPTY_;
    public String se4403 = _EMPTY_;
    public String se4404 = _EMPTY_;
    public String se4496 = _EMPTY_;
    public String se4496x = _EMPTY_;
    public String se45 = _EMPTY_;
    public String se46 = _EMPTY_;
    public String se4601 = _EMPTY_;
    public String se4602 = _EMPTY_;
    public String se4603 = _EMPTY_;
    public String se4604 = _EMPTY_;
    public String se4605 = _EMPTY_;
    public String se4606 = _EMPTY_;
    public String se4696 = _EMPTY_;
    public String se4696x = _EMPTY_;
    public String se47 = _EMPTY_;
    public String se4796x = _EMPTY_;
    public String se52 = _EMPTY_;
    public String se53 = _EMPTY_;
    public String se53_96x = _EMPTY_;
    public String se54 = _EMPTY_;
    public String se54_01 = _EMPTY_;
    public String se54_02 = _EMPTY_;
    public String se54_03 = _EMPTY_;
    public String se54_04 = _EMPTY_;
    public String se54_05 = _EMPTY_;
    public String se54_06 = _EMPTY_;
    public String se54_96 = _EMPTY_;
    public String se54_96x = _EMPTY_;
    public String se55 = _EMPTY_;
    public String se55_01x = _EMPTY_;
    public String se48 = _EMPTY_;
    public String se56 = _EMPTY_;
    public String se56_01 = _EMPTY_;
    public String se56_02 = _EMPTY_;
    public String se56_03 = _EMPTY_;
    public String se56_04 = _EMPTY_;
    public String se56_05 = _EMPTY_;
    public String se56_06 = _EMPTY_;
    public String se56_96 = _EMPTY_;
    public String se56_96x = _EMPTY_;
    public String se49 = _EMPTY_;
    public String se4901 = _EMPTY_;
    public String se4902 = _EMPTY_;
    public String se4903 = _EMPTY_;
    public String se4904 = _EMPTY_;
    public String se4998 = _EMPTY_;
    public String se4996 = _EMPTY_;
    public String se4996x = _EMPTY_;
    public String se50 = _EMPTY_;
    public String se5096x = _EMPTY_;
    public String se57 = _EMPTY_;
    public String se57_01x = _EMPTY_;
    public String se3401 = _EMPTY_;
    public String se3402 = _EMPTY_;
    public String se58 = _EMPTY_;
    public String se59 = _EMPTY_;
    public String se60 = _EMPTY_;
    public String se60_01 = _EMPTY_;
    public String se60_02 = _EMPTY_;
    public String se60_03 = _EMPTY_;
    public String se60_04 = _EMPTY_;
    public String se60_05 = _EMPTY_;
    public String se60_06 = _EMPTY_;
    public String se60_98 = _EMPTY_;
    public String se60_96 = _EMPTY_;
    public String se60_96x = _EMPTY_;
    public String se35 = _EMPTY_;
    public String se36 = _EMPTY_;
    public String se37 = _EMPTY_;
    public String se3701 = _EMPTY_;
    public String se3702 = _EMPTY_;
    public String se3703 = _EMPTY_;
    public String se3704 = _EMPTY_;
    public String se3705 = _EMPTY_;
    public String se3706 = _EMPTY_;
    public String se3707 = _EMPTY_;
    public String se3708 = _EMPTY_;
    public String se3709 = _EMPTY_;
    public String se3710 = _EMPTY_;
    public String se3796 = _EMPTY_;
    public String se3796x = _EMPTY_;
    public String se38 = _EMPTY_;
    public String se39 = _EMPTY_;
    public String se40 = _EMPTY_;


    public Form() {

/*        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());*/

    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEbCode(MainApp.selectedHousehold.getEbCode());
        setHhid(MainApp.selectedHousehold.getHhid());
        setSno(MainApp.selectedHousehold.getSno());
        // setEntryType(String.valueOf(MainApp.entryType));

        //SECTION VARIABLES
        setHh05(MainApp.selectedHousehold.getEbCode());
        setHh06(selectedCluster.getGeoarea().split("\\|")[0]);
        setHh07(selectedCluster.getGeoarea().split("\\|")[1]);
        setHh08(selectedCluster.getGeoarea().split("\\|")[2]);
        setHh09(selectedCluster.getGeoarea().split("\\|")[3]);
        setHh12(selectedHousehold.getHhid());

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
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

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
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

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
        // this.o108 = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
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
    public String getHh01() {
        return hh01;
    }

    @Bindable
    public String getHh0201() {
        return hh0201;
    }

    @Bindable
    public String getHh0202() {
        return hh0202;
    }

    @Bindable
    public String getHh03() {
        return hh03;
    }

    @Bindable
    public String getHh04() {
        return hh04;
    }

    @Bindable
    public String getHh05() {
        return hh05;
    }

    @Bindable
    public String getHh06() {
        return hh06;
    }

    @Bindable
    public String getHh07() {
        return hh07;
    }

    @Bindable
    public String getHh08() {
        return hh08;
    }

    @Bindable
    public String getHh09() {
        return hh09;
    }

    @Bindable
    public String getHh10() {
        return hh10;
    }

    @Bindable
    public String getHh11() {
        return hh11;
    }

    @Bindable
    public String getHh13() {
        return hh13;
    }

    @Bindable
    public String getHh12() {
        return hh12;
    }

    @Bindable
    public String getHh14() {
        return hh14;
    }

    @Bindable
    public String getHh15() {
        return hh15;
    }

    @Bindable
    public String getHh16() {
        return hh16;
    }

    @Bindable
    public String getHh17() {
        return hh17;
    }

    @Bindable
    public String getHh1796x() {
        return hh1796x;
    }

    @Bindable
    public String getHh18() {
        return hh18;
    }

    @Bindable
    public String getHh19() {
        return hh19;
    }

    @Bindable
    public String getHh20() {
        return hh20;
    }

    @Bindable
    public String getHh2096x() {
        return hh2096x;
    }

    @Bindable
    public String getHh21() {
        return hh21;
    }

    @Bindable
    public String getHh22() {
        return hh22;
    }

    @Bindable
    public String getHh23() {
        return hh23;
    }

    @Bindable
    public String getHh24() {
        return hh24;
    }

    @Bindable
    public String getHh25() {
        return hh25;
    }

    @Bindable
    public String getHh26() {
        return hh26;
    }

    @Bindable
    public String getHh2696x() {
        return hh2696x;
    }

    @Bindable
    public String getSe01() {
        return se01;
    }

    @Bindable
    public String getSe0196x() {
        return se0196x;
    }

    @Bindable
    public String getSe02() {
        return se02;
    }

    @Bindable
    public String getSe0296x() {
        return se0296x;
    }

    @Bindable
    public String getSe03() {
        return se03;
    }

    @Bindable
    public String getSe0396x() {
        return se0396x;
    }

    @Bindable
    public String getSe04() {
        return se04;
    }

    @Bindable
    public String getSe0496x() {
        return se0496x;
    }

    @Bindable
    public String getSe05() {
        return se05;
    }

    @Bindable
    public String getSe0596x() {
        return se0596x;
    }

    @Bindable
    public String getSe06a() {
        return se06a;
    }

    @Bindable
    public String getSe07a() {
        return se07a;
    }

    @Bindable
    public String getSe08() {
        return se08;
    }

    @Bindable
    public String getSe0896x() {
        return se0896x;
    }

    @Bindable
    public String getSe09() {
        return se09;
    }

    @Bindable
    public String getSe10() {
        return se10;
    }

    @Bindable
    public String getSe1099x() {
        return se1099x;
    }

    @Bindable
    public String getSe11() {
        return se11;
    }

    @Bindable
    public String getSe1196x() {
        return se1196x;
    }

    @Bindable
    public String getSe12() {
        return se12;
    }

    @Bindable
    public String getSe1296x() {
        return se1296x;
    }

    @Bindable
    public String getSe13() {
        return se13;
    }

    @Bindable
    public String getSe14() {
        return se14;
    }

    @Bindable
    public String getSe15() {
        return se15;
    }

    @Bindable
    public String getSe16() {
        return se16;
    }

    @Bindable
    public String getSe17() {
        return se17;
    }

    @Bindable
    public String getSe1701() {
        return se1701;
    }

    @Bindable
    public String getSe1702() {
        return se1702;
    }

    @Bindable
    public String getSe1703() {
        return se1703;
    }

    @Bindable
    public String getSe1704() {
        return se1704;
    }

    @Bindable
    public String getSe1705() {
        return se1705;
    }

    @Bindable
    public String getSe1801() {
        return se1801;
    }

    @Bindable
    public String getSe1802() {
        return se1802;
    }

    @Bindable
    public String getSe1803() {
        return se1803;
    }

    @Bindable
    public String getSe1804() {
        return se1804;
    }

    @Bindable
    public String getSe1805() {
        return se1805;
    }

    @Bindable
    public String getSe1896() {
        return se1896;
    }

    @Bindable
    public String getSe189601x() {
        return se189601x;
    }

    @Bindable
    public String getSe19() {
        return se19;
    }

    @Bindable
    public String getSe1996x() {
        return se1996x;
    }

    @Bindable
    public String getSe20() {
        return se20;
    }

    @Bindable
    public String getSe2001() {
        return se2001;
    }

    @Bindable
    public String getSe2002() {
        return se2002;
    }

    @Bindable
    public String getSe2003() {
        return se2003;
    }

    @Bindable
    public String getSe2004() {
        return se2004;
    }

    @Bindable
    public String getSe2005() {
        return se2005;
    }

    @Bindable
    public String getSe2006() {
        return se2006;
    }

    @Bindable
    public String getSe2096() {
        return se2096;
    }

    @Bindable
    public String getSe2096x() {
        return se2096x;
    }

    @Bindable
    public String getSe21() {
        return se21;
    }

    @Bindable
    public String getSe2101() {
        return se2101;
    }

    @Bindable
    public String getSe2102() {
        return se2102;
    }

    @Bindable
    public String getSe2103() {
        return se2103;
    }

    @Bindable
    public String getSe2104() {
        return se2104;
    }

    @Bindable
    public String getSe2105() {
        return se2105;
    }

    @Bindable
    public String getSe2196() {
        return se2196;
    }

    @Bindable
    public String getSe2196x() {
        return se2196x;
    }

    @Bindable
    public String getSe2201() {
        return se2201;
    }

    @Bindable
    public String getSe2202() {
        return se2202;
    }

    @Bindable
    public String getSe2203() {
        return se2203;
    }

    @Bindable
    public String getSe2204() {
        return se2204;
    }

    @Bindable
    public String getSe2205() {
        return se2205;
    }

    @Bindable
    public String getSe2206() {
        return se2206;
    }

    @Bindable
    public String getSe2207() {
        return se2207;
    }

    @Bindable
    public String getSe2208() {
        return se2208;
    }

    @Bindable
    public String getSe2209() {
        return se2209;
    }

    @Bindable
    public String getSe2210() {
        return se2210;
    }

    @Bindable
    public String getSe2211() {
        return se2211;
    }

    @Bindable
    public String getSe2212() {
        return se2212;
    }

    @Bindable
    public String getSe2213() {
        return se2213;
    }

    @Bindable
    public String getSe2214() {
        return se2214;
    }

    @Bindable
    public String getSe2215() {
        return se2215;
    }

    @Bindable
    public String getSe2216() {
        return se2216;
    }

    @Bindable
    public String getSe2217() {
        return se2217;
    }

    @Bindable
    public String getSe2218() {
        return se2218;
    }

    @Bindable
    public String getSe31() {
        return se31;
    }

    @Bindable
    public String getSe3196x() {
        return se3196x;
    }

    @Bindable
    public String getSe32() {
        return se32;
    }

    @Bindable
    public String getSe3301() {
        return se3301;
    }

    @Bindable
    public String getSe3302() {
        return se3302;
    }

    @Bindable
    public String getSe51() {
        return se51;
    }

    @Bindable
    public String getSe41() {
        return se41;
    }

    @Bindable
    public String getSe42() {
        return se42;
    }

    @Bindable
    public String getSe4296x() {
        return se4296x;
    }

    @Bindable
    public String getSe43() {
        return se43;
    }

    @Bindable
    public String getSe4301() {
        return se4301;
    }

    @Bindable
    public String getSe4302() {
        return se4302;
    }

    @Bindable
    public String getSe4303() {
        return se4303;
    }

    @Bindable
    public String getSe4304() {
        return se4304;
    }

    @Bindable
    public String getSe4305() {
        return se4305;
    }

    @Bindable
    public String getSe4306() {
        return se4306;
    }

    @Bindable
    public String getSe4307() {
        return se4307;
    }

    @Bindable
    public String getSe4308() {
        return se4308;
    }

    @Bindable
    public String getSe4309() {
        return se4309;
    }

    @Bindable
    public String getSe4310() {
        return se4310;
    }

    @Bindable
    public String getSe4311() {
        return se4311;
    }

    @Bindable
    public String getSe4396() {
        return se4396;
    }

    @Bindable
    public String getSe4396x() {
        return se4396x;
    }

    @Bindable
    public String getSe44() {
        return se44;
    }

    @Bindable
    public String getSe4401() {
        return se4401;
    }

    @Bindable
    public String getSe4402() {
        return se4402;
    }

    @Bindable
    public String getSe4403() {
        return se4403;
    }

    @Bindable
    public String getSe4404() {
        return se4404;
    }

    @Bindable
    public String getSe4496() {
        return se4496;
    }

    @Bindable
    public String getSe4496x() {
        return se4496x;
    }

    @Bindable
    public String getSe45() {
        return se45;
    }

    @Bindable
    public String getSe46() {
        return se46;
    }

    @Bindable
    public String getSe4601() {
        return se4601;
    }

    @Bindable
    public String getSe4602() {
        return se4602;
    }

    @Bindable
    public String getSe4603() {
        return se4603;
    }

    @Bindable
    public String getSe4604() {
        return se4604;
    }

    @Bindable
    public String getSe4605() {
        return se4605;
    }

    @Bindable
    public String getSe4606() {
        return se4606;
    }

    @Bindable
    public String getSe4696() {
        return se4696;
    }

    @Bindable
    public String getSe4696x() {
        return se4696x;
    }

    @Bindable
    public String getSe47() {
        return se47;
    }

    @Bindable
    public String getSe4796x() {
        return se4796x;
    }

    @Bindable
    public String getSe52() {
        return se52;
    }

    @Bindable
    public String getSe53() {
        return se53;
    }

    @Bindable
    public String getSe53_96x() {
        return se53_96x;
    }

    @Bindable
    public String getSe54() {
        return se54;
    }

    @Bindable
    public String getSe54_01() {
        return se54_01;
    }

    @Bindable
    public String getSe54_02() {
        return se54_02;
    }

    @Bindable
    public String getSe54_03() {
        return se54_03;
    }

    @Bindable
    public String getSe54_04() {
        return se54_04;
    }

    @Bindable
    public String getSe54_05() {
        return se54_05;
    }

    @Bindable
    public String getSe54_06() {
        return se54_06;
    }

    @Bindable
    public String getSe54_96() {
        return se54_96;
    }

    @Bindable
    public String getSe54_96x() {
        return se54_96x;
    }

    @Bindable
    public String getSe55() {
        return se55;
    }

    @Bindable
    public String getSe55_01x() {
        return se55_01x;
    }

    @Bindable
    public String getSe48() {
        return se48;
    }

    @Bindable
    public String getSe56() {
        return se56;
    }

    @Bindable
    public String getSe56_01() {
        return se56_01;
    }

    @Bindable
    public String getSe56_02() {
        return se56_02;
    }

    @Bindable
    public String getSe56_03() {
        return se56_03;
    }

    @Bindable
    public String getSe56_04() {
        return se56_04;
    }

    @Bindable
    public String getSe56_05() {
        return se56_05;
    }

    @Bindable
    public String getSe56_06() {
        return se56_06;
    }

    @Bindable
    public String getSe56_96() {
        return se56_96;
    }

    @Bindable
    public String getSe56_96x() {
        return se56_96x;
    }

    @Bindable
    public String getSe49() {
        return se49;
    }

    @Bindable
    public String getSe4901() {
        return se4901;
    }

    @Bindable
    public String getSe4902() {
        return se4902;
    }

    @Bindable
    public String getSe4903() {
        return se4903;
    }

    @Bindable
    public String getSe4904() {
        return se4904;
    }

    @Bindable
    public String getSe4998() {
        return se4998;
    }

    @Bindable
    public String getSe4996() {
        return se4996;
    }

    @Bindable
    public String getSe4996x() {
        return se4996x;
    }

    @Bindable
    public String getSe50() {
        return se50;
    }

    @Bindable
    public String getSe5096x() {
        return se5096x;
    }

    @Bindable
    public String getSe57() {
        return se57;
    }

    @Bindable
    public String getSe57_01x() {
        return se57_01x;
    }

    @Bindable
    public String getSe3401() {
        return se3401;
    }

    @Bindable
    public String getSe3402() {
        return se3402;
    }

    @Bindable
    public String getSe58() {
        return se58;
    }

    @Bindable
    public String getSe59() {
        return se59;
    }

    @Bindable
    public String getSe60() {
        return se60;
    }

    @Bindable
    public String getSe60_01() {
        return se60_01;
    }

    @Bindable
    public String getSe60_02() {
        return se60_02;
    }

    @Bindable
    public String getSe60_03() {
        return se60_03;
    }

    @Bindable
    public String getSe60_04() {
        return se60_04;
    }

    @Bindable
    public String getSe60_05() {
        return se60_05;
    }

    @Bindable
    public String getSe60_06() {
        return se60_06;
    }

    @Bindable
    public String getSe60_98() {
        return se60_98;
    }

    @Bindable
    public String getSe60_96() {
        return se60_96;
    }

    @Bindable
    public String getSe60_96x() {
        return se60_96x;
    }

    @Bindable
    public String getSe35() {
        return se35;
    }

    @Bindable
    public String getSe36() {
        return se36;
    }

    @Bindable
    public String getSe37() {
        return se37;
    }

    @Bindable
    public String getSe3701() {
        return se3701;
    }

    @Bindable
    public String getSe3702() {
        return se3702;
    }

    @Bindable
    public String getSe3703() {
        return se3703;
    }

    @Bindable
    public String getSe3704() {
        return se3704;
    }

    @Bindable
    public String getSe3705() {
        return se3705;
    }

    @Bindable
    public String getSe3706() {
        return se3706;
    }

    @Bindable
    public String getSe3707() {
        return se3707;
    }

    @Bindable
    public String getSe3708() {
        return se3708;
    }

    @Bindable
    public String getSe3709() {
        return se3709;
    }

    @Bindable
    public String getSe3710() {
        return se3710;
    }

    @Bindable
    public String getSe3796() {
        return se3796;
    }

    @Bindable
    public String getSe3796x() {
        return se3796x;
    }

    @Bindable
    public String getSe38() {
        return se38;
    }

    @Bindable
    public String getSe39() {
        return se39;
    }

    @Bindable
    public String getSe40() {
        return se40;
    }

    public void setHh01(String hh01) {
        this.hh01 = hh01;
        notifyPropertyChanged(BR.hh01);
    }

    public void setHh0201(String hh0201) {
        this.hh0201 = hh0201;
        notifyPropertyChanged(BR.hh0201);
    }

    public void setHh0202(String hh0202) {
        this.hh0202 = hh0202;
        notifyPropertyChanged(BR.hh0202);
    }

    public void setHh03(String hh03) {
        this.hh03 = hh03;
        notifyPropertyChanged(BR.hh03);
    }

    public void setHh04(String hh04) {
        this.hh04 = hh04;
        notifyPropertyChanged(BR.hh04);
    }

    public void setHh05(String hh05) {
        this.hh05 = hh05;
        notifyPropertyChanged(BR.hh05);
    }

    public void setHh06(String hh06) {
        this.hh06 = hh06;
        notifyPropertyChanged(BR.hh06);
    }

    public void setHh07(String hh07) {
        this.hh07 = hh07;
        notifyPropertyChanged(BR.hh07);
    }

    public void setHh08(String hh08) {
        this.hh08 = hh08;
        notifyPropertyChanged(BR.hh08);
    }

    public void setHh09(String hh09) {
        this.hh09 = hh09;
        notifyPropertyChanged(BR.hh09);
    }

    public void setHh10(String hh10) {
        this.hh10 = hh10;
        notifyPropertyChanged(BR.hh10);
    }

    public void setHh11(String hh11) {
        this.hh11 = hh11;
        notifyPropertyChanged(BR.hh11);
    }

    public void setHh13(String hh13) {
        this.hh13 = hh13;
        notifyPropertyChanged(BR.hh13);
    }

    public void setHh12(String hh12) {
        this.hh12 = hh12;
        notifyPropertyChanged(BR.hh12);
    }

    public void setHh14(String hh14) {
        this.hh14 = hh14;
        notifyPropertyChanged(BR.hh14);
    }

    public void setHh15(String hh15) {
        this.hh15 = hh15;
        notifyPropertyChanged(BR.hh15);
    }

    public void setHh16(String hh16) {
        this.hh16 = hh16;
        notifyPropertyChanged(BR.hh16);
    }

    public void setHh17(String hh17) {
        this.hh17 = hh17;
        setHh1796x(hh17.equals("96") ? this.hh1796x : "");
        notifyPropertyChanged(BR.hh17);
    }

    public void setHh1796x(String hh1796x) {
        this.hh1796x = hh1796x;
        notifyPropertyChanged(BR.hh1796x);
    }

    public void setHh18(String hh18) {
        this.hh18 = hh18;
        setHh19(hh18.equals("2") ? this.hh19 : "");
        setHh20(hh18.equals("2") ? this.hh20 : "");
        notifyPropertyChanged(BR.hh18);
    }

    public void setHh19(String hh19) {
        this.hh19 = hh19;
        notifyPropertyChanged(BR.hh19);
    }

    public void setHh20(String hh20) {
        this.hh20 = hh20;
        setHh2096x(hh20.equals("96") ? this.hh2096x : "");
        notifyPropertyChanged(BR.hh20);
    }

    public void setHh2096x(String hh2096x) {
        this.hh2096x = hh2096x;
        notifyPropertyChanged(BR.hh2096x);
    }

    public void setHh21(String hh21) {
        this.hh21 = hh21;
        notifyPropertyChanged(BR.hh21);
    }

    public void setHh22(String hh22) {
        this.hh22 = hh22;
        notifyPropertyChanged(BR.hh22);
    }

    public void setHh23(String hh23) {
        this.hh23 = hh23;
        notifyPropertyChanged(BR.hh23);
    }

    public void setHh24(String hh24) {
        this.hh24 = hh24;
        notifyPropertyChanged(BR.hh24);
    }

    public void setHh25(String hh25) {
        this.hh25 = hh25;
        notifyPropertyChanged(BR.hh25);
    }

    public void setHh26(String hh26) {
        this.hh26 = hh26;
        setHh2696x(hh26.equals("96") ? this.hh2696x : "");
        notifyPropertyChanged(BR.hh26);
    }

    public void setHh2696x(String hh2696x) {
        this.hh2696x = hh2696x;
        notifyPropertyChanged(BR.hh2696x);
    }

    public void setSe01(String se01) {
        this.se01 = se01;
        setSe0196x(se01.equals("96") ? this.se0196x : "");
        notifyPropertyChanged(BR.se01);
    }

    public void setSe0196x(String se0196x) {
        this.se0196x = se0196x;
        notifyPropertyChanged(BR.se0196x);
    }

    public void setSe02(String se02) {
        this.se02 = se02;
        setSe0296x(se02.equals("96") ? this.se0296x : "");
        notifyPropertyChanged(BR.se02);
    }

    public void setSe0296x(String se0296x) {
        this.se0296x = se0296x;
        notifyPropertyChanged(BR.se0296x);
    }

    public void setSe03(String se03) {
        this.se03 = se03;
        setSe0396x(se03.equals("96") ? this.se0396x : "");
        notifyPropertyChanged(BR.se03);
    }

    public void setSe0396x(String se0396x) {
        this.se0396x = se0396x;
        notifyPropertyChanged(BR.se0396x);
    }

    public void setSe04(String se04) {
        this.se04 = se04;
        setSe0496x(se04.equals("96") ? this.se0496x : "");
        notifyPropertyChanged(BR.se04);
    }

    public void setSe0496x(String se0496x) {
        this.se0496x = se0496x;
        notifyPropertyChanged(BR.se0496x);
    }

    public void setSe05(String se05) {
        this.se05 = se05;
        setSe0596x(se05.equals("96") ? this.se0596x : "");
        notifyPropertyChanged(BR.se05);
    }

    public void setSe0596x(String se0596x) {
        this.se0596x = se0596x;
        notifyPropertyChanged(BR.se0596x);
    }

    public void setSe06a(String se06a) {
        this.se06a = se06a;
        notifyPropertyChanged(BR.se06a);
    }

    public void setSe07a(String se07a) {
        this.se07a = se07a;
        notifyPropertyChanged(BR.se07a);
    }

    public void setSe08(String se08) {
        this.se08 = se08;
        setSe0896x(se08.equals("96") ? this.se0896x : "");
        notifyPropertyChanged(BR.se08);
    }

    public void setSe0896x(String se0896x) {
        this.se0896x = se0896x;
        notifyPropertyChanged(BR.se0896x);
    }

    public void setSe09(String se09) {
        this.se09 = se09;
        notifyPropertyChanged(BR.se09);
    }

    public void setSe10(String se10) {
        this.se10 = se10;
        setSe1099x(se10.equals("99") ? this.se1099x : "");
        notifyPropertyChanged(BR.se10);
    }

    public void setSe1099x(String se1099x) {
        this.se1099x = se1099x;
        notifyPropertyChanged(BR.se1099x);
    }

    public void setSe11(String se11) {
        this.se11 = se11;
        setSe1196x(se11.equals("96") ? this.se1196x : "");
        notifyPropertyChanged(BR.se11);
    }

    public void setSe1196x(String se1196x) {
        this.se1196x = se1196x;
        notifyPropertyChanged(BR.se1196x);
    }

    public void setSe12(String se12) {
        this.se12 = se12;
        setSe1296x(se01.equals("96") ? this.se1296x : "");
        notifyPropertyChanged(BR.se12);
    }

    public void setSe1296x(String se1296x) {
        this.se1296x = se1296x;
        notifyPropertyChanged(BR.se1296x);
    }

    public void setSe13(String se13) {
        this.se13 = se13;
        notifyPropertyChanged(BR.se13);
    }

    public void setSe14(String se14) {
        this.se14 = se14;
        notifyPropertyChanged(BR.se14);
    }

    public void setSe15(String se15) {
        this.se15 = se15;
        notifyPropertyChanged(BR.se15);
    }

    public void setSe16(String se16) {
        this.se16 = se16;
        notifyPropertyChanged(BR.se16);
    }

    public void setSe17(String se17) {
        this.se17 = se17;
        notifyPropertyChanged(BR.se17);
    }

    public void setSe1701(String se1701) {
        if (this.se1701.equals(se1701)) return; // for all checkboxes
        this.se1701 = se1701;
        notifyPropertyChanged(BR.se1701);
    }

    public void setSe1702(String se1702) {
        if (this.se1702.equals(se1702)) return; // for all checkboxes
        this.se1702 = se1702;
        notifyPropertyChanged(BR.se1702);
    }

    public void setSe1703(String se1703) {
        if (this.se1703.equals(se1703)) return; // for all checkboxes
        this.se1703 = se1703;
        notifyPropertyChanged(BR.se1703);
    }

    public void setSe1704(String se1704) {
        if (this.se1704.equals(se1704)) return; // for all checkboxes
        this.se1704 = se1704;
        notifyPropertyChanged(BR.se1704);
    }

    public void setSe1705(String se1705) {
        if (this.se1705.equals(se1705)) return; // for all checkboxes
        this.se1705 = se1705;
        notifyPropertyChanged(BR.se1705);
    }

    public void setSe1801(String se1801) {
        this.se1801 = se1801;
        notifyPropertyChanged(BR.se1801);
    }

    public void setSe1802(String se1802) {
        this.se1802 = se1802;
        notifyPropertyChanged(BR.se1802);
    }

    public void setSe1803(String se1803) {
        this.se1803 = se1803;
        notifyPropertyChanged(BR.se1803);
    }

    public void setSe1804(String se1804) {
        this.se1804 = se1804;
        notifyPropertyChanged(BR.se1804);
    }

    public void setSe1805(String se1805) {
        this.se1805 = se1805;
        notifyPropertyChanged(BR.se1805);
    }

    public void setSe1896(String se1896) {
        this.se1896 = se1896;
        setSe189601x(se1896.equals("1") ? this.se189601x : "");
        notifyPropertyChanged(BR.se1896);
    }

    public void setSe189601x(String se189601x) {
        this.se189601x = se189601x;
        notifyPropertyChanged(BR.se189601x);
    }

    public void setSe19(String se19) {
        this.se19 = se19;
        setSe1996x(se19.equals("96") ? this.se1996x : "");
        notifyPropertyChanged(BR.se19);
    }

    public void setSe1996x(String se1996x) {
        this.se1996x = se1996x;
        notifyPropertyChanged(BR.se1996x);
    }

    public void setSe20(String se20) {
        this.se20 = se20;
        notifyPropertyChanged(BR.se20);
    }

    public void setSe2001(String se2001) {
        if (this.se2001.equals(se2001)) return; // for all checkboxes
        this.se2001 = se2001;
        notifyPropertyChanged(BR.se2001);
    }

    public void setSe2002(String se2002) {
        if (this.se2002.equals(se2002)) return; // for all checkboxes
        this.se2002 = se2002;
        notifyPropertyChanged(BR.se2002);
    }

    public void setSe2003(String se2003) {
        if (this.se2003.equals(se2003)) return; // for all checkboxes
        this.se2003 = se2003;
        notifyPropertyChanged(BR.se2003);
    }

    public void setSe2004(String se2004) {
        if (this.se2004.equals(se2004)) return; // for all checkboxes
        this.se2004 = se2004;
        notifyPropertyChanged(BR.se2004);
    }

    public void setSe2005(String se2005) {
        if (this.se2005.equals(se2005)) return; // for all checkboxes
        this.se2005 = se2005;
        notifyPropertyChanged(BR.se2005);
    }

    public void setSe2006(String se2006) {
        if (this.se2006.equals(se2006)) return; // for all checkboxes
        this.se2006 = se2006;
        notifyPropertyChanged(BR.se2006);
    }

    public void setSe2096(String se2096) {
        if (this.se2096.equals(se2096)) return; // for all checkboxes
        this.se2096 = se2096;
        setSe2096x(se2096.equals("96") ? this.se2096x : "");
        notifyPropertyChanged(BR.se2096);
    }

    public void setSe2096x(String se2096x) {
        this.se2096x = se2096x;
        notifyPropertyChanged(BR.se2096x);
    }

    public void setSe21(String se21) {
        this.se21 = se21;
        notifyPropertyChanged(BR.se21);
    }

    public void setSe2101(String se2101) {
        if (this.se2101.equals(se2101)) return; // for all checkboxes
        this.se2101 = se2101;
        notifyPropertyChanged(BR.se2101);
    }

    public void setSe2102(String se2102) {
        if (this.se2102.equals(se2102)) return; // for all checkboxes
        this.se2102 = se2102;
        notifyPropertyChanged(BR.se2102);
    }

    public void setSe2103(String se2103) {
        if (this.se2103.equals(se2103)) return; // for all checkboxes
        this.se2103 = se2103;
        notifyPropertyChanged(BR.se2103);
    }

    public void setSe2104(String se2104) {
        if (this.se2104.equals(se2104)) return; // for all checkboxes
        this.se2104 = se2104;
        notifyPropertyChanged(BR.se2104);
    }

    public void setSe2105(String se2105) {
        if (this.se2105.equals(se2105)) return; // for all checkboxes
        this.se2105 = se2105;
        notifyPropertyChanged(BR.se2105);
    }

    public void setSe2196(String se2196) {
        if (this.se2196.equals(se2196)) return; // for all checkboxes
        this.se2196 = se2196;
        setSe2196x(se2196.equals("96") ? this.se2196x : "");
        notifyPropertyChanged(BR.se2196);
    }

    public void setSe2196x(String se2196x) {
        this.se2196x = se2196x;
        notifyPropertyChanged(BR.se2196x);
    }

    public void setSe2201(String se2201) {
        this.se2201 = se2201;
        notifyPropertyChanged(BR.se2201);
    }

    public void setSe2202(String se2202) {
        this.se2202 = se2202;
        notifyPropertyChanged(BR.se2202);
    }

    public void setSe2203(String se2203) {
        this.se2203 = se2203;
        notifyPropertyChanged(BR.se2203);
    }

    public void setSe2204(String se2204) {
        this.se2204 = se2204;
        notifyPropertyChanged(BR.se2204);
    }

    public void setSe2205(String se2205) {
        this.se2205 = se2205;
        notifyPropertyChanged(BR.se2205);
    }

    public void setSe2206(String se2206) {
        this.se2206 = se2206;
        notifyPropertyChanged(BR.se2206);
    }

    public void setSe2207(String se2207) {
        this.se2207 = se2207;
        notifyPropertyChanged(BR.se2207);
    }

    public void setSe2208(String se2208) {
        this.se2208 = se2208;
        notifyPropertyChanged(BR.se2208);
    }

    public void setSe2209(String se2209) {
        this.se2209 = se2209;
        notifyPropertyChanged(BR.se2209);
    }

    public void setSe2210(String se2210) {
        this.se2210 = se2210;
        notifyPropertyChanged(BR.se2210);
    }

    public void setSe2211(String se2211) {
        this.se2211 = se2211;
        notifyPropertyChanged(BR.se2211);
    }

    public void setSe2212(String se2212) {
        this.se2212 = se2212;
        notifyPropertyChanged(BR.se2212);
    }

    public void setSe2213(String se2213) {
        this.se2213 = se2213;
        notifyPropertyChanged(BR.se2213);
    }

    public void setSe2214(String se2214) {
        this.se2214 = se2214;
        notifyPropertyChanged(BR.se2214);
    }

    public void setSe2215(String se2215) {
        this.se2215 = se2215;
        notifyPropertyChanged(BR.se2215);
    }

    public void setSe2216(String se2216) {
        this.se2216 = se2216;
        notifyPropertyChanged(BR.se2216);
    }

    public void setSe2217(String se2217) {
        this.se2217 = se2217;
        notifyPropertyChanged(BR.se2217);
    }

    public void setSe2218(String se2218) {
        this.se2218 = se2218;
        notifyPropertyChanged(BR.se2218);
    }

    public void setSe31(String se31) {
        this.se31 = se31;
        setSe3196x(se31.equals("96") ? this.se3196x : "");
        notifyPropertyChanged(BR.se31);
    }

    public void setSe3196x(String se3196x) {
        this.se3196x = se3196x;
        notifyPropertyChanged(BR.se3196x);
    }

    public void setSe32(String se32) {
        this.se32 = se32;
        notifyPropertyChanged(BR.se32);
    }

    public void setSe3301(String se3301) {
        this.se3301 = se3301;
        notifyPropertyChanged(BR.se3301);
    }

    public void setSe3302(String se3302) {
        this.se3302 = se3302;
        notifyPropertyChanged(BR.se3302);
    }

    public void setSe51(String se51) {
        this.se51 = se51;
        notifyPropertyChanged(BR.se51);
    }

    public void setSe41(String se41) {
        this.se41 = se41;
        notifyPropertyChanged(BR.se41);
    }

    public void setSe42(String se42) {
        this.se42 = se42;
        setSe4296x(se42.equals("96") ? this.se4296x : "");
        notifyPropertyChanged(BR.se42);
    }

    public void setSe4296x(String se4296x) {
        this.se4296x = se4296x;
        notifyPropertyChanged(BR.se4296x);
    }

    public void setSe43(String se43) {
        this.se43 = se43;
        notifyPropertyChanged(BR.se43);
    }

    public void setSe4301(String se4301) {
        if (this.se4301.equals(se4301)) return; // for all checkboxes
        this.se4301 = se4301;
        notifyPropertyChanged(BR.se4301);
    }

    public void setSe4302(String se4302) {
        if (this.se4302.equals(se4302)) return; // for all checkboxes
        this.se4302 = se4302;
        notifyPropertyChanged(BR.se4302);
    }

    public void setSe4303(String se4303) {
        if (this.se4303.equals(se4303)) return; // for all checkboxes
        this.se4303 = se4303;
        notifyPropertyChanged(BR.se4303);
    }

    public void setSe4304(String se4304) {
        if (this.se4304.equals(se4304)) return; // for all checkboxes
        this.se4304 = se4304;
        notifyPropertyChanged(BR.se4304);
    }

    public void setSe4305(String se4305) {
        if (this.se4305.equals(se4305)) return; // for all checkboxes
        this.se4305 = se4305;
        notifyPropertyChanged(BR.se4305);
    }

    public void setSe4306(String se4306) {
        if (this.se4306.equals(se4306)) return; // for all checkboxes
        this.se4306 = se4306;
        notifyPropertyChanged(BR.se4306);
    }

    public void setSe4307(String se4307) {
        if (this.se4307.equals(se4307)) return; // for all checkboxes
        this.se4307 = se4307;
        notifyPropertyChanged(BR.se4307);
    }

    public void setSe4308(String se4308) {
        if (this.se4308.equals(se4308)) return; // for all checkboxes
        this.se4308 = se4308;
        notifyPropertyChanged(BR.se4308);
    }

    public void setSe4309(String se4309) {
        if (this.se4309.equals(se4309)) return; // for all checkboxes
        this.se4309 = se4309;
        notifyPropertyChanged(BR.se4309);
    }

    public void setSe4310(String se4310) {
        if (this.se4310.equals(se4310)) return; // for all checkboxes
        this.se4310 = se4310;
        notifyPropertyChanged(BR.se4310);
    }

    public void setSe4311(String se4311) {
        if (this.se4311.equals(se4311)) return; // for all checkboxes
        this.se4311 = se4311;
        notifyPropertyChanged(BR.se4311);
    }

    public void setSe4396(String se4396) {
        if (this.se4396.equals(se4396)) return; // for all checkboxes
        this.se4396 = se4396;
        setSe4396x(se4396.equals("96") ? this.se4396x : "");
        notifyPropertyChanged(BR.se4396);
    }

    public void setSe4396x(String se4396x) {
        this.se4396x = se4396x;
        notifyPropertyChanged(BR.se4396x);
    }

    public void setSe44(String se44) {
        this.se44 = se44;
        notifyPropertyChanged(BR.se44);
    }

    public void setSe4401(String se4401) {
        if (this.se4401.equals(se4401)) return; // for all checkboxes
        this.se4401 = se4401;
        notifyPropertyChanged(BR.se4401);
    }

    public void setSe4402(String se4402) {
        if (this.se4402.equals(se4402)) return; // for all checkboxes
        this.se4402 = se4402;
        notifyPropertyChanged(BR.se4402);
    }

    public void setSe4403(String se4403) {
        if (this.se4403.equals(se4403)) return; // for all checkboxes
        this.se4403 = se4403;
        notifyPropertyChanged(BR.se4403);
    }

    public void setSe4404(String se4404) {
        if (this.se4404.equals(se4404)) return; // for all checkboxes
        this.se4404 = se4404;
        notifyPropertyChanged(BR.se4404);
    }

    public void setSe4496(String se4496) {
        if (this.se4496.equals(se4496)) return; // for all checkboxes
        this.se4496 = se4496;
        setSe4496x(se4496.equals("96") ? this.se4496x : "");
        notifyPropertyChanged(BR.se4496);
    }

    public void setSe4496x(String se4496x) {
        this.se4496x = se4496x;
        notifyPropertyChanged(BR.se4496x);
    }

    public void setSe45(String se45) {
        this.se45 = se45;
        notifyPropertyChanged(BR.se45);
    }

    public void setSe46(String se46) {
        this.se46 = se46;
        notifyPropertyChanged(BR.se46);
    }

    public void setSe4601(String se4601) {
        if (this.se4601.equals(se4601)) return; // for all checkboxes
        this.se4601 = se4601;
        notifyPropertyChanged(BR.se4601);
    }

    public void setSe4602(String se4602) {
        if (this.se4602.equals(se4602)) return; // for all checkboxes
        this.se4602 = se4602;
        notifyPropertyChanged(BR.se4602);
    }

    public void setSe4603(String se4603) {
        if (this.se4603.equals(se4603)) return; // for all checkboxes
        this.se4603 = se4603;
        notifyPropertyChanged(BR.se4603);
    }

    public void setSe4604(String se4604) {
        if (this.se4604.equals(se4604)) return; // for all checkboxes
        this.se4604 = se4604;
        notifyPropertyChanged(BR.se4604);
    }

    public void setSe4605(String se4605) {
        if (this.se4605.equals(se4605)) return; // for all checkboxes
        this.se4605 = se4605;
        notifyPropertyChanged(BR.se4605);
    }

    public void setSe4606(String se4606) {
        if (this.se4606.equals(se4606)) return; // for all checkboxes
        this.se4606 = se4606;
        notifyPropertyChanged(BR.se4606);
    }

    public void setSe4696(String se4696) {
        if (this.se4696.equals(se4696)) return; // for all checkboxes
        this.se4696 = se4696;
        setSe4696x(se4696.equals("96") ? this.se4696x : "");
        notifyPropertyChanged(BR.se4696);
    }

    public void setSe4696x(String se4696x) {
        this.se4696x = se4696x;
        notifyPropertyChanged(BR.se4696x);
    }

    public void setSe47(String se47) {
        this.se47 = se47;
        setSe4796x(se47.equals("96") ? this.se4796x : "");
        notifyPropertyChanged(BR.se47);
    }

    public void setSe4796x(String se4796x) {
        this.se4796x = se4796x;
        notifyPropertyChanged(BR.se4796x);
    }

    public void setSe52(String se52) {
        this.se52 = se52;
        notifyPropertyChanged(BR.se52);
    }

    public void setSe53(String se53) {
        this.se53 = se53;
        setSe53_96x(se53.equals("96") ? this.se53_96x : "");
        notifyPropertyChanged(BR.se53);
    }

    public void setSe53_96x(String se53_96x) {
        this.se53_96x = se53_96x;
        notifyPropertyChanged(BR.se53_96x);
    }

    public void setSe54(String se54) {
        this.se54 = se54;
        notifyPropertyChanged(BR.se54);
    }

    public void setSe54_01(String se54_01) {
        if (this.se54_01.equals(se54_01)) return; // for all checkboxes
        this.se54_01 = se54_01;
        notifyPropertyChanged(BR.se54_01);
    }

    public void setSe54_02(String se54_02) {
        if (this.se54_02.equals(se54_02)) return; // for all checkboxes
        this.se54_02 = se54_02;
        notifyPropertyChanged(BR.se54_02);
    }

    public void setSe54_03(String se54_03) {
        if (this.se54_03.equals(se54_03)) return; // for all checkboxes
        this.se54_03 = se54_03;
        notifyPropertyChanged(BR.se54_03);
    }

    public void setSe54_04(String se54_04) {
        if (this.se54_04.equals(se54_04)) return; // for all checkboxes
        this.se54_04 = se54_04;
        notifyPropertyChanged(BR.se54_04);
    }

    public void setSe54_05(String se54_05) {
        if (this.se54_05.equals(se54_05)) return; // for all checkboxes
        this.se54_05 = se54_05;
        notifyPropertyChanged(BR.se54_05);
    }

    public void setSe54_06(String se54_06) {
        if (this.se54_06.equals(se54_06)) return; // for all checkboxes
        this.se54_06 = se54_06;
        notifyPropertyChanged(BR.se54_06);
    }

    public void setSe54_96(String se54_96) {
        if (this.se54_96.equals(se54_96)) return; // for all checkboxes
        this.se54_96 = se54_96;
        setSe54_96x(se54_96.equals("96") ? this.se54_96x : "");
        notifyPropertyChanged(BR.se54_96);
    }

    public void setSe54_96x(String se54_96x) {
        this.se54_96x = se54_96x;
        notifyPropertyChanged(BR.se54_96x);
    }

    public void setSe55(String se55) {
        this.se55 = se55;
        notifyPropertyChanged(BR.se55);
    }

    public void setSe55_01x(String se55_01x) {
        this.se55_01x = se55_01x;
        notifyPropertyChanged(BR.se55_01x);
    }

    public void setSe48(String se48) {
        this.se48 = se48;
        notifyPropertyChanged(BR.se48);
    }

    public void setSe56(String se56) {
        this.se56 = se56;
        notifyPropertyChanged(BR.se56);
    }

    public void setSe56_01(String se56_01) {
        if (this.se56_01.equals(se56_01)) return; // for all checkboxes
        this.se56_01 = se56_01;
        notifyPropertyChanged(BR.se56_01);
    }

    public void setSe56_02(String se56_02) {
        if (this.se56_02.equals(se56_02)) return; // for all checkboxes
        this.se56_02 = se56_02;
        notifyPropertyChanged(BR.se56_02);
    }

    public void setSe56_03(String se56_03) {
        if (this.se56_03.equals(se56_03)) return; // for all checkboxes
        this.se56_03 = se56_03;
        notifyPropertyChanged(BR.se56_03);
    }

    public void setSe56_04(String se56_04) {
        if (this.se56_04.equals(se56_04)) return; // for all checkboxes
        this.se56_04 = se56_04;
        notifyPropertyChanged(BR.se56_04);
    }

    public void setSe56_05(String se56_05) {
        if (this.se56_05.equals(se56_05)) return; // for all checkboxes
        this.se56_05 = se56_05;
        notifyPropertyChanged(BR.se56_05);
    }

    public void setSe56_06(String se56_06) {
        if (this.se56_06.equals(se56_06)) return; // for all checkboxes
        this.se56_06 = se56_06;

        notifyPropertyChanged(BR.se56_06);
    }

    public void setSe56_96(String se56_96) {
        if (this.se56_96.equals(se56_96)) return; // for all checkboxes
        this.se56_96 = se56_96;
        setSe56_96x(se56_96.equals("96") ? this.se56_96x : "");
        notifyPropertyChanged(BR.se56_96);
    }

    public void setSe56_96x(String se56_96x) {
        this.se56_96x = se56_96x;
        notifyPropertyChanged(BR.se56_96x);
    }

    public void setSe49(String se49) {
        this.se49 = se49;
        notifyPropertyChanged(BR.se49);
    }

    public void setSe4901(String se4901) {
        if (this.se4901.equals(se4901)) return; // for all checkboxes
        this.se4901 = se4901;
        notifyPropertyChanged(BR.se4901);
    }

    public void setSe4902(String se4902) {
        if (this.se4902.equals(se4902)) return; // for all checkboxes
        this.se4902 = se4902;
        notifyPropertyChanged(BR.se4902);
    }

    public void setSe4903(String se4903) {
        if (this.se4903.equals(se4903)) return; // for all checkboxes
        this.se4903 = se4903;
        notifyPropertyChanged(BR.se4903);
    }

    public void setSe4904(String se4904) {
        if (this.se4904.equals(se4904)) return; // for all checkboxes
        this.se4904 = se4904;
        notifyPropertyChanged(BR.se4904);
    }

    public void setSe4998(String se4998) {
        if (this.se4998.equals(se4998)) return; // for all checkboxes
        this.se4998 = se4998;
        setSe4901(se4998.equals("98") ? "" : this.se4901);
        setSe4902(se4998.equals("98") ? "" : this.se4902);
        setSe4903(se4998.equals("98") ? "" : this.se4903);
        setSe4904(se4998.equals("98") ? "" : this.se4904);
        setSe4996(se4998.equals("98") ? "" : this.se4996);
        notifyPropertyChanged(BR.se4998);
    }

    public void setSe4996(String se4996) {
        if (this.se4996.equals(se4996)) return; // for all checkboxes
        this.se4996 = se4996;
        setSe4996x(se4696.equals("96") ? this.se4996x : "");

        notifyPropertyChanged(BR.se4996);
    }

    public void setSe4996x(String se4996x) {
        this.se4996x = se4996x;
        notifyPropertyChanged(BR.se4996x);
    }

    public void setSe50(String se50) {
        this.se50 = se50;
        setSe5096x(se50.equals("96") ? this.se5096x : "");
        notifyPropertyChanged(BR.se50);
    }

    public void setSe5096x(String se5096x) {
        this.se5096x = se5096x;
        notifyPropertyChanged(BR.se5096x);
    }

    public void setSe57(String se57) {
        this.se57 = se57;
        notifyPropertyChanged(BR.se57);
    }

    public void setSe57_01x(String se57_01x) {
        this.se57_01x = se57_01x;
        notifyPropertyChanged(BR.se57_01x);
    }

    public void setSe3401(String se3401) {
        this.se3401 = se3401;
        notifyPropertyChanged(BR.se3401);
    }

    public void setSe3402(String se3402) {
        this.se3402 = se3402;
        notifyPropertyChanged(BR.se3402);
    }

    public void setSe58(String se58) {
        this.se58 = se58;
        notifyPropertyChanged(BR.se58);
    }

    public void setSe59(String se59) {
        this.se59 = se59;
        notifyPropertyChanged(BR.se59);
    }

    public void setSe60(String se60) {
        this.se60 = se60;
        notifyPropertyChanged(BR.se60);
    }

    public void setSe60_01(String se60_01) {
        if (this.se60_01.equals(se60_01)) return; // for all checkboxes
        this.se60_01 = se60_01;
        notifyPropertyChanged(BR.se60_01);
    }

    public void setSe60_02(String se60_02) {
        if (this.se60_02.equals(se60_02)) return; // for all checkboxes
        this.se60_02 = se60_02;
        notifyPropertyChanged(BR.se60_02);
    }

    public void setSe60_03(String se60_03) {
        if (this.se60_03.equals(se60_03)) return; // for all checkboxes
        this.se60_03 = se60_03;
        notifyPropertyChanged(BR.se60_03);
    }

    public void setSe60_04(String se60_04) {
        if (this.se60_04.equals(se60_04)) return; // for all checkboxes
        this.se60_04 = se60_04;
        notifyPropertyChanged(BR.se60_04);
    }

    public void setSe60_05(String se60_05) {
        if (this.se60_05.equals(se60_05)) return; // for all checkboxes
        this.se60_05 = se60_05;
        notifyPropertyChanged(BR.se60_05);
    }

    public void setSe60_06(String se60_06) {
        if (this.se60_06.equals(se60_06)) return; // for all checkboxes
        this.se60_06 = se60_06;
        notifyPropertyChanged(BR.se60_06);
    }

    public void setSe60_98(String se60_98) {
        if (this.se60_98.equals(se60_98)) return; // for all checkboxes
        this.se60_98 = se60_98;
        setSe60_01(se60_98.equals("98") ? "" : this.se60_01);
        setSe60_02(se60_98.equals("98") ? "" : this.se60_02);
        setSe60_03(se60_98.equals("98") ? "" : this.se60_03);
        setSe60_04(se60_98.equals("98") ? "" : this.se60_04);
        setSe60_05(se60_98.equals("98") ? "" : this.se60_05);
        setSe60_06(se60_98.equals("98") ? "" : this.se60_06);
        setSe60_96(se60_98.equals("98") ? "" : this.se60_96);
        notifyPropertyChanged(BR.se60_98);
    }

    public void setSe60_96(String se60_96) {
        if (this.se60_96.equals(se60_96)) return; // for all checkboxes
        this.se60_96 = se60_96;
        setSe60_96x(se60_96.equals("96") ? this.se60_96x : "");
        notifyPropertyChanged(BR.se60_96);
    }

    public void setSe60_96x(String se60_96x) {
        this.se60_96x = se60_96x;
        notifyPropertyChanged(BR.se60_96x);
    }

    public void setSe35(String se35) {
        this.se35 = se35;
        notifyPropertyChanged(BR.se35);
    }

    public void setSe36(String se36) {
        this.se36 = se36;
        notifyPropertyChanged(BR.se36);
    }

    public void setSe37(String se37) {
        this.se37 = se37;
        notifyPropertyChanged(BR.se37);
    }

    public void setSe3701(String se3701) {
        if (this.se3701.equals(se3701)) return; // for all checkboxes
        this.se3701 = se3701;
        notifyPropertyChanged(BR.se3701);
    }

    public void setSe3702(String se3702) {
        if (this.se3702.equals(se3702)) return; // for all checkboxes
        this.se3702 = se3702;
        notifyPropertyChanged(BR.se3702);
    }

    public void setSe3703(String se3703) {
        if (this.se3703.equals(se3703)) return; // for all checkboxes
        this.se3703 = se3703;
        notifyPropertyChanged(BR.se3703);
    }

    public void setSe3704(String se3704) {
        if (this.se3704.equals(se3704)) return; // for all checkboxes
        this.se3704 = se3704;
        notifyPropertyChanged(BR.se3704);
    }

    public void setSe3705(String se3705) {
        if (this.se3705.equals(se3705)) return; // for all checkboxes
        this.se3705 = se3705;
        notifyPropertyChanged(BR.se3705);
    }

    public void setSe3706(String se3706) {
        if (this.se3706.equals(se3706)) return; // for all checkboxes
        this.se3706 = se3706;
        notifyPropertyChanged(BR.se3706);
    }

    public void setSe3707(String se3707) {
        if (this.se3707.equals(se3707)) return; // for all checkboxes
        this.se3707 = se3707;
        notifyPropertyChanged(BR.se3707);
    }

    public void setSe3708(String se3708) {
        if (this.se3708.equals(se3708)) return; // for all checkboxes
        this.se3708 = se3708;
        notifyPropertyChanged(BR.se3708);
    }

    public void setSe3709(String se3709) {
        if (this.se3709.equals(se3709)) return; // for all checkboxes
        this.se3709 = se3709;
        notifyPropertyChanged(BR.se3709);
    }

    public void setSe3710(String se3710) {
        if (this.se3710.equals(se3710)) return; // for all checkboxes
        this.se3710 = se3710;
        notifyPropertyChanged(BR.se3710);
    }

    public void setSe3796(String se3796) {
        if (this.se3796.equals(se3796)) return; // for all checkboxes
        this.se3796 = se3796;
        setSe3796x(se3796.equals("96") ? this.se3796x : "");
        notifyPropertyChanged(BR.se3796);
    }

    public void setSe3796x(String se3796x) {
        this.se3796x = se3796x;
        notifyPropertyChanged(BR.se3796x);
    }

    public void setSe38(String se38) {
        this.se38 = se38;
        notifyPropertyChanged(BR.se38);
    }

    public void setSe39(String se39) {
        this.se39 = se39;
        notifyPropertyChanged(BR.se39);
    }

    public void setSe40(String se40) {
        this.se40 = se40;
        notifyPropertyChanged(BR.se40);
    }

    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_EB_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        //   this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNC_DATE));


        sHHHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SHH)));
        sSEHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SSE)));

        return this;
    }

    public void sHHHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.hh01 = json.getString("hh01");
            this.hh0201 = json.getString("hh0201");
            this.hh0202 = json.getString("hh0202");
            this.hh03 = json.getString("hh03");
            this.hh04 = json.getString("hh04");
            this.hh05 = json.getString("hh05");
            this.hh06 = json.getString("hh06");
            this.hh07 = json.getString("hh07");
            this.hh08 = json.getString("hh08");
            this.hh09 = json.getString("hh09");
            this.hh10 = json.getString("hh10");
            this.hh11 = json.getString("hh11");
            this.hh13 = json.getString("hh13");
            this.hh12 = json.getString("hh12");
            this.hh14 = json.getString("hh14");
            this.hh15 = json.getString("hh15");
            this.hh16 = json.getString("hh16");
            this.hh17 = json.getString("hh17");
            this.hh1796x = json.getString("hh1796x");
            this.hh18 = json.getString("hh18");
            this.hh19 = json.getString("hh19");
            this.hh20 = json.getString("hh20");
            this.hh2096x = json.getString("hh2096x");
            this.hh21 = json.getString("hh21");
            this.hh22 = json.getString("hh22");
            this.hh23 = json.getString("hh23");
            this.hh24 = json.getString("hh24");
            this.hh25 = json.getString("hh25");
            this.hh26 = json.getString("hh26");
            this.hh2696x = json.getString("hh2696x");


        }
    }

    public void sSEHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.se01 = json.getString("se01");
            this.se0196x = json.getString("se0196x");
            this.se02 = json.getString("se02");
            this.se0296x = json.getString("se0296x");
            this.se03 = json.getString("se03");
            this.se0396x = json.getString("se0396x");
            this.se04 = json.getString("se04");
            this.se0496x = json.getString("se0496x");
            this.se05 = json.getString("se05");
            this.se0596x = json.getString("se0596x");
            this.se06a = json.getString("se06a");
            this.se07a = json.getString("se07a");
            this.se08 = json.getString("se08");
            this.se0896x = json.getString("se0896x");
            this.se09 = json.getString("se09");
            this.se10 = json.getString("se10");
            this.se1099x = json.getString("se1099x");
            this.se11 = json.getString("se11");
            this.se1196x = json.getString("se1196x");
            this.se12 = json.getString("se12");
            this.se1296x = json.getString("se1296x");
            this.se13 = json.getString("se13");
            this.se14 = json.getString("se14");
            this.se15 = json.getString("se15");
            this.se16 = json.getString("se16");
            this.se1701 = json.getString("se1701");
            this.se1702 = json.getString("se1702");
            this.se1703 = json.getString("se1703");
            this.se1704 = json.getString("se1704");
            this.se1705 = json.getString("se1705");
            this.se1801 = json.getString("se1801");
            this.se1802 = json.getString("se1802");
            this.se1803 = json.getString("se1803");
            this.se1804 = json.getString("se1804");
            this.se1805 = json.getString("se1805");
            this.se1896 = json.getString("se1896");
            this.se189601x = json.getString("se189601x");
            this.se19 = json.getString("se19");
            this.se1996x = json.getString("se1996x");
            this.se2001 = json.getString("se2001");
            this.se2002 = json.getString("se2002");
            this.se2003 = json.getString("se2003");
            this.se2004 = json.getString("se2004");
            this.se2005 = json.getString("se2005");
            this.se2006 = json.getString("se2006");
            this.se2096 = json.getString("se2096");
            this.se2096x = json.getString("se2096x");
            this.se2101 = json.getString("se2101");
            this.se2102 = json.getString("se2102");
            this.se2103 = json.getString("se2103");
            this.se2104 = json.getString("se2104");
            this.se2105 = json.getString("se2105");
            this.se2196 = json.getString("se2196");
            this.se2196x = json.getString("se2196x");
            this.se2201 = json.getString("se2201");
            this.se2202 = json.getString("se2202");
            this.se2203 = json.getString("se2203");
            this.se2204 = json.getString("se2204");
            this.se2205 = json.getString("se2205");
            this.se2206 = json.getString("se2206");
            this.se2207 = json.getString("se2207");
            this.se2208 = json.getString("se2208");
            this.se2209 = json.getString("se2209");
            this.se2210 = json.getString("se2210");
            this.se2211 = json.getString("se2211");
            this.se2212 = json.getString("se2212");
            this.se2213 = json.getString("se2213");
            this.se2214 = json.getString("se2214");
            this.se2215 = json.getString("se2215");
            this.se2216 = json.getString("se2216");
            this.se2217 = json.getString("se2217");
            this.se2218 = json.getString("se2218");
            this.se31 = json.getString("se31");
            this.se3196x = json.getString("se3196x");
            this.se32 = json.getString("se32");
            this.se3301 = json.getString("se3301");
            this.se3302 = json.getString("se3302");
            this.se51 = json.getString("se51");
            this.se41 = json.getString("se41");
            this.se42 = json.getString("se42");
            this.se4296x = json.getString("se4296x");
            this.se4301 = json.getString("se4301");
            this.se4302 = json.getString("se4302");
            this.se4303 = json.getString("se4303");
            this.se4304 = json.getString("se4304");
            this.se4305 = json.getString("se4305");
            this.se4306 = json.getString("se4306");
            this.se4307 = json.getString("se4307");
            this.se4308 = json.getString("se4308");
            this.se4309 = json.getString("se4309");
            this.se4310 = json.getString("se4310");
            this.se4311 = json.getString("se4311");
            this.se4396 = json.getString("se4396");
            this.se4396x = json.getString("se4396x");
            this.se4401 = json.getString("se4401");
            this.se4402 = json.getString("se4402");
            this.se4403 = json.getString("se4403");
            this.se4404 = json.getString("se4404");
            this.se4496 = json.getString("se4496");
            this.se4496x = json.getString("se4496x");
            this.se45 = json.getString("se45");
            this.se4601 = json.getString("se4601");
            this.se4602 = json.getString("se4602");
            this.se4603 = json.getString("se4603");
            this.se4604 = json.getString("se4604");
            this.se4605 = json.getString("se4605");
            this.se4606 = json.getString("se4606");
            this.se4696 = json.getString("se4696");
            this.se4696x = json.getString("se4696x");
            this.se47 = json.getString("se47");
            this.se4796x = json.getString("se4796x");
            this.se52 = json.getString("se52");
            this.se53 = json.getString("se53");
            this.se53_96x = json.getString("se53_96x");
            this.se54_01 = json.getString("se54_01");
            this.se54_02 = json.getString("se54_02");
            this.se54_03 = json.getString("se54_03");
            this.se54_04 = json.getString("se54_04");
            this.se54_05 = json.getString("se54_05");
            this.se54_06 = json.getString("se54_06");
            this.se54_96 = json.getString("se54_96");
            this.se54_96x = json.getString("se54_96x");
            this.se55 = json.getString("se55");
            this.se55_01x = json.getString("se55_01x");
            this.se48 = json.getString("se48");
            this.se56_01 = json.getString("se56_01");
            this.se56_02 = json.getString("se56_02");
            this.se56_03 = json.getString("se56_03");
            this.se56_04 = json.getString("se56_04");
            this.se56_05 = json.getString("se56_05");
            this.se56_06 = json.getString("se56_06");
            this.se56_96 = json.getString("se56_96");
            this.se56_96x = json.getString("se56_96x");
            this.se4901 = json.getString("se4901");
            this.se4902 = json.getString("se4902");
            this.se4903 = json.getString("se4903");
            this.se4904 = json.getString("se4904");
            this.se4998 = json.getString("se4998");
            this.se4996 = json.getString("se4996");
            this.se4996x = json.getString("se4996x");
            this.se50 = json.getString("se50");
            this.se5096x = json.getString("se5096x");
            this.se57 = json.getString("se57");
            this.se57_01x = json.getString("se57_01x");
            this.se3401 = json.getString("se3401");
            this.se3402 = json.getString("se3402");
            this.se58 = json.getString("se58");
            this.se59 = json.getString("se59");
            this.se60_01 = json.getString("se60_01");
            this.se60_02 = json.getString("se60_02");
            this.se60_03 = json.getString("se60_03");
            this.se60_04 = json.getString("se60_04");
            this.se60_05 = json.getString("se60_05");
            this.se60_06 = json.getString("se60_06");
            this.se60_98 = json.getString("se60_98");
            this.se60_96 = json.getString("se60_96");
            this.se60_96x = json.getString("se60_96x");
            this.se35 = json.getString("se35");
            this.se36 = json.getString("se36");
            this.se3701 = json.getString("se3701");
            this.se3702 = json.getString("se3702");
            this.se3703 = json.getString("se3703");
            this.se3704 = json.getString("se3704");
            this.se3705 = json.getString("se3705");
            this.se3706 = json.getString("se3706");
            this.se3707 = json.getString("se3707");
            this.se3708 = json.getString("se3708");
            this.se3709 = json.getString("se3709");
            this.se3710 = json.getString("se3710");
            this.se3796 = json.getString("se3796");
            this.se3796x = json.getString("se3796x");
            this.se38 = json.getString("se38");
            this.se39 = json.getString("se39");
            this.se40 = json.getString("se40");

        }

    }

    public String sHHtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();

        json.put("hh01", hh01)
                .put("hh0201", hh0201)
                .put("hh0202", hh0202)
                .put("hh03", hh03)
                .put("hh04", hh04)
                .put("hh05", hh05)
                .put("hh06", hh06)
                .put("hh07", hh07)
                .put("hh08", hh08)
                .put("hh09", hh09)
                .put("hh10", hh10)
                .put("hh11", hh11)
                .put("hh13", hh13)
                .put("hh12", hh12)
                .put("hh14", hh14)
                .put("hh15", hh15)
                .put("hh16", hh16)
                .put("hh17", hh17)
                .put("hh1796x", hh1796x)
                .put("hh18", hh18)
                .put("hh19", hh19)
                .put("hh20", hh20)
                .put("hh2096x", hh2096x)
                .put("hh21", hh21)
                .put("hh22", hh22)
                .put("hh23", hh23)
                .put("hh24", hh24)
                .put("hh25", hh25)
                .put("hh26", hh26)
                .put("hh2696x", hh2696x);

        return json.toString();
    }

    public String sSEtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();

        json.put("se01", se01)
                .put("se0196x", se0196x)
                .put("se02", se02)
                .put("se0296x", se0296x)
                .put("se03", se03)
                .put("se0396x", se0396x)
                .put("se04", se04)
                .put("se0496x", se0496x)
                .put("se05", se05)
                .put("se0596x", se0596x)
                .put("se06a", se06a)
                .put("se07a", se07a)
                .put("se08", se08)
                .put("se0896x", se0896x)
                .put("se09", se09)
                .put("se10", se10)
                .put("se1099x", se1099x)
                .put("se11", se11)
                .put("se1196x", se1196x)
                .put("se12", se12)
                .put("se1296x", se1296x)
                .put("se13", se13)
                .put("se14", se14)
                .put("se15", se15)
                .put("se16", se16)
                .put("se1701", se1701)
                .put("se1702", se1702)
                .put("se1703", se1703)
                .put("se1704", se1704)
                .put("se1705", se1705)
                .put("se1801", se1801)
                .put("se1802", se1802)
                .put("se1803", se1803)
                .put("se1804", se1804)
                .put("se1805", se1805)
                .put("se1896", se1896)
                .put("se189601x", se189601x)
                .put("se19", se19)
                .put("se1996x", se1996x)
                .put("se2001", se2001)
                .put("se2002", se2002)
                .put("se2003", se2003)
                .put("se2004", se2004)
                .put("se2005", se2005)
                .put("se2006", se2006)
                .put("se2096", se2096)
                .put("se2096x", se2096x)
                .put("se2101", se2101)
                .put("se2102", se2102)
                .put("se2103", se2103)
                .put("se2104", se2104)
                .put("se2105", se2105)
                .put("se2196", se2196)
                .put("se2196x", se2196x)
                .put("se2201", se2201)
                .put("se2202", se2202)
                .put("se2203", se2203)
                .put("se2204", se2204)
                .put("se2205", se2205)
                .put("se2206", se2206)
                .put("se2207", se2207)
                .put("se2208", se2208)
                .put("se2209", se2209)
                .put("se2210", se2210)
                .put("se2211", se2211)
                .put("se2212", se2212)
                .put("se2213", se2213)
                .put("se2214", se2214)
                .put("se2215", se2215)
                .put("se2216", se2216)
                .put("se2217", se2217)
                .put("se2218", se2218)
                .put("se31", se31)
                .put("se3196x", se3196x)
                .put("se32", se32)
                .put("se3301", se3301)
                .put("se3302", se3302)
                .put("se51", se51)
                .put("se41", se41)
                .put("se42", se42)
                .put("se4296x", se4296x)
                .put("se4301", se4301)
                .put("se4302", se4302)
                .put("se4303", se4303)
                .put("se4304", se4304)
                .put("se4305", se4305)
                .put("se4306", se4306)
                .put("se4307", se4307)
                .put("se4308", se4308)
                .put("se4309", se4309)
                .put("se4310", se4310)
                .put("se4311", se4311)
                .put("se4396", se4396)
                .put("se4396x", se4396x)
                .put("se4401", se4401)
                .put("se4402", se4402)
                .put("se4403", se4403)
                .put("se4404", se4404)
                .put("se4496", se4496)
                .put("se4496x", se4496x)
                .put("se45", se45)
                .put("se4601", se4601)
                .put("se4602", se4602)
                .put("se4603", se4603)
                .put("se4604", se4604)
                .put("se4605", se4605)
                .put("se4606", se4606)
                .put("se4696", se4696)
                .put("se4696x", se4696x)
                .put("se47", se47)
                .put("se4796x", se4796x)
                .put("se52", se52)
                .put("se53", se53)
                .put("se53_96x", se53_96x)
                .put("se54_01", se54_01)
                .put("se54_02", se54_02)
                .put("se54_03", se54_03)
                .put("se54_04", se54_04)
                .put("se54_05", se54_05)
                .put("se54_06", se54_06)
                .put("se54_96", se54_96)
                .put("se54_96x", se54_96x)
                .put("se55", se55)
                .put("se55_01x", se55_01x)
                .put("se48", se48)
                .put("se56_01", se56_01)
                .put("se56_02", se56_02)
                .put("se56_03", se56_03)
                .put("se56_04", se56_04)
                .put("se56_05", se56_05)
                .put("se56_06", se56_06)
                .put("se56_96", se56_96)
                .put("se56_96x", se56_96x)
                .put("se4901", se4901)
                .put("se4902", se4902)
                .put("se4903", se4903)
                .put("se4904", se4904)
                .put("se4998", se4998)
                .put("se4996", se4996)
                .put("se4996x", se4996x)
                .put("se50", se50)
                .put("se5096x", se5096x)
                .put("se57", se57)
                .put("se57_01x", se57_01x)
                .put("se3401", se3401)
                .put("se3402", se3402)
                .put("se58", se58)
                .put("se59", se59)
                .put("se60_01", se60_01)
                .put("se60_02", se60_02)
                .put("se60_03", se60_03)
                .put("se60_04", se60_04)
                .put("se60_05", se60_05)
                .put("se60_06", se60_06)
                .put("se60_98", se60_98)
                .put("se60_96", se60_96)
                .put("se60_96x", se60_96x)
                .put("se35", se35)
                .put("se36", se36)
                .put("se3701", se3701)
                .put("se3702", se3702)
                .put("se3703", se3703)
                .put("se3704", se3704)
                .put("se3705", se3705)
                .put("se3706", se3706)
                .put("se3707", se3707)
                .put("se3708", se3708)
                .put("se3709", se3709)
                .put("se3710", se3710)
                .put("se3796", se3796)
                .put("se3796x", se3796x)
                .put("se38", se38)
                .put("se39", se39)
                .put("se40", se40);
        return json.toString();

    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_EB_CODE, this.ebCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        //    json.put(FormsTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);

        json.put(FormsTable.COLUMN_SHH, new JSONObject(sHHtoString()));
        json.put(FormsTable.COLUMN_SSE, new JSONObject(sSEtoString()));

//        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
//        json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode);
//        json.put(FormsTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
//        json.put(FormsTable.COLUMN_UC_CODE, this.ucCode);
//        json.put(FormsTable.COLUMN_HF_CODE, this.hfCode);
//        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));

        return json;
    }
}