package io.symphonia.lambda.logging;

import java.util.List;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class MetricPassFilter extends Filter<ILoggingEvent> {

    public static Marker METRIC_MARKER = MarkerFactory.getMarker("METRIC");

    // Accept only logging events that include METRIC marker, deny all others

    @Override
    public FilterReply decide(ILoggingEvent event) {
        List<Marker> eventMarker = event.getMarkerList();
        if (isStarted() && (eventMarker == null || !eventMarker.contains(METRIC_MARKER))) {
            return FilterReply.DENY;
        } else {
            return FilterReply.NEUTRAL;
        }
    }
}
