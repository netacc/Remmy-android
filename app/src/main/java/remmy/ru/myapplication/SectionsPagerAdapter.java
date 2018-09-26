package remmy.ru.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return RecyclerViewActivity.newInstance(position + 1);
            case 1:
                return TabGroups.newInstance(position + 1);
            case 2:
                return TabTasks.newInstance(position + 1);
            default:return null;
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}
