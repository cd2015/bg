package com.bg.bootstrap;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	protected Class<?>[] getRootConfigClasses() { return new Class[]{};};
//			SecurityConfig.class};
			//}

    protected Class<?>[] getServletConfigClasses()  { return new Class[] {ContextConfig.class};}

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

}
