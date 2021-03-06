// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 * 
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.shacl;


// Start of user code imports
// End of user code

public interface ShDomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String SHACL_DOMAIN = "http://www.w3.org/ns/shacl#";
    public static String SHACL_NAMSPACE = "http://www.w3.org/ns/shacl#";
    public static String SHACL_NAMSPACE_PREFIX = "sh";

    public static String VALIDATIONREPORT_PATH = "validationReport";
    public static String VALIDATIONREPORT_NAMESPACE = SHACL_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String VALIDATIONREPORT_LOCALNAME = "ValidationReport"; //localName of the rdfs:class the resource describes
    public static String VALIDATIONREPORT_TYPE = VALIDATIONREPORT_NAMESPACE + VALIDATIONREPORT_LOCALNAME; //fullname of the rdfs:class the resource describes
    public static String VALIDATIONRESULT_PATH = "validationResult";
    public static String VALIDATIONRESULT_NAMESPACE = SHACL_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String VALIDATIONRESULT_LOCALNAME = "ValidationResult"; //localName of the rdfs:class the resource describes
    public static String VALIDATIONRESULT_TYPE = VALIDATIONRESULT_NAMESPACE + VALIDATIONRESULT_LOCALNAME; //fullname of the rdfs:class the resource describes
}
