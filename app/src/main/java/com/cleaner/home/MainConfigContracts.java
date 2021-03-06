package com.cleaner.home;

/**
 * Created by yangfeng on 16-6-29.
 */
public class MainConfigContracts {
    /**
     * Created by yangfeng on 16-6-27.
     */
    public interface PageConfig {
        int VERSION_NONE = 0;
        int VERSION_FIRST = 1;
        int VERSION_SECOND = 2;
        int VERSION_THIRD = 3;

        boolean hasSummary();
        boolean hasRecyclerSummary();
        boolean hasRecyclerSummaryV2();

        boolean hasMessage();

        boolean hasDoctorPage();

        boolean hasMinePage();

        boolean hasDiscoveryPage();
    }

    /**
     * Created by yangfeng on 16-6-29.
     */
    public interface ConfigView {
        void addSummaryTab();
        void addRecyclerSummaryTab();
        void addRecyclerSummaryV2Tab();

        void addUnknownSummaryTab();
        void addMessageTab();

        void addUnknownMessageTab();
        void addDoctorTab();

        void addUnknownDoctorTab();
        void addMineTab();

        void addUnknownMineTab();
        void addDiscoveryTab();

        void addUnknownDiscoveryTab();
    }

    /**
     * Created by yangfeng on 16-6-29.
     */
    public interface ConfigPresenter {
        void initTabs();
    }
}
