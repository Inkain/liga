package inkant1990gmail.com.laliga.screen.tornamentSchedule

import android.support.annotation.NonNull
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.OrientationHelper
import android.support.v7.widget.RecyclerView
import android.view.View

class CenterSnapHelper : LinearSnapHelper() {
    private var mHorizontalHelper: OrientationHelper? = null
    override fun attachToRecyclerView(recyclerView: RecyclerView?) {
        super.attachToRecyclerView(recyclerView)
    }

    private fun distanceToStart(targetView: View, helper: OrientationHelper): Int {
        return helper.getDecoratedStart(targetView) - helper.getStartAfterPadding();
    }

    override fun calculateDistanceToFinalSnap(
        @NonNull layoutManager: RecyclerView.LayoutManager,
        @NonNull targetView: View
    ): IntArray? {
        val out = IntArray(2)
        if (layoutManager.canScrollHorizontally()) {
            out[0] = distanceToStart(targetView, getHorizontalHelper(layoutManager)!!)
        } else {
            out[0] = 0
        }

        return out
    }

    override fun findSnapView(layoutManager: RecyclerView.LayoutManager): View? {

        return if (layoutManager is LinearLayoutManager) {
                getStartView(layoutManager, getHorizontalHelper(layoutManager)!!)

        } else super.findSnapView(layoutManager)

    }

    private fun getStartView(
        layoutManager: RecyclerView.LayoutManager,
        helper: OrientationHelper
    ): View? {

        if (layoutManager is LinearLayoutManager) {
            var firstChild = ((layoutManager).findFirstVisibleItemPosition())

            var isLastItem = ((layoutManager)
                .findLastCompletelyVisibleItemPosition()) == layoutManager.getItemCount() - 1;

            if (firstChild == RecyclerView.NO_POSITION || isLastItem) {
                return null;
            }

            var child = layoutManager.findViewByPosition(firstChild);

            if (helper.getDecoratedEnd(child) >= helper.getDecoratedMeasurement(child) / 2
                && helper.getDecoratedEnd(child) > 0
            ) {
                return child;
            } else {
                if ((layoutManager).findLastCompletelyVisibleItemPosition()
                    == layoutManager.getItemCount() - 1
                ) {
                    return null;
                } else {
                    return layoutManager.findViewByPosition(firstChild + 1)!!;
                }
            }
        }

        return super.findSnapView(layoutManager);
    }


    private fun getHorizontalHelper(layoutManager: RecyclerView.LayoutManager): OrientationHelper? {
        if (mHorizontalHelper == null) {
            mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return mHorizontalHelper;
    }
}
