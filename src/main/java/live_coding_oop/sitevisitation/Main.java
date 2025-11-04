package live_coding_oop.sitevisitation;

public class Main {
    public static void main(String[] args) {
        Visit visit1 = new Visit();
        Visit visit2 = new Visit();
        SiteAnalytics siteAnalytics = new SiteAnalytics();

        siteAnalytics.printUniqueVisitCount();

        siteAnalytics.addVisit(visit1);
        siteAnalytics.printUniqueVisitCount();

        siteAnalytics.addVisit(visit1);
        siteAnalytics.printUniqueVisitCount();

        siteAnalytics.addVisit(visit2);
        siteAnalytics.printUniqueVisitCount();
    }
}