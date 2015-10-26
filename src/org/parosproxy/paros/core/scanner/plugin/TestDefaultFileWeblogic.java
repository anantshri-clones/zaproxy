/*
 *
 * Paros and its related class files.
 * 
 * Paros is an HTTP/HTTPS proxy for assessing web application security.
 * Copyright (C) 2003-2004 Chinotec Technologies Company
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Clarified Artistic License
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Clarified Artistic License for more details.
 * 
 * You should have received a copy of the Clarified Artistic License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
// ZAP: 2012/04/25 Added @Override annotation to all appropriate methods.
// ZAP: 2012/05/02 Added @Deprecated annotation to the class.
package org.parosproxy.paros.core.scanner.plugin;

import org.parosproxy.paros.core.scanner.AbstractDefaultFilePlugin;
import org.parosproxy.paros.core.scanner.Category;


/**
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
@Deprecated
public class TestDefaultFileWeblogic extends AbstractDefaultFilePlugin {

	// ZAP Depreciated by Brute Force scanner
	@Override
	public boolean isDepreciated() {
		return true;
	}

    /* (non-Javadoc)
     * @see org.parosproxy.paros.core.scanner.Test#getId()
     */
    @Override
    public int getId() {
        return 20005;
    }

    /* (non-Javadoc)
     * @see org.parosproxy.paros.core.scanner.Test#getName()
     */
    @Override
    public String getName() {
        
        return "BEA WebLogic example files";
    }
    

    /* (non-Javadoc)
     * @see org.parosproxy.paros.core.scanner.Test#getDependency()
     */
    @Override
    public String[] getDependency() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.parosproxy.paros.core.scanner.Test#getSummary()
     */
    @Override
    public String getDescription() {
        return "BEA WebLogic server 8.1 example files are found";
    }
    
    @Override
    public int getCategory() {
        return Category.SERVER;
    }
    
    @Override
    public String getSolution() {
        return "Remove example files.";
    }
    
    @Override
    public String getReference() {
        return "";
    }

    @Override
    public void init() {
        super.init();
        createURI();
    }
    
    private void createURI() {
		// WebLogic server 8.1 examples

		addTest("/patient","register.do,login.do");
		addTest("/admin", "login.do");
		addTest("/physican", "login.do");

		addTest("/examplesWebApp","index.jsp");
		// order parser example
		addTest("/examplesWebApp","OrderParser.jsp?xmlfile=C:/bea/weblogic81/samples/server/examples/src/examples/xml/orderParser/order.xml");
		// web services example
		addTest("/examplesWebApp","WebservicesEJB.jsp");
		// enterprise java bean example		
		addTest("/examplesWebApp","EJBeanManagedClient.jsp");
		// JSP example
		addTest("/examplesWebApp","InteractiveQuery.jsp");
		// servlet example
		addTest("/examplesWebApp","SessionServlet");

		// ***********************
		
		// WebLogic 8.1 Integration end-to-end examples
		
		addTest("/e2ePortalProject","Login.portal");
		
		// WebLogic Administration portal - not an example
		addTest("/portalAppAdmin","login.jsp");
		
		// weblogic Integration Administration console
		addTest("/","wliconsole");
    }

 
    
    
}