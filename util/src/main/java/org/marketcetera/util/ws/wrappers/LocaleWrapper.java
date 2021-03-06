package org.marketcetera.util.ws.wrappers;

import java.util.Locale;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.wrappers.MarshalledLocale;

/**
 * A dual-form wrapper for marshalling a locale. The raw form is
 * {@link Locale}, and the marshalled form is {@link
 * MarshalledLocale}.
 * 
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: LocaleWrapper.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@XmlSeeAlso(MarshalledLocale.class)
@ClassVersion("$Id: LocaleWrapper.java 16154 2012-07-14 16:34:05Z colin $")
public class LocaleWrapper
    extends DualWrapper<Locale,MarshalledLocale>
{

    // CLASS DATA.

    private static final long serialVersionUID=1L;


    // CONSTRUCTORS.

    /**
     * Creates a new wrapper for the given locale. It also sets the
     * internal marshalled form to match.
     *
     * @param locale The locale, which may be null.
     */

    public LocaleWrapper
        (Locale locale)
    {
        super(locale);
    }

    /**
     * Creates a new wrapper. This empty constructor is intended for
     * use by JAXB and Java serialization.
     */

    public LocaleWrapper() {}


    // DualWrapper.

    @Override
    protected void toRaw()
    {
        setRawOnly(getMarshalled().toLocale());
    }

    @Override
    protected void toMarshalled()
    {
        setMarshalledOnly(new MarshalledLocale(getRaw()));
    }
}
