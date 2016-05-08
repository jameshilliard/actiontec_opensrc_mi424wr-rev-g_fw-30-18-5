/* VolatileImage.java -- 
   Copyright (C) 2002 Free Software Foundation, Inc.

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


package java.awt.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.ImageCapabilities;

/** STUBS ONLY */
public abstract class VolatileImage extends Image
{
  public static final int IMAGE_OK = 0;
  public static final int IMAGE_RESTORED = 1;
  public static final int IMAGE_INCOMPATIBLE = 2;
  public VolatileImage()
  {
  }
  public abstract BufferedImage getSnapshot();
  public abstract int getWidth();
  public abstract int getHeight();
  public ImageProducer getSource()
  {
    return getSnapshot().getSource();
  }
  public void flush()
  {
  }
  public Graphics getGraphics()
  {
    return createGraphics();
  }
  public abstract Graphics2D createGraphics();
  public abstract int validate(GraphicsConfiguration gc);
  public abstract boolean contentsLost();
  public abstract ImageCapabilities getCapabilities();
} // class VolatileImage
