/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Bob Foster - The color manager idea; XSWT top-level node idea; some other 
 *                        important stuff
 *     David Orme (ASC) - Rewrote: switched to a reflection-based implementation
 ******************************************************************************/

package com.swtworkbench.community.xswt.dataparser.parsers;

import java.util.StringTokenizer;

import com.swtworkbench.community.xswt.dataparser.NonDisposableDataParser;


/**
 * Class StringArrayDataParser.  
 * 
 * @author daveo
 */
public class StringArrayDataParser extends NonDisposableDataParser {

    /* (non-Javadoc)
     * @see com.swtworkbench.community.xswt.dataparser.IDataParser#parse(java.lang.String)
     */
    public Object parse(String source) {
        StringTokenizer stringTokenizer = new StringTokenizer(source, " \t\r\n");
        int tokens = stringTokenizer.countTokens();
        String[] tokenArray = new String[tokens];
        
        for (int i = 0; i < tokens; i++)
            tokenArray[i] = stringTokenizer.nextToken();

        return tokenArray;
    }

}
