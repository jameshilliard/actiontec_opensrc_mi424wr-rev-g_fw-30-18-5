/* TextSyntax.java -- 
   Copyright (C) 2003, 2004 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package javax.print.attribute;

import java.io.Serializable;
import java.util.Locale;

/**
 * @author Michael Koch
 */
public abstract class TextSyntax implements Cloneable, Serializable
{
  private static final long serialVersionUID = -8130648736378144102L;
  
  private String value;
  private Locale locale;

  /**
   * Creates a <code>TextSyntax</code> object with the given value
   * and locale.
   *
   * @param value the value for this syntax
   * @param locale the locale to use
   *
   * @exception NullPointerException if value and/or locale is null
   */
  protected TextSyntax(String value, Locale locale)
  {
    if (value == null || locale == null)
      throw new NullPointerException("value and/or locale may not be null");

    this.value = value;
    this.locale = locale;
  }

  /**
   * Returns the value of this syntax object.
   *
   * @return the value
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Returns the locale of this syntax object.
   *
   * @return the locale
   */
  public Locale getLocale()
  {
    return locale;
  }

  /**
   * Returns the hashcode for this object.
   *
   * @return the hashcode
   */
  public int hashCode()
  {
    return value.hashCode() ^ locale.hashCode();
  }

  /**
   * Tests of obj is equal to this object.
   *
   * @param obj the object to test
   *
   * @return true if both objects are equal, false otherwise.
   */
  public boolean equals(Object obj)
  {
    if (! (obj instanceof TextSyntax))
      return false;

    TextSyntax tmp = (TextSyntax) obj;
    
    return (value.equals(tmp.getValue())
            && locale.equals(tmp.getLocale()));
  }

  /**
   * Returns a string representing the object.
   */
  public String toString()
  {
    return getValue();
  }
}
