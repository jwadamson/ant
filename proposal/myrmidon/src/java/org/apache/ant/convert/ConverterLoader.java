/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.apache.ant.convert;

import org.apache.avalon.camelot.Loader;

/**
 * Class used to load converters et al from a source.
 * 
 * @author <a href="mailto:donaldp@apache.org">Peter Donald</a>
 */
public interface ConverterLoader
    extends Loader
{
    Converter loadConverter( String converter )
        throws Exception;
}
