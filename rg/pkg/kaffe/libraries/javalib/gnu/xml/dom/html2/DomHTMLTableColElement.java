/* DomHTMLTableColElement.java -- 
   Copyright (C) 2005 Free Software Foundation, Inc.

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

package gnu.xml.dom.html2;

import org.w3c.dom.html2.HTMLTableColElement;

/**
 * An HTML 'COL' or 'COLGROUP' element node.
 *
 * @author <a href='mailto:dog@gnu.org'>Chris Burdess</a>
 */
public class DomHTMLTableColElement
  extends DomHTMLElement
  implements HTMLTableColElement
{

  protected DomHTMLTableColElement(DomHTMLDocument owner,
                                   String namespaceURI,
                                   String name)
  {
    super(owner, namespaceURI, name);
  }

  public String getAlign()
  {
    return getHTMLAttribute("align");
  }

  public void setAlign(String align)
  {
    setHTMLAttribute("align", align);
  }
  
  public String getCh()
  {
    return getHTMLAttribute("char");
  }

  public void setCh(String ch)
  {
    setHTMLAttribute("char", ch);
  }
  
  public String getChOff()
  {
    return getHTMLAttribute("charoff");
  }

  public void setChOff(String chOff)
  {
    setHTMLAttribute("charoff", chOff);
  }
  
  public int getSpan()
  {
    return getIntHTMLAttribute("span");
  }

  public void setSpan(int span)
  {
    setIntHTMLAttribute("span", span);
  }
  
  public String getVAlign()
  {
    return getHTMLAttribute("valign");
  }

  public void setVAlign(String vAlign)
  {
    setHTMLAttribute("valign", vAlign);
  }
  
  public String getWidth()
  {
    return getHTMLAttribute("width");
  }

  public void setWidth(String width)
  {
    setHTMLAttribute("width", width);
  }
  
}

