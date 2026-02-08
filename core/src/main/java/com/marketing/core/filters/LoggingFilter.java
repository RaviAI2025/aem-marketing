package com.marketing.core.filters;

import org.apache.sling.api.SlingHttpServletRequest;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

@Component(
    service = Filter.class,
    property = {
        "sling.filter.scope=REQUEST",
        "service.ranking:Integer=700"
    }
)
public class LoggingFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // no-op
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        SlingHttpServletRequest slingRequest = (SlingHttpServletRequest) request;
        LOG.debug("Marketing request for: {}", slingRequest.getRequestPathInfo().getResourcePath());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // no-op
    }
}
