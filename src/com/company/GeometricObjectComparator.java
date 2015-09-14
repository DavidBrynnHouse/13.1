package com.company;

import java.util.Comparator;

public class GeometricObjectComparator
        implements Comparator<GeometricObject>, java.io.Serializable {
    static GeometricObjectComparator geo = new GeometricObjectComparator();

    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if (area1 < area2)
            return -1;
        else if (area1 == area2)
            return 0;
        else
            return 1;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        int returnValue = geo.compare(o1,o2);
        if (returnValue == 1)
            return o1;
        else if (returnValue == -1)
            return o2;
        else
            return null;
    }
}
