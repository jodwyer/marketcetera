package org.marketcetera.ors;

import org.junit.Test;
import org.marketcetera.core.InMemoryIDFactory;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 2.1.0
 * @version $Id: LongIDFactoryTest.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class LongIDFactoryTest
    extends TestCaseBase
{

    @Test
    public void basics()
        throws Exception
    {
        InMemoryIDFactory idFactory=new InMemoryIDFactory(0);
        idFactory.init();
        LongIDFactory longIdFactory=new LongIDFactory(idFactory);

        long first=longIdFactory.getNext();
        for (long i=1;i<=LongIDFactory.LOCAL_ID_COUNT+10;i++) {
            assertEquals(first+i,longIdFactory.getNext());
        }
    }
}
