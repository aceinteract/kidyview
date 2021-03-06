package com.ltst.schoolapp.parent.ui.main.feed;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;

import com.ltst.core.base.BasePresenter;
import com.ltst.core.base.BaseView;

import rx.functions.Action1;

public interface FeedContract {

    interface View extends BaseView<Presenter> {
        void initToolbar(int naviagationIcon,
                         android.view.View.OnClickListener onNavigationClick,
                         Toolbar.OnMenuItemClickListener listener,
                         boolean showSpinner, String title);

        void bindData(RecyclerView.Adapter adapter,
//                      SpinnerAdapter spinnerAdapter,
//                      SimpleItemSelectedListener spinnerListener,
                      SwipeRefreshLayout.OnRefreshListener onRefreshListener,
                      SearchView.OnQueryTextListener searchListener,
                      Action1<Void> onCollapseSearch,
                      Action1<Integer> onLoadMore);

//        void bindSpinnerData(
//                SpinnerAdapter spinnerAdapter,
//                SimpleItemSelectedListener spinnerListener
//        );

        void showContent();

        void showLoading();

        void showEmpty();

        void setSpinnerPosition(int position);

        void setPaginationIsEnd(boolean isEnd);

        void expandSearch(boolean isExpand);

    }

    interface Presenter extends BasePresenter {
        void onActivityResult(int requestCode, int resultCode, Intent data);
    }
}
