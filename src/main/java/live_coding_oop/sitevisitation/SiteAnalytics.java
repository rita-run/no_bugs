package live_coding_oop.sitevisitation;

import java.util.HashSet;
import java.util.Set;

public class SiteAnalytics {
    private Set<Visit> visits = new HashSet<>();

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public void printUniqueVisitCount() {
        System.out.println(visits.size());
    }
}