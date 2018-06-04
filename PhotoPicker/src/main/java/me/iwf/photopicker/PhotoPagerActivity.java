package me.iwf.photopicker;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import me.iwf.photopicker.fragment.ImagePagerFragment;

import static me.iwf.photopicker.PhotoPreview.EXTRA_CURRENT_ITEM;
import static me.iwf.photopicker.PhotoPreview.EXTRA_LONG_DATA;
import static me.iwf.photopicker.PhotoPreview.EXTRA_PHOTOS;

/**
 * Created by donglua on 15/6/24.
 */

// modify PhotoPagerActivity.java add showToolbar

public class PhotoPagerActivity extends AppCompatActivity {

    private ImagePagerFragment pagerFragment;

    private ActionBar actionBar;
    private boolean showDelete, showToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        showToolbar = getIntent().getBooleanExtra(EXTRA_SHOW_TOOLBAR, true);
//        if (!showToolbar) {
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        }

        setContentView(R.layout.__picker_activity_photo_pager);

        int currentItem = getIntent().getIntExtra(EXTRA_CURRENT_ITEM, 0);
        List<String> paths = getIntent().getStringArrayListExtra(EXTRA_PHOTOS);
        ArrayList<String> longData = getIntent().getStringArrayListExtra(EXTRA_LONG_DATA);

//        showDelete = getIntent().getBooleanExtra(EXTRA_SHOW_DELETE, true);
//        if (!showToolbar) {
//            showDelete = false;
//        }

        if (pagerFragment == null) {
            pagerFragment =
                    (ImagePagerFragment) getSupportFragmentManager().findFragmentById(R.id.photoPagerFragment);
        }
        pagerFragment.setPhotos(paths, currentItem,longData);

//        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
//
//        actionBar = getSupportActionBar();
//
//        if (actionBar != null) {
//            actionBar.setDisplayHomeAsUpEnabled(true);
//            updateActionBarTitle();
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                actionBar.setElevation(25);
//            }
//        }
//
//
//        pagerFragment.getViewPager().addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                updateActionBarTitle();
//            }
//        });

//        if (!showToolbar) {
//            mToolbar.setVisibility(View.GONE);
//        }else{
//            mToolbar.setBackgroundColor(getResources().getColor(R.color.__picker_pager_bg));
//            mToolbar.setVisibility(View.INVISIBLE);
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        if (showDelete) {
//            getMenuInflater().inflate(R.menu.__picker_menu_preview, menu);
//        }
        return true;
    }


    @Override
    public void onBackPressed() {

//        Intent intent = new Intent();
//        intent.putExtra(KEY_SELECTED_PHOTOS, pagerFragment.getPaths());
//        setResult(RESULT_OK, intent);
//        finish();
        super.onBackPressed();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

//        if (item.getItemId() == R.id.delete) {
//            final int index = pagerFragment.getCurrentItem();
//
//            final String deletedPath = pagerFragment.getPaths().get(index);
//
//            Snackbar snackbar = Snackbar.make(pagerFragment.getView(), R.string.__picker_deleted_a_photo,
//                    Snackbar.LENGTH_LONG);
//
//            if (pagerFragment.getPaths().size() <= 1) {
//
//                // show confirm dialog
//                new AlertDialog.Builder(this)
//                        .setTitle(R.string.__picker_confirm_to_delete)
//                        .setPositiveButton(R.string.__picker_yes, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                dialogInterface.dismiss();
//                                pagerFragment.getPaths().remove(index);
//                                pagerFragment.getViewPager().getAdapter().notifyDataSetChanged();
//                                onBackPressed();
//                            }
//                        })
//                        .setNegativeButton(R.string.__picker_cancel, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                dialogInterface.dismiss();
//                            }
//                        })
//                        .show();
//
//            } else {
//
//                snackbar.show();
//
//                pagerFragment.getPaths().remove(index);
//                pagerFragment.getViewPager().getAdapter().notifyDataSetChanged();
//            }
//
//            snackbar.setAction(R.string.__picker_undo, new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (pagerFragment.getPaths().size() > 0) {
//                        pagerFragment.getPaths().add(index, deletedPath);
//                    } else {
//                        pagerFragment.getPaths().add(deletedPath);
//                    }
//                    pagerFragment.getViewPager().getAdapter().notifyDataSetChanged();
//                    pagerFragment.getViewPager().setCurrentItem(index, true);
//                }
//            });
//
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

//    public void updateActionBarTitle() {
//        if (actionBar != null) actionBar.setTitle(
//                getString(R.string.__picker_image_index, pagerFragment.getViewPager().getCurrentItem() + 1,
//                        pagerFragment.getPaths().size()));
//    }
}
