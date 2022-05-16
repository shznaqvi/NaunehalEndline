package edu.aku.hassannaqvi.naunehalendline.adapters;

import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.naunehalendline.core.MainApp.youngestChild;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.aku.hassannaqvi.naunehalendline.R;
import edu.aku.hassannaqvi.naunehalendline.core.MainApp;
import edu.aku.hassannaqvi.naunehalendline.models.Child;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section02CBActivity;
import edu.aku.hassannaqvi.naunehalendline.ui.sections.Section03CSActivity;


public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    private static final String TAG = "ChildAdapter";
    private final Context mContext;
    private final List<Child> member;
    private final int mExpandedPosition = -1;
    private final int completeCount;
    private final boolean motherPresent = false;
    private final ActivityResultLauncher<Intent> childInfoLauncher;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param child              List<FemaleChildModel> containing the data to populate views to be used by RecyclerView.
     * @param memberInfoLauncher
     */
    public ChildAdapter(Context mContext, List<Child> child, ActivityResultLauncher<Intent> memberInfoLauncher) {
        this.member = child;
        this.mContext = mContext;
        completeCount = 0;
        MainApp.memberComplete = false;
        childInfoLauncher = memberInfoLauncher;

    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int pos) {
        int position = viewHolder.getAdapterPosition();

        Animation animation = AnimationUtils.loadAnimation(mContext,
                R.anim.fade_in_drop);
        viewHolder.itemView.startAnimation(animation);

        Log.d(TAG, "Element " + position + " set.");
        Child child = this.member.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView fName = viewHolder.fName;
        TextView fAge = viewHolder.fAge;
        TextView motherName = viewHolder.motherName;
        TextView childcheck = viewHolder.childcheck;
        TextView markChild = viewHolder.markChild;
        // LinearLayout subItem = viewHolder.subItem;
        ImageView fmRow = viewHolder.fmRow;
        ImageView mainIcon = viewHolder.mainIcon;
        TextView addSibling = viewHolder.addSibling;

        View cloaked = viewHolder.cloak;
        View indexedBar = viewHolder.indexedBar;

        //String pregStatus = familyMember.getRb07().equals("1") ? "Pregnant" : "Not Pregnant";

        //MainApp.memberComplete = completeCount == MainApp.childCount;

        fName.setText(child.getCb02());
        fAge.setText(child.getAgeInMonths() + "m ");
        motherName.setText(null);
        String motherRelation = "";


        if (child.getCb03().equals("1")) {
            motherRelation = " s/o ";
        } else {
            motherRelation = " d/o ";

        }
        motherName.setText(motherRelation + child.getCb07());
        //      motherPresent = MainApp.childList.get(Integer.parseInt(child.getD107()) - 1).getD105().equals("1");



        /*      <string name="hl701"> Married </string>
                <string name="hl702"> Widowed </string>
                <string name="hl703"> Divorced </string>
                <string name="hl704"> Separated </string>
                <string name="hl705"> Un-Married </string>
                <string name="hl7099"> Not Applicable (for Age less 13 years old) </string>*/
    /*    String marStatus = "";
        switch (child.getD105()) {
            case "1":
                marStatus = "Married";
                break;
            case "2":
                marStatus = "UnMarried";
                break;
            case "3":
                marStatus = "Widowed";
                break;
            case "4":
                marStatus = "Divorced/Separated";
                break;
               *//* case "5":
                    marStatus = "Un-Married";
                    break;*//*
            case "99":
                marStatus = "Not Applicable";
                break;
            default:
                marStatus = "Unknown";
                break;
        }

        String idxStatus = "";

        int idxColor;
        switch (child.getIndexed()) {
            case "1":
                idxStatus = " Mother  ";
                idxColor = mContext.getResources().getColor(R.color.motherBg);
                break;
            case "2":
                idxStatus = "  Child  ";
                idxColor = mContext.getResources().getColor(R.color.childBg);
                break;
             *//*   case "3":
                    idxStatus = " Adol. M ";
                    idxColor = mContext.getResources().getColor(R.color.adolMaleBg);
                    break;
                case "4":
                    idxStatus = " Adol. F ";
                    idxColor = mContext.getResources().getColor(R.color.adolFemaleBg);
                    break;
    *//*
            default:
                idxStatus = "         ";
                idxColor = mContext.getResources().getColor(R.color.white);

                break;
        }

*/
        markChild.setVisibility(child.getIndexed().equals("1") ? View.VISIBLE : View.GONE);

        //  cloaked.setVisibility(!child.getMemCate().equals("") ? View.GONE : View.VISIBLE);
        mainIcon.setImageResource(child.getCb03().equals("1") ? R.drawable.ic_boy : R.drawable.ic_girl);
        //MainApp.selectedMWRA = child.getIndexed().equals("1") || child.getIndexed().equals("2") ? "-" : "";
        mainIcon.setBackgroundColor(child.getCb03().equals("1") ? mContext.getResources().getColor(R.color.boy_blue) : mContext.getResources().getColor(R.color.girl_pink));
        //  mainIcon.setBackgroundColor(  ((ColorDrawable) mainIcon.getBackground()).getColor());
        cloaked.setVisibility(child.getAgeInMonths() <= 59 ? View.GONE : View.VISIBLE);

        if (child.getAgeInMonths() > 59) {
            mainIcon.setImageResource(R.drawable.ic_not_available);
            mainIcon.setBackgroundColor(mContext.getResources().getColor(R.color.gray));
        }
 /*
        if (!MainApp.selectedMWRA.equals("")) {
            cloaked.setVisibility(child.getIndexed().equals("") ? View.VISIBLE : View.GONE);
            indexedBar.setVisibility(child.getIndexed().equals("") ? View.GONE : View.VISIBLE);
        }
*/
        childcheck.setVisibility(child.getCs01().equals("") ? View.INVISIBLE : View.VISIBLE);


        //fMaritalStatus.setText("Children: " + familyMember.getH226m() + " boy(s), " + familyMember.getH226f() + " girl(s)");

        // To add Child's Health and Immunization Details
        viewHolder.itemView.setOnClickListener(v -> {
            // Get the current state of the item
            try {
                int id = youngestChild;
                MainApp.child = MainApp.childList.get(position);
                if (child.getAgeInMonths() <= 59) {

                    Intent intent = new Intent(mContext, Section03CSActivity.class);

                    intent.putExtra("position", position);
                    intent.putExtra("requestCode", "4");
                    intent.putExtra("sibling", "");

                    selectedChild = position;

                    intent.putExtra("position", position);
                    childInfoLauncher.launch(intent);

                    //  ((Activity) mContext).startActivityForResult(intent, 2);
                } else {
                    Toast.makeText(mContext, "INELIGIBLE: Child is " + child.getAgeInMonths() + " months old", Toast.LENGTH_SHORT).show();
                }
            } catch (NullPointerException e) {
                Toast.makeText(mContext, "Please complete child list.", Toast.LENGTH_LONG).show();
            }
        });

        // TO EDIT Child's basic info
        viewHolder.itemView.setOnLongClickListener(view -> {
            try {
                int id = youngestChild;
                Toast.makeText(mContext, "Child list has been completed. You cannot change basic information of this child.", Toast.LENGTH_LONG).show();
                return false;

            } catch (NullPointerException e) {

                MainApp.child = MainApp.childList.get(position);
                // Check if Child details has been added in next section
                if (MainApp.child.getCs01().equals("")) {
                    Intent intent = new Intent(mContext, Section02CBActivity.class);

                    intent.putExtra("position", position);
                    intent.putExtra("requestCode", "3");
                    intent.putExtra("sibling", "");

                    selectedChild = position;
                    MainApp.preAgeInMonths = MainApp.childList.get(selectedChild).getAgeInMonths();

                    intent.putExtra("position", position);
                    childInfoLauncher.launch(intent);

                } else {
                    Toast.makeText(mContext, "This child has been locked.", Toast.LENGTH_SHORT).show();
                }
                return true;
            }

        });
        // TO EDIT Child's basic info
        viewHolder.addSibling.setOnClickListener(view -> {
            try {
                int id = youngestChild;
                Toast.makeText(mContext, "Child list has been completed. You cannot add sibling child.", Toast.LENGTH_LONG).show();

            } catch (NullPointerException e) {

                MainApp.child = new Child();

                MainApp.child.cb06 = child.cb06;
                MainApp.child.cb07 = child.cb07;
                MainApp.child.cb08 = child.cb08;
                MainApp.child.cb09 = child.cb09;
                MainApp.child.cb10 = child.cb10;
                MainApp.child.cb11 = child.cb11;
                MainApp.child.cb12 = child.cb12;
                MainApp.child.cb13 = child.cb13;
                MainApp.child.cb14 = child.cb14;

                Intent intent = new Intent(mContext, Section02CBActivity.class);
                intent.putExtra("requestCode", "2");
                intent.putExtra("sibling", "1");
                childInfoLauncher.launch(intent);


            }

        });


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.child_box, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return member.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView fName;
        private final TextView fAge;
        private final TextView motherName;
        private final TextView childcheck;
        private final TextView markChild;
        private final TextView addSibling;
        //private final LinearLayout subItem;
        private final ImageView fmRow;
        private final ImageView mainIcon;
        private final View cloak;
        private final View indexedBar;


        public ViewHolder(View v) {
            super(v);
            fName = v.findViewById(R.id.chh02);
            fAge = v.findViewById(R.id.chh05);
            motherName = v.findViewById(R.id.chh08);
            childcheck = v.findViewById(R.id.childcheck);
            markChild = v.findViewById(R.id.markChild);
            addSibling = v.findViewById(R.id.addSibling);
            //  subItem = v.findViewById(R.id.csubitem);
            fmRow = v.findViewById(R.id.cfmRow);
            mainIcon = v.findViewById(R.id.mainIcon);
            cloak = v.findViewById(R.id.cloaked);
            indexedBar = v.findViewById(R.id.indexedBar);

        }

        public TextView getTextView() {
            return fName;
        }
    }


}
