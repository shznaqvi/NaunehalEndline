package edu.aku.hassannaqvi.naunehalendline.adapters;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.database.DatabaseHelper;
import edu.aku.hassannaqvi.naunehalendline.models.Child;
import edu.aku.hassannaqvi.naunehalendline.models.Form;

/**
 * Created by hassan.naqvi on 8/1/2016.
 */
public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
    private static final String TAG = "FormsAdapter";
    Context c;
    DatabaseHelper db;
    private List<Form> fc = new ArrayList<>();

    // Provide a suitable constructor (depends on the kind of dataset)
    public FormsAdapter(List<Form> fc, Context c) {
        this.fc = fc;
        this.c = c;
        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pendingform_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        db = new DatabaseHelper(c);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

/*        int childCount = 0;
        childCount = db.getChildrenByUUID(fc.get(position).get_UID());
        int photoChild = 0;
        photoChild = db.getChildrenPhotoCheck(fc.get(position).get_UID());
        int cardChild = 0;
        cardChild = db.getChildrenCardCheck(fc.get(position).get_UID());*/

       /* int anthroStatus = 0;
        anthroStatus = db.checkAnthro(fc.get(position).getUid());

        int bloodStatus = 0;
        bloodStatus = db.checkBlood(fc.get(position).getUid());

        int stoolStatus = 0;
        stoolStatus = db.checkStool(fc.get(position).getUid());

        String motherName = "";
        try {
            motherName = db.getWraName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(Form): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        String childName = "";
        try {
            childName = db.getChildName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(Form): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

        String iStatus = "Status  Unknown";
        int iColor = 0;
        switch (fc.get(position).getiStatus()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "No Respondent";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Memebers Absent";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "5":
                iStatus = "Empty";
                iColor = Color.RED;
                break;
            case "6":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
            case "96":
                iStatus = "Other Reason";
                iColor = Color.RED;
                break;
            default:
                iStatus = "Open Form";
                iColor = Color.RED;
                break;

        }

        holder.hhid.setText(fc.get(position).getHhid());
        holder.clusterCode.setText(fc.get(position).getClusterCode());
        String motherChild = "";
        int childrenCount = 0;
        try {
            MainApp.form = fc.get(position);
            List<Child> children = db.getChildrenBYUID();
            childrenCount = children.size();
            for (Child child : children) {

                if (child.getIndexed().equals("1")) {

                    String motherRelation = "";
                    String respRelation = "";
                    if (child.getCb03().equals("1")) {
                        motherRelation = " s/o ";
                    } else {
                        motherRelation = " s/o ";

                    }
                    switch (child.getCb06()) {
                        case "1":
                            respRelation = "Mother";
                            break;
                        case "2":
                            respRelation = "Father";
                            break;
                        case "3":
                            respRelation = "Caregiver";
                            break;
                        case "4":
                            respRelation = "Other Family Member";
                            break;
                    }
                    motherChild = child.getCb02() + motherRelation + child.getCb07() + " (" + child.getAgeInMonths() + " months)";
                }
            }


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(Child)" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        holder.childCount.setText(childrenCount + "");
        holder.istatus.setText(iStatus);
        holder.fatherName.setText(motherChild);
      /*holder.mwraCount.setText(anthroStatus == 2 ? "  Done   " : " Pending ");
        holder.childCount.setText(bloodStatus == 2 ? "  Done   " : " Pending ");
        holder.adolMaleCount.setText(stoolStatus == 2 ? "  Done   " : " Pending ");
        holder.mwraCount.setTextColor(anthroStatus == 2 ? Color.GREEN : Color.RED);
        holder.childCount.setTextColor(bloodStatus == 2 ? Color.GREEN : Color.RED);
        holder.adolMaleCount.setTextColor(stoolStatus == 2 ? Color.GREEN : Color.RED);*/
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            cal.setTime(sdf.parse(fc.get(position).getSysDate()));
            sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            String interviewDateTime = sdf.format(cal.getTime());
            holder.sysdate.setText(interviewDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        holder.istatus.setTextColor(iColor);


      /*  holder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.form = fc.get(position);
            //MainApp.households.setVisitNo(String.valueOf(Integer.parseInt(MainApp.households.getVisitNo())+1));
            if (!MainApp.form.getiStatus().equals("1")) {

                editHousehold(position);

            } else {
                Toast.makeText(c, "This households has been locked. You cannot edit household for locked households", Toast.LENGTH_LONG).show();
            }


        });
*/
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

    private void editHousehold(int position) {
        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByPsuhhid(fc.get(position).getClusterCode(), fc.get(position).getHhid());
        } catch (JSONException e) {
            Log.d(TAG, c.getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(c, c.getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView sysdate;
        public TextView clusterCode;
        public TextView hhid;
        public TextView istatus;
        public TextView mwraCount;
        public TextView childCount;
        public TextView adolMaleCount;
        public TextView adolFemaleCount;
        public TextView fatherName;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
//            rv = v.findViewById(R.id.FormsList);
            sysdate = v.findViewById(R.id.sysdate);
            clusterCode = v.findViewById(R.id.clusterCode);
            hhid = v.findViewById(R.id.hhid);
            istatus = v.findViewById(R.id.istatus);
            fatherName = v.findViewById(R.id.fathername);
            //  mwraCount = v.findViewById(R.id.mwraCount);
            childCount = v.findViewById(R.id.childCount);
          /*  adolMaleCount = v.findViewById(R.id.adolMaleCount);
            adolFemaleCount = v.findViewById(R.id.adolFemaleCount);*/

        }


    }
}