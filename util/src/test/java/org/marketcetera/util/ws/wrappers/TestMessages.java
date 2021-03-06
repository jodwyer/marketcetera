package org.marketcetera.util.ws.wrappers;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.log.I18NMessageProvider;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: TestMessages.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public interface TestMessages
{
    static final I18NMessageProvider PROVIDER=
        new I18NMessageProvider("util_ws_wrappers_test");
    static final I18NLoggerProxy LOGGER=
        new I18NLoggerProxy(PROVIDER);

    static final I18NMessage1P BOUND=
        new I18NMessage1P(LOGGER,"bound");
}
